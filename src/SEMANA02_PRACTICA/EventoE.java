/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA02_PRACTICA;
import Util.MisConstantes;
/**
 *
 * @author ESTHER
 */
public class EventoE {
    private String Titulo;
    private int DuracionEvento;
    private ExpositorPersonaE MiExpositor;
    private String HoraIngreso;
    private String HoraSalida;
    private String TemporadaE;
    private Double CostoEntrada;
    private String UbicacionE;
    private AsistentePersonaE MiAsistente;
    MisConstantes constantes;

    
    public EventoE(String Titulo, int duracionEvento, ExpositorPersonaE Expositor,String horaIngreso, String horaSalida, String temporadaEvento, String ubicacionEvento, AsistentePersonaE miAsistente) {
        this.Titulo = Titulo;
        this.DuracionEvento = duracionEvento;
        this.MiExpositor = Expositor;
        this.HoraIngreso = horaIngreso;
        this.HoraSalida = horaSalida;
        this.TemporadaE = temporadaEvento;
        this.CostoEntrada = 0.0;
        this.UbicacionE = ubicacionEvento;
        this.MiAsistente=miAsistente;
        
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getDuracionEvento() {
        return DuracionEvento;
    }

    public void setDuracionEvento(int DuracionEvento) {
        this.DuracionEvento = DuracionEvento;
    }

    public ExpositorPersonaE getMiExpositor() {
        return MiExpositor;
    }

    public void setMiExpositor(ExpositorPersonaE MiExpositor) {
        this.MiExpositor = MiExpositor;
    }

    public String getHoraIngreso() {
        return HoraIngreso;
    }

    public void setHoraIngreso(String HoraIngreso) {
        this.HoraIngreso = HoraIngreso;
    }

    public String getHoraSalida() {
        return HoraSalida;
    }

    public void setHoraSalida(String HoraSalida) {
        this.HoraSalida = HoraSalida;
    }

    public String getTemporadaE() {
        return TemporadaE;
    }

    public void setTemporadaE(String TemporadaE) {
        this.TemporadaE = TemporadaE;
    }

    public Double getCostoEntrada() {
        return CostoEntrada;
    }

    public void setCostoEntrada(Double CostoEntrada) {
        this.CostoEntrada = CostoEntrada;
    }

    public String getUbicacionE() {
        return UbicacionE;
    }

    public void setUbicacionE(String UbicacionE) {
        this.UbicacionE = UbicacionE;
    }

    public AsistentePersonaE getMiAsistente() {
        return MiAsistente;
    }

    public void setMiAsistente(AsistentePersonaE MiAsistente) {
        this.MiAsistente = MiAsistente;
    }

    public MisConstantes getConstantes() {
        return constantes;
    }

    public void setConstantes(MisConstantes constantes) {
        this.constantes = constantes;
    }
    
    
    public void costoIngresoEvento(){
      
        if(this.UbicacionE == "P"){
            CostoEntrada=constantes.Plantinum;
            System.out.println("el costo es : "+CostoEntrada);
        }
        else if (this.UbicacionE == "G"){
           CostoEntrada=constantes.Gold;
           System.out.println("el costo es : "+CostoEntrada);

        }
        else{
           CostoEntrada=constantes.VIP;
           System.out.println("el costo es : "+CostoEntrada);
        }

    }
    
    public double MontoTotalIncluyendoIGV(){
        CostoEntrada=CostoEntrada+(CostoEntrada*constantes.IGV);
        System.out.println("costo de entrada: ");
        return CostoEntrada;
    }

    public double MontoDescuentoPorTemporada(){
        Double Descuento = 0.0;
        if(TemporadaE== "baja" ) {
        Descuento = CostoEntrada * 0.10;
        }
        
        if(TemporadaE== "alta" ) {
        Descuento = CostoEntrada * 0.05;
        }
        return Descuento;
    }

    
    public String MostrarEvento() {
    return "EventoE{" + "Titulo Evento=" + Titulo + ", DuracionEvento=" + DuracionEvento + ", " +"\n"
            
                + "MiExpositor=" +"Codigo ="+this.MiExpositor.getCodigo()+"Nombre="+ this.MiExpositor.getNombre()+"Apellido"+this.MiExpositor.getApellido()+"Correo="+this.MiExpositor.getCorreo()+"\n"
 +", HoraIngresoEvento=" + HoraIngreso + ", HoraSalidaEvento=" + HoraSalida + ", TemporadaEvento=" + TemporadaE + ", CostoEntradaEvento=" + CostoEntrada + ", UbicacionE=" + UbicacionE + "\n "
                + "MiAsistente=" +"Codigo ="+this.MiAsistente.getCodigo()+"Nombre="+ this.MiExpositor.getNombre()+"Apellido"+this.MiExpositor.getApellido()+"Correo="+this.MiExpositor.getCorreo()+"\n"
                +"Telefono="+this.MiAsistente.getTelefono()+"direccion="+this.MiAsistente.getDireccion()
                + ", constantes=" + constantes + '}';
    }
    
    
}


    

