package Ejercicios;
import java.util.Scanner;
public class ejMatrizString {
    public static void main(String[] args) {
        //Leer nombre, apellido y curso de los alumnos y luego mostrar los alumnos de cierto curso.
        Scanner dato=new Scanner (System.in);
        System.out.println("Cuantos alumnos desea cargar?");
        int cant=dato.nextInt();
        dato.nextLine();
        String alumnos[][]= new String[cant][3];
        for (int i=0; i<cant; i++){
            System.out.println("Ingrese los datos del alumno "+(i+1));
            for (int j=0; j<=2; j++){
                switch (j) {
                    case 0: 
                        System.out.println("Apellido: ");
                        alumnos[i][j]=dato.nextLine();
                        break;
                    case 1:
                        System.out.println("Nombre: ");
                        alumnos[i][j]=dato.nextLine();
                        break;
                    case 2:
                        System.out.println("Curso: ");
                        alumnos[i][j]=dato.nextLine();
                        break;
                }
            }
        }
        System.out.println("Ingrese el curso de sus alumnos:");
        String curso=dato.next().toLowerCase();
        for (int i=0; i<cant; i++) {
            if (alumnos[i][2].toLowerCase().equals(curso)) {
                for (int j=0; j<3; j++){
                    if (j==0) {
                        System.out.print("- ");
                    }
                    System.out.print(alumnos[i][j]+" ");
                }
                System.out.println("");
            }
        }
    }
    
}
