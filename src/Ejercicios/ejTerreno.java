package Ejercicios;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ana Belen
 * @version 1.0
 */
public class ejTerreno {
    /**
     * NOTA: Debe ser de tipo static porque se va a instanciar DENTRO de main.
     */
    static Scanner dato= new Scanner(System.in);
    //Defino un arreglo de terrenos
    static ArrayList <Terreno> parte= new ArrayList<Terreno>();
    
    /**
     * Metodo principal
     * @param args
     */
    public static void main(String[] args) {
        char resp;
        int opc;
        
        do {
            System.out.println("Forma del terreno que desea ingresar:\n1) Triangulo\n2) Rectangulo");
            opc=dato.nextInt();
            switch (opc) {
                case 1: opcTriang();
                break;
                case 2: opcRect();
                break;
            }
            System.out.println("Desea ingresar mas terreno? S/N");
            resp=dato.next().charAt(0);
            
        } while (resp=='s' || resp== 'S');
        Resultados();
    }

    /**
     * Este metodo recibe desde Scanner 3 números y los coloca
     * en la instancia (hija) TerrenoTriang y la agrega al arreglo
     * de Terrenos (clase padre)
     */
    protected static void opcTriang() {
        System.out.println("Triangulo");
        double lado1, lado2, lado3;
        System.out.println("Ingrese las medidas de los tres lados.");
        System.out.print("Lado 1:");
        lado1=dato.nextDouble();
        System.out.println("");
        System.out.print("Lado 2:");
        lado2=dato.nextDouble();
        System.out.println("");
        System.out.print("Lado 3:");
        lado3=dato.nextDouble();
        System.out.println("");
        //Instancio la clase Terreno de forma dinamica porque va a almacenar varios terrenos de distintas formas
        TerrenoTriang t= new TerrenoTriang(lado1, lado2, lado3);
        //Agrego el triangulo al arreglo de terrenos
        parte.add(t);
    }

    /**
     *
     */
    protected static void opcRect() {
        System.out.println("Rectangulo");
        double lado1, lado2;
        System.out.println("Ingrese las medidas de los lados diferentes.");
        System.out.print("Lado 1:");
        lado1=dato.nextDouble();
        System.out.println("");
        System.out.print("Lado 2:");
        lado2=dato.nextDouble();
        System.out.println("");
        TerrenoRect r= new TerrenoRect(lado1, lado2);
        parte.add(r);
    }

    private static void Resultados() {
        double areaT=0;
        //Genero un bucle para mostrar las partes
        for (Terreno t:parte) {
            //Como Terreno es una clase abstracta, solo muestra los mensajes de sus subclases
            System.out.println(t.toString() + " Area: "+ t.area());
            areaT= areaT + t.area();
        } 
        System.out.println("Area total del terreno: "+areaT);
    }
    
}
