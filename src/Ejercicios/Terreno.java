package Ejercicios;

public abstract class Terreno {

    private int nrosLados;

    public Terreno(int nrosLados) {
        this.nrosLados = nrosLados;
    }

    @Override
    public String toString() {
        return "Terreno - numeros de lados= " + this.nrosLados;
    }

    public abstract double area();
}
