package Coursera.SegundaEntrega;
/**
 *
 * @author Ana Belen Alfonso
 */
public class Pelicula extends Netflix implements iVisualizable{
    private int anio;

    public Pelicula() {
    }

    public Pelicula(String titulo, String creador, String genero, double duracion, int anio) {
        super(titulo, creador, genero, duracion);
        this.anio= anio;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return super.toString()+"\nAño: "+anio;
    }
    
            @Override
    public void marcarVisto() {
        this.visto = true;
    }

    @Override
    public boolean esVisto() {
        return super.visto;
    }

    @Override
    public double tiempoVisto() {
        if (visto) {
            return super.getDuracion();
        } else {
            return 0.0;
        }
    }
    
}
