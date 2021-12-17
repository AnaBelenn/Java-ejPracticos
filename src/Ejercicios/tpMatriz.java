/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Arrays;

/**
 *
 * @author Ana Belen Alfonso
 */
public class tpMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Mostrar la siguiente matriz: 
          1  2  4  6  8
          2  10 12 14 16
          3  18 20 22 24
          4  26 28 30 32
        */
        int[][] matriz= new int[4][5]; 
        int num = 1; 
        for (int i=0; i<4; i++) {
            for (int j=0; j<5; j++) {
                if (j==0) { 
                    matriz[i][j]=i+1; 
                } else {
                    matriz[i][j]=num*2;
                    num++;
                }
            }
        }
        for (int[] elto: matriz) {
            System.out.println(" "+Arrays.toString(elto));
        }
    }
    
}
