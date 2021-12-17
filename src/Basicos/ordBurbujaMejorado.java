package Basicos;

import javax.swing.JOptionPane;

public class ordBurbujaMejorado {
    public static void main(String[] args) {
        String datos = JOptionPane.showInputDialog("Ingrese los elementos del arreglo separados con un espacio: ");
        String nros[] = datos.split(" ");
        int cant = nros.length;
        int num[] = new int[cant], temp, ciclos = 0;
        boolean band = true;
        // Creo un FOR que va a convertir los elementos de "nros" en enteros en el nuevo
        // arreglo num
        System.out.println("Registro de numeros inresados: ");
        for (int i = 0; i < cant; i++) {
            num[i] = Integer.parseInt(nros[i]);
            System.out.println("- " + num[i]);
        }
        // Ordenamiento tipo burbuja MEJORADO que sale una vez ordenado el arreglo.
        for (int i = 0; i < (cant - 1) && band == true; i++) {
            band = false; // Sale del bucle si en el siguiente FOR no cambia a verdadero.
            for (int j = 0; j < (cant - 1); j++) {
                if (num[j] > num[j + 1]) {
                    band = true; // TRUE si hay un elemento mayor que el proximo.
                    temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
            ciclos++;
        }
        System.out.println("Arreglo ordenado de menor a mayor: ");
        for (int nro : num) {
            System.out.println("- " + nro);
        }
        System.out.println("Arreglo ordenado de mayor a menor: ");
        for (int i = (cant - 1); i >= 0; i--) {
            System.out.println("- " + num[i]);
        }
        System.out.println("Ciclos: " + ciclos);
    }
}
