/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import napakalaki.Tesoro.TipoTesoro;

/**
 *
 * @authors David Romero Diaz.
 *          Zacarias Romero Sellamitou.
 *          Ruben Martin Hidalgo.
 */
public class Napakalaki { 

   
    private static final Napakalaki instance = new Napakalaki();
    private Napakalaki(){}
    public static Napakalaki getInstance(){
        return instance;
    }

    private Jugador jugadorActivo;
    private ArrayList<Jugador> nombreJugadores;
    private ArrayList<Tesoro> mazoTesoros = new ArrayList(100);
    private ArrayList<Tesoro> descarteTesoros = new ArrayList(100);
    private Monstruo monstruoActivo;
    private ArrayList<Monstruo> mazoMonstruos = new ArrayList(100);
    private ArrayList<Monstruo> descarteMonstruos = new ArrayList(100);
    private Tesoro tesoroActivo;
    private ArrayList<Sectario> mazoSectarios = new ArrayList(6);
    private Sectario sectarioActivo;
    private Vista vista;
    public ArrayList<TipoTesoro> vacio = new ArrayList(0);
    
    public void setVista(Vista unaVista) {
        vista = unaVista;
    }
    
    private void inicializarJuego(){
        ArrayList<TipoTesoro> bdbv=new ArrayList(1); bdbv.add(TipoTesoro.ARMADURA);
        ArrayList<TipoTesoro> bdbo=new ArrayList(1); bdbo.add(TipoTesoro.ARMADURA);
        ArrayList<TipoTesoro> hpmv=new ArrayList(1); hpmv.add(TipoTesoro.ARMADURA);
        ArrayList<TipoTesoro> rv=new ArrayList(1); rv.add(TipoTesoro.DOSMANOS);
        ArrayList<TipoTesoro> bv=new ArrayList(1); bv.add(TipoTesoro.ARMADURA);
        ArrayList<TipoTesoro> adlniv=new ArrayList(1); adlniv.add(TipoTesoro.MANO);
        ArrayList<TipoTesoro> adlnio=new ArrayList(1); adlnio.add(TipoTesoro.MANO);
        ArrayList<TipoTesoro> eev=new ArrayList(1); eev.add(TipoTesoro.CASCO);
        ArrayList<TipoTesoro> cv=new ArrayList(1); cv.add(TipoTesoro.CASCO);
        ArrayList<TipoTesoro> esddv=new ArrayList(1); esddv.add(TipoTesoro.CALZADO);
        ArrayList<TipoTesoro> manovisible = new ArrayList(1); manovisible.add(TipoTesoro.MANO);
        ArrayList<TipoTesoro> tesorosvisibles = new ArrayList(5); 
        tesorosvisibles.add(TipoTesoro.CALZADO);
        tesorosvisibles.add(TipoTesoro.CASCO);
        tesorosvisibles.add(TipoTesoro.DOSMANOS);
        tesorosvisibles.add(TipoTesoro.COLLAR);
        tesorosvisibles.add(TipoTesoro.ARMADURA);
        ArrayList<TipoTesoro> Felvis = new ArrayList(2); 
        Felvis.add(TipoTesoro.CASCO);
        Felvis.add(TipoTesoro.ARMADURA);
        ArrayList<TipoTesoro> Felocu = new ArrayList(5);
        Felocu.add(TipoTesoro.CALZADO);
        Felocu.add(TipoTesoro.CASCO);
        Felocu.add(TipoTesoro.DOSMANOS);
        Felocu.add(TipoTesoro.COLLAR);
        Felocu.add(TipoTesoro.ARMADURA);
        
        mazoTesoros.add(new Tesoro("Porra preternatural", TipoTesoro.MANO, 2, 3, 200));
        mazoTesoros.add(new Tesoro("Necro-comicon", TipoTesoro.MANO, 1, 1, 100));
        mazoTesoros.add(new Tesoro("Linterna a 2 manos", TipoTesoro.DOSMANOS, 3, 6, 400));
        mazoTesoros.add(new Tesoro("Necronomicon", TipoTesoro.DOSMANOS, 5, 7, 800));
        mazoTesoros.add(new Tesoro("Varita de atizamiento", TipoTesoro.MANO, 3, 4, 400));
        mazoTesoros.add(new Tesoro("Clavo de rail ferroviario", TipoTesoro.MANO, 3, 6, 400));
        mazoTesoros.add(new Tesoro("La fuerza de Mr. T", TipoTesoro.COLLAR, 8, 8, 1000));
        mazoTesoros.add(new Tesoro("Cuchillo de sushi arcano", TipoTesoro.MANO, 2, 3, 300));
        mazoTesoros.add(new Tesoro("Fez alopodo", TipoTesoro.CASCO, 3, 5, 700));
        mazoTesoros.add(new Tesoro("Insecticida", TipoTesoro.MANO, 2, 3, 300));
        mazoTesoros.add(new Tesoro("Shogulador", TipoTesoro.DOSMANOS, 1, 1, 600));
        mazoTesoros.add(new Tesoro("Camiseta de la UGR", TipoTesoro.ARMADURA, 1, 7, 100));
        mazoTesoros.add(new Tesoro("Gaita", TipoTesoro.DOSMANOS, 4, 5, 500));
        mazoTesoros.add(new Tesoro("Necro-playboycon", TipoTesoro.MANO, 3, 5, 300));
        mazoTesoros.add(new Tesoro("Capucha de Cthulhu", TipoTesoro.CASCO, 3, 5, 500));
        mazoTesoros.add(new Tesoro("Zapato deja-amigos", TipoTesoro.CALZADO, 0, 1, 500));
        mazoTesoros.add(new Tesoro("Botas de lluvia acida", TipoTesoro.DOSMANOS, 1, 1, 800));
        mazoTesoros.add(new Tesoro("Lanzallamas", TipoTesoro.DOSMANOS, 4, 8, 800));
        mazoTesoros.add(new Tesoro("Necrotelecom", TipoTesoro.CASCO, 2, 3, 300));
        mazoTesoros.add(new Tesoro("Escopeta de 3 cañones", TipoTesoro.DOSMANOS, 4, 6, 700));
        mazoTesoros.add(new Tesoro("TentÃ¡culo de pega", TipoTesoro.CASCO, 0, 1, 200));
        mazoTesoros.add(new Tesoro("Garabato mistico", TipoTesoro.MANO, 2, 2, 300));
        mazoTesoros.add(new Tesoro("La rebeca metalica", TipoTesoro.ARMADURA, 2, 3, 400));
        mazoTesoros.add(new Tesoro("A prueba de babas", TipoTesoro.ARMADURA, 2, 5, 400));
        mazoTesoros.add(new Tesoro("Casco minero", TipoTesoro.CASCO, 2, 4, 400));
        mazoTesoros.add(new Tesoro("¡Si mi amo!", TipoTesoro.CASCO, 4, 7, 0));
        mazoTesoros.add(new Tesoro("Hacha prehistorica", TipoTesoro.MANO, 2, 5, 500));
        mazoTesoros.add(new Tesoro("Mazo de los antiguos", TipoTesoro.MANO, 3, 4, 200));
        mazoTesoros.add(new Tesoro("El aparato del Pr. Tesla", TipoTesoro.ARMADURA, 4, 8, 900));
        mazoTesoros.add(new Tesoro("Botas de investigacion", TipoTesoro.CALZADO, 3, 4, 600));
        mazoTesoros.add(new Tesoro("Ametralladora Thompson", TipoTesoro.DOSMANOS, 4, 8, 600));
        mazoTesoros.add(new Tesoro("Necro-gnomicon", TipoTesoro.MANO, 2, 4, 200));      
        
        
        mazoMonstruos.add(new Monstruo("Pollipolipo volante", 3,
        1, 1, "Da mucho asquito.\nPierdes tres niveles.", 3, vacio,
        vacio,0, 0, 0));
    
        mazoMonstruos.add(new Monstruo("El sopor de Dunwich", 2,
        1, 1, "El primordial bostezo contagioso. Pierdes el calzaco visible.", 0,
        esddv, vacio, 0, 0, 0));

        mazoMonstruos.add(new Monstruo("El rey de la rosa", 13,
        4, 2, "\nPierdes 5 niveles y 3 tesoros.", 5, vacio, 
        vacio,3, 0, 0));

        mazoMonstruos.add(new Monstruo("Chibithulhu", 2,
        1, 1, "Embobados con el lindo primigenio te descartas de tu casco visible.",
        0, cv, vacio, 0, 0, 0));

        mazoMonstruos.add(new Monstruo("El gorron en el umbral", 10,
        3, 1, "Pierdes todos tus tesoros visibles.", 0, vacio, 
        vacio, 10, 0, 0));

        mazoMonstruos.add(new Monstruo("Los hondos", 8,
        2, 1, "Estos monstruos resultan bastane superficiales y te aburren mortalmente."
        + " Estas muerto.", 100, vacio, vacio, 0, 0, 0));

        mazoMonstruos.add(new Monstruo("El espia", 5,
        1, 1, "Te asusta por la noche.\nPierdes el casco visible."
        , 0, eev, vacio, 0, 0, 0));

        mazoMonstruos.add(new Monstruo("3 Byakhees de bonanza", 8,
        2, 1, "Pierdes tu armadura visible y otra oculta."
        , 0, bdbv , bdbo, 0, 0, 0));

        mazoMonstruos.add(new Monstruo("Angeles de la noche ibicenca", 14,
        4, 1, "Te atrapan para llevarte de fiesta y te dejan caer en mitad del vuelo."
                + "Descarta 1 mano visible y otra oculta."
        , 0, adlniv, adlnio, 0, 0, 0));

        mazoMonstruos.add(new Monstruo("La que redacta en las tinieblas", 2,
        1, 1, "Toses los pulmones y pierdes dos niveles."
        , 2, vacio, vacio, 0, 0, 0));

         mazoMonstruos.add(new Monstruo("Bichgooth", 2,
        1, 1, "Sientes bichos bajo la ropa. Descarta la armadura visible."
        , 0, bv, vacio, 0, 0, 0));

        mazoMonstruos.add(new Monstruo("Semillas Cthulhu", 4,
        2, 1, "Pierdes 2 niveles y 2 tesoros ocultos."
        , 2, vacio, vacio, 0, 2, 0)); 

        mazoMonstruos.add(new Monstruo("Roboggoth", 8,
        2, 1, "La quinta directiva primaria te obliga a perder 2 niveles y un"
                + "tesoro 2 manos visible."
        , 2, rv, vacio, 0, 0, 0));

        mazoMonstruos.add(new Monstruo("Yskhtihyssg-Goth", 12,
        3, 1, "No le hace gracia que pronuncien mal su nombre. Estas muerto."
        , 100, vacio, vacio, 0, 0, 0));

        mazoMonstruos.add(new Monstruo("H.P. Munchcraft", 6,
        2, 1, "Pierdes la armadura visible"
        , 0, hpmv, vacio, 0, 0, 0));
        
        // ultimos  monstruos aniadidos
        
        mazoMonstruos.add(new Monstruo("Dameargo", 1,
        2, 1, "Te intentas escaquear. Pierdes una mano visible."
        , 0, adlniv, vacio, 1, 0, 0));
        
        mazoMonstruos.add(new Monstruo("El lenguas", 20,
        1, 1, "Menudo susto te llevas. Pierdes 2 niveles y 5 tesoros visibles."
        , 2, tesorosvisibles, vacio, 5, 0, 0));
        
        mazoMonstruos.add(new Monstruo("Bicefalo", 20,
        1, 1, "Te faltan manos para tanta cabeza. Pierdes 3 niveles y tus tesoros visibles de las manos."
        , 3, tesorosvisibles, vacio, 5, 0, 0));
        
        mazoMonstruos.add(new Monstruo("Familia Feliz", 1,
        1, 1, "La familia te atrapa. Estas muerto."
        , 100, vacio, vacio, 0 , 0, 0));
       
        // ultimos monstruos sectarios

        mazoMonstruos.add(new Monstruo("El mal indecible impronunciable", 10,
        3, 1, "Pierdes una mano visible.", 0, manovisible, vacio, 1 , 0, -2));
        
        mazoMonstruos.add(new Monstruo("Testigos Oculares", 6,
        2, 1, "Pierdes tus tesoros visibles. Jajaja.", 0, tesorosvisibles, vacio, 5 , 0, 2));
        
        mazoMonstruos.add(new Monstruo("El gran cthulhu", 20,
        2, 5, "Hoy no es tu dia de suerte. Mueres.", 100, vacio, vacio, 0 , 0, 4));
        
        mazoMonstruos.add(new Monstruo("Serpiente Politico", 8,
        2, 1, "Tu gobierno te recorta 2 niveles.", 2, vacio, vacio, 0 , 0, -2));
        
        mazoMonstruos.add(new Monstruo("Felpuggoth ", 2, 1, 1, 
        "Pierdes tu casco y tu armadura visible. Pierdes 3 tesoros ocultos.",
        0, Felvis, Felocu, 2 , 3, 5));
        
        mazoMonstruos.add(new Monstruo("Shoggoth ", 16, 4, 2, 
        "Pierdes 2 niveles.", 2, vacio, vacio, 0 , 0, -4));
        
        mazoMonstruos.add(new Monstruo("Lolitagooth ", 2, 1, 1, 
        "Pintalabios negro. Pierdes 2 niveles.", 2, vacio, vacio, 0 , 0, 3));
       
        //mazoSectarios
        
        mazoSectarios.add(new Sectario("Sectario",1));
        mazoSectarios.add(new Sectario("Sectario",2));
        mazoSectarios.add(new Sectario("Sectario",1));
        mazoSectarios.add(new Sectario("Sectario",2));
        mazoSectarios.add(new Sectario("Sectario",1));
        mazoSectarios.add(new Sectario("Sectario",1));
        
    }
     
