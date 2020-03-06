/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA8_TEORICO;

import java.util.Calendar;
import java.util.Locale;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author ESTHER
 */
public class PanelReloj extends JPanel{
    public PanelReloj(){
        super();
        String TiempoActual=getTiempo();
        JLabel tiempo=new JLabel("fecha");
        JLabel fecha=new JLabel(TiempoActual);
        add(tiempo);
        add(fecha);
    }
    String getTiempo(){
        
        String tiempo;
        Calendar ahora=Calendar.getInstance();
        int hora=ahora.get(Calendar.HOUR_OF_DAY);
        int minuto=ahora.get(Calendar.MINUTE);
        int mes=ahora.get(Calendar.MONTH);
        int dia=ahora.get(Calendar.DAY_OF_MONTH);
        int anio=ahora.get(Calendar.YEAR);
        String nombremes=" ";
        switch(mes){
            case 1:
                nombremes="enero";
                break;
            case 2:
                nombremes="febrero";
                break;
            case 3:
                nombremes="marzo";
                break;
            case 4:
                nombremes="abril";
                break;
            case 5:
                nombremes="mayo";
                break;
            case 6:
                nombremes="junio";
                break;
            case 7:
                nombremes="julio";
                break;
            case 8:
                nombremes="agosto";
                break;
            case 9:
                nombremes="setiembre";
                break;
            case 10:
                nombremes="octubre";
                
                break;
            case 11:
                nombremes="noviembre";
                break;
            case 12:
                nombremes="diciembre";
                break;
                
        }
        tiempo=dia+"de"+nombremes+"del"+anio+"hora"+hora+":"+minuto;
        return tiempo;
    }
    public static void main(String[] args) {
        
    }
}
