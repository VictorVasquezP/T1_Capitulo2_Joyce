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
public class CarlysEventPrice {
    private Integer invitados;
    public static final Integer PERSONA=35;
    public CarlysEventPrice(Integer invitados){
        this.invitados=invitados;
    }
    public Integer getInvitados() {
        return invitados;
    }
    public void setInvitados(Integer invitados) {
        this.invitados = invitados;
    }
    public String lema(){
        return "********************************************************\n* Carly hace la comida que lo convierte en una fiesta *\n********************************************************";
    }           
    public Integer totalPrice(){
        return this.getInvitados()*PERSONA;
    }
    @Override
    public String toString(){
        return String.format("N° Invitados: %d\nPrecio por huésped: %d\nPrecio total: %d",this.getInvitados(),PERSONA,this.totalPrice());
    }
    public Boolean taman(){
        return this.getInvitados()>= 50;
    }
}
