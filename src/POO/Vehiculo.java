package POO;
public class Vehiculo {
    String marca;
    String modelo;
    String sku;
    
    //**********SOBRECARGA**********//
    
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Vehiculo(String sku) {
        this.sku = sku;
    }
    
    public void registro(){
        if (this.marca!=null && this.modelo!=null){
            System.out.println("Su vehiculo "+this.marca+" - "+this.modelo+" fue registrado.");
        } else if (this.sku!=null){
            System.out.println("Su vehiculo "+this.sku+" fue registrado");
        }
        
    }
    public void acelerar(int km){
        if (this.marca!=null && this.modelo!=null){
            System.out.println("Su vehiculo "+this.marca+" - "+this.modelo+" esta acelerando a "+km+"km/h");
        } else if (this.sku!=null){
            System.out.println("Su vehiculo "+this.sku+" esta acelerando a "+km+"km/h");
        }
    }
    
}
