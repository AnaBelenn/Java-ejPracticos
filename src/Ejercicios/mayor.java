package Ejercicios;
/**
 *
 * @author AnaBelen
 */
public class mayor {    
    public static void main(String[] args) {
        int[] nros = {1, 2, 3, 4, 5, 6, 7};
        int a = nros[0];

        for(int i=1; i<nros.length; i+=2){
            int b = nros[i];
            int c = nros[i+1];
            if (a>b && a>c){
                nros[i-1] = b;
                nros[i] = a;
                nros[i+1] = c;
            } else if (b>a && b>c) {
                    nros[i-1] = a;
                    nros[i] = b;
                    nros[i+1] = c;
            
            } else if (c>a && c>b) {
                    nros[i-1] = a;
                    nros[i] = c;
                    nros[i+1] = b;
                }
            a = nros[i+1];
        }

        for (int elemento:nros) {
            System.out.print(elemento+" ");
        }

    }
    
}
