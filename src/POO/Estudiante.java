package POO;
public class Estudiante extends Persona {
    private String codigo;
    private float calif;
    
    public Estudiante(String _nombre, String _apellido, int _edad, String _codigo, float _calif) {
        super(_nombre, _apellido, _edad);
        this.codigo= _codigo;
        this.calif= _calif;
    }

    public String getCod() {
        return this.codigo;
    }

    public float getCalif() {
        return this.calif;
    }
//De esta forma puedo "acceder" o utilizar los valores privados de la clase superior.
    public void setNombre() {
        System.out.println("Nombre: "+this.getNombre());
    }

    public void setApellido() {
        System.out.println("Apellido: "+this.getApellido());
    }

    public void setEdad() {
        System.out.println("Edad: "+this.getEdad());
    }
}
