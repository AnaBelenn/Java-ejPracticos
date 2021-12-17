package POO;
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String _nombre, String _apellido, int _edad) {
        this.nombre= _nombre;
        this.apellido= _apellido;
        this.edad= _edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public int getEdad() {
        return this.edad;
    }
}
