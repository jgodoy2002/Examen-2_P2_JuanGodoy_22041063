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
public class Gaseoso extends Planeta{
    
    public Gaseoso(String nombre, int tamano, double peso, int cordx, int cordy) {
        super(nombre, tamano, peso, cordx, cordy);
    }

    @Override
    public String toString() {
        return "Gaseoso{" + super.toString();
    }
    
    
    
}
