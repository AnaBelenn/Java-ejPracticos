package Ejercicios;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class ej3UnidDecCen {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner dato = new Scanner (System.in);
        System.out.println("Ingrese un numero entre 1 y 999:");
        int num = dato.nextInt();
        if (num>0 && num < 10) {
            System.out.println("El numero ingresado es una unidad de mil.");} 
        else {
            if (num >=10 && num <100) {
                System.out.println("El numero ingresado es una decena de mil.");} 
            else {
                if (num >= 100 && num < 1000) {
                System.out.println("El numero ingresado pertenece a una centena de mil.");}
                else {System.out.println("Numero fuera de rango.");} 
                    }

            }
                    
    }   
    }
    

