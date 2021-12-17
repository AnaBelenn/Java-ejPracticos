package Basicos;

import java.util.Scanner;

public class ordxSeleccion {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int nro[] = new int[5];
        int pos, aux, menor;
        System.out.println("Ingrese CINCO numeros: ");
        for (int i = 0; i < 5; i++) {
            nro[i] = dato.nextInt();
        }
        // bucle para ordenamiento por SELECCION
        for (int i = 0; i < (nro.length - 1); i++) {
            menor = nro[i];
            pos = i;
            for (int j = i + 1; j < (nro.length); j++) {
                if (nro[j] < menor) {
                    menor = nro[j];
                    pos = j;
                }
            }
            if (pos != i) { // DUDA SOBRE LA CONDICION, NO SOBRE SUS OPERACIONES INTERNAS.
                aux = nro[i];
                nro[i] = nro[pos];
                nro[pos] = aux;
            }
        }
        System.out.println("Arreglo ordenado de menor a mayor: ");
        for (int num : nro) {
            System.out.println("- " + num);
        }
        System.out.println("Arreglo ordenado de mayor a menor: ");
        for (int i = (nro.length - 1); i >= 0; i--) {
            System.out.println("- " + nro[i]);
        }
    }

}
