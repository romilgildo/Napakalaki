/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 /**
 * Rubén Martín Hidalgo
 * David Romero Díaz
 * Zacarías Romero Sellamitou
 */
package napakalaki;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import napakalaki.Tesoro.TipoTesoro;

public class Jugador {
    
    private String nombre;
    private int nivel=1;
    private int NIVEL_MINIMO=1;
    private int NIVEL_MAXIMO=10;
    private int TESOROS_OCULTOS_MAXIMO=4;
    private int numeroVisibles=0;
    private int numeroOcultos=0;
    ArrayList<Tesoro> tesorosVisibles;
    ArrayList<Tesoro> tesorosOcultos;
    ArrayList<TipoTesoro> malRolloVisible;
    ArrayList<TipoTesoro> malRolloOculto;
    public Jugador (String unNombre){
        this.nombre=unNombre;
        tesorosOcultos= new ArrayList(10);
        tesorosVisibles = new ArrayList(10);
        malRolloVisible = new ArrayList(10);
        malRolloOculto = new ArrayList(10);
    }
    
    public Jugador (Jugador jug) {
        nombre=jug.nombre;
        nivel=jug.nivel;
        numeroVisibles=jug.numeroVisibles;
        numeroOcultos=jug.numeroOcultos;
        tesorosVisibles=jug.tesorosVisibles;
        tesorosOcultos=jug.tesorosOcultos;
        malRolloVisible=jug.malRolloVisible;
        malRolloOculto=jug.malRolloOculto;
    }
    
    public int obtenerNivel(){
        return nivel;
    }
    public void modificarNivel(int nuevoNivel){
        this.nivel=nuevoNivel;
    }
    public int obtenerNivelCombate(){
        int nivc=0;
        nivc+=this.nivel;
        if (this.tienesCollar()) {
            for (Tesoro tes : tesorosVisibles) {
                nivc+=tes.bonusMaximo;
            }
        } else {
            for (Tesoro tes : tesorosVisibles) {
                nivc+=tes.bonusMinimo;
            }
        }
        return nivc;
    }
    public void robarTesoro(Tesoro unTesoro){
        tesorosOcultos.add(unTesoro);
    }
    public boolean descartarTesoros(ArrayList<Tesoro> tesorosVisDes,ArrayList<Tesoro> tesorosOcuDes) {
        actualizarMalRollo(tesorosVisDes,tesorosOcuDes);
        for (Tesoro tes : tesorosVisDes) {
            tesorosVisibles.remove(tes);
        }
        for (Tesoro tes : tesorosOcuDes) {
            tesorosOcultos.remove(tes);
        }
        return cumploMalRollo();
    }
    private void actualizarMalRollo(ArrayList<Tesoro> tesVisibles,ArrayList<Tesoro> tesOcultos) {
        for (Tesoro tes : tesVisibles) {
            if (malRolloVisible.contains(tes.tipo)) malRolloVisible.remove(tes.tipo);
        }
        for (Tesoro tes : tesOcultos) {
            if (malRolloOculto.contains(tes.tipo)) malRolloOculto.remove(tes.tipo);
        }
          
        numeroVisibles-=malRolloVisible.size();
        numeroOcultos-=malRolloOculto.size();
    }
    private boolean cumploMalRollo() {
        return (malRolloVisible.isEmpty() && malRolloOculto.isEmpty());
    }
            
    public void equiparTesoros(ArrayList<Tesoro> listaTesoro) {
        for (Tesoro tes : listaTesoro) {
            if (puedoEquipar(tes)) {
                tesorosVisibles.add(tes);
                tesorosOcultos.remove(tes);
            }
        }
    }
    private boolean puedoEquipar(Tesoro unTesoro) {
        boolean puedo = true;
        for (Tesoro tes : tesorosVisibles) {
            if (tes.tipo == unTesoro.tipo) puedo=false;
        }
        return puedo;
    }
    public int puedoPasar() {
        if (!cumploMalRollo()) {
            return -1;
        }
        if (malRolloVisible.isEmpty() && malRolloOculto.isEmpty()) {
            return 0;
        } else {
            return malRolloOculto.size();
        }
    }
    public boolean tengoTesoros() {
        if (tesorosVisibles.isEmpty() && tesorosOcultos.isEmpty()) {
            return false;
        } else return true;
    }
    public boolean comprarNiveles(ArrayList<Tesoro> tesoros) {
        boolean puedo = false;
        int cont=0;
        for (Tesoro tes : tesoros) {
            cont+=tes.piezasOro;
        }
        int niveles=cont/1000;
        if (niveles+this.nivel < NIVEL_MAXIMO) {
            puedo = true;
            incDecNivel(niveles);
            for (Tesoro tes : tesoros) {
                tesorosVisibles.remove(tes);
                tesorosOcultos.remove(tes);
            }
        }
        return puedo;
    }
    public void incDecNivel(int incDec) {
        this.nivel+=incDec;
    }
    public int combatir(Monstruo monstruoEnJuego) {
        if (obtenerNivelCombate() > obtenerNivelContrincante(monstruoEnJuego)) {
            incDecNivel(monstruoEnJuego.obtenerNivelesGanados());
            if (nivel>=10) return 10;
            else return 1;
        } else {
            Random r = new Random();
            int dado = 1 + r.nextInt(6);
            if (dado < 5) {
                if (monstruoEnJuego.malRolloEsMuerte()) {
                    nivel = NIVEL_MINIMO;
                    return -2;
                } else {
                    incluirMalRollo(monstruoEnJuego.cualEsTuMalRollo());
                    incDecNivel(monstruoEnJuego.obtenerNivelesPerdidos());
                    return -1;
                }
            } else return 0;
        }
    }
    public ArrayList<Tesoro> dameTodosTusTesoros() {
        ArrayList<Tesoro> tes = new ArrayList(tesorosVisibles.size()+tesorosOcultos.size());
        tes.addAll(tesorosVisibles);
        tes.addAll(tesorosOcultos);
        tesorosVisibles.clear();
        tesorosOcultos.clear();
        return tes;
    }
    public void incluirMalRollo(ArrayList<ArrayList<TipoTesoro> > lista) {
        malRolloVisible=lista.get(0);
        malRolloOculto=lista.get(1);
    }
    public Tesoro devuelveElCollar() {
        for (Tesoro tes : tesorosVisibles) {
            if (tes.tipo==TipoTesoro.COLLAR) {
                tesorosVisibles.remove(tes);
                return tes;
            }
        }
        return null;
    }
    public boolean tienesCollar() {
        boolean tieneCollar = false;
        for (Tesoro tes: this.tesorosVisibles) {
            if (tes.tipo==TipoTesoro.COLLAR) {
                tieneCollar=true;
            }
        }
        return tieneCollar;
    }
    
    private int obtenerNivelContrincante (Monstruo monstruo) {
        return monstruo.getValorBasico();
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public ArrayList<Tesoro> getTesorosVisibles () {
        return tesorosVisibles;
    }
    
    public ArrayList<Tesoro> getTesorosOcultos () {
        return tesorosOcultos;
    }
    
    private int getNumeroVisibles() {
        return numeroVisibles;
    }
    
    private int getNumeroOcultos() {
        return numeroOcultos;
    }
    
    public JugadorSectario convertirme(Sectario cartaSectario) {
        JugadorSectario js = new JugadorSectario(this,cartaSectario);
        return js;
    }
    
    public boolean puedoConvertirme () {
        Random r = new Random();
        int dado = 1 + r.nextInt(6);
        if (dado == 6) 
            return true;
        else
            return false;
    }
}

