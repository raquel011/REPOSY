/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA03_PRACTICA;

import java.util.Scanner;

/**
 *
 * @author ESTHER
 */

class Cliente{
    private String Nombre;
    private Double Monto;
    private double reco;

    public Cliente() {
    }
    
    
    
    public Cliente(String Nombre) {
        this.Nombre = Nombre;
        this.Monto = 0.0;
        this.reco=0;
    }
    public void Depositar(double d){

     Monto=Monto+d;
    }
    public void Extraer(double ext){
        
     Monto=Monto-ext;   
        System.out.println(".."+Monto);
    }
    public double Retornar(){
        
        return Monto;  
        
    }

public String Imprimir(){
    
return  "Monto="+Monto;
}
}
public class Banco {  
            
        Cliente cliente1,cliente2,cliente3;

    public Banco() {
        cliente1=new Cliente("juan");
        cliente2=new Cliente("ana");
        cliente3=new Cliente("pedro");
        
    }
    public void operar(){
        cliente1.Depositar(100);
        cliente2.Depositar(150);
        cliente3.Depositar(200);
        cliente3.Extraer(150);
    }
    public void Depositototal(){
        double suma=cliente1.Retornar()+cliente2.Retornar()+cliente3.Retornar();
        System.out.println("la suma total es "+suma);
        cliente1.Imprimir();
        cliente2.Imprimir();
        cliente3.Imprimir();
    }
        
    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
Banco b=new Banco();
b.operar();
b.Depositototal();
        
        
        
        
        
        /*
        System.out.println("ingrese nombre");
        String nombre=entrada.next();
        System.out.println("monto");
        double monto=entrada.nextDouble();
        
        Cliente c1,c2,c3,c;
        c=new Cliente();
        
               c1 =new Cliente(nombre);
               c1.Depositar(monto);
        c1.Extraer(20);
               
               
        System.out.println("ingrese nombre");
        String nombre2=entrada.next();
        System.out.println("monto");
                double monto2=entrada.nextDouble();
        
       c2=new Cliente(nombre2);             
       c2.Depositar(monto2);
                      
        c2.Extraer(30);
        System.out.println("ingrese nombre");
        String nombre3=entrada.next();
        System.out.println("monto");
        double monto3=entrada.nextDouble();
         
               c3=new Cliente(nombre3);
        
        
        c3.Depositar(monto3);
        c3.Extraer(40);
double suma=c1.Retornar()+c2.Retornar()+c3.Retornar();
        System.out.println("total "+suma);
        */
    }
}
