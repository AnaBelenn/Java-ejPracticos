package POO;
import javax.swing.JOptionPane;
public class ejAlumnos {
    public static void main(String[] args) {
        int cantAlum=Integer.parseInt(JOptionPane.showInputDialog("Cantidad de alumnos:"));
        Alumnos a[]=new Alumnos[cantAlum];
        for (int i=0; i<cantAlum; i++){
            a[i]=new Alumnos(JOptionPane.showInputDialog("Nombre del alumno:"), JOptionPane.showInputDialog("Aula:").charAt(0));
            a[i].setCalif(Float.parseFloat(JOptionPane.showInputDialog("Calificacion del alumno:")));
        }
        
        int conf=JOptionPane.showConfirmDialog(null, "Desea obtener el promedio de un curso?");
        if (conf==JOptionPane.YES_OPTION) {
            float suma=0, promedio;
            int cantxAula=0;
            char aula= JOptionPane.showInputDialog("Curso para obtener el promedio:").charAt(0);
            for (int i=0; i<cantAlum; i++) {
                if ( a[i].getAula()==aula){
                    suma=suma+a[i].getCalif();
                    cantxAula++;
                }
            }
            promedio=(suma/cantxAula);
            JOptionPane.showMessageDialog(null, "Promedio: "+promedio);
        } else {
            JOptionPane.showMessageDialog(null, "Datos almacenados correctamente.");
        } 
        
}
}
