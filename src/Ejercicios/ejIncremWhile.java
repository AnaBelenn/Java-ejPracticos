package Ejercicios;

import java.util.Scanner;

public class ejIncremWhile {
    public static void main(String[] args) {
        Scanner dato= new Scanner (System.in);
        System.out.println("Ingrese un numero de repeticiones entre 1 y 10: ");
        int rep= dato.nextInt();
        int i=1;
        if (rep <1 || rep >10) {
            System.out.println("FUERA DE RANGO!");
        } else {
            if (rep>=1 && rep<=10) {
                while (i<=rep) {
                    System.out.println("i= "+i);
                    i++;
                }
            }
        }
     
        
    }
    
}
