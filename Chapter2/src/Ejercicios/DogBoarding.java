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
public class DogBoarding {
    public static final float COST = (float)0.50; 
    private Integer peso;
    private Integer dias;
    public DogBoarding(Integer peso, Integer dias){
        this.peso=peso;
        this.dias=dias;
    }
   
    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }
   
    public Integer getDias() {
        return dias;
    }

    public void setDias(Integer dias) {
        this.dias = dias;
    }
    
    @Override
    public String toString(){
        return String.format("Precio total por embarque: $ %.2f",(this.getPeso()*COST*this.getDias()));
    }
}
