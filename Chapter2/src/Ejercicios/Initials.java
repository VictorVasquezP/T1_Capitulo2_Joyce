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
public class Initials {
     private Character a;
    private Character b;
    private Character c;
    public Initials(Character a, Character b, Character c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public Character getA() {
        return a;
    }
    public void setA(Character a) {
        this.a = a;
    }
    public Character getB() {
        return b;
    }
    public void setB(Character b) {
        this.b = b;
    }
    public Character getC() {
        return c;
    }
    public void setC(Character c) {
        this.c = c;
    }
    @Override
    public String toString(){
        return String.format("%c.%c.%c",this.getA(),this.getB(),this.getC());
    }
}