    public void EnseniarMazos() {
        for (Tesoro tes : this.mazoTesoros) {
            System.out.println(tes.toString());
        }
        for (Monstruo mons : this.mazoMonstruos) {
            System.out.println(mons.toString());
        }
    }
    
    //private Napakalaki Crear(); // ya se hace crea en Napakalaki()
    
    public void comenzarJuego(ArrayList<String> nombres) throws Exception{
        inicializarJuego();
        inicializarJugadores(nombres);
        repartirCartas();
        siguienteTurno();
        if(nombres.size() < 3 || nombres.size() > 4){
            throw new Exception ("Numero de jugadores no permitido.");
        }
    }
    
    private void inicializarJugadores(ArrayList<String> nombres) {
        nombreJugadores = new ArrayList(nombres.size());
        for (String nombre : nombres) {
            Jugador jug = new Jugador(nombre);
            nombreJugadores.add(jug);
        }
    }
    
    private void repartirCartas(){
        for (Jugador jug : nombreJugadores) {
            Random rand = new Random();
            int dado = rand.nextInt(6) + 1;
            if (dado == 1) {
                jug.robarTesoro(siguienteTesoro());
            }
            if (dado > 1 && dado < 6) {
                for (int i=0;i<2;i++) {
                    jug.robarTesoro(siguienteTesoro());
                }
            }
            if (dado == 6) {
                for (int i=0;i<3;i++) {
                    jug.robarTesoro(siguienteTesoro());
                }
            }
        }
    }
    
