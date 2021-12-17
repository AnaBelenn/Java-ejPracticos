package Ejercicios;
public class Telefono {
    int id;
    String modelo;
    String marca;
    Double precio;
 
   public Telefono () {
       //Overload: sobrecargo el metodo constructor.
   }

   public Telefono(int id, String modelo, String marca, Double precio) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
    }

    
   public void mostrarDatos() {
       System.out.println("ID: " +this.id);
       System.out.println("Marca: "+this.marca);
       System.out.println("Modelo: "+this.modelo);
       System.out.println("Precio: $"+this.precio);
   }
}
