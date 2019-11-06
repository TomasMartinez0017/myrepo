package obligatorio2ingsoftware;

public class Local {
    private String direccion;
    private int nroLocal;

    public Local(){
        direccion = " ";
        nroLocal = 0;
    }
    
    public Local(String direccion, int nroLocal) {
        this.setDireccion(direccion);
        this.setNroLocal(nroLocal);
    }
    
    
    public String getDireccion(){
        return direccion;
    }
    
    public void setDireccion(String unaDireccion){
        direccion = unaDireccion;
    }
    
    public int getNroLocal(){
        return nroLocal;
    }
    
    public void setNroLocal(int unNro){
        nroLocal = unNro;
    }

    @Override
    public boolean equals (Object objeto){
        Local local = (Local)objeto;
        return this.getNroLocal()==local.getNroLocal();
    }
  
    @Override
    public String toString() {
        return "EcoShop: " + this.getNroLocal();
    }    
      
}
