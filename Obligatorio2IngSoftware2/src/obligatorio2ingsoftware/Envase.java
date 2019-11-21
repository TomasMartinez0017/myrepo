/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio2ingsoftware;

import java.awt.Image;

/**
 *
 * @author tomasmartinez
 */
public class Envase {
    private int nroEnvase;
    private String nombre;
    private String material;
    
    public Envase(){
        nroEnvase = 0;
        nombre = " ";
        material = " ";
    }

    public Envase(int nroEnvase, String nombre, String material) {
        this.setNroEnvase(nroEnvase);
        this.setNombre(nombre);
        this.setMaterial(material);
    }
    
    
    public String getNombre(){
        return nombre;
    }
    
    public String getMaterial(){
        return material;
    }
    
    
    public void setNombre(String unNombre){
        nombre = unNombre;
    }
    
    public void setMaterial(String unMaterial){
        material = unMaterial;
    }
    
    public int getNroEnvase() {
        return nroEnvase;
    }

    public void setNroEnvase(int nroEnvase) {
        this.nroEnvase = nroEnvase;
    }

    @Override
    public boolean equals (Object objeto){
        Envase envase = (Envase)objeto;
        return this.getNroEnvase()==envase.getNroEnvase();
    }    
    
      @Override
    public String toString() {
        return this.getNombre();
    }
    
}
