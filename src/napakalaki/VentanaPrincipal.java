/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

/**
 * Rubén Martín Hidalgo
 * David Romero Díaz
 * Zacarías Romero Sellamitou
 */
 
public class VentanaPrincipal extends javax.swing.JFrame implements Vista {

    /**
     * Creates new form VentanaPrincipal
     */
    
    private Napakalaki juego;
    private JD_dado dado;
    private String[] nombresJugadores;
    private Jugador jugadorActivo;
    private ArrayList<Tesoro> tesorosVisiblesSeleccionados;
    private ArrayList<Tesoro> tesorosOcultosSeleccionados;
    private ArrayList<TesoroGrafico> tesorosVisiblesAlimpiar;
    private ArrayList<TesoroGrafico> tesorosOcultosAlimpiar;
    public VentanaPrincipal(Napakalaki unJuego) {
        juego = unJuego;
        tesorosVisiblesSeleccionados = new ArrayList(10);
        tesorosOcultosSeleccionados = new ArrayList(10);
        tesorosVisiblesAlimpiar = new ArrayList(10);
        tesorosOcultosAlimpiar = new ArrayList(10);
        initComponents();
    }

    private class TesoroGrafico extends javax.swing.JPanel{
        protected Tesoro tesoro; 
        private JLabel nombre = new JLabel();
        TesoroGrafico (Tesoro unTesoro){
            tesoro=unTesoro;
            this.setPreferredSize(new java.awt.Dimension(100,140));
            this.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
            
            nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            nombre.setText(tesoro.getNombre());
            this.setBackground(new java.awt.Color(200,200,0));
            this.setOpaque(false);
            this.add(nombre,new org.netbeans.lib.awtextra.AbsoluteConstraints(5,10,90,-1));
            
        }
    }
    
