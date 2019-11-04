package obligatorio2ingsoftware;
import java.util.*;
/**
 *
 * @author tomasmartinez
 */
public class Venta {
    private Cliente cliente;
    private ArrayList<Envase> listaEnvasesUtilizados;
    private ArrayList<Articulo> listaArticulos;
    private int dia;
    private int mes;
    private int anio;
    private int nroVenta;
    
    public Venta(){
        cliente = new Cliente();
        listaArticulos = new ArrayList();
        listaEnvasesUtilizados=new ArrayList();
        nroVenta = 0;
        dia=0;
        mes=0;
        anio=0;
        
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public ArrayList<Envase> getListaEnvasesUtilizados() {
        return listaEnvasesUtilizados;
    }

    public void setListaEnvasesUtilizados(ArrayList<Envase> listaEnvases) {
        this.listaEnvasesUtilizados = listaEnvases;
    }


    public Venta(ArrayList<Envase> unaListaEnvases, Cliente cliente, ArrayList<Articulo> unaListaArticulos,int mes,int anio,int dia, int nroVenta) {
        this.setCliente(cliente);
        this.listaArticulos = unaListaArticulos;
        this.listaEnvasesUtilizados=unaListaEnvases;
        this.setAnio(anio);
        this.setDia(dia);
        this.setMes(mes);
        this.setNroVenta(nroVenta);
    }


    public ArrayList<Articulo> getListaArticulos() {
        return listaArticulos;
    }    
    
    public int getNroVenta() {
        return nroVenta;
    }
    
    public Cliente getCliente(){
        return cliente;
    }
    
   
    
    
    public void setCliente(Cliente unCliente){
        cliente = unCliente;
    }
    
  
    
    public void setNroVenta(int nroVenta) {
        this.nroVenta = nroVenta;
    }
    
    @Override
    public boolean equals (Object objeto){
        Venta venta = (Venta)objeto;
        return this.getNroVenta()==venta.getNroVenta();
    }
}
