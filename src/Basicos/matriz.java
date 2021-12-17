package Basicos;

import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas:");
        int filas = dato.nextInt();
        System.out.println("Ingrese el numero de columnas:");
        int col = dato.nextInt();
        // defino la matriz
        int matriz[][] = new int[filas][col];
        // Ya definida la matriz, realizamos el bucle para cargar los datos.
        for (int i = 0; i < filas; i++) {
            System.out.println("Ingrese los numeros de la fila " + (i + 1));
            for (int j = 0; j < col; j++) {
                System.out.println("Ingrese el numero de la columna " + (j + 1));
                matriz[i][j] = dato.nextInt();
            }
            System.out.println("-------------------");
        }
        System.out.println("Matriz ingresada:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < col; j++) {
                if (j == (col - 1)) {
                    System.out.println(matriz[i][j]);
                } else {
                    System.out.print(matriz[i][j] + ", ");
                }
            }
        }
    }

}
