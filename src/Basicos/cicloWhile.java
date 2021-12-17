package Basicos;

public class cicloWhile {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println("i: " + i);
            i++;
        }
        // Cuenta regresiva
        i = i - 1;
        System.out.println("Cuenta regresiva: ");
        while (i >= 0) {
            System.out.println("i: " + i);
            if (i == 0) {
                System.out.println("BOOM !");
            }
            i--;
        }

    }

}
