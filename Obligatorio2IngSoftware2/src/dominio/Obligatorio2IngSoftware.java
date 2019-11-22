/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;
import java.util.*;
import interfaz_.VentanaEditarArticulos;
import interfaz_.VentanaAgregarArticulo;
import interfaz_.VentanaVendedor;
import interfaz_.VentanaPrincipal;
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
        int valor;
        Sistema s = new Sistema();
        Envase e1 = new Envase(1,"Botella","Vidrio");
        Envase e2 = new Envase(2,"Tupper","Plastico");
        Envase e3 = new Envase(3,"Caja","Carton");
        Envase e4 = new Envase(4,"Bolsa", "Carton");
        s.agregarEnvase(e3);
        s.agregarEnvase(e2);
        s.agregarEnvase(e1);
        s.agregarEnvase(e4);
        
        ArrayList<Envase> art1Envases = new ArrayList();
        art1Envases.add(e2);
        art1Envases.add(e4);
        
        ArrayList<Envase> art2Envases = new ArrayList();
        art2Envases.add(e4);
        art2Envases.add(e2);  
        
        ArrayList<Envase> art3Envases = new ArrayList();
        art3Envases.add(e2);
        art3Envases.add(e3);

        ArrayList<Envase> art4Envases = new ArrayList();
        art4Envases.add(e1);     
        
        Articulo art1 = new Articulo(1, 200, "Uruguay", "Uva", "Pasas de uva", art1Envases, 0);
        Articulo art2 = new Articulo(2, 500, "Colombia", "Granos de café", "Café Parsero", art2Envases, 0);
        Articulo art3 = new Articulo(3, 700, "Japon", "Organico", "Hongo Shiitake", art3Envases, 0);
        Articulo art4 = new Articulo(4, 400, "Alemania", "Té", "Kombucha", art4Envases, 0);
                
        s.agregarArticulo(art1);
        s.agregarArticulo(art2);
        s.agregarArticulo(art3);
        s.agregarArticulo(art4);
        
        s.getListaArticulosOriginales().add(art1);
        s.getListaArticulosOriginales().add(art2);
        s.getListaArticulosOriginales().add(art3);
        s.getListaArticulosOriginales().add(art4);
 
        
        Cliente c1 = new Cliente("Franco",48777780, "Parque de Miramar 8042");
        Cliente c2 = new Cliente("Tomás", 51308435, "Miguel Barreiro 3317 901");
        Cliente c3 = new Cliente("Martin", 12345678, "Luis de la Torre 876");
        s.agregarCliente(c1);
        s.agregarCliente(c2);
        s.agregarCliente(c3);
        
        Local l1 = new Local("Av 18 de Diciembre 1623", 1);
        Local l2 = new Local("Av. Luis Batlle Berres 6634", 2);
        Local l3 = new Local("José Ellauri 350", 3);
        Local l4 = new Local("Dr José Scoseria 2659", 4);
        s.agregarLocal(l1);
        s.agregarLocal(l2);
        s.agregarLocal(l3);
        s.agregarLocal(l4);
        
        
        
        VentanaPrincipal vent1= new VentanaPrincipal(s);
        vent1.setVisible(true);
        vent1.setResizable(false);
        
        /*
        VentanaVendedor vent2=new VentanaVendedor(s);
        vent2.setVisible(false);
        
        VentanaEditarArticulos vent3=new VentanaEditarArticulos(s);
        vent3.setVisible(false);
        
        VentanaAgregarArticulo vent4 = new VentanaAgregarArticulo(s);
        vent4.setVisible(false);
        
        VentanaCalendario vent5 = new VentanaCalendario(s);
        vent5.setVisible(false);
        */
        
        
        
        
        
    }
    
}
