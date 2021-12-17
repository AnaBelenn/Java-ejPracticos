package Basicos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class arrayList {
    public static void main(String[] args) {
        // LISTA SIMPLE
        listaNormal();
        listaDinamica();
    }

    // Creo el metodo de la lista normal
    private static void listaNormal() {
        int cantElem = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de elementos: "));
        // declaramos el arreglo
        String lista[] = new String[cantElem];
        // Ingresamos los elementos
        for (int i = 0; i < cantElem; i++) {
            lista[i] = new String();
            lista[i] = JOptionPane.showInputDialog("Elemento " + (i + 1) + ": ");
        }
        System.out.println("Lista normal:");
        for (int i = 0; i < cantElem; i++) {
            System.out.print(lista[i] + " ");
            // Otra opcion: System.out.println(lista[i]);
        }
        System.out.println("");
    }

    private static void listaDinamica() {
        ArrayList<String> lista = new ArrayList<>();
        char resp;
        do {
            lista.add(JOptionPane.showInputDialog("Ingrese el elemento: "));
            resp = JOptionPane.showInputDialog("Desea agregar otro elemento? S/N").charAt(0);
        } while (resp == 's' || resp == 'S');
        System.out.println("Lista dinamica: ");
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i) + " ");
            // System.out.println(lista.get(i));
        }
    }

}