    public int siguienteTurno()throws Exception{
        if(jugadorActivo == null){
            jugadorActivo = primerJugador();
            monstruoActivo = siguienteMonstruo();
            tesoroActivo = siguienteTesoro();
            sectarioActivo = siguienteSectario();
        }
        int fin = jugadorActivo.puedoPasar();
        System.out.println(fin);
        if(fin == 0) {
            jugadorActivo = siguienteJugador();
            boolean tieneTesoros = jugadorActivo.tengoTesoros();
            if (!tieneTesoros) {
                Random rand = new Random();
                int dado = rand.nextInt(6) + 1;
                if (dado == 1) {
                    jugadorActivo.robarTesoro(siguienteTesoro());
                }
                if (dado > 1 && dado < 6) {
                    for (int i=0;i<2;i++) {
                    jugadorActivo.robarTesoro(siguienteTesoro());
                    }
                }
                if (dado == 6) {
                    for (int i=0;i<3;i++) {
                    jugadorActivo.robarTesoro(siguienteTesoro());
                    }
                }
            }
            monstruoActivo=siguienteMonstruo();
        }
        return fin;
    }
        
    
        
    // Estas 4 son las que no se muy bien como deben hacerse
    private Jugador primerJugador(){
        return nombreJugadores.get(0);
    }
    
