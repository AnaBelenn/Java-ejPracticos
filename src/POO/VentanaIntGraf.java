package POO;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class VentanaIntGraf extends JFrame {
//Declaro las variables GLOBALES 
    JPanel panel1;
    JPanel panel2;
    JPanel panel3;
    JLabel et1;
    JLabel et2;
    JLabel et3;
    public VentanaIntGraf() throws HeadlessException {
        //Se manejan errores o excepciones en caso de que no se cuente con interfaces gráficas compatibles.
        Dimension d= new Dimension(200, 100);
        this.setSize(d);
    }
//Agrego un titulo y dimension a la ventana
    public VentanaIntGraf(String title) throws HeadlessException {
        super(title);
        Dimension d= new Dimension(350, 250);
        this.setSize(d);
        //Metodo para cerrar la ventana (no solo esconderla)
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Posicionar la ventana en alguna parte de la pantalla
        this.setLocation(300, 100);
        iniciarPaneles(); 
        iniciarEtiquetas();
    }

    protected void iniciarPaneles() {
        JPanel contenedor= new JPanel();
        //Le digo a Java que inserte esto en la ventana principal de la siguiente forma:
        //Accedo al panel de la ventana principal con "this.getContentPane()"
        //A esto le pido que agregue el contenedor con ".add(contenedor)"
        this.getContentPane().add(contenedor);
        //Puedo agregar color al contenedor para diferenciarlo de la ventana.
        contenedor.setBackground(Color.gray);
        //Puedo crear varios paneles y absorberlos con el contenedor
        //Accedo a los atributos de los paneles declarados con "this"
        this.panel1= new JPanel();
        this.panel2= new JPanel();
        this.panel3= new JPanel();
        contenedor.add(this.panel1);
        contenedor.add(this.panel2);
        contenedor.add(this.panel3);
        //Cambio el color de los paneles
        //Puedo crear un nuevo color con "new Color(coordenadas)" dentro del setBackground
        //Las "coordenadas" las obtengo de https://www.w3schools.com/colors/colors_picker.asp de rgb
        this.panel1.setBackground(new Color(102, 255, 102));
        this.panel2.setBackground(new Color(153, 204, 255));
        //O puedo usar los colores con los que ya cuenta la plataforma.
        this.panel3.setBackground(Color.magenta); 
        //La instruccion setLayout indica la forma en la que se va a comportar el objeto
        //BoxLayout(base (lugar) del comportamiento, como se va a comportar); 
        //X_AXIS -> los paneles que se encuentren dentro, los va a dividir de forma orizontal.
        //La siguiente linea divide en tres columa nuestra ventana (los 3 paneles que agregué).
        contenedor.setLayout(new BoxLayout(contenedor, BoxLayout.X_AXIS));
        //Puedo esconder un panel de la siguiente forma:
        
       //
    }
    
    
    protected void iniciarEtiquetas() {
        //Declaro las etiquetas.
        this.et1=new JLabel("<html>Etiqueta nro. 1<html>");
        this.et2=new JLabel("<html>Etiqueta nro. 2<html>");
        this.et3=new JLabel("<html>Etiqueta nro. 3<html>");
        //Ponemos las etiquetas dentro de los paneles.
        this.panel1.add(et1);
        this.panel2.add(et2);
        this.panel3.add(et3);
        this.et1.setForeground(new Color(255, 80, 80));
        this.et2.setForeground(new Color(0, 153, 0));
        this.et3.setForeground(new Color(204, 255, 51));
        //Le quito los atributos que defini anteriormente a los paneles
        this.panel1.setLayout(null);
        this.panel2.setLayout(null);
        this.panel3.setLayout(null);
        //Defino nuevos atributos -posiciones- a las etiquetas de los paneles:
        this.et1.setBounds(10, 100, 90, 60);
        this.et2.setBounds(10, 100, 90, 60);
        this.et3.setBounds(10, 100, 90, 60);
    }
    //Creo un nuevo metodo para mostrar, en las etiquetas de los paneles, los argumentos recibidos
    //Recibe un arreglo de textos de tipo string
    public void setTextos(String textos[]) {
        this.et1.setText(textos[0]);
        this.et2.setText(textos[1]);
        this.et3.setText(textos[2]);
    }
    
    
}
