package Ejercicios;

public class TerrenoTriang extends Terreno {
    private double lado1;
    private double lado2;
    private double lado3;

    public TerrenoTriang(double lado1, double lado2, double lado3) {
        super(3);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }
     
    @Override
    public String toString() {
        return "Triangulo "+ super.toString() +" - lado1= " + lado1 + ", lado2= " + lado2 + ", lado3= " + lado3;
    }

    /**
     * Formula de Heron
     * Calcular primero el semi perimetro. S=(a+b+c)/2
     * Luego el area. A= sqrt(S*(S-A)*(S-B)*(S-C)).
     */
    public double area() {
        double s= (this.lado1 + this.lado2 + this.lado3)/2;
        return Math.sqrt(s*(s-this.lado1)*(s-this.lado2)*(s-this.lado3) );
    }
}
