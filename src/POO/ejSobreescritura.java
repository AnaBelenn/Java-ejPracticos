package POO;
public class ejSobreescritura {
    public static void main(String[] args) {
        // SOBREESCRITURA de las clases ANIMAL, HUMANO, PERRO y PAJARO.
        Animal a1=new Animal();
        a1.comer();
        a1.correr();
        Humano p1=new Humano();
        p1.correr();
        p1.comer();
    }
    
}
