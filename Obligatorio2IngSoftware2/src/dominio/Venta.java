package dominio;
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
    private boolean esPreventa;
    private int nroVenta;
    private int huellaCarbono;

    public Venta(){
        cliente = new Cliente();
        listaArticulos = new ArrayList();
        listaEnvasesUtilizados=new ArrayList();
        local=new Local();
        nroVenta = 0;    
        huellaCarbono=0;
    }
    
    public int getHuellaCarbono() {
        return huellaCarbono;
    }

    public void setHuellaCarbono(int huellaCarbono) {
        this.huellaCarbono = huellaCarbono;
    }
    
    
    public boolean getEsPreventa() {
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

    
    //metodo que dado una lista de articulos me devuelve la cantidad de co2 ahorrado.
    //para ello por cada producto, envase de plastico contamina 10g aprox
    public int calculoHuella(ArrayList<Articulo> lstArt){
        int cant=0;
        for (int i = 0; i < lstArt.size(); i++) {
            cant+=lstArt.get(i).getCantidadVendidos()*10;
        }
        return cant;
    }
    
}
