package Coursera.SegundaEntrega;

import Coursera.SegundaEntrega.Pelicula;
import Coursera.SegundaEntrega.Serie;

public class ejNetflix {
    public static void main(String[] args) {
        int mayor=0, temp=1;
        String salida1="", salida2="";
        
        Pelicula peli[] = new Pelicula[5]; 
        peli[0] = new Pelicula("A1", "Creador1", "Genero1", 97.22, 2015);
        peli[0].marcarVisto();
        peli[1] = new Pelicula("A2", "Creador2", "Genero2", 98.15, 2004);
        peli[2] = new Pelicula("A3", "Creador3", "Genero3", 101.53, 2016);
        peli[2].marcarVisto();
        peli[3] = new Pelicula("A4", "Creador4", "Genero4", 103.41, 2019);
        peli[4] = new Pelicula("A5", "Creador5", "Genero5", 96.38, 2012);
        peli[4].marcarVisto();
        
        Serie series[] = new Serie[5];
        series[0] = new Serie("S1", "Creador1", "Genero1", 97.22, 4);
        series[1] = new Serie("S2", "Creador2", "Genero1", 97.22, 7);
        series[1].marcarVisto();
        series[2] = new Serie("S3", "Creador3", "Genero1", 97.22, 3);
        series[3] = new Serie("S4", "Creador4", "Genero1", 97.22, 4);
        series[3].marcarVisto();
        series[4] = new Serie("S5", "Creador5", "Genero1", 97.22, 5);
        
        
        System.out.println("Peliculas vistas: ");
        for (Pelicula elto:peli) {
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
        for (Serie elto:series) {
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


