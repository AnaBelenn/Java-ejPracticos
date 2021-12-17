package POO;
public class ejPersona1 {
    public static void main(String[] args) {
        Persona1 p= new Persona1("Juan");
        p.setDinero(100);
        System.out.println("Nombre: "+p.getNombre());
        System.out.println("Dinero: $"+p.getDinero());
    }
    
}
