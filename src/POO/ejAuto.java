package POO;
public class ejAuto {
    public static void main(String[] args) {
        //LA DEFINICIÓN DE LA CLASE DE ESTAR DENTRO DEL MISMO PAQUETE.
        //Si se encuentra fuera del paquete, la debo importar como con Scanner.
        //llamo a la clase auto
        auto vocho=new auto();
        vocho.modelo="1980";
        vocho.marca="vocho";
        vocho.color="rojo";
        vocho.llave("1234");
        vocho.mando("enciende");
        
        /*
        vocho.enciende();
        vocho.acelera();
        vocho.frena();
                */
        
    }
    
}
