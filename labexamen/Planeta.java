/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexamen;

/**
 *
 * @author jcgof
 */
public class Planeta {
    private String nombre;
    private int tamano;
    private double peso;
    private int cordx;
    private int cordy;

    public Planeta(String nombre, int tamano, double peso, int cordx, int cordy) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.peso = peso;
        this.cordx = cordx;
        this.cordy = cordy;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getCordx() {
        return cordx;
    }

    public void setCordx(int cordx) {
        this.cordx = cordx;
    }

    public int getCordy() {
        return cordy;
    }

    public void setCordy(int cordy) {
        this.cordy = cordy;
    }
    
    
    
}
