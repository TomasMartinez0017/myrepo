/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

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
    Venta ventaPrueba;
    
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
        ventaPrueba = new Venta();
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
        ArrayList<Envase> lstEnvase = new ArrayList();
        Envase e1 = new Envase();
        e1.setNroEnvase(1);
        Envase e2 = new Envase();
        e2.setNroEnvase(2);
        
        lstEnvase.add(e1);
        lstEnvase.add(e2);
        
        ventaPrueba.setListaEnvasesUtilizados(lstEnvase);
        
        ArrayList<Envase> expResult = lstEnvase;
        ArrayList<Envase> result = ventaPrueba.getListaEnvasesUtilizados();
        assertEquals(expResult, result);
    }

    /**
     * Test of setListaEnvasesUtilizados method, of class Venta.
     */
    @Test
    public void testSetListaEnvasesUtilizados() {
        
        ArrayList<Envase> lstEnvase = new ArrayList();
        Envase e1 = new Envase();
        e1.setNroEnvase(1);
        Envase e2 = new Envase();
        e2.setNroEnvase(2);
        
        lstEnvase.add(e1);
        lstEnvase.add(e2);
    
        ventaPrueba.setListaEnvasesUtilizados(lstEnvase);
        assertEquals(ventaPrueba.getListaEnvasesUtilizados(), lstEnvase);
    }

    /**
     * Test of getListaArticulos method, of class Venta.
     */
    @Test
    public void testGetListaArticulos() {
        Articulo art1 = new Articulo();
        art1.setCodigo(1);
        ArrayList<Articulo> lstArticulos = new ArrayList();
        lstArticulos.add(art1);
        ventaPrueba.setListaArticulos(lstArticulos);
        ArrayList<Articulo> expResult = lstArticulos;
        ArrayList<Articulo> result = ventaPrueba.getListaArticulos();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetListaArticulos() {
        Articulo art1 = new Articulo();
        art1.setCodigo(1);
        ArrayList<Articulo> lstArticulos = new ArrayList();
        lstArticulos.add(art1);
        ArrayList<Articulo> expResult = lstArticulos;
        ventaPrueba.setListaArticulos(lstArticulos);
        assertEquals(expResult, ventaPrueba.getListaArticulos());
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
        Articulo artAgrego = new Articulo();
        ventaPrueba.agregarArticuloVenta(artAgrego);
        ArrayList<Articulo> lstArticulos = new ArrayList();
        lstArticulos.add(artAgrego);
        assertEquals(lstArticulos, ventaPrueba.getListaArticulos());
    }
    
    @Test
    public void testAgregarArticuloVenta2() {
        Articulo artAgrego = new Articulo();
        artAgrego.setCantidadVendidos(1);
        ventaPrueba.agregarArticuloVenta(artAgrego);
        ventaPrueba.agregarArticuloVenta(artAgrego);
        
        ArrayList<Articulo> lstArticulos = new ArrayList();
        artAgrego.setCantidadVendidos(2);
        lstArticulos.add(artAgrego);
        assertEquals(lstArticulos, ventaPrueba.getListaArticulos());
    }

    /**
     * Test of equals method, of class Venta.
     */
    @Test
    public void testEquals() {
        ArrayList<Envase> lstEnvase = new ArrayList();
        ArrayList<Articulo> lstArticulos = new ArrayList();
        Cliente cl = new Cliente();
        int nroVenta = 1212;
        Local loc = new Local();
        Date fecha = new Date();
        Venta vent = new Venta(lstEnvase, cl, lstArticulos, nroVenta, loc, fecha);
        ventaPrueba.setNroVenta(1212);
        
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
    
    @Test
    public void testCalculoHuella2() {
        ArrayList<Articulo> lstArt = new ArrayList<Articulo>();
        Articulo art = new Articulo();
        art.setCantidadVendidos(2);
        lstArt.add(art);
        int expResult = 20;
        int result = ventaPrueba.calculoHuella(lstArt);
        assertEquals(expResult, result);
    }
    
}
