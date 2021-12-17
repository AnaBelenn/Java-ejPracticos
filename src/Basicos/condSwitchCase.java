package Basicos;

import java.util.Scanner;

public class condSwitchCase {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        System.out.println("Seleccione una opcion:\n1: Acceso\n2: Configuracion\n3: Ayuda");
        int sel = dato.nextInt();
        switch (sel) {
            case 1:
                System.out.println("Acceso al sistema.");
                break;
            case 2:
                System.out.println("Configuracion del sistema.");
                break;
            case 3:
                System.out.println("Ayuda al usuario.");
                break;
            default:
                System.out.println("Opcion no valida.");
                break;
        }
    }

}
