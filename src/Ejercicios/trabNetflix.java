package Ejercicios;

import Coursera.SegundaEntrega.Pelicula;
import Coursera.SegundaEntrega.Pelicula;
import Coursera.SegundaEntrega.Serie;
import Coursera.SegundaEntrega.Serie;

public class trabNetflix {
    public static void main(String[] args) {
        // TODO code application logic here
        Pelicula peliculas1[] = null; 
        Serie series1[] = null;
        int anio=0, temp=0;
        String salida1="", salida2="";
        
        peliculas1[0]= new Pelicula("Titanic", "ABC", "Romance", 123.5, 2001);
        peliculas1[1]= new Pelicula("Titanes del pacifico", "DEF", "Accion", 93.5, 2008);
        peliculas1[2]= new Pelicula("Transformers", "ABC", "Ficcion", 123.5, 2012);
        peliculas1[3]= new Pelicula("Avengers", "Marvel", "Ficcion", 123.5, 2018);
        peliculas1[4]= new Pelicula("Spiderman", "Marvel", "Ficcion", 123.5, 2017);
        
        
        series1[0]= new Serie("Stranger Things", "The Duffer Brothers", "Ciencia Ficcion", 1135.4, 3);
        series1[1]= new Serie("Sherlock Holmes", "Netflix", "Misterio", 935.4, 4);
        series1[2]= new Serie("Lucifer", "Netflix", "Ficcion", 1038.4, 4);
        series1[3]= new Serie("Gravity Falls", "Alex Hirsch", "Animacion", 1265.4, 7);
        series1[4]= new Serie("Supergirl", "DC", "C. Ficcion", 1673.4, 4);
        
        for (Pelicula elto: peliculas1) {
            if (elto.getAnio()>anio) {
                salida1= elto.toString();
            }
        }
        System.out.println("Pelicula mas reciente: ");
        System.out.println(""+salida1);
        
        for (Serie elto: series1) {
            if (elto.getTemporadas()>temp) {
                salida2= elto.toString();
            }
        }
        System.out.println("Serie con mas temporadas: ");
        System.out.println(""+salida1);
    }
    
}
