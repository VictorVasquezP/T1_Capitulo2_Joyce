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
public class Eggs {
    public static final String COLOR = "marron";
    public static final float COSTO_DOCENA = (float) 3.25;
    public static final float COSTO_UNO = (float) 0.45;
    private Integer huevos;
    public Eggs(Integer huevos){
        this.huevos=huevos;
    }
    
    public Integer getHuevos() {
        return huevos;
    }

    public void setHuevos(Integer huevos) {
        this.huevos = huevos;
    }
    public float total(){
        return (((huevos/12)*COSTO_DOCENA)+((huevos%12)*COSTO_UNO));
    }
    @Override
    public String toString(){
        return String.format("Usted ordenó %d huevos de color %s. Eso es %d docenas a $ %.2f por docena y %d huevos sueltos a %.2f centavos cada uno por un total de $ %.2f",this.getHuevos(),COLOR,this.getHuevos()/12,COSTO_DOCENA,this.getHuevos()%12,COSTO_UNO,this.total()); 
    }
}
