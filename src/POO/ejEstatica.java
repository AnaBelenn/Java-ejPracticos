package POO;
public class ejEstatica {
    //La clase MAIN suele ser estáica ya que solo podemos tener un solo main, un solo punto de entrada.
    public static void main(String[] args) {
        Estatica i1=new Estatica();
        Estatica i2=new Estatica();
        System.out.println("i1: "+i1.normal);
        System.out.println("i2: "+i2.normal);
        i1.normal="Nuevo valor de i1";
        i2.normal="Nuevo valor de i2";
        System.out.println("Cambio de valores:");
        System.out.println("i1: "+i1.normal);
        System.out.println("i2: "+i2.normal);
        
        /*
        //NO HAY NECESIDAD DE USAR INSTANCIAS PARA MIEMBROS ESTÁTICOS pero un ejemplo seria:
        System.out.println("i1: "+i1.estatico);
        System.out.println("i2: "+i2.estatico);
        i1.estatico="Nuevo valor de i1";
        i2.estatico="Nuevo valor de i2";
        System.out.println("Cambio de valores");
        System.out.println("i1: "+i1.estatico);
        System.out.println("i2: "+i2.estatico);
        //Ambos devuelven el mismo valor ya que el miembro estatico le pertenece a la clase
        //No importa si asigno valores distintos a variables distintas, en la clase se refiere a la misma instancia
        //Se le asigna el valor a la clase, no a la instancia. 
        //Por lo tanto, el resultado final para todas las variables estáticas es el ultimo valor asignado. 
                */
        //No necesito instanciar para llamar al valor estatico
        System.out.println(Estatica.estatico);
        
    }
    
}
