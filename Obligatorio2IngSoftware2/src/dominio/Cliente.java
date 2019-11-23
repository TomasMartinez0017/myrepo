package dominio;


public class Cliente implements Comparable<Cliente> {
    
    private String nombre;
    private int cedula;
    private String direccion;

    public Cliente(){
        this.setNombre("");
        this.setCedula(0);
        this.setDireccion("");
    }
    
    public Cliente(String nombre, int cedula, String direccion) {
        this.setNombre(nombre);
        this.setCedula(cedula);
        this.setDireccion(direccion);
    }

    public String getNombre(){
        return nombre;
    }
    
    public int getCedula(){
        return cedula;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public void setNombre(String unNombre){
        nombre = unNombre;
    }
    
    public void setCedula(int unaCedula){
        cedula = unaCedula;
    }
    
    public void setDireccion(String unaDireccion){
        direccion = unaDireccion;
    }
    
    @Override
    public boolean equals (Object objeto){
        Cliente cliente = (Cliente)objeto;
        return this.getCedula()==cliente.getCedula();
    }
    
    @Override
    public int compareTo (Cliente unCliente){
        return this.getNombre().compareTo(unCliente.getNombre());
    }
     @Override
    public String toString() {
        return "Nombre: " + this.getNombre();
    }
    
    
}
