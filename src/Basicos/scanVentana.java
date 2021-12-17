/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basicos;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class scanVentana {
    public static void main(String[] args) {
        String cad = JOptionPane.showInputDialog("Ingrese una frase: ");
        JOptionPane.showMessageDialog(null, "Frase ingresada: " + cad);

        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        JOptionPane.showMessageDialog(null, "El numero ingresado es: " + num);

        float num2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un numero: "));
        JOptionPane.showMessageDialog(null, "El numero ingresado es: " + num2);

        char A = JOptionPane.showInputDialog("Ingrese una frase: ").charAt(5);
        JOptionPane.showMessageDialog(null, "La letra es: " + A);
    }

}
