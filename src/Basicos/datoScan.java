package Basicos;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class datoScan {
    public static void main(String[] args) {
        // Instancio un objeto de la clase scanner
        // creo un objeto (entrada) y su tipo (scanner).
        Scanner entrada = new Scanner(System.in);
        // creo un string
        char cad;
        System.out.println("Ingrese una frase: ");
        cad = entrada.nextLine().charAt(7);
        System.out.println("La frase ingresada es: " + cad);

    }
}
