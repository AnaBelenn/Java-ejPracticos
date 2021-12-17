 package Ejercicios;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class ejExcepciones {
    //EXCEPCIONES CON THROW.
    //EXCEPCION CON TRY, CATCH, FINALLY.
    //Las excepciones si o si se deben manejar dentro del main.
    public static void main(String[] args) {
        try{
           leerArchivo();
        } catch (FileNotFoundException e) { //trato el error FileNotFoundException y lo almaceno en la variable e.
            System.out.println("Archivo no encontrado. Detalle: "+e);
        } catch (IOException e) {
            System.out.println("No se puede acceder al archivo. Detalle: "+e);
        }
        //Para ahorrarme escribir cada una de las excepciones tratadas, puedo agregar solamente la siguiente excepcion general.
        //Se recomienda NO usarlo y tratarlas individualmente para un mejor control de las excepciones. 
        catch (Exception e){
            System.out.println("Error. "+e);
        } finally {
            System.out.println("Se ejecuta si o si.");
        }
        //Excepcion NO verificada (que no necesita verificarse -para el programa- pero que DEBEMOS hacerlo).
        try {
            Integer num= null;
            System.out.println(num.toString());
        } catch (NullPointerException e) {
            System.out.println("Debes inicializar el objeto.");
        }
    }
    
    //Esta funcion deja pasar el error.
        public static void leerArchivo() throws FileNotFoundException, IOException{
            //BufferedReader es una libreria para trabajar/leer archivos externos.
            //FileReader es una libreria para leer un fichero puntual.
            BufferedReader bf = new BufferedReader(new FileReader("/Users/Admin/Desktop/archivo.txt"));
            //Throw de la linea anterior genera el FileNotFoundException
            String linea;
            while ((linea=bf.readLine()) != null) {
               //Throw de la linea anterior genera el IOException 
                System.out.println(linea);
            }
        }
        
    }
    

