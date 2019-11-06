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
        Sistema s = new Sistema();
        Envase e1 = new Envase(1,"Botella","Vidrio");
        Envase e2 = new Envase(2,"Tupper","Plastico");
        Envase e3 = new Envase(3,"Caja","Carton");
        Envase e4 = new Envase(4,"Bolsa", "Carton");
        s.agregarEnvase(e3);
        s.agregarEnvase(e2);
        s.agregarEnvase(e1);
        s.agregarEnvase(e4);
        
        Articulo art1 = new Articulo(1, 200, "Uruguay", "Uva", "Pasas de uva", s.getListaEnvases(), 4);
        Articulo art2 = new Articulo(2, 500, "Colombia", "Granos de café", "Café Parsero", s.getListaEnvases(), 2);
        Articulo art3 = new Articulo(3, 700, "Japon", "Organico", "Hongo Shiitake", s.getListaEnvases(), 6);
        Articulo art4 = new Articulo(4, 400, "Alemania", "Té", "Kombucha", s.getListaEnvases(), 6);
        s.agregarArticulo(art1);
        s.agregarArticulo(art2);
        s.agregarArticulo(art3);
        s.agregarArticulo(art4);
 
        
        Cliente c1 = new Cliente("Juan",51308672, "Mercedez 8042");
        Cliente c2 = new Cliente("Tomás", 51308435, "Miguel Barreiro 3317 901");
        Cliente c3 = new Cliente("Martin", 16709326, "Luis de la Torre 876");
        s.agregarCliente(c1);
        s.agregarCliente(c2);
        s.agregarCliente(c3);
        
        
        
        VentanaPrincipal vent4= new VentanaPrincipal(s);
        vent4.setVisible(true);
        vent4.setResizable(false);
        
        
        VentanaVendedor vent3=new VentanaVendedor(s);
        vent3.setVisible(false);
        
        VentanaEditarArticulos vent=new VentanaEditarArticulos(s);
        vent.setVisible(false);
        
        VentanaAgregarArticulo vent2= new VentanaAgregarArticulo(s);
        vent2.setVisible(false);
        
        
    }
    
}
