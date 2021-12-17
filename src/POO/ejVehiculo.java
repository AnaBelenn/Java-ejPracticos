package POO;
public class ejVehiculo {
    public static void main(String[] args) {
        Vehiculo v1= new Vehiculo("Ford", "1990");
        v1.registro();
        v1.acelerar(48);
        
        System.out.println("**********");
        
        Vehiculo v2= new Vehiculo("Ford");
        v2.registro();
        v2.acelerar(80);
    }
    
}
