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
public class MilesToFeetInteractive {
    public static final int PIES = 5280;
    private float distancia;
    public MilesToFeetInteractive(float distancia){
        this.distancia = distancia;
    }
    public MilesToFeetInteractive(){
        
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
