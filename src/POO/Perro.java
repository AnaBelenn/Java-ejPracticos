package POO;

public class Perro extends Animal {

    @Override
    public void comer() {
        System.out.println("El perro come como tal.");
    }

    @Override
    public void correr() {
        System.out.println("El perro corre como tal.");
    }
}
