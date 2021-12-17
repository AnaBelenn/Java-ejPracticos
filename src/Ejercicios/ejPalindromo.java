package Ejercicios;

import javax.swing.JOptionPane;

public class ejPalindromo {
    public static void main(String[] args) {
        String texto= JOptionPane.showInputDialog("Ingrese una frase: ");
        String conv = texto.replace(" ", "").toLowerCase();
        int longitud= conv.length();
        char[] letras= new char[longitud];
        char[] inverso= new char[longitud];
        int inv = longitud;
        boolean band=true;
        for (int i=0; i<longitud; i++) {
            inverso[i]= conv.toLowerCase().charAt(inv-1);
            inv--;
            letras[i]= conv.toLowerCase().charAt(i);
            if (inverso[i]!=letras[i]) {
                band=false;
                break;
            }
        }
        if (band==false) {
            System.out.println(texto+" NO es palindromo.");
        } else {
            System.out.println(texto+" SI es palindromo.");
            System.out.println("Frase ingresada sin espacios:");
            System.out.println(conv);
        }
       
    }
    
}
