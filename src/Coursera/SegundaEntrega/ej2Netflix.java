package Coursera.SegundaEntrega;
import java.util.ArrayList;
public class ej2Netflix {
    public static void main(String[] args) {
        int mayor=0, temp=1;
        String salida1="", salida2="";
        ArrayList <Pelicula> peliculas= new ArrayList();
        ArrayList <Serie> series= new ArrayList();
        try {
        Pelicula peli1 = new Pelicula("A1", "Creador1", "Genero1", 97.22, 2015);
        peli1.marcarVisto();
        peliculas.add(peli1);
        Pelicula peli2 = new Pelicula("A2", "Creador2", "Genero2", 98.15, 2004);
        peli2.marcarVisto();
        peliculas.add(peli2);
        Pelicula peli3 = new Pelicula("A3", "Creador3", "Genero3", 101.53, 2016);
        peli3.marcarVisto();
        peliculas.add(peli3);
        Pelicula peli4 = new Pelicula("A4", "Creador4", "Genero4", 103.41, 2019);
        peliculas.add(peli4);
        Pelicula peli5 = new Pelicula("A5", "Creador5", "Genero5", 96.38, 2012);
        peliculas.add(peli5);
        
        Serie series1 = new Serie("S1", "Creador1", "Genero1", 97.22, 4);
        series1.marcarVisto();
        series.add(series1);
        Serie series2 = new Serie("S2", "Creador2", "Genero1", 97.22, 7);
        series.add(series2);
        Serie series3 = new Serie("S3", "Creador3", "Genero1", 97.22, 3);
        series.add(series3);
        Serie series4 = new Serie("S4", "Creador4", "Genero1", 97.22, 4);
        series4.marcarVisto();
        series.add(series4);
        Serie series5 = new Serie("S5", "Creador5", "Genero1", 97.22, 5);
        series5.marcarVisto();
        series.add(series5);
        
        } catch (RuntimeException e) {
            System.out.println("Error: "+e);
        } finally {
        
        System.out.println("Peliculas vistas: ");
        for (Pelicula elto: peliculas) {
            if (elto.esVisto()) {
                System.out.println("Titulo: "+elto.getTitulo());
                System.out.println("Tiempo visto: "+elto.getDuracion()+" minutos.");
                System.out.println("");
            }
            if (elto.getAnio()>mayor) {
                mayor=elto.getAnio();
                salida1=elto.toString();
            }
        }
        
                
        System.out.println("Series vistas: ");
        for (Serie elto: series) {
            if (elto.esVisto()) {
                System.out.println("Titulo: "+elto.getTitulo());
                System.out.println("Tiempo visto: "+elto.getDuracion()+" minutos");
                System.out.println("");
            }
            if (elto.getTemporadas()>temp) {
                temp=elto.getTemporadas();
                salida2=elto.toString();
            }
        }
        
        System.out.println("Pelicula mas reciente: "+salida1);
        System.out.println("");
        System.out.println("Serie con mas temporadas: "+salida2);
        }
        
    }
}