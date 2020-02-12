/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA02_TEORIA;

/**
 *
 * @author ESTHER
 */
class Operaciones {
    private int n;

    double potencia(double x,double y) {
        return Math.pow(x, y);
    }
    
    double Factorial(double x){
        double fact=1;
        for (double i = 0; i <=x; i++) {
         fact*=i;
         
        }return fact;
    }
    double RC(double x){
      return Math.sqrt(x);
    }
}
    public class ttOperacion{
       
        public static void main(String[] args) {
            
        
        Operaciones o=new Operaciones();
    }
    
    
}
