/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio2ingsoftware;

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
    private ArrayList<Envase> lstEnvases;
    
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
        lstEnvases=new ArrayList<>();
        
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
        System.out.println("getListaEnvases");
        Articulo instance = new Articulo();
        ArrayList<Envase> expResult = null;
        ArrayList<Envase> result = instance.getListaEnvases();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
