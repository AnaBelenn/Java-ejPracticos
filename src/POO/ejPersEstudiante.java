package POO;
public class ejPersEstudiante {
    public static void main(String[] args) {
        Estudiante e1= new Estudiante("Maria", "Perez", 20, "IRF536", 8);
        e1.setNombre();
        e1.setApellido();
        e1.setEdad();
        System.out.println("Calificacion: "+e1.getCalif());
        System.out.println("Codigo de estudiante: "+e1.getCod());
        System.out.println("----------------------------");
        
       float suma;
       //GET: obtengo el valor y lo puedo utilizar para operaciones o para mostrar por pantalla
       suma=(e1.getCalif())+1;
        System.out.println("Suma al azar: "+suma);
    }
    
}
