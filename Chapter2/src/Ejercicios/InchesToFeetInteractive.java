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
public class InchesToFeetInteractive {
    private int inches;
    public InchesToFeetInteractive(int inches){
        this.inches = inches;
    }
    
    @Override
    public String toString(){
        return String.format("Las pulgadas son: %d y los pies son: %d",getInches()/12,getInches()%12);
    }
    public int getInches() {
        return inches;
    }
    public void setInches(int inches) {
        this.inches = inches;
    }
}
