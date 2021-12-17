package POO;
public class Persona2 {
    String nombre;
    int edad;
    //**********METODO CONSTRUCTOR**********//
    public Persona2(String _nombre, int _edad) {
        this.nombre=_nombre;
        this.edad=_edad; 
    }
     
    
    /*
    Se carga de la siguiente forma:
    Persona per= new Persona("Juan", 18);
    Por ser un constructor, obliga a cargar los datos cuando se define la variable.
    Ej: como en el caso de los arreglos que debemos definir el tamaño.
    */
}
