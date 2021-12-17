package Coursera.EjRopa;
public class ejRopa {
    public static void main(String[] args) {
        Remera n1= new Remera(25436, "M", "Azul", 58.36, "largo");
        Pantalon n2= new Pantalon(256983, "L", "Negro", 658.32, "Femenino", "Short");
        Zapatos n3= new Zapatos(45963, "39", "Blanco", 365.24, "Adidas", "Sport");
        
        n1.mostrarDatos("Remera de verano");
        System.out.println("");
        n2.mostrarDatos("Pantalon retro");
        System.out.println("");
        n3.mostrarDatos("Zapatillas");
        System.out.println("");
        n1.hacerDevolucion();
    }
    
}
