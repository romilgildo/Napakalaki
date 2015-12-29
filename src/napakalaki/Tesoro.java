/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zacarias Romero Sellamitou
 *         Ruben Martin Hidaldo
 *         David Romero Diaz
 */

package napakalaki;

public class Tesoro {
    public enum TipoTesoro {ARMADURA,MANO,DOSMANOS,CASCO,CALZADO,COLLAR};
    public String nombre;
    public TipoTesoro tipo;
    public int bonusMinimo;
    public int bonusMaximo;
    public int piezasOro;

public Tesoro(String nombre,TipoTesoro tipo,int bonusMin,int bonusMax,int piezas) {
    this.nombre=nombre;
    this.tipo=tipo;
    this.bonusMinimo=bonusMin;
    this.bonusMaximo=bonusMax;
    this.piezasOro=piezas;
}

public String toString() {
    return "El tesoro " + this.nombre + " de tipo " + this.tipo + " con bonus " +
            this.bonusMinimo + " " + this.bonusMaximo + " de valor " + this.piezasOro;
}

public String getNombre(){
    return nombre;
}

public int getValorBasico(){
    return this.bonusMinimo;
}

public int getValorEspecial(){
    return this.bonusMaximo;
}

}