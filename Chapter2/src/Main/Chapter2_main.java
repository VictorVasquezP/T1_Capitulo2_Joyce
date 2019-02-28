/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Ejercicios.CarlysEventPrice;
import Ejercicios.DogBoarding;
import Ejercicios.Dollars;
import Ejercicios.Eggs;
import Ejercicios.Ejercicio_Dos;
import Ejercicios.Ejercicio_Uno;
import Ejercicios.FahrenheitToCelsius;
import Ejercicios.InchesToFeet;
import Ejercicios.InchesToFeetInteractive;
import Ejercicios.Initials;
import Ejercicios.MilesToFeet;
import Ejercicios.MilesToFeetInteractive;
import Ejercicios.ProjectedSales;
import Ejercicios.ProjectedSalesInteractive;
import Ejercicios.SammysRentalPrice;
import Ejercicios.TicketNumber;

/**
 *
 * @author Victor
 */
public class Chapter2_main {
    public static void main(String[] args){
        Ejercicio_Uno cap = new Ejercicio_Uno();
        System.out.println("Ejercicio 1");
        System.out.println("inciso a) = " + cap.ak(3, 7, 2));
        System.out.println("inciso b) = " + cap.b(18, 3, 4));
        System.out.println("inciso c) = " + cap.c(9, 3, 12, 4));
        System.out.println("inciso d) = " + cap.def(15, 2));
        System.out.println("inciso e) = " + cap.def(14, 3));
        System.out.println("inciso f) = " + cap.def(29, 10));
        System.out.println("inciso g) = " + cap.ghim(14, 2));
        System.out.println("inciso h) = " + cap.ghim(15, 2));
        System.out.println("inciso i) = " + cap.ghim(31, 7));
        System.out.println("inciso j) = " + cap.j(6, 4, 1));
        System.out.println("inciso k) = " + cap.k(5, 6, 3));
        System.out.println("inciso l) = " + cap.l(25, 3, 2));
        System.out.println("inciso m) = " + cap.ghim(13, 15));
        Ejercicio_Dos cap2= new Ejercicio_Dos();
        System.out.println("Ejercicio 2");
        System.out.println("inciso a) = " + cap2.aa(5, 8) );
        System.out.println("inciso b) = " + cap2.bb(4, 9));
        System.out.println("inciso c) = " + cap2.cc(3, 4));
        System.out.println("inciso d) = " + cap2.dd(12, 12));
        System.out.println("inciso e) = " + cap2.ee(3, 4, 8));
        System.out.println("inciso f) = " + cap2.f(7, 9, 2));
        System.out.println("inciso g) = " + cap2.gi(5, 5));
        System.out.println("inciso h) = " + cap2.h(15, 3, 5));
        System.out.println("inciso i) = " + cap2.gi(9, 9));
        System.out.println("inciso j) = " + cap2.j(3, 5, 2, 16));
        MilesToFeet milla = new MilesToFeet();
        System.out.println("MilesToFeet");
        System.out.println(milla);
        MilesToFeetInteractive miles = new MilesToFeetInteractive((float) 8.5);
        System.out.println("MilesToFeetInteractive");
        System.out.println(miles);
        ProjectedSales Pro = new ProjectedSales();
        System.out.println("ProjectedSales");
        System.out.println(Pro);
        System.out.println("ProjectedSalesInteractive");
        ProjectedSalesInteractive Proj = new ProjectedSalesInteractive(4000,5500);
        System.out.println(Proj);
        System.out.println("InchesToFeet");
        InchesToFeet In = new InchesToFeet();
        System.out.println(In);
        System.out.println("InchesToFeetInteractive");
        InchesToFeetInteractive inc = new InchesToFeetInteractive(115);
        System.out.println(inc);
        System.out.println("Initials");
        //Para caracteres es '' simples
        Initials i= new Initials('M','J','F');
        System.out.println(i);
        System.out.println("Eggs");
        Eggs egg = new Eggs(40);
        System.out.println(egg);
        System.out.println("DogBoarding");
        DogBoarding db = new DogBoarding(20,4);
        System.out.println(db);
        System.out.println("Dollars");
        Dollars d = new Dollars(150);
        System.out.println(d);
        System.out.println("FahrenheitToCelsius");
        FahrenheitToCelsius fa = new FahrenheitToCelsius(100);
        System.out.println(fa);
        System.out.println("TicketNumber");
        TicketNumber t = new TicketNumber(123454);
        System.out.println(t.identify());
        System.out.println("CarlysEventPrice");
        CarlysEventPrice ca = new CarlysEventPrice(60);
        System.out.println(ca.lema());
        System.out.println(ca.toString());
        System.out.println("Evento grande: "+ca.taman());
        System.out.println("SammysRentalPrice");
        SammysRentalPrice sam = new SammysRentalPrice(80);
        System.out.println(sam.lemaS());
        System.out.println(sam.toString());
        
    }
}
