/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Objects;

/**
 *
 * @author Victor
 */
public class TicketNumber {
     private Integer number;
    public TicketNumber(Integer number){
        this.number=number;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
    public Integer removeLast(){
        return this.getNumber()%10;
    }
    public Integer newNumber(){
        return (this.getNumber()/10);
    }
    public Integer toCompare(){
        return this.newNumber()-((this.newNumber()/7)*7);
    }
    public Boolean identify(){
        //Objets.equals retorna true si los parametros soniguales, false caso contrario
        return Objects.equals(this.removeLast(), this.toCompare());
    }
}
