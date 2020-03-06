/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA04_PRACTICO;

import java.util.ArrayList;

/**
 *
 * @author ESTHER
 */
class persona{
    protected String codigo;
    protected String nombre;
    protected String apellidos;
    protected String telefono;

    public persona(String codigo, String nombre, String apellidos, String telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono=telefono;
    }

    @Override
    public String toString() {
        return "persona{" + "codigo=" + codigo + ", nombre=" + nombre + ", apellidos=" + apellidos + "telefono="+telefono+ '}';
    }
        
}
class cliente extends persona{

    public cliente(String codigo, String nombre, String apellidos,String telefono) {
        super(codigo, nombre, apellidos,telefono);
    }
    
    String mostrarCliente(){
        return this.toString();
    }
}
class vendedor extends persona{

    public vendedor(String codigo, String nombre, String apellidos,String telefono) {
        super(codigo, nombre, apellidos,telefono);
    }
   String mostrarVendedor(){
       return this.toString();
   } 
}
class producto{
    private String codigo;
    private String nombre;
    private Double precio;
    private int cantidad;

    public producto(String codigo, String nombre, Double precio, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
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

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    

    
    public String mostrarProducto() {
        return "producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + '}';
    }
    
}
class empresa{
    ArrayList<vendedor> listaVendedor;
    private producto listaProducto;
    ArrayList<cliente> listaCliente;
int indice;
    
    public empresa(ArrayList<cliente> listaC,String cod,String nom,double precio,int cant) {
        //this.listaVendedor=new ArrayList<>();
        this.listaCliente=listaC;
        listaProducto=new producto(cod,nom,precio,cant);
indice=0;
    }
    //public empresa(){
      //this.listaProducto=new ArrayList<producto>();
  
    //}
  void AgregarCliente(cliente c){
      listaCliente.add(c);
  }
  void AgregarProducto(producto p){
      //listaProducto[indice++]=p;
  }
  void crearProducto(){
        //this.listaProducto=new ArrayList<>();
        
        
        //producto p=new producto("001","arroz",3.5,2);
        //producto p1=new producto("002","fideo",4.5,1);
        //producto p2=new producto("003","atun",5.0,2);

        //listaProducto.add(p);
        //listaProducto.add(p1);
        //listaProducto.add(p2);
        

       String codigo[]={"001","002","003"};
       String c=codigo[aleatorio(1,3)];
       String nombre[]={"rosa","pedro","juan"};
       String n=nombre[aleatorio(1,3)];
       AgregarProducto(new producto(c,n,(double)(Math.random()*3),(int)(Math.random()*3)));
       

  }
  int aleatorio(int min,int max){
      return (int)(Math.random()*(max-min)+min);
  }
    void mostrar(){
      
            
        
       
        for (int i = 0; i < listaCliente.size(); i++) {
            System.out.println(listaCliente.get(i).mostrarCliente()); 
        }
    }
   String mostrarP(){
   return this.listaProducto.mostrarProducto();
   }
   }
 




public class actividad01_prueba {
    public static void main(String[] args) {
            ArrayList<cliente> listaCliente=new ArrayList<>(4);
            cliente c1=new cliente("001","jose","robles","986354621");
            cliente c2=new cliente("002","luis","flores","945354621");

            listaCliente.add(c1);
            listaCliente.add(c2);
            
           

           
            
        empresa em=new empresa(listaCliente,"001","arrosito",2.9,2); 
        
        //em=null;
        //em.crearProducto();
      
        //em.crearProducto();
        em.mostrar();
        System.out.println(em.mostrarP());

        
        
    }
}
