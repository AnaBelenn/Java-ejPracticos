package Coursera.SegundaEntrega;
/**
 *
 * @author Ana Belen Alfonso
 */
public class Serie extends Netflix implements iVisualizable {
    private int temporadas=1; 

    public Serie() {
    }

    public Serie(String titulo, String creador, String genero, double duracion, int temporadas) {
        super(titulo, creador, genero, duracion);
        this.temporadas = temporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public String toString() {
        return super.toString()+"\nTemporadas: "+temporadas;
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
