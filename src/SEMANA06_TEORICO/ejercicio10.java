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
class MiError extends Exception{
    public MiError(String text){
        super(text);
    }
}
public class ejercicio10 {
    public static void main(String[] args) {
        try {
            MiError er=new MiError("Error de semantica!!");
            throw er;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
