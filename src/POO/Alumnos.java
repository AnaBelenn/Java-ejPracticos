package POO;

public class Alumnos {
    private String nombre;
    private char aula;
    private float calif;

    public Alumnos(String _nombre, char _aula) {
        this.nombre= _nombre;
        this.aula= _aula;
    }

    public void setCalif(float _calif) {
        if(_calif>10){
            this.calif=10;
        } else if (_calif<0){
            this.calif=0;
        } else {
            this.calif= _calif;
        }
    }

    public float getCalif() {
        return this.calif;
    }

    public char getAula() {
        return this.aula; 
    }
}
