/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;

/**
 * Rubén Martín Hidalgo
 * David Romero Díaz
 * Zacarías Romero Sellamitou
 */
public class JugadorSectario extends Jugador {
    
    private static int numeroSectarios;
    Sectario miCartaSectario;
    
    public static int getNumeroSectarios() {
        return numeroSectarios;
    }
    
    private static void incrementarNumeroSectarios() {
        numeroSectarios++;
    }
    
    public JugadorSectario(Jugador jug, Sectario carta) {
        super(jug);
        this.miCartaSectario=carta;
        incrementarNumeroSectarios();
    }
    
    @Override
    public JugadorSectario convertirme(Sectario cartaSectario) {
        return this;
    }
    
    public int obtenerNivelCombate () {
        return super.obtenerNivelCombate() + miCartaSectario.getValorEspecial();        
    }
    
    private int obtenerNivelContrincante (Monstruo monstruo) {
        return monstruo.getValorEspecial();       
    }
    
    public int calcularNivelesAComprar(ArrayList<Tesoro> tesoros) {
        int cont=0;
        for (Tesoro tes : tesoros) {
            cont+=tes.piezasOro*2;
        }
        return cont/1000;
    }
    
    public boolean puedoConvertirme() {
        return false;
    }
}
