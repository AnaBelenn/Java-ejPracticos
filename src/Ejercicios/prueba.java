package Ejercicios;

import java.util.Arrays;

public class prueba {
    public static void main(String[] args) {
        int[][] myArray = new int[4][4];
        int l=0;
        for (int j=0; j<4;j++){
            for (int i=0; i<4;i++){
                l=l+2;
                myArray[j][i]=l;
                
            }
        }
        for (int[] row : myArray) 
  
            System.out.println(Arrays.toString(row)); 
    }
}