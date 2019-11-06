/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio2ingsoftware;
import Interfaz.VentanaEditarArticulos;
import Interfaz.VentanaAgregarArticulo;
import Interfaz.VentanaVendedor;
import Interfaz.VentanaPrincipal;


/**
 *
 * @author tomasmartinez
 */
public class Obligatorio2IngSoftware {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sistema s=new Sistema();
        Envase e1=new Envase(5,"botella","vidrio");
        Envase e2 = new Envase(1,"tupper","plastico");
        Envase e3= new Envase(2,"caja","carton");
        s.agregarEnvase(e3);
        s.agregarEnvase(e2);
        s.agregarEnvase(e1);
        
        Articulo art1=new Articulo(1,200,"uru","uva","Pasas de uva",s.getListaEnvases(),4);
        s.agregarArticulo(art1);
        
        
        Cliente c1=new Cliente("juan",24537865, "cuareim");
        s.agregarCliente(c1);
        
        
        
        VentanaPrincipal vent4= new VentanaPrincipal(s);
        vent4.setVisible(true);
        
        
        VentanaVendedor vent3=new VentanaVendedor(s);
        vent3.setVisible(false);
        
        VentanaEditarArticulos vent=new VentanaEditarArticulos(s);
        vent.setVisible(false);
        
        VentanaAgregarArticulo vent2= new VentanaAgregarArticulo(s);
        vent2.setVisible(false);
        
        
    }
    
}
