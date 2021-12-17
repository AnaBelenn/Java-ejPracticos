package Ejercicios;

import javax.swing.JOptionPane;

public class ejMezclaVectores {
    public static void main(String[] args) {
        int a[]=new int[5], b[]=new int[5], c[]=new int[10];
        //carga de datos del arreglo A
        for (int i=0; i<5; i++) {
            a[i]= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del arreglo A de la posicion "+(i+1)));
        }
        //carga de dato del arreglo B
        for (int i=0; i<5; i++) {
            b[i]= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del arreglo B de la posicion "+(i+1)));
        }
        //Mezcla para generar el arreglo C
        //declaro una nueva variable
        int j=0;
        for (int i=0; i<5; i++) {
            c[j]= a[i];
            j++;
            c[j]= b[i];
            j++;
        }
        System.out.println("Elementos del arreglo C:");
        for (int elemento:c) {
            System.out.println("- "+elemento);
        }
    }
    
}
