package Basicos;

/**
 *
 * @author Admin
 */
public class operMath {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double nRaiz = 9;
        double result;
        result = Math.sqrt(nRaiz);
        System.out.println("Raiz de " + (int) nRaiz + " es igual a: " + result);

        double base = 8;
        double exp = 3;
        double result2;
        result2 = Math.pow(base, exp);
        System.out
                .println("El resultado de " + (int) base + " elevado a " + (int) exp + " es igual a: " + (int) result2);

        float absol = -5.5f;
        float result3 = Math.abs(absol);
        System.out.println("El valor aboluto de: " + absol + " es: " + result3);

        float redond = 5.5f;
        float result4 = Math.round(redond);
        System.out.println("El redondeo de " + redond + " es igual a: " + result4);

        double aleat = Math.random();
        System.out.println("Numero aleatorio con redondeo: " + Math.round(aleat * 100));
        System.out.println("Numero aleatorio devolviendo entero: " + (int) (aleat * 100));

    }

}
