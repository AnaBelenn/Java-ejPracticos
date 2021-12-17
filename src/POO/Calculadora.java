package POO;
public class Calculadora {
    public int suma (int a, int b) {
        int result;
        result= a+b;
        return result;
    }
    
    public int resta (int a, int b) {
        int result;
        result= a-b;
        return result;
    }
    
    public int producto (int a, int b) {
        int result;
        result= a*b;
        return result;
    }
    
    public float division (int a, int b) {
        float result=0;
        if (b!=0){
        result= a/b;
        } else {
            System.out.println("Cualquier numero dividido por cero es infinito.");
        }
        return result;
    }
}
