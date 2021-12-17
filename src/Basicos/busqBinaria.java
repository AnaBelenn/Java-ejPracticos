package Basicos;

import java.util.Scanner;

public class busqBinaria {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int temp;
        // Para variar la cantidad de numeros a ingresar, solo debo cambiar el 7 del
        // arreglo
        int num[] = new int[7];
        int cant = num.length;
        boolean band = true;
        System.out.println("Ingrese " + cant + " numeros: ");
        for (int i = 0; i < cant; i++) {
            num[i] = dato.nextInt();
        }
        // Ordeno el arreglo
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
        }
        System.out.println("La busqueda binaria solo trabaja con arreglos ordenados.");
        System.out.println("Su arreglo ordenado es: ");
        for (int n : num) {
            System.out.println("- " + n);
        }
        // nro a buscar
        System.out.println("Ingrese el numero que desea buscar: ");
        int busc = dato.nextInt();
        // comienzo el ciclo de busqueda
        int inf = 0, centro = 0;
        int sup = cant - 1;
        band = false;
        while (inf <= sup) {
            centro = Math.round((sup + inf) / 2);
            if (num[centro] == busc) {
                band = true;
                break;
            } else if (busc < num[centro]) {
                sup = centro - 1;
            } else {
                inf = centro + 1;
            }
        }
        if (band == true) {
            System.out.println("El numero ingresado se encuentra en la posicion " + (centro + 1));
        } else {
            System.out.println("El numero ingresado no se encuentra en el arreglo");
        }
    }

}