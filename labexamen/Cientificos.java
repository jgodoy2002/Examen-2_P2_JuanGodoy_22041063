/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexamen;
import java.util.ArrayList;
/**
 *
 * @author jcgof
 */
public class Cientificos {
    private String nombre;
    private ArrayList<Planeta> listaP;

    public Cientificos(String nombre) {
        this.nombre = nombre;
        listaP = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Planeta> getListaP() {
        return listaP;
    }

    public void setListaP(ArrayList<Planeta> listaP) {
        this.listaP = listaP;
    }
    
    
    
    
}
