package Ejercicios;

import java.util.Random;

public class ejDoWhile {
    public static void main(String[] args) {
        Random dato= new Random();
        int num= dato.nextInt(10)+1;
        System.out.println("Numero aleatorio= "+num);
        int i=1;
        do {
            System.out.println("i= "+i);
            i++;
        } while (i<=num);
        
    }
    
}
