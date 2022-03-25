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
public class Terrestre extends Planeta{

    public Terrestre(String nombre, int tamano, double peso, int cordx, int cordy) {
        super(nombre, tamano, peso, cordx, cordy);
    }

    @Override
    public String toString() {
        return "Terrestre{" + super.toString();
    }
    
}
