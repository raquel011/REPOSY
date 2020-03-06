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
interface Irectangulo{
    int calcularArea();
}
class rectangulo implements Irectangulo{
    int x;
    int y;
    public rectangulo(int a, int b){
        this.x=a;
        this.y=b;
    }
    public int calcularArea(){
        return x*y;
    }
}
class square implements Irectangulo{
    int x;
    public square(int a){
        this.x=a;
    }
    public int calcularArea(){
        return x*x;
    }
}
public class ejercicio02 {
    
}
