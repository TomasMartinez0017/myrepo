

package dominio;
import java.util.*;

public class Sistema {
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Articulo> listaArticulos;
    private ArrayList<Local> listaLocales;
    private ArrayList<Venta> listaVentas;
    private ArrayList<Envase> listaEnvases;
    private ArrayList<Articulo> listaArticulosOriginales;
    
    public Sistema (){
        listaClientes = new ArrayList<>();
        listaArticulos = new ArrayList<>();
        listaLocales = new ArrayList<>();
        listaVentas = new ArrayList<>();
        listaEnvases = new ArrayList<>();
        listaArticulosOriginales = new ArrayList<>();
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
        ArrayList<Articulo> copia=copiarLista(lista);
        Collections.sort(copia);
        return copia;
    }
    
    public ArrayList<Envase> envasesReutilizados(){
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
    
    public int ventasDadoUnMes(int mes){
        int cant=0;
        for(int i=0;i<this.listaVentas.size();i++){
            Venta vent= this.listaVentas.get(i);
            Calendar calaux=Calendar.getInstance();
            calaux.setTime(vent.getFecha());
            int mesaux=calaux.get(Calendar.MONTH);
            if(mesaux==mes){
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
        if(esNumerico(ci)){
            return ci.length()==8;
        }
        else{
            return false;
        }
        
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
    
    public String precioTotal(ArrayList<Articulo> lista){
        int total = 0;
        for(int i = 0; i<lista.size(); i++){
            for(int j = 0; j < lista.get(i).getCantidadVendidos(); j++){
                total = total + lista.get(i).getPrecio();
            }
            
        }
        String retorno = Integer.toString(total);
        return retorno;
    }
    
    public boolean esHoy(Date FechaHoy,Date FechaSeleccionado){
        Calendar cal=Calendar.getInstance();
        cal.setTime(FechaHoy);
        int anoHoy=cal.get(Calendar.YEAR);
        int mesHoy=cal.get(Calendar.MONTH);
        int diaHoy=cal.get(Calendar.DAY_OF_MONTH);
        
        Calendar cal2=Calendar.getInstance();
        cal2.setTime(FechaSeleccionado);
        int anoSeleccionado=cal2.get(Calendar.YEAR);
        int mesSeleccionado=cal2.get(Calendar.MONTH);
        int diaSeleccionado=cal2.get(Calendar.DAY_OF_MONTH);
        
        return (anoHoy == anoSeleccionado) && (mesHoy==mesSeleccionado) && (diaHoy==diaSeleccionado);  
    }
    
    public boolean aplicaDescuento(ArrayList<Articulo> lstArticulo){
        int cont = 0;
        for(int i = 0; i< lstArticulo.size(); i++){
            cont += lstArticulo.get(i).getCantidadVendidos();
        }
        return cont>4;
    }
    
    public int calculoDescuento(int precioTotal){
        int descuento = (int) (precioTotal*0.10);
        return precioTotal-descuento;
        
    }
    public ArrayList<Integer> listaCantidadVendidos(ArrayList<Articulo> lstArticulos){
        ArrayList<Integer> retorno = new ArrayList<>();
        for(int i=0; i<lstArticulos.size(); i++){
            retorno.add(lstArticulos.get(i).getCantidadVendidos());
        }
        return retorno;
    }
    
    
}    

