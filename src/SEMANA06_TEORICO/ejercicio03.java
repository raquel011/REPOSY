/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA06_TEORICO;

/**
 *
 * @author paz
 */
interface Ipadre{
    void c(); 
}
abstract class padre implements Ipadre{
    abstract void a();
    abstract void b();       
}
//hija solo necesita metodo c
class hija implements Ipadre{
    public void c(){
        System.out.println("Exito!!"); 
    }
}
public class ejercicio03 {
    
}
