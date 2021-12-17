package Coursera.EjRopa;
/**
 *
 * @author Ana Belen Alfonso
 */
public class Ropa {
    private int id;
    private String talle;
    private String color;
    private double precio;

    public Ropa(int id, String talle, String color, double precio) { //Constructor
        this.id = id;
        this.talle = talle;
        this.color = color;
        this.precio = precio;
    }

    public int getId() { //Getter ID
        return id;
    }

    public void setId(int id) { //Setter ID
        this.id = id;
    }

    public String getTalle() { //Getter TALLE
        return talle;
    }

    public void setTalle(String talle) { //Setter TALLE
        this.talle = talle;
    }

    public String getColor() { //Getter COLOR
        return color;
    }

    public void setColor(String color) { //Setter COLOR
        this.color = color;
    }

    public double getPrecio() { //Getter PRECIO
        return precio;
    }

    public void setPrecio(double precio) { //Setter PRECIO
        this.precio = precio;
    }
    
    public void mostrarDatos(String nombreClase) {
        System.out.println(nombreClase);
        System.out.println("ID: "+id);
        System.out.println("Talle: "+talle);
        System.out.println("Color: "+color);
        System.out.println("Precio: $"+precio);
    }
    
}
