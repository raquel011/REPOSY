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

    class operaciones{
    double potencia(double x,double y){
        return Math.pow(x,y);
    }
    double factorial(double x){
        double fact=1;
        for (double i = 1; i <=x ; i++) {
            fact*=i;
        }
        return fact;
    }
    double raiz_cuadrada(double x){
        return Math.sqrt(x);
    }
}
public class testOperaciones {
    public static void main(String[] args) {
        operaciones op=new operaciones();
        System.out.println("factorial de 5 es: "+op.factorial(5));
    }

}
