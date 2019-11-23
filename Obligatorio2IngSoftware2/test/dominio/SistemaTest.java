
package dominio;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class SistemaTest {
    
    Sistema sistemaPrueba;
    
    public SistemaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        sistemaPrueba = new Sistema();
    }
    
    @After
    public void tearDown() {
    }

 

    /**
     * Test of getListaArticulosOriginales method, of class Sistema.
     */
    @Test
    public void testGetListaArticulosOriginales() {
        
        Envase e1 = new Envase(1,"Botella","Vidrio");
        Envase e2 = new Envase(2,"Tupper","Plastico");
        Envase e3 = new Envase(3,"Caja","Carton");
        Envase e4 = new Envase(4,"Bolsa", "Carton");
        
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
        
        ArrayList<Articulo>lstArticulosOriginales = new ArrayList();
        lstArticulosOriginales.add(art1);
        lstArticulosOriginales.add(art2);
        lstArticulosOriginales.add(art3);
        lstArticulosOriginales.add(art4);
        
        sistemaPrueba.setListaArticulosOriginales(lstArticulosOriginales);
        
        
        ArrayList<Articulo> expResult = lstArticulosOriginales;
        ArrayList<Articulo> result = sistemaPrueba.getListaArticulosOriginales();
        assertEquals(expResult, result);
    }

    /**
     * Test of setListaArticulosOriginales method, of class Sistema.
     */
    @Test
    public void testSetListaArticulosOriginales() {
        Envase e1 = new Envase(1,"Botella","Vidrio");
        Envase e2 = new Envase(2,"Tupper","Plastico");
        Envase e3 = new Envase(3,"Caja","Carton");
        Envase e4 = new Envase(4,"Bolsa", "Carton");
        
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
        
        ArrayList<Articulo>lstArticulosOriginales = new ArrayList();
        lstArticulosOriginales.add(art2);
        lstArticulosOriginales.add(art3);
        lstArticulosOriginales.add(art4);
        
        sistemaPrueba.setListaArticulosOriginales(lstArticulosOriginales);
        
        
        assertEquals(lstArticulosOriginales, sistemaPrueba.getListaArticulosOriginales());
    }

    /**
     * Test of getListaClientes method, of class Sistema.
     */
    @Test
    public void testGetListaClientes() {
        ArrayList<Cliente> lstClientes = new ArrayList();
        
        Cliente c1 = new Cliente("Franco",48777780, "Parque de Miramar 8042");
        Cliente c2 = new Cliente("Tomás", 51308435, "Miguel Barreiro 3317 901");
        Cliente c3 = new Cliente("Martin", 12345678, "Luis de la Torre 876");
        
        lstClientes.add(c1);
        lstClientes.add(c2);
        lstClientes.add(c3);
        
        sistemaPrueba.setListaClientes(lstClientes);
        
        ArrayList<Cliente> expResult = lstClientes;
        ArrayList<Cliente> result = sistemaPrueba.getListaClientes();
        assertEquals(expResult, result);
    }

    /**
     * Test of setListaClientes method, of class Sistema.
     */
    @Test
    public void testSetListaClientes() {
        
        ArrayList<Cliente> lstClientes = new ArrayList();
        
        Cliente c1 = new Cliente("Franco",48777780, "Parque de Miramar 8042");
        Cliente c2 = new Cliente("Tomás", 51308435, "Miguel Barreiro 3317 901");
        Cliente c3 = new Cliente("Martin", 12345678, "Luis de la Torre 876");
        
        lstClientes.add(c1);
        lstClientes.add(c2);
        lstClientes.add(c3);
        
        
        sistemaPrueba.setListaClientes(lstClientes);
        assertEquals(lstClientes, sistemaPrueba.getListaClientes());
    }

    /**
     * Test of getListaArticulos method, of class Sistema.
     */
    @Test
    public void testGetListaArticulos() {
        
        Envase e1 = new Envase(1,"Botella","Vidrio");
        Envase e2 = new Envase(2,"Tupper","Plastico");
        Envase e3 = new Envase(3,"Caja","Carton");
        Envase e4 = new Envase(4,"Bolsa", "Carton");
        
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
        
        ArrayList<Articulo>lstArticulos = new ArrayList();
        lstArticulos.add(art2);
        lstArticulos.add(art3);
        lstArticulos.add(art4);
        
        sistemaPrueba.setListaArticulos(lstArticulos);
        
        ArrayList<Articulo> expResult = lstArticulos;
        ArrayList<Articulo> result = sistemaPrueba.getListaArticulos();
        assertEquals(expResult, result);
    }

    /**
     * Test of setListaArticulos method, of class Sistema.
     */
    @Test
    public void testSetListaArticulos() {
        Envase e1 = new Envase(1,"Botella","Vidrio");
        Envase e2 = new Envase(2,"Tupper","Plastico");
        Envase e3 = new Envase(3,"Caja","Carton");
        Envase e4 = new Envase(4,"Bolsa", "Carton");
        
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
        
        ArrayList<Articulo>lstArticulos = new ArrayList();
        lstArticulos.add(art2);
        lstArticulos.add(art3);
        lstArticulos.add(art4);
        
        sistemaPrueba.setListaArticulos(lstArticulos);
        
        assertEquals(lstArticulos, sistemaPrueba.getListaArticulos());
    }

    /**
     * Test of getListaLocales method, of class Sistema.
     */
    @Test
    public void testGetListaLocales() {
        Local loc = new Local();
        loc.setDireccion("Pocitos");
        loc.setNroLocal(1);
        
        ArrayList<Local> lstLocales = new ArrayList();
        lstLocales.add(loc);
        
        sistemaPrueba.getListaLocales().add(loc);
        
        ArrayList<Local> expResult = lstLocales;
        ArrayList<Local> result = sistemaPrueba.getListaLocales();
        assertEquals(expResult, result);
    }

    /**
     * Test of setListaLocales method, of class Sistema.
     */
    @Test
    public void testSetListaLocales() {
        Local loc = new Local();
        loc.setDireccion("Pocitos");
        loc.setNroLocal(1);
        
        ArrayList<Local> lstLocales = new ArrayList();
        lstLocales.add(loc);
        
        sistemaPrueba.setListaLocales(lstLocales);
        
        assertEquals(lstLocales, sistemaPrueba.getListaLocales());    
    }

    /**
     * Test of getListaVentas method, of class Sistema.
     */
    @Test
    public void testGetListaVentas() {
        ArrayList<Venta> lstVentas = new ArrayList();
        Venta venta1 = new Venta();
        
        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Tomas");
        
        ArrayList<Articulo> lstArticulos = new ArrayList();
        
        Articulo art1 = new Articulo();
        
        art1.setCodigo(1);
        art1.setCantidadVendidos(1);
        art1.setMaterial("Organico");
        art1.setNombre("Pasas de Uva");
        art1.setOrigen("Uruguay");
        art1.setPrecio(100);
        
        Articulo art2 = new Articulo();
        
        art2.setCodigo(2);
        art2.setCantidadVendidos(1);
        art2.setMaterial("Organico");
        art2.setNombre("Mandarina");
        art2.setOrigen("Ecuador");
        art2.setPrecio(120);
        
        lstArticulos.add(art1);
        lstArticulos.add(art2);
        
        ArrayList<Envase> lstEnvase = new ArrayList();
        
        Envase envase1 = new Envase();
        
        envase1.setMaterial("Vidrio");
        envase1.setNombre("Botella");
        envase1.setNroEnvase(1);
        
        Envase envase2 = new Envase();
        
        envase2.setMaterial("Carton");
        envase2.setNombre("Caja");
        envase2.setNroEnvase(2);
        
        lstEnvase.add(envase1);
        lstEnvase.add(envase2);
        
        Local local1 = new Local();
        local1.setDireccion("Franzini 1702");
        local1.setNroLocal(12);
        
        Date fecha = new Date();
        
        boolean esPreventa = false;
        
        int nroVenta = 1;
        
        int huellaCarbono = 20;
        
        venta1.setCliente(cliente1);
        venta1.setEsPreventa(esPreventa);
        venta1.setFecha(fecha);
        venta1.setHuellaCarbono(huellaCarbono);
        venta1.setListaEnvasesUtilizados(lstEnvase);
        venta1.setLocal(local1);
        venta1.setNroVenta(nroVenta);
        
        lstVentas.add(venta1);
        
        sistemaPrueba.setListaVentas(lstVentas);
        
        ArrayList<Venta> expResult = lstVentas;
        ArrayList<Venta> result = sistemaPrueba.getListaVentas();
        assertEquals(expResult, result);
    }

    /**
     * Test of setListaVentas method, of class Sistema.
     */
    @Test
    public void testSetListaVentas() {
        ArrayList<Venta> lstVentas = new ArrayList();
        Venta venta1 = new Venta();
        
        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Tomas");
        
        ArrayList<Articulo> lstArticulos = new ArrayList();
        
        Articulo art1 = new Articulo();
        
        art1.setCodigo(1);
        art1.setCantidadVendidos(1);
        art1.setMaterial("Organico");
        art1.setNombre("Pasas de Uva");
        art1.setOrigen("Uruguay");
        art1.setPrecio(100);
        
        Articulo art2 = new Articulo();
        
        art2.setCodigo(2);
        art2.setCantidadVendidos(1);
        art2.setMaterial("Organico");
        art2.setNombre("Mandarina");
        art2.setOrigen("Ecuador");
        art2.setPrecio(120);
        
        lstArticulos.add(art1);
        lstArticulos.add(art2);
        
        ArrayList<Envase> lstEnvase = new ArrayList();
        
        Envase envase1 = new Envase();
        
        envase1.setMaterial("Vidrio");
        envase1.setNombre("Botella");
        envase1.setNroEnvase(1);
        
        Envase envase2 = new Envase();
        
        envase2.setMaterial("Carton");
        envase2.setNombre("Caja");
        envase2.setNroEnvase(2);
        
        lstEnvase.add(envase1);
        lstEnvase.add(envase2);
        
        Local local1 = new Local();
        local1.setDireccion("Franzini 1702");
        local1.setNroLocal(12);
        
        Date fecha = new Date();
        
        boolean esPreventa = false;
        
        int nroVenta = 1;
        
        int huellaCarbono = 20;
        
        venta1.setCliente(cliente1);
        venta1.setEsPreventa(esPreventa);
        venta1.setFecha(fecha);
        venta1.setHuellaCarbono(huellaCarbono);
        venta1.setListaEnvasesUtilizados(lstEnvase);
        venta1.setLocal(local1);
        venta1.setNroVenta(nroVenta);
        
        lstVentas.add(venta1);
        
        sistemaPrueba.setListaVentas(lstVentas);
        
        assertEquals(lstVentas, sistemaPrueba.getListaVentas());
    }

    /**
     * Test of getListaEnvases method, of class Sistema.
     */
    @Test
    public void testGetListaEnvases() {
        ArrayList<Envase> lstEnvase = new ArrayList();
        
        Envase envase1 = new Envase();
        
        envase1.setMaterial("Vidrio");
        envase1.setNombre("Botella");
        envase1.setNroEnvase(1);
        
        Envase envase2 = new Envase();
        
        envase2.setMaterial("Carton");
        envase2.setNombre("Caja");
        envase2.setNroEnvase(2);
        
        lstEnvase.add(envase1);
        lstEnvase.add(envase2);
        
        sistemaPrueba.setListaEnvases(lstEnvase);
        
        ArrayList<Envase> expResult = lstEnvase;
        ArrayList<Envase> result = sistemaPrueba.getListaEnvases();
        assertEquals(expResult, result);

    }

    /**
     * Test of setListaEnvases method, of class Sistema.
     */
    @Test
    public void testSetListaEnvases() {
        ArrayList<Envase> lstEnvase = new ArrayList();
        
        Envase envase1 = new Envase();
        
        envase1.setMaterial("Vidrio");
        envase1.setNombre("Botella");
        envase1.setNroEnvase(1);
        
        Envase envase2 = new Envase();
        
        envase2.setMaterial("Carton");
        envase2.setNombre("Caja");
        envase2.setNroEnvase(2);
        
        lstEnvase.add(envase1);
        lstEnvase.add(envase2);
        
        sistemaPrueba.setListaEnvases(lstEnvase);
        
        assertEquals(lstEnvase, sistemaPrueba.getListaEnvases());
    }

    /**
     * Test of agregarCliente method, of class Sistema.
     */
    @Test
    public void testAgregarCliente() {

        Cliente unCliente = new Cliente();
        unCliente.setCedula(123);
        unCliente.setDireccion("18 de Julio 2477");
        unCliente.setNombre("Alejandro");
        sistemaPrueba.getListaClientes().add(unCliente);
        boolean expResult = false;
        boolean result = sistemaPrueba.agregarCliente(unCliente);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAgregarCliente2() {
        Cliente unCliente = new Cliente();
        unCliente.setCedula(123);
        unCliente.setDireccion("18 de Julio 2477");
        unCliente.setNombre("Alejandro");
        boolean expResult = true;
        boolean result = sistemaPrueba.agregarCliente(unCliente);
        assertEquals(expResult, result);

    }
    
    @Test
    public void testAgregarCliente3() {

        Cliente cliente2 = new Cliente();
        cliente2.setCedula(123);
        cliente2.setDireccion("18 de Julio 2477");
        cliente2.setNombre("Alejandro");
        
        Cliente unCliente = new Cliente();
        unCliente.setCedula(456);
        unCliente.setDireccion("18 de Julio 2477");
        unCliente.setNombre("Alejandro");
        
        sistemaPrueba.getListaClientes().add(cliente2);
        
        boolean expResult = true;
        boolean result = sistemaPrueba.agregarCliente(unCliente);
        assertEquals(expResult, result);
    }
    

    /**
     * Test of eliminarCliente method, of class Sistema.
     */
    @Test
    public void testEliminarCliente() {
        Cliente unCliente = new Cliente();
        unCliente.setCedula(123);
        unCliente.setDireccion("18 de Julio 2477");
        unCliente.setNombre("Alejandro");
        boolean expResult = false;
        boolean result = sistemaPrueba.eliminarCliente(unCliente);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEliminarCliente2() {
        Cliente unCliente = new Cliente();
        unCliente.setCedula(123);
        unCliente.setDireccion("18 de Julio 2477");
        unCliente.setNombre("Alejandro");
        sistemaPrueba.getListaClientes().add(unCliente);
        boolean expResult = true;
        boolean result = sistemaPrueba.eliminarCliente(unCliente);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEliminarCliente3() {
        Cliente cliente2 = new Cliente();
        cliente2.setCedula(123);
        cliente2.setDireccion("18 de Julio 2477");
        cliente2.setNombre("Alejandro");
        
        Cliente unCliente = new Cliente();
        unCliente.setCedula(456);
        unCliente.setDireccion("18 de Julio 2477");
        unCliente.setNombre("Alejandro");
        
        sistemaPrueba.getListaClientes().add(unCliente);
        
        boolean expResult = false;
        boolean result = sistemaPrueba.eliminarCliente(cliente2);
        assertEquals(expResult, result);
    }
    
    

    /**
     * Test of agregarArticulo method, of class Sistema.
     */
    @Test
    public void testAgregarArticulo() {
        Articulo art1 = new Articulo();
        
        art1.setCodigo(1);
        art1.setCantidadVendidos(1);
        art1.setMaterial("Organico");
        art1.setNombre("Pasas de Uva");
        art1.setOrigen("Uruguay");
        art1.setPrecio(100);
        
        boolean expResult = true;
        boolean result = sistemaPrueba.agregarArticulo(art1);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAgregarArticulo2() {
        Articulo art1 = new Articulo();
        
        art1.setCodigo(1);
        art1.setCantidadVendidos(1);
        art1.setMaterial("Organico");
        art1.setNombre("Pasas de Uva");
        art1.setOrigen("Uruguay");
        art1.setPrecio(100);
        
        sistemaPrueba.getListaArticulos().add(art1);
        
        boolean expResult = false;
        boolean result = sistemaPrueba.agregarArticulo(art1);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAgregarArticulo3() {
        Articulo art2 = new Articulo();
        
        art2.setCodigo(1);
        art2.setCantidadVendidos(1);
        art2.setMaterial("Organico");
        art2.setNombre("Pasas de Uva");
        art2.setOrigen("Uruguay");
        art2.setPrecio(100);
        
        Articulo art1 = new Articulo();
        
        art1.setCodigo(2);
        art1.setCantidadVendidos(1);
        art1.setMaterial("Organico");
        art1.setNombre("Pasas de Uva");
        art1.setOrigen("Uruguay");
        art1.setPrecio(100);
        
        sistemaPrueba.getListaArticulos().add(art2);
        
        boolean expResult = true;
        boolean result = sistemaPrueba.agregarArticulo(art1);
        assertEquals(expResult, result);
    }
    /**
     * Test of eliminarArticulo method, of class Sistema.
     */
    @Test
    public void testEliminarArticulo() {
        
        Articulo art1 = new Articulo();
        
        art1.setCodigo(1);
        art1.setCantidadVendidos(1);
        art1.setMaterial("Organico");
        art1.setNombre("Pasas de Uva");
        art1.setOrigen("Uruguay");
        art1.setPrecio(100);
        
        boolean expResult = false;
        boolean result = sistemaPrueba.eliminarArticulo(art1);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEliminarArticulo2() {
        Articulo art1 = new Articulo();
        
        art1.setCodigo(1);
        art1.setCantidadVendidos(1);
        art1.setMaterial("Organico");
        art1.setNombre("Pasas de Uva");
        art1.setOrigen("Uruguay");
        art1.setPrecio(100);
        
        sistemaPrueba.getListaArticulos().add(art1);
        
        
        boolean expResult = true;
        boolean result = sistemaPrueba.eliminarArticulo(art1);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEliminarArticulo3() {
        Articulo art2 = new Articulo();
        
        art2.setCodigo(1);
        art2.setCantidadVendidos(1);
        art2.setMaterial("Organico");
        art2.setNombre("Pasas de Uva");
        art2.setOrigen("Uruguay");
        art2.setPrecio(100);
        
        Articulo art1 = new Articulo();
        
        art1.setCodigo(2);
        art1.setCantidadVendidos(1);
        art1.setMaterial("Organico");
        art1.setNombre("Pasas de Uva");
        art1.setOrigen("Uruguay");
        art1.setPrecio(100);
        
        sistemaPrueba.getListaArticulos().add(art1);
        
        
        boolean expResult = true;
        boolean result = sistemaPrueba.eliminarArticulo(art1);
        assertEquals(expResult, result);
    }

    /**
     * Test of agregarLocal method, of class Sistema.
     */
    @Test
    public void testAgregarLocal() {
        Local unLocal = new Local();
        unLocal.setDireccion("Pocitos");
        unLocal.setNroLocal(1);
        boolean expResult = true;
        boolean result = sistemaPrueba.agregarLocal(unLocal);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAgregarLocal2() {
        Local unLocal = new Local();
        unLocal.setDireccion("Pocitos");
        unLocal.setNroLocal(1);
        
        sistemaPrueba.getListaLocales().add(unLocal);
        
        boolean expResult = false;
        boolean result = sistemaPrueba.agregarLocal(unLocal);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAgregarLocal3() {
        Local local1 = new Local();
        local1.setDireccion("Pocitos");
        local1.setNroLocal(1);
        
        Local unLocal = new Local();
        unLocal.setDireccion("Pocitos");
        unLocal.setNroLocal(2);
        
        sistemaPrueba.getListaLocales().add(unLocal);
        
        boolean expResult = true;
        boolean result = sistemaPrueba.agregarLocal(local1);
        assertEquals(expResult, result);
    }

    /**
     * Test of eliminarLocal method, of class Sistema.
     */
    @Test
    public void testEliminarLocal() {
        Local unLocal = new Local();
        unLocal.setDireccion("Pocitos");
        unLocal.setNroLocal(1);
        
        boolean expResult = false;
        boolean result = sistemaPrueba.eliminarLocal(unLocal);
        assertEquals(expResult, result);

    }
    
    @Test
    public void testEliminarLocal2() {
        Local unLocal = new Local();
        unLocal.setDireccion("Pocitos");
        unLocal.setNroLocal(1);
        
        sistemaPrueba.getListaLocales().add(unLocal);
        
        boolean expResult = true;
        boolean result = sistemaPrueba.eliminarLocal(unLocal);
        assertEquals(expResult, result);

    }
    
    @Test
    public void testEliminarLocal3() {
        Local local1 = new Local();
        local1.setDireccion("Pocitos");
        local1.setNroLocal(2);
        
        Local unLocal = new Local();
        unLocal.setDireccion("Pocitos");
        unLocal.setNroLocal(1);
        
        sistemaPrueba.getListaLocales().add(unLocal);
        
        boolean expResult = false;
        boolean result = sistemaPrueba.eliminarLocal(local1);
        assertEquals(expResult, result);

    }

    /**
     * Test of agregarVenta method, of class Sistema.
     */
    @Test
    public void testAgregarVenta() {
        Venta venta1 = new Venta();
        
        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Tomas");
        
        ArrayList<Articulo> lstArticulos = new ArrayList();
        
        Articulo art1 = new Articulo();
        
        art1.setCodigo(1);
        art1.setCantidadVendidos(1);
        art1.setMaterial("Organico");
        art1.setNombre("Pasas de Uva");
        art1.setOrigen("Uruguay");
        art1.setPrecio(100);
        
        Articulo art2 = new Articulo();
        
        art2.setCodigo(2);
        art2.setCantidadVendidos(1);
        art2.setMaterial("Organico");
        art2.setNombre("Mandarina");
        art2.setOrigen("Ecuador");
        art2.setPrecio(120);
        
        lstArticulos.add(art1);
        lstArticulos.add(art2);
        
        ArrayList<Envase> lstEnvase = new ArrayList();
        
        Envase envase1 = new Envase();
        
        envase1.setMaterial("Vidrio");
        envase1.setNombre("Botella");
        envase1.setNroEnvase(1);
        
        Envase envase2 = new Envase();
        
        envase2.setMaterial("Carton");
        envase2.setNombre("Caja");
        envase2.setNroEnvase(2);
        
        lstEnvase.add(envase1);
        lstEnvase.add(envase2);
        
        Local local1 = new Local();
        local1.setDireccion("Franzini 1702");
        local1.setNroLocal(12);
        
        Date fecha = new Date();
        
        boolean esPreventa = false;
        
        int nroVenta = 1;
        
        int huellaCarbono = 20;
        
        venta1.setCliente(cliente1);
        venta1.setEsPreventa(esPreventa);
        venta1.setFecha(fecha);
        venta1.setHuellaCarbono(huellaCarbono);
        venta1.setListaEnvasesUtilizados(lstEnvase);
        venta1.setLocal(local1);
        venta1.setNroVenta(nroVenta);
        
        boolean expResult = true;
        boolean result = sistemaPrueba.agregarVenta(venta1);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAgregarVenta2() {
        Venta venta1 = new Venta();
        
        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Tomas");
        
        ArrayList<Articulo> lstArticulos = new ArrayList();
        
        Articulo art1 = new Articulo();
        
        art1.setCodigo(1);
        art1.setCantidadVendidos(1);
        art1.setMaterial("Organico");
        art1.setNombre("Pasas de Uva");
        art1.setOrigen("Uruguay");
        art1.setPrecio(100);
        
        Articulo art2 = new Articulo();
        
        art2.setCodigo(2);
        art2.setCantidadVendidos(1);
        art2.setMaterial("Organico");
        art2.setNombre("Mandarina");
        art2.setOrigen("Ecuador");
        art2.setPrecio(120);
        
        lstArticulos.add(art1);
        lstArticulos.add(art2);
        
        ArrayList<Envase> lstEnvase = new ArrayList();
        
        Envase envase1 = new Envase();
        
        envase1.setMaterial("Vidrio");
        envase1.setNombre("Botella");
        envase1.setNroEnvase(1);
        
        Envase envase2 = new Envase();
        
        envase2.setMaterial("Carton");
        envase2.setNombre("Caja");
        envase2.setNroEnvase(2);
        
        lstEnvase.add(envase1);
        lstEnvase.add(envase2);
        
        Local local1 = new Local();
        local1.setDireccion("Franzini 1702");
        local1.setNroLocal(12);
        
        Date fecha = new Date();
        
        boolean esPreventa = false;
        
        int nroVenta = 1;
        
        int huellaCarbono = 20;
        
        venta1.setCliente(cliente1);
        venta1.setEsPreventa(esPreventa);
        venta1.setFecha(fecha);
        venta1.setHuellaCarbono(huellaCarbono);
        venta1.setListaEnvasesUtilizados(lstEnvase);
        venta1.setLocal(local1);
        venta1.setNroVenta(nroVenta);
        
        sistemaPrueba.getListaVentas().add(venta1);
        
        boolean expResult = false;
        boolean result = sistemaPrueba.agregarVenta(venta1);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAgregarVenta3() {
        Venta venta2 = new Venta();
        venta2.setNroVenta(2);
        
        Venta venta1 = new Venta();
        
        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Tomas");
        
        ArrayList<Articulo> lstArticulos = new ArrayList();
        
        Articulo art1 = new Articulo();
        
        art1.setCodigo(1);
        art1.setCantidadVendidos(1);
        art1.setMaterial("Organico");
        art1.setNombre("Pasas de Uva");
        art1.setOrigen("Uruguay");
        art1.setPrecio(100);
        
        Articulo art2 = new Articulo();
        
        art2.setCodigo(2);
        art2.setCantidadVendidos(1);
        art2.setMaterial("Organico");
        art2.setNombre("Mandarina");
        art2.setOrigen("Ecuador");
        art2.setPrecio(120);
        
        lstArticulos.add(art1);
        lstArticulos.add(art2);
        
        ArrayList<Envase> lstEnvase = new ArrayList();
        
        Envase envase1 = new Envase();
        
        envase1.setMaterial("Vidrio");
        envase1.setNombre("Botella");
        envase1.setNroEnvase(1);
        
        Envase envase2 = new Envase();
        
        envase2.setMaterial("Carton");
        envase2.setNombre("Caja");
        envase2.setNroEnvase(2);
        
        lstEnvase.add(envase1);
        lstEnvase.add(envase2);
        
        Local local1 = new Local();
        local1.setDireccion("Franzini 1702");
        local1.setNroLocal(12);
        
        Date fecha = new Date();
        
        boolean esPreventa = false;
        
        int nroVenta = 1;
        
        int huellaCarbono = 20;
        
        venta1.setCliente(cliente1);
        venta1.setEsPreventa(esPreventa);
        venta1.setFecha(fecha);
        venta1.setHuellaCarbono(huellaCarbono);
        venta1.setListaEnvasesUtilizados(lstEnvase);
        venta1.setLocal(local1);
        venta1.setNroVenta(nroVenta);
        
        sistemaPrueba.getListaVentas().add(venta1);
        
        boolean expResult = true;
        boolean result = sistemaPrueba.agregarVenta(venta2);
        assertEquals(expResult, result);
    }

    /**
     * Test of eliminarVenta method, of class Sistema.
     */
    @Test
    public void testEliminarVenta() {
        
        Venta venta1 = new Venta();
        
        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Tomas");
        
        ArrayList<Articulo> lstArticulos = new ArrayList();
        
        Articulo art1 = new Articulo();
        
        art1.setCodigo(1);
        art1.setCantidadVendidos(1);
        art1.setMaterial("Organico");
        art1.setNombre("Pasas de Uva");
        art1.setOrigen("Uruguay");
        art1.setPrecio(100);
        
        Articulo art2 = new Articulo();
        
        art2.setCodigo(2);
        art2.setCantidadVendidos(1);
        art2.setMaterial("Organico");
        art2.setNombre("Mandarina");
        art2.setOrigen("Ecuador");
        art2.setPrecio(120);
        
        lstArticulos.add(art1);
        lstArticulos.add(art2);
        
        ArrayList<Envase> lstEnvase = new ArrayList();
        
        Envase envase1 = new Envase();
        
        envase1.setMaterial("Vidrio");
        envase1.setNombre("Botella");
        envase1.setNroEnvase(1);
        
        Envase envase2 = new Envase();
        
        envase2.setMaterial("Carton");
        envase2.setNombre("Caja");
        envase2.setNroEnvase(2);
        
        lstEnvase.add(envase1);
        lstEnvase.add(envase2);
        
        Local local1 = new Local();
        local1.setDireccion("Franzini 1702");
        local1.setNroLocal(12);
        
        Date fecha = new Date();
        
        boolean esPreventa = false;
        
        int nroVenta = 1;
        
        int huellaCarbono = 20;
        
        venta1.setCliente(cliente1);
        venta1.setEsPreventa(esPreventa);
        venta1.setFecha(fecha);
        venta1.setHuellaCarbono(huellaCarbono);
        venta1.setListaEnvasesUtilizados(lstEnvase);
        venta1.setLocal(local1);
        venta1.setNroVenta(nroVenta);
        
        
        boolean expResult = false;
        boolean result = sistemaPrueba.eliminarVenta(venta1);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEliminarVenta2() {
        
        Venta venta1 = new Venta();
        venta1.setNroVenta(1);
        
        sistemaPrueba.getListaVentas().add(venta1);
   
        boolean expResult = true;
        boolean result = sistemaPrueba.eliminarVenta(venta1);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEliminarVenta3() {
        
        Venta venta1 = new Venta();
        venta1.setNroVenta(1);
        
        Venta venta2 = new Venta();
        venta2.setNroVenta(3);
        
        sistemaPrueba.getListaVentas().add(venta1);
   
        boolean expResult = false;
        boolean result = sistemaPrueba.eliminarVenta(venta2);
        assertEquals(expResult, result);
    }

    /**
     * Test of agregarEnvase method, of class Sistema.
     */
    @Test
    public void testAgregarEnvase() {
        Envase unEnvase = new Envase();
        unEnvase.setMaterial("Vidrio");
        unEnvase.setNombre("Botella");
        unEnvase.setNroEnvase(1);
        
        boolean expResult = true;
        boolean result = sistemaPrueba.agregarEnvase(unEnvase);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAgregarEnvase2() {
        Envase unEnvase = new Envase();
        unEnvase.setMaterial("Vidrio");
        unEnvase.setNombre("Botella");
        unEnvase.setNroEnvase(1);
        
        sistemaPrueba.getListaEnvases().add(unEnvase);
        
        boolean expResult = false;
        boolean result = sistemaPrueba.agregarEnvase(unEnvase);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAgregarEnvase3() {
        Envase unEnvase = new Envase();
        unEnvase.setMaterial("Vidrio");
        unEnvase.setNombre("Botella");
        unEnvase.setNroEnvase(1);
        
        Envase envase1 = new Envase();
        envase1.setMaterial("Vidrio");
        envase1.setNombre("Botella");
        envase1.setNroEnvase(2);
        
        sistemaPrueba.getListaEnvases().add(unEnvase);
        
        boolean expResult = true;
        boolean result = sistemaPrueba.agregarEnvase(envase1);
        assertEquals(expResult, result);
    }

    /**
     * Test of eliminarEnvase method, of class Sistema.
     */
    @Test
    public void testEliminarEnvase() {
        Envase unEnvase = new Envase();
        unEnvase.setMaterial("Vidrio");
        unEnvase.setNombre("Botella");
        unEnvase.setNroEnvase(1);
        
        boolean expResult = false;
        boolean result = sistemaPrueba.eliminarEnvase(unEnvase);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEliminarEnvase2() {
        Envase unEnvase = new Envase();
        unEnvase.setMaterial("Vidrio");
        unEnvase.setNombre("Botella");
        unEnvase.setNroEnvase(1);
        
        sistemaPrueba.getListaEnvases().add(unEnvase);
        
        boolean expResult = true;
        boolean result = sistemaPrueba.eliminarEnvase(unEnvase);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEliminarEnvase3() {
        Envase unEnvase = new Envase();
        unEnvase.setMaterial("Vidrio");
        unEnvase.setNombre("Botella");
        unEnvase.setNroEnvase(1);
        
        Envase envase1 = new Envase();
        envase1.setMaterial("Vidrio");
        envase1.setNombre("Botella");
        envase1.setNroEnvase(2);
        sistemaPrueba.getListaEnvases().add(unEnvase);
        
        boolean expResult = false;
        boolean result = sistemaPrueba.eliminarEnvase(envase1);
        assertEquals(expResult, result);
    }

    /**
     * Test of productosMasVendidos method, of class Sistema.
     */
    @Test
    public void testProductosMasVendidos() {
        
        ArrayList<Articulo> lstArticulos = new ArrayList();
        
        Articulo art1 = new Articulo();
        
        art1.setCodigo(1);
        art1.setCantidadVendidos(1);
        art1.setMaterial("Organico");
        art1.setNombre("Pasas de Uva");
        art1.setOrigen("Uruguay");
        art1.setPrecio(100);
        
        Articulo art2 = new Articulo();
        
        art2.setCodigo(2);
        art2.setCantidadVendidos(8);
        art2.setMaterial("Organico");
        art2.setNombre("Mandarina");
        art2.setOrigen("Ecuador");
        art2.setPrecio(120);
        
        lstArticulos.add(art1);
        lstArticulos.add(art2);
        
        ArrayList<Articulo> expResult = new ArrayList();
        expResult.add(art2);
        expResult.add(art1);
        ArrayList<Articulo> result = sistemaPrueba.productosMasVendidos(lstArticulos);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testProductosMasVendidos2() {
        
        ArrayList<Articulo> lstArticulos = new ArrayList();
        
        Articulo art1 = new Articulo();
        
        art1.setCodigo(1);
        art1.setCantidadVendidos(8);
        art1.setMaterial("Organico");
        art1.setNombre("Pasas de Uva");
        art1.setOrigen("Uruguay");
        art1.setPrecio(100);
        
        Articulo art2 = new Articulo();
        
        art2.setCodigo(2);
        art2.setCantidadVendidos(1);
        art2.setMaterial("Organico");
        art2.setNombre("Mandarina");
        art2.setOrigen("Ecuador");
        art2.setPrecio(120);
        
        lstArticulos.add(art1);
        lstArticulos.add(art2);
        
        ArrayList<Articulo> expResult = new ArrayList();
        expResult.add(art1);
        expResult.add(art2);
        ArrayList<Articulo> result = sistemaPrueba.productosMasVendidos(lstArticulos);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testProductosMasVendidos3() {
        
        ArrayList<Articulo> lstArticulos = new ArrayList();
        
        Articulo art1 = new Articulo();
        
        art1.setCodigo(1);
        art1.setCantidadVendidos(5);
        art1.setMaterial("Organico");
        art1.setNombre("Pasas de Uva");
        art1.setOrigen("Uruguay");
        art1.setPrecio(100);
        
        Articulo art2 = new Articulo();
        
        art2.setCodigo(2);
        art2.setCantidadVendidos(5);
        art2.setMaterial("Organico");
        art2.setNombre("Mandarina");
        art2.setOrigen("Ecuador");
        art2.setPrecio(120);
        
        lstArticulos.add(art1);
        lstArticulos.add(art2);
        
        ArrayList<Articulo> expResult = new ArrayList();
        expResult.add(art1);
        expResult.add(art2);
        ArrayList<Articulo> result = sistemaPrueba.productosMasVendidos(lstArticulos);
        assertEquals(expResult, result);
    }
    
    

    /**
     * Test of EnvasesReutilizados method, of class Sistema.
     */
    @Test
    public void testEnvasesReutilizados() {
        Venta vent = new Venta();
        ArrayList<Envase> lstEnvases = new ArrayList();
        
        Envase unEnvase = new Envase();
        unEnvase.setMaterial("Carton");
        unEnvase.setNombre("Caja");
        unEnvase.setNroEnvase(1);
        
        Envase envase1 = new Envase();
        envase1.setMaterial("Vidrio");
        envase1.setNombre("Botella");
        envase1.setNroEnvase(2);
        
        lstEnvases.add(unEnvase);
        lstEnvases.add(envase1);
        
        vent.setListaEnvasesUtilizados(lstEnvases);
        
        Venta vent2 = new Venta();
        ArrayList<Envase> lstEnvases2 = new ArrayList();
        
        Envase envase2 = new Envase();
        envase2.setMaterial("Plastico");
        envase2.setNombre("Bolsa");
        envase2.setNroEnvase(3);
        
        Envase envase3 = new Envase();
        envase3.setMaterial("Plastico");
        envase3.setNombre("Tupper");
        envase3.setNroEnvase(4);
        
        lstEnvases2.add(envase2);
        lstEnvases2.add(envase3);
        
        vent2.setListaEnvasesUtilizados(lstEnvases2);
        
        sistemaPrueba.getListaVentas().add(vent);
        sistemaPrueba.getListaVentas().add(vent2);
        
        
        ArrayList<Envase> expResult = new ArrayList();
        expResult.add(unEnvase);
        expResult.add(envase1);
        expResult.add(envase2);
        expResult.add(envase3);
        ArrayList<Envase> result = sistemaPrueba.envasesReutilizados();
        assertEquals(expResult, result);

    }
    
    @Test
    public void testEnvasesReutilizados2() {
        Venta vent = new Venta();
        ArrayList<Envase> lstEnvases = new ArrayList();
        
        Envase unEnvase = new Envase();
        unEnvase.setMaterial("Carton");
        unEnvase.setNombre("Caja");
        unEnvase.setNroEnvase(1);
        
        
        lstEnvases.add(unEnvase);
        
        
        vent.setListaEnvasesUtilizados(lstEnvases);
        
        Venta vent2 = new Venta();
        ArrayList<Envase> lstEnvases2 = new ArrayList();
        
        Envase envase2 = new Envase();
        envase2.setMaterial("Carton");
        envase2.setNombre("Caja");
        envase2.setNroEnvase(1);
        
        lstEnvases2.add(envase2);
        
        
        vent2.setListaEnvasesUtilizados(lstEnvases2);
        
        sistemaPrueba.getListaVentas().add(vent);
        sistemaPrueba.getListaVentas().add(vent2);
        
        
        ArrayList<Envase> expResult = new ArrayList();
        expResult.add(unEnvase);
        ArrayList<Envase> result = sistemaPrueba.envasesReutilizados();
        assertEquals(expResult, result);
    }

    /**
     * Test of eliminarEnvasesRepetidos method, of class Sistema.
     */
    @Test
    public void testEliminarEnvasesRepetidos() {
        ArrayList<Envase> lstEnvases = new ArrayList();
        Envase unEnvase = new Envase();
        unEnvase.setMaterial("Carton");
        unEnvase.setNombre("Caja");
        unEnvase.setNroEnvase(1);
        
        Envase envase1 = new Envase();
        envase1.setMaterial("Carton");
        envase1.setNombre("Caja");
        envase1.setNroEnvase(1);
        
        Envase envase2 = new Envase();
        envase2.setMaterial("Vidrio");
        envase2.setNombre("Botella");
        envase2.setNroEnvase(2);
        
        lstEnvases.add(unEnvase);
        lstEnvases.add(envase1);
        lstEnvases.add(envase2);
        
        sistemaPrueba.setListaEnvases(lstEnvases);
        
        ArrayList<Envase> expResult = new ArrayList();
        expResult.add(unEnvase);
        expResult.add(envase2);
        
        sistemaPrueba.eliminarEnvasesRepetidos(lstEnvases);
        ArrayList<Envase> result = sistemaPrueba.getListaEnvases();
        
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEliminarEnvasesRepetidos3() {
        ArrayList<Envase> lstEnvases = new ArrayList();
        Envase unEnvase = new Envase();
        unEnvase.setMaterial("Carton");
        unEnvase.setNombre("Caja");
        unEnvase.setNroEnvase(1);
        
        Envase envase1 = new Envase();
        envase1.setMaterial("Bolsa");
        envase1.setNombre("Plastico");
        envase1.setNroEnvase(3);
        
        Envase envase2 = new Envase();
        envase2.setMaterial("Vidrio");
        envase2.setNombre("Botella");
        envase2.setNroEnvase(2);
        
        lstEnvases.add(unEnvase);
        lstEnvases.add(envase1);
        lstEnvases.add(envase2);
        
        sistemaPrueba.setListaEnvases(lstEnvases);
        
        ArrayList<Envase> expResult = new ArrayList();
        expResult.add(unEnvase);
        expResult.add(envase1);
        expResult.add(envase2);
        
        sistemaPrueba.eliminarEnvasesRepetidos(lstEnvases);
        ArrayList<Envase> result = sistemaPrueba.getListaEnvases();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of ventasDadoUnMes method, of class Sistema.
     */
    @Test
    public void testVentasDadoUnMes() {
        Venta vent = new Venta();
        Calendar cal =Calendar.getInstance();
        cal.set(Calendar.MONTH,10);
        cal.set(Calendar.DATE, 05);
        cal.set(Calendar.YEAR, 2019);
        
        Date fecha  = cal.getTime();
        
        vent.setFecha(fecha);
        
        Venta vent2 = new Venta();
        Calendar cal2 = Calendar.getInstance();
        cal2.set(Calendar.MONTH, 10);
        cal2.set(Calendar.DATE, 05);
        cal2.set(Calendar.YEAR, 2019);
        
        Date fecha2 = cal2.getTime();
        
        vent2.setFecha(fecha2);
        
        sistemaPrueba.getListaVentas().add(vent);
        sistemaPrueba.getListaVentas().add(vent2);
        
        int expResult = 2;
        int result = sistemaPrueba.ventasDadoUnMes(10);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVentasDadoUnMes2() {
        Venta vent = new Venta();
        Calendar cal =Calendar.getInstance();
        cal.set(Calendar.MONTH,10);
        cal.set(Calendar.DATE, 05);
        cal.set(Calendar.YEAR, 2019);
        
        Date fecha  = cal.getTime();
        
        vent.setFecha(fecha);
        
        Venta vent2 = new Venta();
        Calendar cal2 = Calendar.getInstance();
        cal2.set(Calendar.MONTH, 10);
        cal2.set(Calendar.DATE, 05);
        cal2.set(Calendar.YEAR, 2019);
        
        Date fecha2 = cal2.getTime();
        
        vent2.setFecha(fecha2);
        
        sistemaPrueba.getListaVentas().add(vent);
        sistemaPrueba.getListaVentas().add(vent2);
        
        int expResult = 0;
        int result = sistemaPrueba.ventasDadoUnMes(11);
        assertEquals(expResult, result);
    }

    /**
     * Test of esNumerico method, of class Sistema.
     */
    @Test
    public void testEsNumerico() {
        String dato = "hola";
        boolean expResult = false;
        boolean result = sistemaPrueba.esNumerico(dato);
        assertEquals(expResult, result);

    }
    
    @Test
    public void testEsNumerico2() {
        String dato = "hola456";
        boolean expResult = false;
        boolean result = sistemaPrueba.esNumerico(dato);
        assertEquals(expResult, result);

    }
    
    @Test
    public void testEsNumerico3() {
        String dato = "456";
        boolean expResult = true;
        boolean result = sistemaPrueba.esNumerico(dato);
        assertEquals(expResult, result);

    }
    
    @Test
    public void testEsNumerico4() {
        String dato = "";
        boolean expResult = false;
        boolean result = sistemaPrueba.esNumerico(dato);
        assertEquals(expResult, result);

    }

    /**
     * Test of esCedula method, of class Sistema.
     */
    @Test
    public void testEsCedula() {
        String ci = "12345678";
        boolean expResult = true;
        boolean result = sistemaPrueba.esCedula(ci);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEsCedula2() {
        String ci = "123456789";
        boolean expResult = false;
        boolean result = sistemaPrueba.esCedula(ci);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEsCedula3() {
        String ci = "1234567a";
        boolean expResult = false;
        boolean result = sistemaPrueba.esCedula(ci);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEsCedula4() {
        String ci = "abcdefgh";
        boolean expResult = false;
        boolean result = sistemaPrueba.esCedula(ci);
        assertEquals(expResult, result);
    }
    
    

    /**
     * Test of sonIguales method, of class Sistema.
     */
    @Test
    public void testSonIguales() {
        
        Envase e1 = new Envase(1,"Botella","Vidrio");
        Envase e2 = new Envase(2,"Tupper","Plastico");
        Envase e3 = new Envase(3,"Caja","Carton");
        Envase e4 = new Envase(4,"Bolsa", "Carton");
        
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
        
        ArrayList<Articulo>lstArticulosOriginales = new ArrayList();
        lstArticulosOriginales.add(art1);
        lstArticulosOriginales.add(art2);
        lstArticulosOriginales.add(art3);
        lstArticulosOriginales.add(art4);
        
        sistemaPrueba.setListaArticulosOriginales(lstArticulosOriginales);
        

        boolean expResult = true;
        boolean result = sistemaPrueba.sonIguales(lstArticulosOriginales);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSonIguales2() {
        
        Envase e1 = new Envase(1,"Botella","Vidrio");
        Envase e2 = new Envase(2,"Tupper","Plastico");
        Envase e3 = new Envase(3,"Caja","Carton");
        Envase e4 = new Envase(4,"Bolsa", "Carton");
        
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
        Articulo art5 = new Articulo(5, 400, "Alemania", "Té", "Kombucha", art4Envases, 0);
        
        ArrayList<Articulo>lstArticulosOriginales = new ArrayList();
        lstArticulosOriginales.add(art1);
        lstArticulosOriginales.add(art2);
        lstArticulosOriginales.add(art3);
        lstArticulosOriginales.add(art4);
        
        ArrayList<Articulo>lstArticulos = new ArrayList();
        lstArticulos.add(art5);
        lstArticulos.add(art2);
        lstArticulos.add(art3);
        lstArticulos.add(art4);
        
        
        sistemaPrueba.setListaArticulosOriginales(lstArticulosOriginales);
        

        boolean expResult = false;
        boolean result = sistemaPrueba.sonIguales(lstArticulos);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSonIguales3() {
        
        Envase e1 = new Envase(1,"Botella","Vidrio");
        Envase e2 = new Envase(2,"Tupper","Plastico");
        Envase e3 = new Envase(3,"Caja","Carton");
        Envase e4 = new Envase(4,"Bolsa", "Carton");
        
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
        Articulo art5 = new Articulo(5, 400, "Alemania", "Té", "Kombucha", art4Envases, 0);
        
        ArrayList<Articulo>lstArticulosOriginales = new ArrayList();
        lstArticulosOriginales.add(art1);
        lstArticulosOriginales.add(art2);
        lstArticulosOriginales.add(art3);
        lstArticulosOriginales.add(art4);
        lstArticulosOriginales.add(art5);
        
        ArrayList<Articulo>lstArticulos = new ArrayList();
        lstArticulos.add(art5);
        lstArticulos.add(art2);
        lstArticulos.add(art3);
        lstArticulos.add(art4);
        
        
        sistemaPrueba.setListaArticulosOriginales(lstArticulosOriginales);
        

        boolean expResult = false;
        boolean result = sistemaPrueba.sonIguales(lstArticulos);
        assertEquals(expResult, result);
    }

    /**
     * Test of estaRegistrado method, of class Sistema.
     */
    @Test
    public void testEstaRegistrado() {
        Cliente cl = new Cliente();
        int ci = 12345678;
        cl.setCedula(ci);
        sistemaPrueba.getListaClientes().add(cl);
                
        boolean expResult = true;
        boolean result = sistemaPrueba.estaRegistrado(Integer.toString(ci));
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEstaRegistrado2() {
        Cliente cl = new Cliente();
        int ci = 12345677;
        cl.setCedula(ci);
        sistemaPrueba.getListaClientes().add(cl);
        
        int ci2 = 12345678;
                
        boolean expResult = false;
        boolean result = sistemaPrueba.estaRegistrado(Integer.toString(ci2));
        assertEquals(expResult, result);
    }

    /**
     * Test of validacionCompra method, of class Sistema.
     */
    @Test
    public void testValidacionCompra() {
        Envase e1 = new Envase(1,"Botella","Vidrio");
        Envase e2 = new Envase(2,"Tupper","Plastico");
        Envase e3 = new Envase(3,"Caja","Carton");
        Envase e4 = new Envase(4,"Bolsa", "Carton");
        
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
        
        ArrayList<Articulo>lstArticulosOriginales = new ArrayList();
        lstArticulosOriginales.add(art1);
        lstArticulosOriginales.add(art2);
        lstArticulosOriginales.add(art3);
        lstArticulosOriginales.add(art4);
        
        ArrayList<Envase>lstEnvases = new ArrayList();
        lstEnvases.add(e1);
        lstEnvases.add(e2);
        lstEnvases.add(e3);
        lstEnvases.add(e4);
        
        
        boolean expResult = true;
        boolean result = sistemaPrueba.validacionCompra(lstArticulosOriginales, lstEnvases);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidacionCompra2() {
        Envase e1 = new Envase(1,"Botella","Vidrio");
        Envase e2 = new Envase(2,"Tupper","Plastico");
        Envase e3 = new Envase(3,"Caja","Carton");
        Envase e4 = new Envase(4,"Bolsa", "Carton");
        
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
        
        ArrayList<Articulo>lstArticulosOriginales = new ArrayList();
        lstArticulosOriginales.add(art1);
        lstArticulosOriginales.add(art2);
        lstArticulosOriginales.add(art3);
        
        ArrayList<Envase>lstEnvases = new ArrayList();
        lstEnvases.add(e1);
        lstEnvases.add(e2);
        lstEnvases.add(e3);
        lstEnvases.add(e4);
        
        
        boolean expResult = false;
        boolean result = sistemaPrueba.validacionCompra(lstArticulosOriginales, lstEnvases);
        assertEquals(expResult, result);
    }

    /**
     * Test of copiarLista method, of class Sistema.
     */
    @Test
    public void testCopiarLista() {
        Envase e1 = new Envase(1,"Botella","Vidrio");
        Envase e2 = new Envase(2,"Tupper","Plastico");
        Envase e3 = new Envase(3,"Caja","Carton");
        Envase e4 = new Envase(4,"Bolsa", "Carton");
        
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
        
        ArrayList<Articulo>lstArticulosOriginales = new ArrayList();
        lstArticulosOriginales.add(art1);
        lstArticulosOriginales.add(art2);
        lstArticulosOriginales.add(art3);
        
        ArrayList<Envase>lstEnvases = new ArrayList();
        lstEnvases.add(e1);
        lstEnvases.add(e2);
        lstEnvases.add(e3);
        lstEnvases.add(e4);
        
        
        ArrayList<Articulo> expResult = lstArticulosOriginales;
        ArrayList<Articulo> result = sistemaPrueba.copiarLista(lstArticulosOriginales);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of precioTotal method, of class Sistema.
     */
    @Test
    public void testPrecioTotal() {
        Envase e1 = new Envase(1,"Botella","Vidrio");
        Envase e2 = new Envase(2,"Tupper","Plastico");
        Envase e3 = new Envase(3,"Caja","Carton");
        Envase e4 = new Envase(4,"Bolsa", "Carton");
        
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
        
        Articulo art1 = new Articulo(1, 200, "Uruguay", "Uva", "Pasas de uva", art1Envases, 1);
        Articulo art2 = new Articulo(2, 500, "Colombia", "Granos de café", "Café Parsero", art2Envases, 1);
        Articulo art3 = new Articulo(3, 700, "Japon", "Organico", "Hongo Shiitake", art3Envases, 1);
        Articulo art4 = new Articulo(4, 400, "Alemania", "Té", "Kombucha", art4Envases, 1);
        
        ArrayList<Articulo>lstArticulosOriginales = new ArrayList();
        lstArticulosOriginales.add(art1);
        lstArticulosOriginales.add(art2);
        lstArticulosOriginales.add(art3);
        lstArticulosOriginales.add(art4);
        
        ArrayList<Envase>lstEnvases = new ArrayList();
        lstEnvases.add(e1);
        lstEnvases.add(e2);
        lstEnvases.add(e3);
        lstEnvases.add(e4);
        
        String expResult = "1800";
        String result = sistemaPrueba.precioTotal(lstArticulosOriginales);
        assertEquals(expResult, result);

    }

    /**
     * Test of esHoy method, of class Sistema.
     */
    @Test
    public void testEsHoy() {
        
        Calendar cal =Calendar.getInstance();
        cal.set(Calendar.MONTH,10);
        cal.set(Calendar.DATE, 22);
        cal.set(Calendar.YEAR, 2019);
                
        Date FechaHoy = cal.getTime();
        
        Calendar cal2 =Calendar.getInstance();
        cal2.set(Calendar.MONTH,10);
        cal2.set(Calendar.DATE, 22);
        cal2.set(Calendar.YEAR, 2019);
        
        Date FechaSeleccionado = cal2.getTime();
        
        boolean expResult = true;
        boolean result = sistemaPrueba.esHoy(FechaHoy, FechaSeleccionado);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEsHoy2() {
        
        Calendar cal =Calendar.getInstance();
        cal.set(Calendar.MONTH,10);
        cal.set(Calendar.DATE, 23);
        cal.set(Calendar.YEAR, 2019);
                
        Date FechaHoy = cal.getTime();
        
        Calendar cal2 =Calendar.getInstance();
        cal2.set(Calendar.MONTH,10);
        cal2.set(Calendar.DATE, 22);
        cal2.set(Calendar.YEAR, 2019);
        
        Date FechaSeleccionado = cal2.getTime();
        
        boolean expResult = false;
        boolean result = sistemaPrueba.esHoy(FechaHoy, FechaSeleccionado);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEsHoy3() {
        
        Calendar cal =Calendar.getInstance();
        cal.set(Calendar.MONTH,10);
        cal.set(Calendar.DATE, 23);
        cal.set(Calendar.YEAR, 2019);
                
        Date FechaHoy = cal.getTime();
        
        Calendar cal2 =Calendar.getInstance();
        cal2.set(Calendar.MONTH,9);
        cal2.set(Calendar.DATE, 23);
        cal2.set(Calendar.YEAR, 2019);
        
        Date FechaSeleccionado = cal2.getTime();
        
        boolean expResult = false;
        boolean result = sistemaPrueba.esHoy(FechaHoy, FechaSeleccionado);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEsHoy4() {
        
        Calendar cal =Calendar.getInstance();
        cal.set(Calendar.MONTH,10);
        cal.set(Calendar.DATE, 23);
        cal.set(Calendar.YEAR, 2019);
                
        Date FechaHoy = cal.getTime();
        
        Calendar cal2 =Calendar.getInstance();
        cal2.set(Calendar.MONTH,9);
        cal2.set(Calendar.DATE, 21);
        cal2.set(Calendar.YEAR, 2020);
        
        Date FechaSeleccionado = cal2.getTime();
        
        boolean expResult = false;
        boolean result = sistemaPrueba.esHoy(FechaHoy, FechaSeleccionado);
        assertEquals(expResult, result);
    }

    /**
     * Test of aplicaDescuento method, of class Sistema.
     */
    @Test
    public void testAplicaDescuento() {
        Envase e1 = new Envase(1,"Botella","Vidrio");
        Envase e2 = new Envase(2,"Tupper","Plastico");
        Envase e3 = new Envase(3,"Caja","Carton");
        Envase e4 = new Envase(4,"Bolsa", "Carton");
        
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
        
        ArrayList<Envase> art5Envases = new ArrayList();
        art5Envases.add(e1);
        
        Articulo art1 = new Articulo(1, 200, "Uruguay", "Uva", "Pasas de uva", art1Envases, 1);
        Articulo art2 = new Articulo(2, 500, "Colombia", "Granos de café", "Café Parsero", art2Envases, 1);
        Articulo art3 = new Articulo(3, 700, "Japon", "Organico", "Hongo Shiitake", art3Envases, 1);
        Articulo art4 = new Articulo(4, 400, "Alemania", "Té", "Kombucha", art4Envases, 1);
        Articulo art5 = new Articulo(5, 500, "EEUU", "Harina", "Galletas", art5Envases, 1);
        
        
        ArrayList<Articulo>lstArticulosOriginales = new ArrayList();
        lstArticulosOriginales.add(art1);
        lstArticulosOriginales.add(art2);
        lstArticulosOriginales.add(art3);
        lstArticulosOriginales.add(art4);
        lstArticulosOriginales.add(art5);
        
        boolean expResult = true;
        boolean result = sistemaPrueba.aplicaDescuento(lstArticulosOriginales);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAplicaDescuento2() {
        Envase e1 = new Envase(1,"Botella","Vidrio");
        Envase e2 = new Envase(2,"Tupper","Plastico");
        Envase e3 = new Envase(3,"Caja","Carton");
        Envase e4 = new Envase(4,"Bolsa", "Carton");
        
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
        
        
        Articulo art1 = new Articulo(1, 200, "Uruguay", "Uva", "Pasas de uva", art1Envases, 1);
        Articulo art2 = new Articulo(2, 500, "Colombia", "Granos de café", "Café Parsero", art2Envases, 1);
        Articulo art3 = new Articulo(3, 700, "Japon", "Organico", "Hongo Shiitake", art3Envases, 1);
        Articulo art4 = new Articulo(4, 400, "Alemania", "Té", "Kombucha", art4Envases, 1);
        
        ArrayList<Articulo>lstArticulosOriginales = new ArrayList();
        lstArticulosOriginales.add(art1);
        lstArticulosOriginales.add(art2);
        lstArticulosOriginales.add(art3);
        lstArticulosOriginales.add(art4);
        
        boolean expResult = false;
        boolean result = sistemaPrueba.aplicaDescuento(lstArticulosOriginales);
        assertEquals(expResult, result);
    }

    /**
     * Test of calculoDescuento method, of class Sistema.
     */
    @Test
    public void testCalculoDescuento() {
        Envase e1 = new Envase(1,"Botella","Vidrio");
        Envase e2 = new Envase(2,"Tupper","Plastico");
        Envase e3 = new Envase(3,"Caja","Carton");
        Envase e4 = new Envase(4,"Bolsa", "Carton");
        
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
        
        ArrayList<Envase> art5Envases = new ArrayList();
        art5Envases.add(e1);
        
        Articulo art1 = new Articulo(1, 200, "Uruguay", "Uva", "Pasas de uva", art1Envases, 1);
        Articulo art2 = new Articulo(2, 500, "Colombia", "Granos de café", "Café Parsero", art2Envases, 1);
        Articulo art3 = new Articulo(3, 700, "Japon", "Organico", "Hongo Shiitake", art3Envases, 1);
        Articulo art4 = new Articulo(4, 400, "Alemania", "Té", "Kombucha", art4Envases, 1);
        Articulo art5 = new Articulo(5, 500, "EEUU", "Harina", "Galletas", art5Envases, 1);
        
        
        ArrayList<Articulo>lstArticulosOriginales = new ArrayList();
        lstArticulosOriginales.add(art1);
        lstArticulosOriginales.add(art2);
        lstArticulosOriginales.add(art3);
        lstArticulosOriginales.add(art4);
        lstArticulosOriginales.add(art5);
        
        String precioTotal = sistemaPrueba.precioTotal(lstArticulosOriginales);
        int expResult = 2070; 
        int result = sistemaPrueba.calculoDescuento(Integer.parseInt(precioTotal));
        assertEquals(expResult, result);
    }

    /**
     * Test of listaCantidadVendidos method, of class Sistema.
     */
    @Test
    public void testListaCantidadVendidos() {
        Envase e1 = new Envase(1,"Botella","Vidrio");
        Envase e2 = new Envase(2,"Tupper","Plastico");
        Envase e3 = new Envase(3,"Caja","Carton");
        Envase e4 = new Envase(4,"Bolsa", "Carton");
        
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
        
        ArrayList<Envase> art5Envases = new ArrayList();
        art5Envases.add(e1);
        
        Articulo art1 = new Articulo(1, 200, "Uruguay", "Uva", "Pasas de uva", art1Envases, 1);
        Articulo art2 = new Articulo(2, 500, "Colombia", "Granos de café", "Café Parsero", art2Envases, 1);
        Articulo art3 = new Articulo(3, 700, "Japon", "Organico", "Hongo Shiitake", art3Envases, 1);
        Articulo art4 = new Articulo(4, 400, "Alemania", "Té", "Kombucha", art4Envases, 1);
        Articulo art5 = new Articulo(5, 500, "EEUU", "Harina", "Galletas", art5Envases, 1);
        
        
        ArrayList<Articulo>lstArticulosOriginales = new ArrayList();
        lstArticulosOriginales.add(art1);
        lstArticulosOriginales.add(art2);
        lstArticulosOriginales.add(art3);
        lstArticulosOriginales.add(art4);
        lstArticulosOriginales.add(art5);
        
        ArrayList<Integer> expResult = new ArrayList();
        expResult.add(1);
        expResult.add(1);
        expResult.add(1);
        expResult.add(1);
        expResult.add(1);
        
        ArrayList<Integer> result = sistemaPrueba.listaCantidadVendidos(lstArticulosOriginales);
        assertEquals(expResult, result);
    }
    
}


