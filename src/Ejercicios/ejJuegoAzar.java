package Ejercicios;
import java.util.Random;
import java.util.Scanner;
public class ejJuegoAzar {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 
        Tenemos tres dados que se lanzan de forma aleatoria. 
        Si tres dados salen con el mismo numero ingresado, se muestra un mensaje "excelente".
        Si dos dados salen con el mismo numero ingresado, se muestra un mensaje "muy bien".
        Si un  solo dado sale con el mismo numero ingresado, se muestra un mensaje "regular".
        Si ningun dado sale con el numero ingresado, se muestra un mensaje "pesimo".
        */
        Random dato= new Random();
        int n1=dato.nextInt(7);
        int n2=dato.nextInt(7);
        int n3=dato.nextInt(7);
        System.out.println("Dado 1: "+n1);
        System.out.println("Dado 2: "+n2);
        System.out.println("Dado 3: "+n3);
        if (n1==6 && n2==6 && n3==6) {
            System.out.println("Excelente !");
        } else {
            if ( (n1==6 && n2==6) || (n1==6 && n3==6) || (n2==6 && n3==6) ) {
                System.out.println("Muy bien !");
            } else {
                if (n1==6 || n2==6 || n3==6) {
                    System.out.println("Regular.");
                } else {
                    if (n1!=6 && n2!=6 && n3!=6) {
                        System.out.println("Pesimo.");
                    }
                }
            }
        }
        
        
        
    }
    
}
