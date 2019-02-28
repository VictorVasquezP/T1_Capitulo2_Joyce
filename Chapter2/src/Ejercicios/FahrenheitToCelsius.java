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
public class FahrenheitToCelsius {
    private Integer f;
    public static final float CINCO_NOV=(float)0.5555556;
    public FahrenheitToCelsius(Integer f){
        this.f=f;
    }
   
    public Integer getF() {
        return f;
    }

    public void setF(Integer f) {
        this.f = f;
    }
    public float celsius(){
        return((this.getF()-32)*(CINCO_NOV));
    }
    @Override
    public String toString(){
        return String.format("La temperatura en Fahrenheit es: %d\nLa temperatura en Celsius es: %f",this.getF(),this.celsius());
    }
}
