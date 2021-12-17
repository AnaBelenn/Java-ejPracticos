package Basicos;

public class cicloDoWhile {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("i= " + i);
            i++;
        } while (i <= 10);
        System.out.println("----------");
        System.out.println("Cuenta regresiva");
        i = 10;
        do {
            System.out.println("i= " + i);
            i--;
        } while (i >= 1);
    }

}
