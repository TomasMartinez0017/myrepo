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
import Interfaz.VentanaCalendario;
import java.util.Date;


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
        
        Local l1 = new Local("Pocitos", 1);
        Date fecha = new Date();
        fecha.setMonth(1);
        s.agregarLocal(l1);
        
        Venta v1 = new Venta(s.getListaEnvases(), c1, s.getListaArticulos(), 1, l1, fecha);
        s.agregarVenta(v1);
        
        
        
        VentanaPrincipal vent1= new VentanaPrincipal(s);
        vent1.setVisible(true);
        vent1.setResizable(false);
        
        
        VentanaVendedor vent2=new VentanaVendedor(s);
        vent2.setVisible(false);
        
        VentanaEditarArticulos vent3=new VentanaEditarArticulos(s);
        vent3.setVisible(false);
        
        VentanaAgregarArticulo vent4 = new VentanaAgregarArticulo(s);
        vent4.setVisible(false);
        
        VentanaCalendario vent5 = new VentanaCalendario(s);
        vent5.setVisible(false);
        
        
        
        
    }
    
}
