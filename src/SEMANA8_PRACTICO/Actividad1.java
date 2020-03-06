
package SEMANA8_PRACTICO;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;


/**
 *
 * @author ESTHER
 */
class procesos{
 	
 	public void agregar(persona p){
 		Actividad1.listaPersona.add(p);
 		
 	}
 	
 	public String listar(){
 		
 		String cad="";
 		for(int i=0 ; i<Actividad1.listaPersona.size() ; i++){
 			cad+=Actividad1.listaPersona.get(i).toString()+"\n";
 			//acà unimos los valores que nos retorna el arraylist con la variable cad
 		}
 		return cad;
 	}
 }
class persona {
 	private String nombre;
 	private String apellido;
 	private int edad;
 	private String email;
 	private int telefono;
 	public persona(String nombre,String apellido,int edad,String email,int telefono){
 		this.nombre=nombre;
 		this.apellido=apellido;
 		this.edad=edad;
 		this.email=email;
 		this.telefono=telefono;
 	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido; 
	}

	public String getApellido() {
		return (this.apellido); 
	}

	
	public void setNombre(String nombre) {
		this.nombre = nombre; 
	}

	public String getNombre() {
		return (this.nombre); 
	}

	
	public void setEdad(int edad) {
		this.edad = edad; 
	}

	public int getEdad() {
		return (this.edad); 
	}

	
	public void setEmail(String email) {
		this.email = email; 
	}

	public String getEmail() {
		return (this.email); 
	}

	
	public void setTelefono(int telefono) {
		this.telefono = telefono; 
	}

	public int getTelefono() {
		return (this.telefono); 
	}
	


	public String toString() {

		String sep = System.getProperty("line.separator");

		StringBuffer buffer = new StringBuffer();
		buffer.append(sep);
		buffer.append("nombre = ");
		buffer.append(nombre);
		buffer.append(sep);
		buffer.append("apellido = ");
		buffer.append(apellido);
		buffer.append(sep);
		buffer.append("edad = ");
		buffer.append(edad);
		buffer.append(sep);
		buffer.append("email = ");
		buffer.append(email);
		buffer.append(sep);
		buffer.append("telefono = ");
		buffer.append(telefono);
		buffer.append(sep);
		
		return buffer.toString();
	}
	
 }
 
class ventana1 extends JFrame implements ActionListener{
       
    private JPanel panel;
    private JTextField cajaNombre;
    private JTextField cajaApellido;
    private JTextField cajaEdad;
    private JTextField cajaEmail;
    private JTextField cajaTelefono;
    private JButton guardar;
    private JButton listar;
    private ventana2 v2;
    private procesos proces = new procesos();

    public  ventana1(){
        this.setSize(350,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        init();
    }
    private void init(){
        panel();
        labels();
        cajas();
        botones();
    }
    
    private void labels() {
        
        JLabel Titulo = new JLabel("Registro de Datos");
        Titulo.setBounds(100, 10, 200, 20);
        panel.add(Titulo);
        
        JLabel nombre = new JLabel("Nombre: ");
        nombre.setBounds(10, 40, 70, 20);
        panel.add(nombre);
        
        JLabel apellido = new JLabel("Apellido: ");
        apellido.setBounds(10, 100, 70, 20);
        panel.add(apellido);
        
        JLabel edad = new JLabel("Eadad: ");
        edad.setBounds(10, 160, 70, 20);
        panel.add(edad);
        
        JLabel email = new JLabel("Email: ");
        email.setBounds(10, 220, 70, 20);
        panel.add(email);
        
        JLabel telefono = new JLabel("Telefono: ");
        telefono.setBounds(10, 280, 70, 20);
        panel.add(telefono);
        
    }

    private void cajas() {
        
        cajaNombre= new JTextField();
        cajaNombre.setBounds(10, 70, 100, 20);
        panel.add(cajaNombre);
        
        cajaApellido= new JTextField();
        cajaApellido.setBounds(10, 130, 100, 20);
        panel.add(cajaApellido);
        
        cajaEdad= new JTextField();
        cajaEdad.setBounds(10, 190, 100, 20);
        panel.add(cajaEdad);
        
        cajaEmail= new JTextField();
        cajaEmail.setBounds(10, 250, 100, 20);
        panel.add(cajaEmail);
        
        cajaTelefono= new JTextField();
        cajaTelefono.setBounds(10, 310, 100, 20);
        panel.add(cajaTelefono);
        
    }

    private void botones() {
        guardar= new JButton("Guardar");
        guardar.setBounds(40, 360, 100, 30);
        guardar.addActionListener(this);
        panel.add(guardar);
        
        listar= new JButton("Listar");
        listar.setBounds(170, 360, 100, 30);
        listar.addActionListener(this);
        panel.add(listar);
        
    }

    private void panel() {
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==listar){
            ventana2 v2 = new ventana2();
            v2.setVisible(true);
            this.dispose();
        }
        if(e.getSource()==guardar){
            String nombre = cajaNombre.getText();
            String apellido = cajaApellido.getText();
            String edad = cajaEdad.getText();
            String Email = cajaEmail.getText();
            String telefono = cajaTelefono.getText();
            proces.agregar(new persona(nombre,apellido,Integer.parseInt(edad), Email, Integer.parseInt(telefono)));
            limpiar();
        	JOptionPane.showMessageDialog(null,"se guardo exitosamente");
            
        }
        
    }
    private void limpiar(){
   		cajaApellido.setText("");
   		cajaNombre.setText("");
   		cajaEdad.setText("");
   		cajaEmail.setText("");
   		cajaTelefono.setText("");
   	}

    

    
}
    
   
   

class ventana2 extends JFrame implements ActionListener{
    
    private procesos proccess = new procesos();
    private JPanel panel;
    private JButton regresar;
    private JTextArea area;
    private JScrollPane scroll;
    public  ventana2(){
        this.setSize(350,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        init();
    }
    
    private void init(){
        panel();
        labels();
        cajas();
        botones();
    }

    private void panel() {
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }

    private void labels() {
        JLabel Titulo = new JLabel("Lista de Datos recolectados");
        Titulo.setBounds(50, 30, 300, 20);
        panel.add(Titulo);
    }

    private void cajas() {
        
        area= new JTextArea();
        area.setText("Lista de Datos \n"+proccess.listar());
        
        scroll=new JScrollPane(area);
        scroll.setBounds(20, 60, 300, 300);
        panel.add(scroll);
        
    }

    private void botones() {
        regresar= new JButton("Regresar");
        regresar.setBounds(100, 390, 100, 30);
        regresar.addActionListener(this);
        panel.add(regresar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==regresar){
            ventana1 v1 = new ventana1();
            v1.setVisible(true);
            this.dispose();
        }
    }
}
public class Actividad1{
    
	public static  ArrayList<persona> listaPersona = new ArrayList<>();
    public static void main(String[] args) {
      ventana1 v=new ventana1();  
      v.setVisible(true);
        
    }
}
