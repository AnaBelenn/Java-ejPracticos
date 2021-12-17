package Coursera.SegundaEntrega;
/**
 *
 * @author Admin
 */
public class Netflix{
    private String titulo;
    private String creador;
    private String genero = "";
    private double duracion = 0.0;
    protected boolean visto = false;

    public Netflix() {
    }
    
    public Netflix(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }
    
    public Netflix(String titulo, String creador, String genero, double duracion) {
        this.titulo = titulo;
        this.creador = creador;
        this.genero = genero;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Titulo: "+titulo+"\nGenero: "+genero+"\nCreador: "+creador+"\nDuracion: "+duracion;
    }

    
}
