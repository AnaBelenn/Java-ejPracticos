package Coursera.SegundaEntrega;
/**
 *
 * @author Ana Belen Alfonso
 */
public interface iVisualizable {
    
    public void marcarVisto(); //cambia el atributo de visto a true
    public boolean esVisto(); //devuelve el estado del atributo visto
    public double tiempoVisto(); //devuelve el tiempo en minutos/segundos que se visualizó el video.

}
