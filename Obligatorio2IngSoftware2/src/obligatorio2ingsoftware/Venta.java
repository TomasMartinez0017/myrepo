package obligatorio2ingsoftware;
import java.time.LocalDateTime;
import java.util.*;
import java.util.Date;
/**
 *
 * @author tomasmartinez
 */
public class Venta {
    private Cliente cliente;
    private ArrayList<Envase> listaEnvasesUtilizados;
    private ArrayList<Articulo> listaArticulos;
    private Local local;
    private Date fecha;
    boolean esPreventa;
    private int nroVenta;
    
    
    
    public Venta(){
        cliente = new Cliente();
        listaArticulos = new ArrayList();
        listaEnvasesUtilizados=new ArrayList();
        local=new Local();
        nroVenta = 0;    
    }
    
    public boolean isEsPreventa() {
        return esPreventa;
    }

    public void setEsPreventa(boolean esPreventa) {
        this.esPreventa = esPreventa;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
    
    public ArrayList<Envase> getListaEnvasesUtilizados() {
        return listaEnvasesUtilizados;
    }

    public void setListaEnvasesUtilizados(ArrayList<Envase> listaEnvases) {
        this.listaEnvasesUtilizados = listaEnvases;
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
    
    public Date getFecha(){
        return fecha;
    }
    
    public void setFecha(Date unaFecha){
        this.fecha = unaFecha;
    }

    //Poner int mes, int anio, int dia en constructor
    public Venta(ArrayList<Envase> unaListaEnvases, Cliente cliente, ArrayList<Articulo> unaListaArticulos, int nroVenta, Local local, Date fecha) {
        this.setCliente(cliente);
        this.setLocal(local);
        this.listaArticulos = unaListaArticulos;
        this.listaEnvasesUtilizados=unaListaEnvases;
        /*
        this.setAnio(anio);
        this.setDia(dia);
        this.setMes(mes);
        */
        this.setNroVenta(nroVenta);
        this.setFecha(fecha);
    }
    
    public void agregarArticuloVenta(Articulo art){
        if(this.listaArticulos.contains(art)){
            int pos = listaArticulos.indexOf(art);
            this.listaArticulos.get(pos).setCantidadVendidos(this.listaArticulos.get(pos).getCantidadVendidos()+ 1);
        }
        else{
            this.listaArticulos.add(art);
        }
    }

    
    @Override
    public boolean equals (Object objeto){
        Venta venta = (Venta)objeto;
        return this.getNroVenta()==venta.getNroVenta();
    }

    public void setFecha(LocalDateTime now) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
