package Ejercicios;

import java.util.Scanner;

public class ejMatrizTraspuesta {
    public static void main(String[] args) {
        Scanner dato=new Scanner (System.in);
        System.out.println("Ingrese numero de filas:");
        int fila=dato.nextInt();
        System.out.println("Ingrese numero de columnas:");
        int col= dato.nextInt();
        int matriz[][]=new int[fila][col];
        int mTras[][]= new int[col][fila];
        //Carga de datos
        for (int i=0; i<fila; i++){
            System.out.println("Ingrese los elementos de la fila "+(i+1));
            for (int j=0; j<col; j++){
                matriz[i][j]=dato.nextInt();
            }
        }
        for (int i=0; i<fila; i++) {
            for (int j=0; j<col; j++) {
                mTras[j][i]=matriz[i][j];
            }
        }
        System.out.println("----------------------");
        System.out.println("Matriz original:");
        for (int i=0; i<fila; i++){
            for (int j=0; j<col; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Matriz Traspuesta: ");
        for (int i=0; i<col; i++) {
            for (int j=0; j<fila; j++) {
                System.out.print(mTras[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