    private class TesoroGraficoVisible extends TesoroGrafico{
        TesoroGraficoVisible(Tesoro unTesoro){
            super(unTesoro);
            //aspecto distinto
            addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent evt){
                   tesorosVisiblesSeleccionados.add(tesoro);
                }
            });     
        }
        
        Tesoro getTesoro() {
            return tesoro;
        }
    }
    
    
    private class TesoroGraficoOculto extends TesoroGrafico{
        TesoroGraficoOculto(Tesoro unTesoro){
            super(unTesoro);
            //aspecto distinto
            addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent evt){
                   tesorosOcultosSeleccionados.add(tesoro);
                }
            }); 
        }
        Tesoro getTesoro() {
            return tesoro;
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Monstruo = new javax.swing.JPanel();
        nombreMonstruo = new javax.swing.JLabel();
        nivelesGanados = new javax.swing.JLabel();
        tesorosGanados = new javax.swing.JLabel();
        nivelCombate = new javax.swing.JLabel();
        nivelesPerdidos = new javax.swing.JLabel();
        malRollo = new javax.swing.JLabel();
        info = new javax.swing.JLabel();
        Jugador = new javax.swing.JPanel();
        nombreJugador = new javax.swing.JLabel();
        tipoJugador = new javax.swing.JLabel();
        infoSectario = new javax.swing.JLabel();
        tesorosVisibles = new javax.swing.JPanel();
        tesorosOcultos = new javax.swing.JPanel();
        nivelJugador = new javax.swing.JLabel();
        equiparse = new javax.swing.JButton();
        comprarNivel = new javax.swing.JButton();
        descartarTesoros = new javax.swing.JButton();
        combatir = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Monstruo.setBorder(javax.swing.BorderFactory.createTitledBorder("Territorio del terrible monstruo"));

        nombreMonstruo.setText("Monstruo");

        nivelesGanados.setText("Nvl Ganados");

        tesorosGanados.setText("Tesoros Ganados");

        nivelCombate.setText("NvlCmbt");

        nivelesPerdidos.setText("NvlPerdidos");

        malRollo.setText("MalRollo");

        info.setText("Info");

        javax.swing.GroupLayout MonstruoLayout = new javax.swing.GroupLayout(Monstruo);
        Monstruo.setLayout(MonstruoLayout);
        MonstruoLayout.setHorizontalGroup(
            MonstruoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MonstruoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MonstruoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MonstruoLayout.createSequentialGroup()
                        .addComponent(nivelesGanados)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MonstruoLayout.createSequentialGroup()
                        .addGroup(MonstruoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tesorosGanados)
                            .addComponent(nombreMonstruo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(MonstruoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nivelCombate)
                            .addComponent(nivelesPerdidos))
                        .addGap(165, 165, 165))))
            .addGroup(MonstruoLayout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addGroup(MonstruoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(info)
                    .addComponent(malRollo))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        MonstruoLayout.setVerticalGroup(
            MonstruoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MonstruoLayout.createSequentialGroup()
                .addGroup(MonstruoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreMonstruo)
                    .addComponent(nivelCombate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nivelesGanados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MonstruoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tesorosGanados)
                    .addComponent(nivelesPerdidos))
                .addGap(18, 18, 18)
                .addComponent(malRollo)
                .addGap(18, 18, 18)
                .addComponent(info)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        Jugador.setBorder(javax.swing.BorderFactory.createTitledBorder("Parcelita de los debiles jugadores"));

        nombreJugador.setText("Nombre");

        tipoJugador.setText("Tipo");

        infoSectario.setText("InfoSectario");

        tesorosVisibles.setBorder(javax.swing.BorderFactory.createTitledBorder("Tesoros Visibles"));

        tesorosOcultos.setBorder(javax.swing.BorderFactory.createTitledBorder("Tesoros Ocultos"));

        nivelJugador.setText("nvlJugador");

        javax.swing.GroupLayout JugadorLayout = new javax.swing.GroupLayout(Jugador);
        Jugador.setLayout(JugadorLayout);
        JugadorLayout.setHorizontalGroup(
            JugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JugadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JugadorLayout.createSequentialGroup()
                        .addComponent(nombreJugador)
                        .addGap(87, 87, 87)
                        .addComponent(tipoJugador)
                        .addGap(99, 99, 99)
                        .addComponent(infoSectario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nivelJugador)
                        .addGap(130, 130, 130))
                    .addComponent(tesorosOcultos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tesorosVisibles, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        JugadorLayout.setVerticalGroup(
            JugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JugadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreJugador)
                    .addComponent(tipoJugador)
                    .addComponent(infoSectario)
                    .addComponent(nivelJugador))
                .addGap(18, 18, 18)
                .addComponent(tesorosVisibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tesorosOcultos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        equiparse.setText("Equiparse");
        equiparse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equiparseActionPerformed(evt);
            }
        });

        comprarNivel.setText("Comprar Nivel");
        comprarNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarNivelActionPerformed(evt);
            }
        });

        descartarTesoros.setText("Descartarse Tesoros");
        descartarTesoros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descartarTesorosActionPerformed(evt);
            }
        });

        combatir.setText("¡COMBATIR!");
        combatir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combatirActionPerformed(evt);
            }
        });

        siguiente.setText("Siguiente");
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(equiparse)
                        .addGap(18, 18, 18)
                        .addComponent(comprarNivel)
                        .addGap(18, 18, 18)
                        .addComponent(descartarTesoros)
                        .addGap(18, 18, 18)
                        .addComponent(combatir)
                        .addGap(18, 18, 18)
                        .addComponent(siguiente)
                        .addContainerGap(189, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Monstruo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Jugador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Monstruo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Jugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comprarNivel)
                    .addComponent(descartarTesoros)
                    .addComponent(combatir)
                    .addComponent(siguiente)
                    .addComponent(equiparse))
                .addContainerGap(359, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comprarNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarNivelActionPerformed
        // TODO add your handling code here:
        if(juego.comprarNivelesJugador(tesorosOcultosSeleccionados)) {
            info.setText("Has podido comprar niveles");
        } else info.setText("No has podido comprar niveles");
    }//GEN-LAST:event_comprarNivelActionPerformed

    private void equiparseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equiparseActionPerformed
        // TODO add your handling code here:
        juego.getJugadorActivo().equiparTesoros(tesorosOcultosSeleccionados);
        info.setText("Te has equipado los items");
        actualizarJugador();
    }//GEN-LAST:event_equiparseActionPerformed

    private void descartarTesorosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descartarTesorosActionPerformed
        // TODO add your handling code here:
        if (juego.descartarTesoros(tesorosVisiblesSeleccionados, tesorosOcultosSeleccionados)) {
            info.setText("Te has descartado de los tesoros");
        } else info.setText("No te has descartado de los tesoros oportunos");
        actualizarJugador();
    }//GEN-LAST:event_descartarTesorosActionPerformed

    private void combatirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combatirActionPerformed
        // TODO add your handling code here:
        int res = juego.desarollarCombate();
        switch (res) {
            case 1:
                info.setText("¡Has ganado! =)");
                break;
            case -2:
                info.setText("¡Has muerto! =(");
                break;
            case -1:
                info.setText("¡Has perdido! =(");
            case 0:
                info.setText("¡Has escapado!");
                break;
        }
        actualizarJugador();
    }//GEN-LAST:event_combatirActionPerformed

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        // TODO add your handling code here:
        try {
        juego.siguienteTurno();
        } catch (Exception ex) {
            System.err.println(ex);
        }
        if (juego.getJugadorActivo().obtenerNivel()==10) {
            info.setText(juego.getJugadorActivo().getNombre() + " has ganado!");
        }
        info.setText("Es tu turno "+juego.getJugadorActivo().getNombre());
        actualizarJugador();
        actualizarMonstruo();
    }//GEN-LAST:event_siguienteActionPerformed

    /**
     * @param args the command line arguments
     */
    @Override
    public void mostrar (String args[])  {
        JD_nombreJugadores dialogoNombres;
        dado = new JD_dado (this,true);
        dialogoNombres= new JD_nombreJugadores(this,true);
        nombresJugadores = dialogoNombres.getNombres();
        ArrayList<String> nombr = new ArrayList();
        for (int i=0;i<nombresJugadores.length;i++) {
            nombr.add(nombresJugadores[i]);
        }
        try {
        juego.comenzarJuego(nombr);
        } catch (Exception ex) {
            System.err.println(ex);
        }
        actualizarJugador();
        actualizarMonstruo();
        info.setText("Empieza el juego");
        this.setVisible(true);
        setTitle("Napakalaki-PDOO-Curso 2012/2013");
    }
    
    private void actualizarMonstruo () {
        nombreMonstruo.setText(juego.getMonstruoEnJuego().getNombre());
        malRollo.setText(juego.getMonstruoEnJuego().getMalRollo());
        nivelesGanados.setText(String.valueOf(juego.getMonstruoEnJuego().obtenerNivelesGanados()));
        tesorosGanados.setText(String.valueOf(juego.getMonstruoEnJuego().obtenerGananciaTesoros()));
        nivelCombate.setText(String.valueOf(juego.getMonstruoEnJuego().getValorBasico()));
        nivelesPerdidos.setText(String.valueOf(juego.getMonstruoEnJuego().obtenerNivelesPerdidos()));
        pack();
    }
    
    private void actualizarJugador () {
        TesoroGrafico unTesoroGrafico;
        jugadorActivo = juego.getJugadorActivo();
        nombreJugador.setText(juego.getJugadorActivo().getNombre());
        nivelJugador.setText(String.valueOf(juego.getJugadorActivo().obtenerNivel()));
        if(juego.getJugadorActivo() instanceof Jugador)
            tipoJugador.setText("normal");
        else 
            tipoJugador.setText("sectario");
        infoSectario.setText(String.valueOf(JugadorSectario.getNumeroSectarios()));
        tesorosVisibles.removeAll();
        for(Tesoro t : jugadorActivo.getTesorosVisibles()){
            unTesoroGrafico = new TesoroGraficoVisible(t);
            tesorosVisibles.add(unTesoroGrafico);
        }
        
        for(TesoroGrafico tg : tesorosVisiblesAlimpiar)
            tesorosVisibles.remove(tg);
        tesorosVisiblesAlimpiar.clear();

        tesorosOcultos.removeAll();
        for(Tesoro t : jugadorActivo.getTesorosOcultos()){
            unTesoroGrafico = new TesoroGraficoOculto(t);
            tesorosOcultos.add(unTesoroGrafico);
        }
        
        for(TesoroGrafico tg : tesorosOcultosAlimpiar) 
            tesorosOcultos.remove(tg);
        tesorosOcultosAlimpiar.clear();
        
        tesorosVisiblesSeleccionados.clear();
        tesorosOcultosSeleccionados.clear();
        repaint();
        pack();
    }
    
    
    @Override
    public int getDado(String s1, String s2) {
        return dado.getValor(s1, s2);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jugador;
    private javax.swing.JPanel Monstruo;
    private javax.swing.JButton combatir;
    private javax.swing.JButton comprarNivel;
    private javax.swing.JButton descartarTesoros;
    private javax.swing.JButton equiparse;
    private javax.swing.JLabel info;
    private javax.swing.JLabel infoSectario;
    private javax.swing.JLabel malRollo;
    private javax.swing.JLabel nivelCombate;
    private javax.swing.JLabel nivelJugador;
    private javax.swing.JLabel nivelesGanados;
    private javax.swing.JLabel nivelesPerdidos;
    private javax.swing.JLabel nombreJugador;
    private javax.swing.JLabel nombreMonstruo;
    private javax.swing.JButton siguiente;
    private javax.swing.JLabel tesorosGanados;
    private javax.swing.JPanel tesorosOcultos;
    private javax.swing.JPanel tesorosVisibles;
    private javax.swing.JLabel tipoJugador;
    // End of variables declaration//GEN-END:variables

}

