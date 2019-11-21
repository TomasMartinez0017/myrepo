/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio2ingsoftware;

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
    
    Articulo articuloPrueba;
    
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
        int result = articuloPrueba.getCantidadVendidos();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCantidadVendidos method, of class Articulo.
     */
    @Test
    public void testSetCantidadVendidos() {
        System.out.println("setCantidadVendidos");
        int cantidadVendidos = 0;
        Articulo instance = new Articulo();
        instance.setCantidadVendidos(cantidadVendidos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        System.out.println("getCodigo");
        Articulo instance = new Articulo();
        int expResult = 0;
        int result = instance.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecio method, of class Articulo.
     */
    @Test
    public void testGetPrecio() {
        System.out.println("getPrecio");
        Articulo instance = new Articulo();
        int expResult = 0;
        int result = instance.getPrecio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrigen method, of class Articulo.
     */
    @Test
    public void testGetOrigen() {
        System.out.println("getOrigen");
        Articulo instance = new Articulo();
        String expResult = "";
        String result = instance.getOrigen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaterial method, of class Articulo.
     */
    @Test
    public void testGetMaterial() {
        System.out.println("getMaterial");
        Articulo instance = new Articulo();
        String expResult = "";
        String result = instance.getMaterial();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class Articulo.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        int unCodigo = 0;
        Articulo instance = new Articulo();
        instance.setCodigo(unCodigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecio method, of class Articulo.
     */
    @Test
    public void testSetPrecio() {
        System.out.println("setPrecio");
        int unPrecio = 0;
        Articulo instance = new Articulo();
        instance.setPrecio(unPrecio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOrigen method, of class Articulo.
     */
    @Test
    public void testSetOrigen() {
        System.out.println("setOrigen");
        String unOrigen = "";
        Articulo instance = new Articulo();
        instance.setOrigen(unOrigen);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaterial method, of class Articulo.
     */
    @Test
    public void testSetMaterial() {
        System.out.println("setMaterial");
        String unMaterial = "";
        Articulo instance = new Articulo();
        instance.setMaterial(unMaterial);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Articulo.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object objeto = null;
        Articulo instance = new Articulo();
        boolean expResult = false;
        boolean result = instance.equals(objeto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Articulo.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Articulo unArticulo = null;
        Articulo instance = new Articulo();
        int expResult = 0;
        int result = instance.compareTo(unArticulo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Articulo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Articulo instance = new Articulo();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
