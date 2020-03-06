/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA03_TEORICO;

import java.text.DecimalFormat;


/**
 *
 * @author ESTHER
 */

class Work{
    private String codigo;
    private String nombre;
    private String AreaLaboral;
    private double sueldo;
    private int HorasExtras;
    private String afiliacion;
        DecimalFormat df=new DecimalFormat("#.##");

    
    public Work(String codigo, String nombre, String AreaLaboral, double sueldo, int HorasExtras, String afiliacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.AreaLaboral = AreaLaboral;
        this.sueldo = sueldo;
        this.afiliacion = afiliacion;
        
    }
    double montoHextras(){
        return (sueldo*HorasExtras)/240;
    }
    double montoSeguro(){
        if(afiliacion.equals("AFP")){
            return sueldo*0.17;
        }else {
    return sueldo*0.05;
        }
}
    double montoessalud(){
        return sueldo*0.03;
    }
    double montodescuento(){
        return montoSeguro()+this.montoessalud();
    }
   double montobruto(){
       return this.sueldo+this.montoHextras();
   }
   double sueldoneto(){
      return montobruto()-this.montodescuento();
   }

    @Override
    public String toString() {
        return "Worker{" + "codigo=" + codigo + ", nombre=" + nombre + ", "+"n"
                + "AreaLaboral=" + AreaLaboral + ", sueldo=" + sueldo + ", HorasExtras=" + HorasExtras + ", afiliacion=" + afiliacion + "\n"+
                "extra"+df.format(montoHextras())+
                "monto seguro"+montoSeguro()+
                "monto esalud"+montoessalud()+
                "monto descuento"+montodescuento()+
                "monto bruto"+df.format(montobruto())+
                "sueldo neto"+df.format(sueldoneto())+'}';
    }
    
    
}
public class Ejercicio09 {
    public static void main(String[] args) {
    String laboral[]={"Sistemas","Administracion","Marketing"};
    String afi[]={"AFP","SNP"};
    Work w1=new Work("01","jose",laboral[aleatorio(0,3)],2000,10,afi[aleatorio(0,2)]);
        //System.out.println(aleatorio(0,3));
        System.out.println(w1.toString());
    }
    static int aleatorio(int min,int max){
        return (int)((Math.random()*(max-min))+min);
    }
    
}
