/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import dominio.Articulo;
import dominio.Envase;
import java.util.ArrayList;
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
public class ArticuloTest {
    
    private Articulo articuloPrueba;
 
    
    public ArticuloTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        //CREO LOS ATRIBUTOS Y SE LOS SETEO
        articuloPrueba = new Articulo();
        
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCantidadVendidos method, of class Articulo.
     */
    @Test
    public void testGetCantidadVendidos() {
        int expResult = 3;
        articuloPrueba.setCantidadVendidos(expResult);
        int result = articuloPrueba.getCantidadVendidos();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCantidadVendidos method, of class Articulo.
     */
    @Test
    public void testSetCantidadVendidos() {
        int expResult = 5;
        articuloPrueba.setCantidadVendidos(expResult);
        assertEquals(expResult, articuloPrueba.getCantidadVendidos());
    }

    /**
     * Test of getListaEnvases method, of class Articulo.
     */
    @Test
    public void testGetListaEnvases() {
        ArrayList<Envase> lst=new ArrayList<>();
        Envase e=new Envase(1,"nombre","material");
        lst.add(e);
        articuloPrueba.setListaEnvases(lst);
        ArrayList<Envase> expResult = lst;
        ArrayList<Envase> result = articuloPrueba.getListaEnvases();
        assertEquals(expResult, result);
    }
    
     @Test
    public void testSetListaEnvases() {
        ArrayList<Envase> lst = new ArrayList();
        
        Envase e1 = new Envase(2,"nom","mat");
        Envase e2 = new Envase(3,"nomb","mate");
        Envase e3 = new Envase(3,"nombr","mate");
        
        lst.add(e1);
        lst.add(e2);
        lst.add(e3);
        
        
        articuloPrueba.setListaEnvases(lst);
        assertEquals(lst, articuloPrueba.getListaEnvases());
    }

    /**
     * Test of getNombre method, of class Articulo.
     */
    @Test
    public void testGetNombre() {
        String expResult = "Mani";
        articuloPrueba.setNombre("Mani");
        String result = articuloPrueba.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNombre method, of class Articulo.
     */
    @Test
    public void testSetNombre() {
        String nombre = "Prueba";
        articuloPrueba.setNombre(nombre);
        assertEquals(nombre, articuloPrueba.getNombre());
    }

    /**
     * Test of getCodigo method, of class Articulo.
     */
    @Test
    public void testGetCodigo() {
       int expResult = 2;
       articuloPrueba.setCodigo(expResult);
       int result = articuloPrueba.getCodigo();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPrecio method, of class Articulo.
     */
    @Test
    public void testGetPrecio() {
       int expResult = 2;
       articuloPrueba.setPrecio(expResult);
       int result = articuloPrueba.getPrecio();
        assertEquals(expResult, result);
    }

    /**
     * Test of getOrigen method, of class Articulo.
     */
    @Test
    public void testGetOrigen() {
       String expResult = "origenprueba";
       articuloPrueba.setOrigen(expResult);
       String result = articuloPrueba.getOrigen();
       assertEquals(expResult, result);
    }

    /**
     * Test of getMaterial method, of class Articulo.
     */
    @Test
    public void testGetMaterial() {
       String expResult = "Materialprueba";
       articuloPrueba.setMaterial(expResult);
       String result = articuloPrueba.getMaterial();
       assertEquals(expResult, result);
    }

    /**
     * Test of setCodigo method, of class Articulo.
     */
    @Test
    public void testSetCodigo() {
        int expResult = 4;
        articuloPrueba.setCodigo(expResult);
        assertEquals(expResult, articuloPrueba.getCodigo());
    }

    /**
     * Test of setPrecio method, of class Articulo.
     */
    @Test
    public void testSetPrecio() {
       int expResult = 3;
       articuloPrueba.setPrecio(expResult);
       assertEquals(expResult, articuloPrueba.getPrecio());
    }

    /**
     * Test of setOrigen method, of class Articulo.
     */
    @Test
    public void testSetOrigen() {
        String expResult = "pruebaorigen";
        articuloPrueba.setOrigen(expResult);
        assertEquals(expResult, articuloPrueba.getOrigen());
    }

    /**
     * Test of setMaterial method, of class Articulo.
     */
    @Test
    public void testSetMaterial() {
        String expResult = "pruebaMaterial";
        articuloPrueba.setMaterial(expResult);
        assertEquals(expResult, articuloPrueba.getMaterial());
    }

    /**
     * Test of equals method, of class Articulo.
     */
    @Test
    public void testEquals() {
        Articulo art = new Articulo();
        articuloPrueba.setCodigo(1212);
        art.setCodigo(1212);
        boolean expResult = true;
        boolean result = articuloPrueba.equals(art);
        assertEquals(expResult, result);
    }
    @Test
    public void testEquals2() {
        Articulo art = new Articulo();
        articuloPrueba.setCodigo(1212);
        art.setCodigo(1234);
        boolean expResult = false;
        boolean result = articuloPrueba.equals(art);
        assertEquals(expResult, result);
    }
    

    /**
     * Test of compareTo method, of class Articulo.
     */
    @Test
    public void testCompareTo() {
        Articulo art = new Articulo();
        art.setCantidadVendidos(3);
        articuloPrueba.setCantidadVendidos(3);
        int expResult = 0;
        int result = art.compareTo(articuloPrueba);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Articulo.
     */
    @Test
    public void testToString() {
        articuloPrueba.setNombre("Pruebanombre");
        String expResult = "Pruebanombre";
        String result = articuloPrueba.toString();
        assertEquals(expResult, result);
    }
    
}
