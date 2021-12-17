package POO;
import java.util.Scanner;
public class ejCuadrilatero {
    public static void main(String[] args) {
        float perimetro, area;
        Cuadrilatero c1;
        Scanner dato= new Scanner(System.in);
        System.out.println("Figura. Ingrese una opcion:\n1) Cuadrado. \n2) Rectangulo.");
        int fig=dato.nextInt();
        if (fig==1) {
            System.out.println("Ingrese el tamaño de un lado:");
            int lado1=dato.nextInt();
            c1=new Cuadrilatero(lado1);
        } else {
            if (fig==2){
                System.out.println("Ingrese el tamaño del lado1:");
                int lado1=dato.nextInt();
                System.out.println("Ingrese el tamaño del lado2:");
                int lado2= dato.nextInt();
                c1=new Cuadrilatero(lado1,lado2);
            } else {
                System.out.println("Opcion no valida.");
                c1=new Cuadrilatero(0);
                }
        } 
        if (fig==1 || fig==2){
        perimetro=c1.getPerimetro();
        area=c1.getArea();
        System.out.println("Area: "+area+" - Perimetro: "+perimetro);
        }
    }
    
}
