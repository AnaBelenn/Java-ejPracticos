package POO;
import java.util.Scanner;
public class ejCalculadora {
    public static void main(String[] args) {
        Calculadora calc= new Calculadora();
        Scanner dato= new Scanner (System.in);
        int resultado=0;
        System.out.println("Ingrese el primer valor:");
        int a=dato.nextInt();
        System.out.println("Ingrese el segundo valor:");
        int b=dato.nextInt();
        System.out.println("Ingrese la operación que desea realizar: \n 1) Suma\n 2) Resta\n 3) Producto\n 4) Division.");
        int op=dato.nextInt();
        switch (op){
            case 1: 
                resultado = calc.suma(a,b);
                break;
            case 2:
                resultado= calc.resta(a, b);
                break;
            case 3:
                resultado = calc.producto(a, b);
                break;
            case 4:
                float result = calc.division(a, b);
                break;
            default: 
                System.out.println("Opcion invalida.");
                break;
        }
        if (b==0 && op==4){
            System.out.println("Error.");
        } else {
        System.out.println("El resultado de la operacion es: "+resultado);
        }
    }
    }
    

