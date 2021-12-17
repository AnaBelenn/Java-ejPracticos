package Basicos;

public class e_foreach {
    public static void main(String[] args) {
        String[] nombres = { "Ana", "Lucia", "Jose", "Lucas", "Andrea", "Miguel" };
        System.out.println("Nombre ingresados: ");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println((i + 1) + " " + nombres[i]);
        }
        System.out.println("----------------------");
        System.out.println("Utilizando FOREACH");
        System.out.println("----------------------");
        System.out.println("Nombres ingresados: ");
        // foreach, debo definir aparte un indice que incremento o decremento DENTRO del
        // bloque
        int a = 1;
        for (String nomb : nombres) {
            System.out.println(a + " " + nomb);
            a++;
        }

    }
}
