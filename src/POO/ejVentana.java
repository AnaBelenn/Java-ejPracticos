package POO;
/**
 *
 * @author Admin
 */
public class ejVentana {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VentanaIntGraf v= new VentanaIntGraf("ID: "+getPID());
        v.setVisible(true);
        if(args.length>0) {
            v.setTextos(args);
        }
    }
    //Creamos un nuevo metodo que debe ser estatico porque será llamado por el 
    // VOID que solo recibe metodos estáticos. Y va a retornar un String.
    
    public static String getPID() {
        return java.lang.management.ManagementFactory.getRuntimeMXBean().getName();
    }
}
