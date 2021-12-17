package Basicos;

import javax.swing.JOptionPane;

public class ordBurbuja {
    public static void main(String[] args) {
        String datos = JOptionPane.showInputDialog("Ingrese los elementos del arreglo separados con un espacio: ");
        String nros[] = datos.split(" ");
        int cant = nros.length;
        int num[] = new int[cant], temp;
        // Creo un FOR que va a convertir los elementos de "nros" en enteros en el nuevo
        // arreglo num
        System.out.println("Registro de numeros inresados: ");
        for (int i = 0; i < cant; i++) {
            num[i] = Integer.parseInt(nros[i]);
            System.out.println("- " + num[i]);
        }
        // Ordenamiento tipo burbuja
        for (int i = 0; i < (cant - 1); i++) {
            for (int j = 0; j < (cant - 1); j++) {
                if (num[j] > num[j + 1]) {
                    temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
        System.out.println("Arreglo ordenado de menor a mayor: ");
        for (int nro : num) {
            System.out.println("- " + nro);
        }
        System.out.println("Arreglo ordenado de mayor a menor: ");
        for (int i = (cant - 1); i >= 0; i--) {
            System.out.println("- " + num[i]);
        }

    }

}
