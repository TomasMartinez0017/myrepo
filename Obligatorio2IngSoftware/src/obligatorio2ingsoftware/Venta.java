package obligatorio2ingsoftware;
import java.util.*;
/**
 *
 * @author tomasmartinez
 */
public class Venta {
    private ArrayList<Envase> listaEnvases;
    private Cliente cliente;
    private ArrayList<Articulo> listaArticulos;
    private String fecha;
    private int nroVenta;
    
    public Venta(){
        listaEnvases = new ArrayList();
        cliente = new Cliente();
        listaArticulos = new ArrayList();
        fecha = "";
        nroVenta = 0;
        
    }


    public Venta(ArrayList<Envase> unaListaEnvases, Cliente cliente, ArrayList<Articulo> unaListaArticulos, String fecha, int nroVenta) {
        this.listaEnvases = unaListaEnvases;
        this.setCliente(cliente);
        this.listaArticulos = unaListaArticulos;
        this.setFecha(fecha);
        this.setNroVenta(nroVenta);
    }

    
    public ArrayList<Envase> getListaEnvases() {
        return listaEnvases;
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
    
    public String getFecha(){
        return fecha;
    }
    
    
    public void setCliente(Cliente unCliente){
        cliente = unCliente;
    }
    
    public void setFecha(String unaFecha){
        fecha = unaFecha;
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
