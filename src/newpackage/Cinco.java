/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;

/**
 *
 * @author ESTHER
 */

class cinco{
    
    //INSISO A
    private int Npantalones;
    private int modelo;
    private int talla;
    private double metrosTela;
    private double precioFinal;
    private double cargoTalla;
    private double costoTela;
    private double manoObra;
    private double gananciaExtra;
    private double ganancia;
    
    //INSISO B
    
Scanner entrada=new Scanner(System.in);
    public cinco() {
       this.ganancia=0; 
    }
   public void PrecioFinalVentaInsisoA(){
       ganancia=0;
       System.out.println("ingrese la cantidad de N pantalones a producir");  
       Npantalones=entrada.nextInt();
       System.out.println("ingrese el valor por metro de tela");
       double PrecioMetro=entrada.nextDouble();
       System.out.println("ingrese el modelo 1=A o 2=B");
       do{
           
       modelo=entrada.nextInt();
       
       if(modelo!=1||modelo!=2)
                 
           System.out.println("ingrese nuevamente");
       
       }while(modelo!=1||modelo!=2);
           
       System.out.println("talla 1=30 2=32 3=36");
       talla=entrada.nextInt();
       
      
        do {
            talla = entrada.nextInt();
            if (talla<1||talla>3)
                System.out.print("Valor incorrecto Ingrese nuevamente ");
        } while (talla<1||talla>3);
        
        if(modelo==1){
            metrosTela=1.5*Npantalones;
            costoTela=metrosTela*PrecioMetro;
            manoObra=costoTela*0.8;
            

        }else if(modelo==2){
            metrosTela=1.8*Npantalones;
            costoTela=metrosTela*PrecioMetro;
                        manoObra=costoTela*0.95;

        }
        if(talla==2||talla==3){
            cargoTalla=manoObra*0.04;
            gananciaExtra=(costoTela+manoObra+cargoTalla)*0.3;
                    precioFinal=costoTela+manoObra+cargoTalla+gananciaExtra;
        ganancia=cargoTalla+gananciaExtra;

        }else if(talla==1){
            cargoTalla=manoObra*0;
            gananciaExtra=(costoTela+manoObra+cargoTalla)*0.3;
            precioFinal=costoTela+manoObra+cargoTalla+gananciaExtra;
        ganancia=cargoTalla+gananciaExtra;
        }
            
        
        
        System.out.println("Valor de cargo por talla: " + cargoTalla);
        System.out.println("Valor de costo de la tela: " + costoTela);
        System.out.println("Valor de ganancia: " + ganancia);
        System.out.println("Valor de ganancia extra: " + gananciaExtra);
        System.out.println("Valor de mano de obra: " + manoObra);
        System.out.println("Valor de metros de tela: " + PrecioMetro);
        System.out.println("Valor de precio final: " + precioFinal);
    }
   public void CobroUsoEstacionamiento(){
       int cobro;
       System.out.println("ingrese la cantidad de horas ");
       int horas=entrada.nextInt();
       if(horas<=2){
           cobro=horas*5;
           System.out.println(".."+cobro);
       }else if(horas>2&&horas<=5){
           cobro=2*5+(horas-2)*4;
           System.out.println(".."+cobro);
       }else if(horas>5&&horas<=10) {
           cobro=2*5+3*4+(horas-5)*3;
           System.out.println(".."+cobro);
   }else if(horas>10){
           cobro=2*5+3*4+3*5+(horas-10)*2;
           System.out.println(".."+cobro);
   }
   }
   
   

}
class seis{
Scanner entrada=new Scanner(System.in);    
public void estructuraRepetitivafor2(){

int suma,f,valor,promedio,cont=0;
suma=0;
do{

    System.out.println("ingrese valor");
    valor=entrada.nextInt();
    cont++;
    suma=suma+valor;
    
    System.out.println("la suma es"+suma);
promedio=suma/cont;
    System.out.println("promedio "+promedio);

}while(valor!=-1);
}
}
class siete{
    Scanner entrada=new Scanner(System.in);
    //Dado N y X calcular: x1/1+x3/3+x5/5+...........+x(2N)-1?;
    public void m(){
int i,n;
        System.out.println("N");
        n=entrada.nextInt();
       
    i=1;
    while(1<=2*n){
        if(i%2==0){
            System.out.println(".."+i);
        }
        i=i+1;
    } 
 
}
}
class ocho{
    Scanner entrada=new Scanner(System.in);

    public ocho() {
    }
    
    public void InsisoA(){
        double pago=0;
        System.out.println("ingrese la cantidad de horas que trabajo ");   
        int horas=entrada.nextInt();
        System.out.println("ingrese el costo por hora ");
        double costoHora=entrada.nextInt();
        pago=horas*costoHora;
        if(horas>=40){
            pago=pago+(horas-40)*costoHora;
        }
        if(horas>48){
            pago =pago+(horas-48)*costoHora;
        }
        System.out.println("pago "+pago);
    }
  
        
    
    public void InsisoB(){
       
        double descuento, descuentosCategoria_1, descuentosCategoria_2, descuentosCategoria_3, descuentosCategoria_4;
        double descuentosCategoria_5, edad, precioUnico;
        String tecla_repetir;
        descuentosCategoria_1 = 0;
        descuentosCategoria_2 = 0;
        descuentosCategoria_3 = 0;
        descuentosCategoria_4 = 0;
        descuentosCategoria_5 = 0;
        
        System.out.print("Ingrese el precio unico en los asientos : ");
        precioUnico = entrada.nextDouble();
      
        do {
            System.out.print("Ingrese la edad: ");
            edad = entrada.nextDouble();
            descuento=0;
            if(edad<5)
                System.out.println("No puede entrar al teatro");
            if(edad>=5&&edad<15)
            {
                descuento=precioUnico*0.35;
                descuentosCategoria_1=descuentosCategoria_1+descuento;
            }
            if(edad>=15&&edad<20)
            {
                descuento=precioUnico*0.25;
                descuentosCategoria_2=descuentosCategoria_2+descuento;
            }
            if(edad>=20&&edad<46)
            {
                descuento=precioUnico*0.1;
                descuentosCategoria_3=descuentosCategoria_3+descuento;
            }
            if(edad>=46&&edad<66)
            {
                descuento=precioUnico*0.25;
                descuentosCategoria_4=descuentosCategoria_4+descuento;
            }
            if(edad>=66)
            {
                descuento=precioUnico*0.35;
                descuentosCategoria_5=descuentosCategoria_5+descuento;
            }
            System.out.println("Valor de descuento: " + descuento);
            System.out.println();
            
            
           
        } while (edad!=-1);
        System.out.println("Valor de descuentos por categoria 1: " + descuentosCategoria_1);
        System.out.println("Valor de descuentos por categoria 2: " + descuentosCategoria_2);
        System.out.println("Valor de descuentos por categoria 3: " + descuentosCategoria_3);
        System.out.println("Valor de descuentos por categoria 4: " + descuentosCategoria_4);
        System.out.println("Valor de descuentos por categoria 5: " + descuentosCategoria_5);
    }

}
        
    
    


public class Cinco {
    
public static void main(String[] args) {
        
    }
    
}
