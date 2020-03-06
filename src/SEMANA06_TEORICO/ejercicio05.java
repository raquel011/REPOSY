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
interface data{
    
}
class mysql implements data{
    String cadena;
}
class conect extends mysql{
    
}
class rescusql extends mysql{
    
}
class oracle implements data{
    String cadena;
}
class conectoracle extends oracle{
    
}
class rescusqloracle extends oracle{
    
}
class save{
    public save(){
        data con=new conect();
        data res=new rescusql();
    }
}
public class ejercicio05 {
    
}
