/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basicos;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class condIF {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner dato = new Scanner(System.in);
        // num1 es ingresado por el usuario y num2 es generado por el sistema.
        int num1, num2;
        num2 = (int) (Math.random() * 10);
        System.out.print("Ingrese un numero menor o igual a " + num2 + ": ");
        num1 = dato.nextInt();
        if (num1 <= num2) {
            System.out.println("Correcto!");
        } else {
            System.out.println("Incorrecto!");
        }

    }

}
