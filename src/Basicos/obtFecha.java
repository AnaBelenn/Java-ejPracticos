/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basicos;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Admin
 */
public class obtFecha {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Creo una instancia (fecNac) y le asigno una fecha determinada
        Calendar fecNac = new GregorianCalendar(1995, 10, 01);
        // Obtengo la fecha actual
        Calendar fecAct = Calendar.getInstance();
        // Asigno a la variable el año correspondiente
        int anioNac = fecNac.get(Calendar.YEAR);
        int anioAct = fecAct.get(Calendar.YEAR);
        // Muestro fecha actual
        System.out.println("dia: " + fecAct.get(Calendar.DATE) + " - mes:" + fecAct.get(Calendar.MONTH) + " - año: "
                + fecAct.get(Calendar.YEAR));

    }

}
