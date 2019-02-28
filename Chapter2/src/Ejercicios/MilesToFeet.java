/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *
 * @author Victor
 */
public class MilesToFeet {
     public static final int PIES = 5280;
    
    private float distancia;
    public MilesToFeet(){
       this.distancia=(float) 8.5;
    }
    public float getDistancia() {
        return distancia;
    }
    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }
    @Override
    public String toString(){
        return String.format("La distancia de mi casa a la de mi tio es: %.2f",distancia*PIES);
    } 
}
