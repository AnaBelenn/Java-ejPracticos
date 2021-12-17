package Basicos;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class OperMatem {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float n1, n2, suma, resta, div, mod, prod;
        System.out.println("Ingrese dos numeros: ");
        n1 = entrada.nextFloat();
        n2 = entrada.nextFloat();
        suma = n1 + n2;
        resta = n1 - n2;
        div = n1 / n2;
        prod = n1 * n2;
        mod = n1 % n2;
        System.out.println("Resultados");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Division; " + div);
        System.out.println("Resto de la division: " + mod);
        System.out.println("Multiplicacion: " + prod);

    }

}
