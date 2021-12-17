package POO;
public class auto {
    //Defino los atributos:
    public String marca;
    public String modelo;
    public String color;
    private boolean acceso=false; //nadie puede tocar o acceder al atributo ACCESO
    
    public void llave(String clave) { //recibo un string y lo guardo en CLAVE
        if (clave.equals("1234")){
            acceso=true;
        } else {
            System.out.println("Acceso denegado. Clave incorrecta.");
        }
    }
    //Una vez habilitado el acceso, accedemos al metodo ENCIENDE por otro metodo MANDO
    //De esta forma puedo acceder al metodo PRIVADO porque se encuentra DENTRO de la misma clase.
    public void mando(String accion) {
        if (acceso==true){
            if (accion.equals("enciende")) {
                enciende();
            }
        }
    }
    private void enciende(){
        System.out.println("Auto encendido.");
    }
    public void acelera(){
        System.out.println("Acelerando.");
    }
    public void frena(){
        System.out.println("Auto detenido.");
    }
    
}
