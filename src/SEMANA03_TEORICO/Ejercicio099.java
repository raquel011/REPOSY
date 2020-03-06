/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA03_TEORICO;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author ESTHER
 */

    class worker{
    private String codigo;
    private String nombre;
    private String areaLaboral;
    private double sueldo;
    private int hextras;
    private String afiliacion;

    public String getAreaLaboral() {
        return areaLaboral;
    }

    public String getNombre() {
        return nombre;
    }
    
    DecimalFormat df=new DecimalFormat("#.##");
    public worker(String codigo, String nombre, String areaLaboral, 
            double sueldo, int hextras, String afiliacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.areaLaboral = areaLaboral;
        this.sueldo = sueldo;
        this.hextras = hextras;
        this.afiliacion = afiliacion;
    }    
    double montoHextras(){
        return (sueldo*hextras)/240;
    }
    double montoseguro(){
        if(afiliacion.equals("AFP")){
            return sueldo*0.17;
        }else{
            return sueldo*0.05;
        }
    }
    double montoessalud(){
        return sueldo*0.03;
    }
    double montodescuento(){
        return this.montoseguro()+this.montoessalud();
    }
    double montosueldobruto(){
        return this.sueldo+this.montoHextras();
    }
    double sueldoneto(){
        return this.montosueldobruto()-this.montodescuento();
    }   

    @Override
    public String toString() {
        return "worker{" + "codigo=" + codigo + ", nombre=" + nombre + 
                ", areaLaboral=" + areaLaboral + ", sueldo=" + sueldo + 
                ", hextras=" + hextras + ", afiliacion=" + afiliacion + 
                " \nHEXTRA "+df.format(montoHextras())+
                " \nMONTO SEGURO "+montoseguro()+
                " \nMONTO ESSALUD "+montoessalud()+
                " \nMONTO DESCUENTO "+montodescuento()+
                " \nSUELDO BRUTO "+df.format(montosueldobruto())+
                " \nSUELDO NETO "+df.format(sueldoneto())+'}'+"\n";
    }
    
}
class personis implements Iterable<worker>{
    ArrayList<worker> listaworke=new ArrayList<>();
    
    void add(worker p1){
        listaworke.add(p1);
    }
    String NombreEmpSueldo(){
        String cad="";
        double sueldotemp=0.0;
        for(worker w:listaworke){
            if(w.sueldoneto()>=sueldotemp){
                sueldotemp=w.sueldoneto();
            }
        }
        for(worker w:listaworke){
            if(w.sueldoneto()==sueldotemp){
                cad+=w.getNombre()+" ";
            }
        }
        return cad;
    }
    double sueldoNetoAreas(String area){
        double acu=0;
        for(worker w:listaworke){
            if(w.getAreaLaboral()==area){
                acu+=w.sueldoneto();
            }
        }
        return acu;
    }
    @Override
    public Iterator iterator(){
        return listaworke.iterator();
    }
}
public class Ejercicio099 {
    public static void main(String[] args) {  
        DecimalFormat dt=new DecimalFormat("#.##");
        String laboral[]={"Sistemas","Administracion","Marketing"};
        String afi[]={"AFP","SNP"};
        personis listapersona=new personis();
        worker w1=new worker("1","Jose",laboral[aleatorio(0,3)],1500.0,10,afi[aleatorio(0,2)]);
        worker w2=new worker("2","Mario",laboral[aleatorio(0,3)],2000.0,10,afi[aleatorio(0,2)]);
        worker w3=new worker("3","Antonio",laboral[aleatorio(0,3)],2500.0,10,afi[aleatorio(0,2)]);
        worker w4=new worker("4","Miguel",laboral[aleatorio(0,3)],3000.0,10,afi[aleatorio(0,2)]);
        worker w5=new worker("4","Pablo",laboral[aleatorio(0,3)],1800.0,10,afi[aleatorio(0,2)]);
        listapersona.add(w1);
        listapersona.add(w2);
        listapersona.add(w3);
        listapersona.add(w4);
        listapersona.add(w5);
        for(worker w:listapersona){
            System.out.println(w.toString());
        }  
        System.out.println("A- Empleado que tiene mayor sueldo NETO: "+listapersona.NombreEmpSueldo());
        System.out.println("B- Sueldo neto de marketing: "+dt.format(listapersona.sueldoNetoAreas("Marketing")));
    }
    static int aleatorio(int min,int max){
        return (int)((Math.random()*(max-min))+min);
    } 
}
