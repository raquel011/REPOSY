/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA03_PRACTICA;

/**
 *
 * @author ESTHER
 */

public class Dado {
    private int valor;
    
    public void Tirar(){
        valor=1+(int)(Math.random()*6);
        
    }
    public void Imprimir(){
        System.out.println("el valor es"+valor);
    }
    public int retornarValor(){
        return valor;
    }
    
}
    

class JuegoDado{
    private Dado dado1,dado2,dado3;
    
    public JuegoDado(){
        dado1=new Dado();
        dado2=new Dado();
        dado3=new Dado();
    }
    public void Jugar(){
        dado1.Tirar();
        dado1.Imprimir();
        dado2.Tirar();
        dado2.Imprimir();
        dado3.Tirar();
        dado3.Imprimir();
        
        if(dado1.retornarValor()==dado2.retornarValor()&& dado1.retornarValor()==dado3.retornarValor()){
            System.out.println("GANO"); 
        }else {System.out.println("PERDIO");}
    }
    
    
    
    public static void main(String[] args) {
        
       JuegoDado jd=new JuegoDado();
       jd.Jugar();
    }
    
}
