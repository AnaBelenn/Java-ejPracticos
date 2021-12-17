package POO;

public class Cuadrilatero {
    private float lado1;
    private float lado2;

    public Cuadrilatero(float _lado1) {
        this.lado1= _lado1;
        this.lado2= _lado1;
    }

    public Cuadrilatero(float _lado1, float _lado2) {
        this.lado1=_lado1;
        this.lado2=_lado2;
    }

    public float getPerimetro() {
        return (this.lado1 + this.lado2)*2;
    }

    public float getArea() {
        float area;
        area=this.lado1*this.lado2;
        return area;
    }
}
