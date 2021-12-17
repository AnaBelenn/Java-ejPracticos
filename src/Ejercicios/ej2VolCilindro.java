/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ej2VolCilindro {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // vaso de 6cm de diametro y 10cm de altura. Con cuantos vasos completo dos litros de agua? 
        //Formula: vol=pi*r^2*h. rad= d/2
        /**float diam=6;
        float alt= 10;
        float radio= diam/2;
        float pi=3.1416f;
        double volumen= pi*Math.pow(radio, 2)*alt;
        System.out.println("Volumen de un vaso: "+volumen+"ml");
        double vasos= 2000/volumen;
        System.out.println("Necesito "+vasos+" vasos para completar 2 litros.");
        **/
        
        //Puedo pedir que el usuario lo ingrese.
        Scanner dato= new Scanner (System.in);
        System.out.print("Ingrese diametro del vaso en centimetros: ");
        float diam=dato.nextFloat();
        System.out.print("Ingrese altura del vaso en centimetros: ");
        float alt= dato.nextFloat();
        float radio= diam/2;
        float pi=3.1416f;
        double volumen= pi*Math.pow(radio, 2)*alt;
        System.out.println("Volumen de un vaso: "+volumen+"ml");
        System.out.println("Ingrese cuantos litros desea contar:");
        float litros= dato.nextFloat();
        double vasos= litros/volumen;
        System.out.println("Necesito "+vasos+" vasos para completar "+litros+" litros.");
    }
    
}
