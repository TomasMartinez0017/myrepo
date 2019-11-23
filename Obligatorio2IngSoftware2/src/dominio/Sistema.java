
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
    
    /*Metodo que agrega un cliente a la lista de clientes. Si el cliente no
    estaba en la lista lo agrega y retorna true. Si el cliente esta en la
    lista no lo agrega y retorna false
    */
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
    /*Metodo que elimina un cliente de la lista de clientes. Si el cliente no
    estaba en la lista retorna false. Si el cliente esta en la
    lista lo elimina y retorna true
    */
    public boolean eliminarCliente(Cliente unCliente){
        if(this.listaClientes.contains(unCliente)){
            this.listaClientes.remove(unCliente);   
            return true;
        }
        else{
            return false;
        }
    }
    
    /*Metodo que agrega un articulo a la lista de articulos. Si el articulo no
    estaba en la lista lo agrega y retorna true. Si el articulo esta en la
    lista no lo agrega y retorna false
    */
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
    
    /*Metodo que elimina un articulo de la lista de clientes. Si el artiuclo no
    estaba en la lista retorna false. Si el articulo esta en la
    lista lo elimina y retorna true
    */
    public boolean eliminarArticulo(Articulo unArticulo){
        if(this.listaArticulos.contains(unArticulo)){
            this.listaArticulos.remove(unArticulo);   
            return true;
        }
        else{
            return false;
        }
    }    
    
    /*Metodo que agrega un local a la lista de locales. Si el local no
    estaba en la lista lo agrega y retorna true. Si el local esta en la
    lista no lo agrega y retorna false
    */
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
    
    /*Metodo que elimina un local de la lista de locales. Si el local no
    estaba en la lista retorna false. Si el local esta en la
    lista lo elimina y retorna true
    */
    public boolean eliminarLocal(Local unLocal){
        if(this.listaLocales.contains(unLocal)){
            this.listaLocales.remove(unLocal);   
            return true;
        }
        else{
            return false;
        }
    }    
    
    /*Metodo que agrega una venta a la lista de ventas. Si la venta no
    estaba en la lista la agrega y retorna true. Si la venta esta en la
    lista no la agrega y retorna false
    */
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
    
    /*Metodo que elimina una venta de la lista de ventas. Si la venta no
    estaba en la lista retorna false. Si la venta esta en la
    lista la elimina y retorna true
    */
    public boolean eliminarVenta(Venta unaVenta){
        if(this.listaVentas.contains(unaVenta)){
            this.listaVentas.remove(unaVenta);   
            return true;
        }
        else{
            return false;
        }
    }    
    
    /*Metodo que agrega un envase a la lista de envases. Si el envase no
    estaba en la lista lo agrega y retorna true. Si el envase esta en la
    lista no la agrega y retorna false
    */
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
    
    /*Metodo que elimina un envase de la lista de envases. Si el envase no
    estaba en la lista retorna false. Si el envase esta en la
    lista lo elimina y retorna true
    */
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
    /*Metodo que recorre la lista de ventas y por cada venta agrega a una lista
    los envases utilizados y luego la retorna
    */
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
    
    //Metodo que elimina los envases repetidos de una lista de envases
    public void eliminarEnvasesRepetidos(ArrayList<Envase> lista){
        for(int i=0;i<lista.size();i++){
            for(int j=i+1;j<lista.size();j++){
                if(lista.get(i).getNroEnvase()==lista.get(j).getNroEnvase()){
                    lista.remove(i);
                }
            }
        }
    }
    //Metodo que retorna el total de ventas dado un mes
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

    //Metodo que verifica que un String sea numerico
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
    //Metodo que verifica que un String sea una cedula
    public boolean esCedula(String ci){
        if(esNumerico(ci)){
            return ci.length()==8;
        }
        else{
            return false;
        }
        
    }
    
    /*Metodo que identifica si una lista de Articulos es igual a la listaArticulosOriginales
    (listaArticulosOriginales es una lista pre cargada con todos los articulos disponibles)*/
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
    
    //Metodo que verifica si un cliente esta registrado en el sistema
    public boolean estaRegistrado(String ci){
        Cliente aux = new Cliente();
        aux.setCedula(Integer.parseInt(ci));
        return (this.listaClientes.contains(aux));       
    }
    
    /*Metodo que verifica que cada articulo tenga un envase asignado. Para ello
    verificamos que el largo de la lista de articulos sea igual al largo de 
    la lista de envases
    */
    public boolean validacionCompra(ArrayList<Articulo> listaArticulos, ArrayList<Envase> listaEnvases){
        return (listaArticulos.size() == listaEnvases.size());
    }
    
    //Metodo que copia un ArrayList
    public ArrayList<Articulo> copiarLista(ArrayList<Articulo> lista){
        ArrayList<Articulo> retorno = new ArrayList();
        for(int i = 0; i < lista.size(); i++){
            retorno.add(lista.get(i));
        }
        return retorno;
    }
    
    //Metodo que calcula el precio total de una venta
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
    
    //Metodo que valida que la fecha seleccionada sea igual a la fecha de hoy
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
    
    //Metodo que decide si a la compra se le aplica un descuento o no
    public boolean aplicaDescuento(ArrayList<Articulo> lstArticulo){
        int cont = 0;
        for(int i = 0; i< lstArticulo.size(); i++){
            cont += lstArticulo.get(i).getCantidadVendidos();
        }
        return cont>4;
    }
    
    //Metodo que calcula el descuento
    public int calculoDescuento(int precioTotal){
        int descuento = (int) (precioTotal*0.10);
        return precioTotal-descuento;    
    }
    
    //Metodo que retorna una lista con la cantidad de articulos vendidos por articulo
    public ArrayList<Integer> listaCantidadVendidos(ArrayList<Articulo> lstArticulos){
        ArrayList<Integer> retorno = new ArrayList<>();
        for(int i=0; i<lstArticulos.size(); i++){
            retorno.add(lstArticulos.get(i).getCantidadVendidos());
        }
        return retorno;
    }
    
    
}    

