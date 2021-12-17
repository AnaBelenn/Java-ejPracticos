package POO;
public class Empleado {
    //SETTER: nos sirve para asignar un valor inicial a un atributo
    //GETTER: nos sirve para obtener (recuperar o acceder) el valor ya asignado a un atributo y utilizarlo para cierto método.
    private int edad;
    private String nombre;
    public void setEdad(int _edad){
        //this.edad accedo al atributo PRIVADO asignando un valor de entrada mediante un metodo
        if (_edad<10 && _edad>80){
            this.edad= _edad;
        } else {
            System.out.println("No se permite un empleado de esa edad.");
        }
    }
    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String _nombre) {
        this.nombre = _nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
