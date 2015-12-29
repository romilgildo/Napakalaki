/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

/**
 * Rubén Martín Hidalgo
 * David Romero Díaz
 * Zacarías Romero Sellamitou
 */
 
public class Sectario {
    private String nombre;
    private int gananciaNivel;
    
    public Sectario (String nom, int gn) {
        this.nombre=nom;
        this.gananciaNivel=gn;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getValorBasico() {
        return gananciaNivel;
    }
    
    public int getValorEspecial() {
        return gananciaNivel*JugadorSectario.getNumeroSectarios();
    }
}
