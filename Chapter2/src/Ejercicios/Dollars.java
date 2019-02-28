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
public class Dollars {
    private Integer dolares;
    public Dollars(Integer dolares){
        this.dolares=dolares;
    }
  
    public Integer getDolares() {
        return dolares;
    }

    public void setDolares(Integer dolares) {
        this.dolares = dolares;
    }
    @Override
    public String toString(){
        return String.format("Queda convertido a:\nEn moneda de 20 son: %d\nEn moneda de 10 son: %d\nEn moneda de 5 son: %d\nEn moneda de 1 son: %d",this.getDolares()/20,this.getDolares()/10,this.getDolares()/5,this.getDolares());
    }
}
