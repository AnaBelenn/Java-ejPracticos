package Ejercicios;
import java.util.Scanner;
public class ejMatrizSimetrica {
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
        //1ra regla: la matriz debe ser CUADRADA
        if (fila==col) {
            //2da regla: los elementos deben coincidir en posicion
            for (int i=0; i<fila; i++) {
                for (int j=0; j<col; j++) {
                    if (matriz[i][j]!=matriz[j][i]) {
                        band=false;
                        break;
                    }
                }
                if (band==false) {
                    break;
                }
            }
        } else {
            System.out.println("La matriz NO ES SIMETRICA.");
        }
        if (band) {
            System.out.println("La matriz ingresada es simetrica.");
        } else {
            System.out.println("La matriz ingresada NO es simetrica.");
        }
        
    }
    
}
