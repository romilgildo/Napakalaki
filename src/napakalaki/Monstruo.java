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

import java.util.ArrayList;
import napakalaki.Tesoro.TipoTesoro;

public class Monstruo {
    public String nombre;
    public int nivel;
    public int gananciaTesoros;
    public int gananciaNivel;
    public String malRollo;
    public int nivelesPerdidos;
    public int visiblesPerdidos;
    public int ocultosPerdidos;
    public ArrayList<TipoTesoro> tipoVisiblesPerdidos;
    public ArrayList<TipoTesoro> tipoOcultosPerdidos;
    private int nivelContraSectarios;
 
public Monstruo(String nombre,int nivel,int gananciaTesoros,int gananciaNivel,String malRollo,
                int nivelesPerdidos,ArrayList<TipoTesoro> tipoVisiblesPerdidos,ArrayList<TipoTesoro> tipoOcultosPerdidos,
                int visiblesPerdidos,int ocultosPerdidos,int nivelContraSectarios) {
    this.nombre=nombre;
    this.nivel=nivel;
    this.gananciaTesoros=gananciaTesoros;
    this.gananciaNivel=gananciaNivel;
    this.malRollo=malRollo;
    this.nivelesPerdidos=nivelesPerdidos;
    this.tipoVisiblesPerdidos=tipoVisiblesPerdidos;
    this.tipoOcultosPerdidos=tipoOcultosPerdidos;
    this.visiblesPerdidos=visiblesPerdidos;
    this.ocultosPerdidos=ocultosPerdidos;
    this.nivelContraSectarios=nivelContraSectarios;
}

    @Override
    public String toString() {
    return "El monstruo " + this.nombre + " de nivel " + this.nivel + " da " + gananciaTesoros +
            " tesoros, y " + this.gananciaNivel + " niveles";
}


public int obtenerGananciaTesoros(){
    return this.gananciaTesoros;
}

public String getNombre(){
    return nombre;
}

public int getValorBasico(){
    return this.nivel;
}

public int getValorEspecial(){
    return this.nivelContraSectarios;
}

public int obtenerNivelesGanados(){
    return this.gananciaNivel;
}

public boolean malRolloEsMuerte(){
    boolean muerte=false;
    if(this.nivelesPerdidos == 100){
        muerte=true;
    }
    return muerte;
}

public ArrayList< ArrayList<TipoTesoro> > cualEsTuMalRollo(){
    ArrayList< ArrayList<TipoTesoro> > malRo = new ArrayList(2);
    malRo.add(tipoVisiblesPerdidos);
    malRo.add(tipoOcultosPerdidos);
    
    return malRo;
}

public int obtenerNivelesPerdidos(){
    return -this.nivelesPerdidos;
}

public String getMalRollo() {
    return malRollo;
}

}