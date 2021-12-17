package Ejercicios;

import javax.swing.JOptionPane;

public class ejNroMayor {
    public static void main(String[] args) {
        //Obtiene el mayor numero ingresado en un arreglo
            //Le pido al usuario que ingrese los numeros separados por coma o espacio
        String datos= JOptionPane.showInputDialog("Ingrese los elementos del arreglo separados con un espacio: "); 
            //se almacena como una cadena de caracteres en datos
            //la operacion SPLIT separa los elementos de acuerdo al patron que le pasamos
            //Guardo en un arreglo los elementos separados por un espacio o blanco
        String nros[]=datos.split(" ");
            //Obtengo la cantidad de elementos del arreglo
        int cant= nros.length;
            //Creo un arreglo que va a almacenar los numeros 
        int num[]=new int[cant];
            //Creo un FOR que va a convertir los elementos de "nros" en enteros en el nuevo arreglo num
        System.out.println("Registro de numeros inresados: ");
        for (int i=0; i<cant; i++) {
            num[i]=Integer.parseInt(nros[i]);
        }
        int mayor=0;
        for (int numeros: num) {
            System.out.println("- "+numeros);
            if (numeros>mayor) {
                mayor=numeros;
                
            }
        }
        System.out.println("El mayor numero ingresado es: "+mayor);
        JOptionPane.showMessageDialog(null, "El mayor numero ingresado es: "+mayor);
        
    }
    
}
