package Ejercicios;
import javax.swing.JOptionPane;
public class ejPromArray {
    public static void main(String[] args) {
        String texto;
        float calif[]=new float[4], suma=0, promedio;
        int semestre=0;
        do {
            texto= JOptionPane.showInputDialog("Ingrese la calificacion del semestre "+(semestre+1)+":");
            if (texto!=null) {
            calif[semestre]= Float.parseFloat(texto);
            semestre++;
            } else {
                break;
            }
            }while (semestre<4);
        for (float cal:calif) {
            suma+=cal;
        }
        promedio=suma/semestre;
        if (texto==null && suma==0) {
            JOptionPane.showMessageDialog(null, "No se ingresó ninguna calificacion.");
        } else {
            if (texto==null && suma!=0) {
                JOptionPane.showMessageDialog(null, "El promedio del alumno es de: "+promedio);
            }
        }
        }
    }
    
