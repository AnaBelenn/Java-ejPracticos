package Ejercicios;
import java.util.Scanner;
public class ejSumaMatrizSim {
    public static void main(String[] args) {
        Scanner dato= new Scanner(System.in);
        System.out.println("Cuantas filas tiene su matriz?");
        int fila=dato.nextInt();
        System.out.println("Cuantas columnas tiene su matriz?");
        int col=dato.nextInt();
        int matriz[][]= new int[fila][col];
        boolean band=true;
        //CARGA DE DATOS
        for (int i=0; i<fila; i++) {
            System.out.println("Ingrese los datos de la fila "+(i+1));
            for (int j=0; j<col; j++) {
                matriz[i][j]=dato.nextInt();
            }
        }
        int suma;
        for (int i=0; i<fila; i++) {
            suma=0;
            for (int j=0; j<col; j++) {
                suma+=matriz[i][j];
            }
            System.out.println("Fila "+(i+1)+" suma total de: "+suma);
        }
        int sumCol;
        for (int j=0; j<col; j++) {
            sumCol=0;
            for (int i=0; i<fila; i++) {
                sumCol+= matriz[i][j];
            }
            System.out.println("Columna "+(j+1)+" suma total de "+sumCol);
        }
    }
    
}
