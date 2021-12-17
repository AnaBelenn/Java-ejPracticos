package Coursera.EjRopa;
/**
 *
 * @author Ana Belen Alfonso
 */
public class Pantalon extends Ropa implements iDevolucion {
    private String genero;
    private String largo;
    
    public Pantalon(int id, String talle, String color, double precio, String genero, String largo) {
        super(id, talle, color, precio);
        this.genero = genero;
        this.largo = largo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getLargo() {
        return largo;
    }

    public void setLargo(String largo) {
        this.largo = largo;
    }

    @Override
    public void mostrarDatos(String nombreClase) {
        super.mostrarDatos(nombreClase); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Genero: "+genero);
        System.out.println("Medida: "+largo);
    }

    @Override
    public void hacerDevolucion() {
        System.out.println("Devolucion de un pantalon.");
    }
    
    
    
}
