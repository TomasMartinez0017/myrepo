package dominio;
import java.util.*;

public class Articulo implements Comparable<Articulo> {
    
    private int codigo;
    private int precio;
    private String origen;
    private String material;
    private String nombre;
    private int cantidadVendidos;
    private ArrayList<Envase> listaEnvases;
    /**
     * 
     */
    public Articulo(){
        this.setCantidadVendidos(0);
        this.setPrecio(0);
        this.setOrigen("");
        this.setMaterial("");
        this.setNombre("");
        listaEnvases = new ArrayList();
        this.setCantidadVendidos(0);
    }
    
    public Articulo(int codigo, int precio, String origen, String material, String nombre, ArrayList<Envase> unaLista, int cantidadVendidos) {
        this.setCodigo(codigo);
        this.setPrecio(precio);
        this.setOrigen(origen);
        this.setMaterial(material);
        this.setNombre(nombre);
        this.setCantidadVendidos(cantidadVendidos);
        this.listaEnvases = unaLista;
    }
    /**
     * @author ..
     * pre
     * post
     * @return retorna la cantidad de articulos vendidos de un producto
     */
    public int getCantidadVendidos() {
        return cantidadVendidos;
    }

    public void setCantidadVendidos(int cantidadVendidos) {
        this.cantidadVendidos = cantidadVendidos;
    }
    
    

    public ArrayList<Envase> getListaEnvases() {
        return listaEnvases;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public int getPrecio(){
        return precio;
    }
    
    public String getOrigen(){
        return origen;
    }
    
    public String getMaterial(){
        return material;
    }
    
    public void setCodigo(int unCodigo){
        codigo = unCodigo;
    }
    
    public void setPrecio(int unPrecio){
        precio = unPrecio;
    }
    
    public void setOrigen(String unOrigen){
        origen = unOrigen;
    }
    
    public void setMaterial(String unMaterial){
        material = unMaterial;
    }
    
    @Override
    public boolean equals (Object objeto){
        Articulo art = (Articulo)objeto;
        return this.getCodigo()==art.getCodigo();
    }
    
    @Override
     public int compareTo(Articulo unArticulo) {
        return unArticulo.getCantidadVendidos() - this.getCantidadVendidos();
    }
    
      @Override
    public String toString() {
        return this.getNombre();
    }
}
