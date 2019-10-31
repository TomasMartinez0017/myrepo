package obligatorio2ingsoftware;
import java.util.*;

public class Articulo implements Comparable<Articulo> {
    
    private int codigo;
    private int precio;
    private String origen;
    private String material;
    private String nombre;
    private ArrayList<Envase> listaEnvases;
    
    public Articulo(){
        codigo = 0;
        precio = 0;
        origen = "";
        material = "";
        nombre = "";
        listaEnvases = new ArrayList();
    }
    
    public Articulo(int codigo, int precio, String origen, String material, String nombre, ArrayList<Envase> unaLista) {
        this.setCodigo(codigo);
        this.setPrecio(precio);
        this.setOrigen(origen);
        this.setMaterial(material);
        this.setNombre(nombre);
        this.listaEnvases = unaLista;
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
    public int compareTo (Articulo unArticulo){
        return this.getNombre().compareTo(unArticulo.getNombre());
    }
    
      @Override
    public String toString() {
        return "Nombre: " + this.getNombre();
    }
}
