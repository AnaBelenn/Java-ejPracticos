package Basicos;

import java.util.Scanner;

public class busqSecuencial {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int nros[] = new int[7];
        System.out.println("Ingrese SIETE numeros: ");
        for (int i = 0; i < 7; i++) {
            nros[i] = dato.nextInt();
        }
        System.out.println("Ingrese el numero que desea buscar: ");
        int busc = dato.nextInt();
        int i = 0;
        boolean band = false;
        while (i < 7 && band == false) {
            if (busc == nros[i]) {
                band = true;
            }
            i++;
        }
        if (band) {
            System.out.println("El numero " + busc + " se encuentra en la posicion " + i);
        } else {
            System.out.println("El numero " + busc + " NO se encuentra en el arreglo.");
        }
    }

}
