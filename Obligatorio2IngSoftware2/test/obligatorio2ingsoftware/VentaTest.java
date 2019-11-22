/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio2ingsoftware;

import dominio.Cliente;
import dominio.Local;
import dominio.Articulo;
import dominio.Envase;
import dominio.Venta;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class VentaTest {
    Venta ventaPrueba=new Venta();
    
    public VentaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getHuellaCarbono method, of class Venta.
     */
    @Test
    public void testGetHuellaCarbono() {
        int expResult = 10;
        ventaPrueba.setHuellaCarbono(expResult);
        int result = ventaPrueba.getHuellaCarbono();
        assertEquals(expResult, result);
    }

    /**
     * Test of setHuellaCarbono method, of class Venta.
     */
    @Test
    public void testSetHuellaCarbono() {
        int expResult = 3;
        ventaPrueba.setHuellaCarbono(expResult);
        assertEquals(expResult, ventaPrueba.getHuellaCarbono());
    }

    /**
     * Test of getEsPreventa method, of class Venta.
     */
    @Test
    public void testGetEsPreventa() {
        boolean expResult = true;
        ventaPrueba.setEsPreventa(expResult);
        boolean result = ventaPrueba.getEsPreventa();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEsPreventa method, of class Venta.
     */
    @Test
    public void testSetEsPreventa() {
        boolean expResult = true;
        ventaPrueba.setEsPreventa(expResult);
        assertEquals(expResult, ventaPrueba.getEsPreventa());
    }

    /**
     * Test of getLocal method, of class Venta.
     */
    @Test
    public void testGetLocal() {
        Local expResult = new Local();
        ventaPrueba.setLocal(expResult);
        Local result = ventaPrueba.getLocal();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLocal method, of class Venta.
     */
    @Test
    public void testSetLocal() {
        Local expResult = new Local();
        ventaPrueba.setLocal(expResult);
        assertEquals(expResult, ventaPrueba.getLocal());
    }

    /**
     * Test of getListaEnvasesUtilizados method, of class Venta.
     */
    @Test
    public void testGetListaEnvasesUtilizados() {
        System.out.println("getListaEnvasesUtilizados");
        Venta instance = new Venta();
        ArrayList<Envase> expResult = null;
        ArrayList<Envase> result = instance.getListaEnvasesUtilizados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListaEnvasesUtilizados method, of class Venta.
     */
    @Test
    public void testSetListaEnvasesUtilizados() {
        System.out.println("setListaEnvasesUtilizados");
        ArrayList<Envase> listaEnvases = null;
        Venta instance = new Venta();
        instance.setListaEnvasesUtilizados(listaEnvases);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaArticulos method, of class Venta.
     */
    @Test
    public void testGetListaArticulos() {
        System.out.println("getListaArticulos");
        Venta instance = new Venta();
        ArrayList<Articulo> expResult = null;
        ArrayList<Articulo> result = instance.getListaArticulos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNroVenta method, of class Venta.
     */
    @Test
    public void testGetNroVenta() {
        int expResult = 2;
        ventaPrueba.setNroVenta(expResult);
        int result = ventaPrueba.getNroVenta();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCliente method, of class Venta.
     */
    @Test
    public void testGetCliente() {
        Cliente expResult = new Cliente();
        ventaPrueba.setCliente(expResult);
        Cliente result = ventaPrueba.getCliente();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCliente method, of class Venta.
     */
    @Test
    public void testSetCliente() {
        Cliente expResult = new Cliente();
        ventaPrueba.setCliente(expResult);
        assertEquals(expResult, ventaPrueba.getCliente());
    }

    /**
     * Test of setNroVenta method, of class Venta.
     */
    @Test
    public void testSetNroVenta() {
        int expResult = 3;
        ventaPrueba.setNroVenta(expResult);
        assertEquals(expResult, ventaPrueba.getNroVenta());
    }

    /**
     * Test of getFecha method, of class Venta.
     */
    @Test
    public void testGetFecha() {
        Date expResult = new Date();
        ventaPrueba.setFecha(expResult);
        Date result = ventaPrueba.getFecha();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFecha method, of class Venta.
     */
    @Test
    public void testSetFecha_Date() {
        Date expResult = new Date();
        ventaPrueba.setFecha(expResult);
        assertEquals(expResult, ventaPrueba.getFecha());
    }

    /**
     * Test of agregarArticuloVenta method, of class Venta.
     */
    @Test
    public void testAgregarArticuloVenta() {
        System.out.println("agregarArticuloVenta");
        Articulo art = null;
        Venta instance = new Venta();
        instance.agregarArticuloVenta(art);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Venta.
     */
    @Test
    public void testEquals() {
        Venta vent = new Venta();
        ventaPrueba.setNroVenta(1212);
        vent.setNroVenta(1212);
        boolean expResult = true;
        boolean result = ventaPrueba.equals(vent);
        assertEquals(expResult, result);
    }

    /**
     * Test of calculoHuella method, of class Venta.
     */
    @Test
    public void testCalculoHuella() {
        ArrayList<Articulo> lstArt = new ArrayList<Articulo>();
        int expResult = 0;
        int result = ventaPrueba.calculoHuella(lstArt);
        assertEquals(expResult, result);
    }
    
}
