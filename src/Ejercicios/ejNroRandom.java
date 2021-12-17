package Ejercicios;

import java.util.Random;
import javax.swing.JOptionPane;

public class ejNroRandom {
    public static void main(String[] args) {
        Random dato= new Random();
        int aleatorio=dato.nextInt(5)+1;
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entre 1 y 5. Presione 0 para salir. "));
        System.out.println("Estadisticas del juego:");
        while (num != aleatorio) {
            System.out.println("Numero ingresado: "+num+" - Numero aleatorio: "+aleatorio);
            if (num==0) {
                JOptionPane.showMessageDialog(null, "Fin del juego.");
                break;
            } else {
                if (num<1 || num >5 ) {
                    JOptionPane.showMessageDialog(null, "Numero fuera de rango.");
                    break; 
                } else {
                    num = Integer.parseInt(JOptionPane.showInputDialog("El numero ingresado no coincido. Ingrese un numero entre 1 y 5. Presione 0 para salir. "));
                    aleatorio=dato.nextInt(5)+1;
                    
                }
            } 
            
        } if (num==aleatorio) {
            JOptionPane.showMessageDialog(null, "Correcto ! Los numeros coinciden!");
            System.out.println("Numero ingresado: "+num+" - Numero aleatorio: "+aleatorio);
        }
        
    }
    
}
