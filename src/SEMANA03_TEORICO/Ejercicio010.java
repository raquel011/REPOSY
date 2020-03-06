/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA03_TEORICO;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author ESTHER
 */
class Worker{
    private String codigo;
    private String nombre;
    private String AreaLaboral;
    private double sueldo;
    private int HorasExtras;
    private String afiliacion;
    
    public Worker(String codigo, String nombre, String AreaLaboral, double sueldo, int HorasExtras, String afiliacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.AreaLaboral = AreaLaboral;
        this.sueldo = sueldo;
        this.HorasExtras=HorasExtras;
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAreaLaboral() {
        return AreaLaboral;
    }

    public void setAreaLaboral(String AreaLaboral) {
        this.AreaLaboral = AreaLaboral;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getHorasExtras() {
        return HorasExtras;
    }

    public void setHorasExtras(int HorasExtras) {
        this.HorasExtras = HorasExtras;
    }

    public String getAfiliacion() {
        return afiliacion;
    }

    public void setAfiliacion(String afiliacion) {
        this.afiliacion = afiliacion;
    }

    @Override
    public String toString() {
        return "Worker{" + "codigo=    " + codigo + ", nombre=" + nombre + ", "+"n"
                + " AreaLaboral=" + AreaLaboral + ", sueldo=" + sueldo + ", HorasExtras=" + HorasExtras + ", afiliacion=" + afiliacion + "\n"+
                "   monto extra       "+montoHextras()+
                "  monto seguro   "+montoSeguro()+
                "  monto esalud   "+montoessalud()+
                "  monto descuento"+montodescuento()+
                "  monto bruto    "+montobruto()+
                "  sueldo neto    "+sueldoneto()+'}';
    }
    
    
}
class person implements Iterable<Worker>{
  
    ArrayList<Worker> list= new ArrayList<>();
    
    
    void add(Worker p1){
       list.add(p1);
    }
    String NombreEmpleadoSueldo(){
        String cad="";
        double sueldoTemp=0.0;
        
        for(Worker w:list){
          if(w.sueldoneto()>=sueldoTemp){
             sueldoTemp=w.sueldoneto();
             cad=w.getNombre();
          }  
        }
        
        for(Worker w:list){
            if(w.sueldoneto()==sueldoTemp){
               cad=cad+w.getNombre()+"";
            }
        }
        return cad;
        
    }
    double sueldoNetoArea(String area){
        double acu=0;
        for(Worker w:list){
          if(w.getAreaLaboral()==area)  {
           acu+=w.sueldoneto();
        }
        }
        return acu;
          
    }
    int MontoMayor100(){
        int cont=0;
        for(Worker w:list){
            if(w.montoSeguro()>100){
                cont++;
            }
        }
        return cont;
        
    }
    int empleadosSistemasHorasExtras500y800(){
        int cont=0;
        for(Worker w:list){
            if(w.getAreaLaboral().equals("Sistemas")&&(w.montoHextras()>=500 && w.montoHextras()<=800)){
               cont++; 
            }
        
    }
        return cont;
    }
    String empleadoSNPmenordescuento(){
        
        String nom="";
        double minimoMonto=1000;
        for(Worker w:list){
            if(w.getAfiliacion().equals("SNP")&&w.montodescuento()<minimoMonto){
                minimoMonto=w.montodescuento();
               nom=w.getNombre();
                
                
            }
                   }
        return nom;
            
        }
    
    double GastoTotalEmpresa(){
        double total=0;
        
        for(Worker w:list){
            total=total+w.montobruto();
        }
        return total;
    }
    
        
    public Iterator iterator(){
        return list.iterator();
    }
}

public class Ejercicio010 {
    public static void main(String[] args) {
        
                DecimalFormat df=new DecimalFormat("#.##");

        person lista=new person();
    String laboral[]={"Sistemas","Administracion","Marketing"};
    String afi[]={"AFP","SNP"};
    
    Worker w1=new Worker("01","jose",laboral[aleatorio(0,3)],2000,9,afi[aleatorio(0,2)]);
    Worker w2=new Worker("02","mario",laboral[aleatorio(0,3)],2100,10,afi[aleatorio(0,2)]);
    Worker w3=new Worker("03","miguel",laboral[aleatorio(0,3)],2600,10,afi[aleatorio(0,2)]);
    Worker w4=new Worker("04","antonio",laboral[aleatorio(0,3)],2300,10,afi[aleatorio(0,2)]);
    Worker w5=new Worker("05","pablo",laboral[aleatorio(0,3)],2100,10,afi[aleatorio(0,2)]);
      lista.add(w1);
      lista.add(w2);
      lista.add(w3);
      lista.add(w4);
      lista.add(w5);
      
      for(Worker w:lista){
      System.out.println(w.toString());
    }
        System.out.println("empleado con mayor sueldo neto  : "+lista.NombreEmpleadoSueldo());
        System.out.println("sueldo neto del area de marketing "+df.format(lista.sueldoNetoArea("Marketing")));
        System.out.println("numero de emplados con monto de seguro mayor de 100: "+lista.MontoMayor100());
        System.out.println("cantidad de emplados de sistemas con con monto de horas extras que estan entre 500 y 800: "+lista.empleadosSistemasHorasExtras500y800());
        System.out.println("empleado del SNP con el menor monto de descuento: "+lista.empleadoSNPmenordescuento());
        System.out.println("monto toal que gasta la empresa en pagar a sus empleados: "+df.format(lista.GastoTotalEmpresa()));
    }
    static int aleatorio(int min,int max){
        return (int)((Math.random()*(max-min))+min);
    }
    
}

