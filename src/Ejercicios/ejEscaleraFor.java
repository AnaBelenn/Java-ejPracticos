package Ejercicios;

import javax.swing.JOptionPane;

public class ejEscaleraFor {
    public static void main(String[] args) {
        //Dibujar una escalera de asteriscos con una altura ingresada por el usuario.
        String dato= JOptionPane.showInputDialog("Ingrese el numero de escalones: ");
        int esc=Integer.parseInt(dato);
        for (int ast=1; ast<=esc; ast++) {
            for (int i=1; i<=ast; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }
    
}
