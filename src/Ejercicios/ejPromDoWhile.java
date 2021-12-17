package Ejercicios;
import javax.swing.JOptionPane;
public class ejPromDoWhile {
    public static void main(String[] args) {
        int semestre=0;
        float calif=0, suma=0, promedio; 
        String nota;
        do {
            nota = JOptionPane.showInputDialog("Ingrese la calificacion del semestre: "+(semestre+1));
            if (nota != null) {
                calif=Float.parseFloat(nota);
                System.out.println("Semestre: "+(semestre+1)+" - nota: "+calif);
                suma= suma+calif;
                semestre++;
            }
        } while (nota!=null);
        promedio = suma/semestre;
        if (nota==null && suma==0) {
            JOptionPane.showMessageDialog(null, "No ingreso ninguna calificacion.");
        } else {
            if (suma!=0) {
                System.out.println("El promedio es: "+promedio);
                JOptionPane.showMessageDialog(null, "Promedio: "+promedio);
            }
        }
        
    }
    
}