    private Monstruo siguienteMonstruo(){
        int indexMonstruo =(mazoMonstruos.indexOf(monstruoActivo) + 1) % mazoMonstruos.size();
        return mazoMonstruos.get(indexMonstruo);
    }
    
    private Tesoro siguienteTesoro(){
        int indexTesoro =(mazoTesoros.indexOf(tesoroActivo) + 1) % mazoTesoros.size();
        tesoroActivo=mazoTesoros.get(indexTesoro);
        return tesoroActivo;
    }
    
    private Jugador siguienteJugador(){
         int indexJugador =(nombreJugadores.indexOf(jugadorActivo) + 1) % nombreJugadores.size();
         return nombreJugadores.get(indexJugador);
    }

    private Sectario siguienteSectario(){
         int indexSectario =(mazoSectarios.indexOf(sectarioActivo) + 1) % mazoSectarios.size();
         return mazoSectarios.get(indexSectario);
    }
    
    public int desarollarCombate(){
        int resultado = jugadorActivo.combatir(monstruoActivo);
        if (resultado == 1) {
            int tesorosGanados = monstruoActivo.obtenerGananciaTesoros();
            for (int i=0;i<tesorosGanados;i++) jugadorActivo.robarTesoro(siguienteTesoro());
            if (jugadorActivo.tienesCollar()) {
                descarteTesoros.add(jugadorActivo.devuelveElCollar());
            }
        }
        if (resultado == -2) {
            descarteTesoros.addAll(jugadorActivo.dameTodosTusTesoros());
        }
        return resultado;
     }     
    
    public boolean comprarNivelesJugador(ArrayList<Tesoro> tesoros){
        boolean puedo = false;
        puedo = jugadorActivo.comprarNiveles(tesoros);
        for(Tesoro tes : tesoros) {
            descarteTesoros.add(tes);
        }
        return puedo;
    }
    
    public boolean descartarTesoros(ArrayList<Tesoro> tesorosVisibles, 
            ArrayList<Tesoro> tesorosOcultos){
        boolean cumploMR = false;
        cumploMR = jugadorActivo.descartarTesoros(tesorosVisibles, tesorosOcultos);
        for(Tesoro tes : tesorosVisibles) descarteTesoros.add(tes);
        for(Tesoro tes : tesorosOcultos) descarteTesoros.add(tes);
        return cumploMR;
    }
    
    public Monstruo getMonstruoEnJuego() {
        return monstruoActivo;
    }
    
    public Jugador getJugadorActivo(){
        return jugadorActivo;
    }
}
    /* main
    public static void main(String[] args) {
        
    Napakalaki nap = new Napakalaki();
    nap.inicializarJuego();
    nap.EnseniarMazos();
    
}
  */    