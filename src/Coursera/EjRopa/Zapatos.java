package Coursera.EjRopa;
/**
 *
 * @author Admin
 */
public class Zapatos extends Ropa {
    private String marca;
    private String estilo;

    public Zapatos(int id, String talle, String color, double precio, String marca, String estilo) {
        super(id, talle, color, precio);
        this.marca = marca;
        this.estilo= estilo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
    
    @Override
    public void mostrarDatos(String nombreClase) {
        super.mostrarDatos(nombreClase); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Estilo: "+estilo);
        System.out.println("Marca: "+marca);
    }
    
}
