package POO;

public class Humano extends Animal {

    @Override
    public void comer() {
        System.out.println("El humano come como tal.");
    }

    @Override
    public void correr() {
        System.out.println("El humano corre como tal.");
    }
}
