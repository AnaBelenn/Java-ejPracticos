package Ejercicios;
import java.util.Scanner;
public class ejMatrizSumDiag {
    public static void main(String[] args) {
        Scanner dato= new Scanner(System.in);
        System.out.println("Matriz cuadrada.");
        System.out.println("Ingrese numero de filas: ");
        int fil=dato.nextInt();
        System.out.println("Ingrese numero de columnas: ");
        int col=dato.nextInt();
        int matriz[][]= new int[fil][col];
        int elto=1; //Coloca los elementos en el arreglo
        for (int i=0; i<fil; i++){
            for (int j=0; j<col; j++){
                matriz[i][j]=elto;
                elto++;
            }
        }
        for (int i=0; i<fil; i++){
            for (int j=0; j<col; j++){
                System.out.print("\t"+matriz[i][j]);
            }
            System.out.println("");
        }
        
        int diagP[]= new int[matriz.length];
        int diagS[]= new int[matriz.length];
        for (int i=0; i<fil; i++){
            for (int j=0; j<col; j++){
                if (j==i){
                    diagP[i]=matriz[i][j];
                }
                if ((i+j)== matriz.length-1){
                    diagS[i]=matriz[i][j];
                }
            }
        }
        int suma=0;
        System.out.println("Diagonal principal: ");
        for (int elemento:diagP){
            System.out.print("\t"+elemento);
            suma+=elemento;
        }
        System.out.println("");
        System.out.println("Suma: "+suma);
        System.out.println("");
        suma=0;
        System.out.println("Diagonal secundaria: ");
        for (int elemento:diagS){
            System.out.print("\t"+elemento);
            suma+=elemento;
        }
        System.out.println("");
        System.out.println("Suma: "+suma);
    }
    
}
