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
public class SammysRentalPrice {
    private Integer min;
    public static final Integer COST =40;
    public SammysRentalPrice(Integer min){
        this.min=min;
    }
    public Integer getMin() {
        return min;
    }
    public void setMin(Integer min) {
        this.min = min;
    }
    public Integer priceTotal(){
        return (((this.getMin()/60)*COST)+(this.getMin()%60));
    }
    @Override
    public String toString(){
        return String.format("Horas de alquiler: %d\nMinutos de alquiler: %d\nPrecio total: %d",this.getMin()/60,this.getMin()%60,this.priceTotal());
    }
    public String lemaS(){
        return "*****************************************\n* Sammy´s lo hace divertido bajo el sol *\n*****************************************";
    }   
}
