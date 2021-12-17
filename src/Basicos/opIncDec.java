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
public class opIncDec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1 = 5;
        int n2 = 0;
        n2 = n1++;// El incremento se encuentra DESPUES de la asignacion
        System.out.println("n1: " + n1);
        System.out.println("n2: " + n2);
        // Pasa n1=6
        n2 = ++n1; // Asigno EL INCREMENTO de n1
        System.out.println("n1: " + n1);// nuevo incremento en la asignacion anterior.
        System.out.println("Nuevo n2: " + n2);

    }

}
