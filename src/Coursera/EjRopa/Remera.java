package Coursera.EjRopa;
/**
 *
 * @author Ana Belen Alfonso
 */
public class Remera extends Ropa implements iDevolucion {
   private String corte;
   
    public Remera(int id, String talle, String color, double precio, String corte) {
        super(id, talle, color, precio);
        this.corte = corte;
    }

    public String getCorte() {
        return corte;
    }

    public void setCorte(String corte) {
        this.corte = corte;
    }

    @Override
    public void mostrarDatos(String nombreClase) {
        super.mostrarDatos(nombreClase); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Corte: "+corte);
    }

    @Override
    public void hacerDevolucion() {
        System.out.println("Devolucion de una remera.");
    }
       
    
}
