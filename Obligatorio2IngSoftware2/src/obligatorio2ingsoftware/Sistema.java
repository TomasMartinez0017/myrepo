
package obligatorio2ingsoftware;
import java.util.*;

public class Sistema {
    private ArrayList<Cliente> listaClientes = new ArrayList<>();
    private ArrayList<Articulo> listaArticulos = new ArrayList<>();
    private ArrayList<Local> listaLocales = new ArrayList<>();
    private ArrayList<Venta> listaVentas = new ArrayList<>();
    private ArrayList<Venta> listaPreventas = new ArrayList<>();
    private ArrayList<Envase> listaEnvases = new ArrayList<>();
    private ArrayList<Articulo> listaArticulosOriginales = new ArrayList<>();
    
    
    public ArrayList<Venta> getListaPreventas() {
        return listaPreventas;
    }

    public void setListaPreventas(ArrayList<Venta> listaPreventas) {
        this.listaPreventas = listaPreventas;
    }

    public ArrayList<Articulo> getListaArticulosOriginales() {
        return listaArticulosOriginales;
    }

    public void setListaArticulosOriginales(ArrayList<Articulo> listaArticulosOriginales) {
        this.listaArticulosOriginales = listaArticulosOriginales;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public ArrayList<Articulo> getListaArticulos() {
        return listaArticulos;
    }

    public void setListaArticulos(ArrayList<Articulo> listaArticulos) {
        this.listaArticulos = listaArticulos;
    }

    public ArrayList<Local> getListaLocales() {
        return listaLocales;
    }

    public void setListaLocales(ArrayList<Local> listaLocales) {
        this.listaLocales = listaLocales;
    }

    public ArrayList<Venta> getListaVentas() {
        return listaVentas;
    }

    public void setListaVentas(ArrayList<Venta> listaVentas) {
        this.listaVentas = listaVentas;
    }

    public ArrayList<Envase> getListaEnvases() {
        return listaEnvases;
    }

    public void setListaEnvases(ArrayList<Envase> listaEnvases) {
        this.listaEnvases = listaEnvases;
    }
    
    public boolean agregarCliente(Cliente unCliente){
        Cliente aux = new Cliente();
        aux.setCedula(unCliente.getCedula());
        
        if(!this.listaClientes.contains(aux)){
            this.listaClientes.add(unCliente);
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean eliminarCliente(Cliente unCliente){
        if(this.listaClientes.contains(unCliente)){
            this.listaClientes.remove(unCliente);   
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean agregarArticulo(Articulo unArticulo){
        Articulo aux = new Articulo();
        aux.setCodigo(unArticulo.getCodigo());
        
        if(!this.listaArticulos.contains(aux)){
            this.listaArticulos.add(unArticulo);
            return true;
        }
        else{
            return false;
        }        
    }
    
    public boolean eliminarArticulo(Articulo unArticulo){
        if(this.listaArticulos.contains(unArticulo)){
            this.listaArticulos.remove(unArticulo);   
            return true;
        }
        else{
            return false;
        }
    }    
    
    public boolean agregarLocal(Local unLocal){
        Local aux = new Local();
        aux.setNroLocal(unLocal.getNroLocal());
        
        if(!this.listaLocales.contains(aux)){
            this.listaLocales.add(unLocal);
            return true;
        }
        else{
            return false;
        }        
    }
    
    public boolean eliminarLocal(Local unLocal){
        if(this.listaLocales.contains(unLocal)){
            this.listaLocales.remove(unLocal);   
            return true;
        }
        else{
            return false;
        }
    }    

    public boolean agregarVenta(Venta unaVenta){
        Venta aux = new Venta();
        aux.setNroVenta(unaVenta.getNroVenta());
        
        if(!this.listaVentas.contains(aux)){
            this.listaVentas.add(unaVenta);
            return true;
        }
        else{
            return false;
        }        
    }
    
    public boolean eliminarVenta(Venta unaVenta){
        if(this.listaVentas.contains(unaVenta)){
            this.listaVentas.remove(unaVenta);   
            return true;
        }
        else{
            return false;
        }
    }    
    
    public boolean agregarEnvase(Envase unEnvase){
        Envase aux = new Envase();
        aux.setNroEnvase(unEnvase.getNroEnvase());
        
        if(!this.listaEnvases.contains(aux)){
            this.listaEnvases.add(unEnvase);
            return true;
        }
        else{
            return false;
        }        
    }
    
    public boolean eliminarEnvase(Envase unEnvase){
        if(this.listaEnvases.contains(unEnvase)){
            this.listaEnvases.remove(unEnvase);   
            return true;
        }
        else{
            return false;
        }
    }    
    //Ordeno la lista de articulos segun la cantidad de veces que se vendio.
    public ArrayList<Articulo> productosMasVendidos(ArrayList<Articulo> lista){
        
        Collections.sort(lista);
        return lista;
    }
    
    public ArrayList<Envase> EnvasesReutilizados(){
        ArrayList<Envase> listaReutilizados=new ArrayList();
        for(int i=0;i<this.listaVentas.size();i++){
            Venta vent=this.listaVentas.get(i);
            for(int j=0;j<vent.getListaEnvasesUtilizados().size();j++){
                listaReutilizados.add(vent.getListaEnvasesUtilizados().get(j));
            }
        }
        eliminarEnvasesRepetidos(listaReutilizados);
        return listaReutilizados;
    }
    
    public void eliminarEnvasesRepetidos(ArrayList<Envase> lista){
        for(int i=0;i<lista.size();i++){
            for(int j=i+1;j<lista.size();j++){
                if(lista.get(i).getNroEnvase()==lista.get(j).getNroEnvase()){
                    lista.remove(i);
                }
            }
        }
    }
    
    public int VentasDadoUnMes(int mes){
        int cant=0;
        for(int i=0;i<this.listaVentas.size();i++){
            Venta vent= this.listaVentas.get(i);
            if(vent.getFecha().getMonth()==mes){
                cant++;
            }
        }
        return cant;
    }

    
    public boolean esNumerico(String dato) {
        boolean esNumerico = true;
        if(dato.equals("")){
            return false;
        }
        else{
            try {
                int valor = Integer.parseInt(dato);
            } catch (NumberFormatException e) {
                esNumerico = false;
        }
        return esNumerico;    
        }
        
    }
    
    public boolean esCedula(String ci){
        return ci.length()==8;
    }
    
    public  boolean sonIguales(ArrayList<Articulo> listaArticulos){
        if (this.listaArticulosOriginales.size() == listaArticulos.size()){
            for(int i = 0; i<this.listaArticulosOriginales.size(); i++){
                if(this.listaArticulosOriginales.get(i) != listaArticulos.get(i)){
                    return false;
                }
            }
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean estaRegistrado(String ci){
        Cliente aux = new Cliente();
        aux.setCedula(Integer.parseInt(ci));
        return (this.listaClientes.contains(aux));       
    }
    
    public boolean validacionCompra(ArrayList<Articulo> listaArticulos, ArrayList<Envase> listaEnvases){
        return (listaArticulos.size() == listaEnvases.size());
    }
    
    public ArrayList<Articulo> copiarLista(ArrayList<Articulo> lista){
        ArrayList<Articulo> retorno = new ArrayList();
        for(int i = 0; i < lista.size(); i++){
            retorno.add(lista.get(i));
        }
        return retorno;
    }
    
}    

