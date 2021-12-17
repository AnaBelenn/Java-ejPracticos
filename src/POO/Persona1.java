package POO;
public class Persona1 {
    private int dinero;
    //Establezco un atributo FINAL que no se puede modificar (constante) pero lo debo inicializar en el metodo constructor
    private final String nombre;
    public Persona1 (String _nombre){
        this.nombre=_nombre;
    }

    public void setDinero(int _dinero) {
        this.dinero = _dinero;
    }
    
    public int getDinero() {
        return dinero;
    }

    public String getNombre() {
        return nombre;
    }
    
}
