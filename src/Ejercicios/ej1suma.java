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
public class ej1suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //calcular venta de tres productos y redondear centavos finales           
         Scanner dato= new Scanner (System.in);
         System.out.print("Ingrese el precio del primer producto:");
         float prod1= dato.nextFloat();
         System.out.print("Ingrese el precio del segundo producto:");
         float prod2= dato.nextFloat();
         System.out.print("Ingrese el precio del tercer producto:");
         float prod3= dato.nextFloat();
         float sum= prod1 + prod2 + prod3;
         System.out.println("Total de la compra: $"+sum);
         double sum1= Math.ceil(sum);
         System.out.println("Total a pagar: $"+sum1);
         float resto = (float) sum1-sum;
         System.out.println("Monto donado: $"+resto);
       
    }
    
}
