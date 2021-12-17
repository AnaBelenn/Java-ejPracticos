package Basicos;

import javax.swing.JOptionPane;

public class arreglos {
    public static void main(String[] args) {
        // Arreglo: grupo o coleccion finita, homogenea y ordenada de elementos.
        int[] nros = { 1, 2, 3, 4 };
        // Java siempre comienza desde CERO
        for (int i = 0; i < 4; i++) {
            System.out.println(nros[i]);
        }
        // ----------------------------
        String texto = JOptionPane.showInputDialog("Ingrese un texto: ");
        // Obtenemos el tamaño del texto
        int longitud = texto.length();
        char[] letras = new char[longitud];
        int inverso = longitud;
        for (int i = 0; i < longitud; i++) {
            letras[i] = texto.charAt(inverso - 1);
            inverso--;
        }
        System.out.println("Palabra ingresada: " + texto);
        System.out.println("Inverso: " + String.valueOf(letras));

    }
}
