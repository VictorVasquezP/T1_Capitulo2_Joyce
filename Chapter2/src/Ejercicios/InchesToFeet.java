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
public class InchesToFeet {
     private int inches;
    public InchesToFeet(){
        this.inches = 86;
    }
    @Override
    public String toString(){
        return String.format("Las pulgadas son: %d y los pies son: %d",inches/12,inches%12);
    }
}
