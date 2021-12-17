/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basicos;

/**
 *
 * @author Admin
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /**
         * SALIDA DE DATOS: EJEMPLOS1:
         * System.out.print("Hola mundo\n");
         * System.out.println("Mensaje de prueba2");
         * System.err.println("Mensaje de prueba 3");
         **/

        /**
         * byte A; //Rango de -128 a 127
         * A = (byte) 127.33;
         * System.out.println("Resultado o valor: "+A);
         */

        Byte A; // Rango de -128 a 127
        A = (byte) 127.33;
        System.out.println("Resultado o valor: " + A);

        short B; // Rango de -32768 a 32767
        B = 32767;
        System.out.println("Resultado: " + B);

        float C;
        C = A.floatValue(); // la conversion de A solo funciona si es una
                            // var encapsulada (abstracta - su tipo en mayusc)
                            // y no se un tipo de dato primitivo
        System.out.println("Resultado: " + C);

    }

}
