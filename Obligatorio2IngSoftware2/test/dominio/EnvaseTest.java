/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tomasmartinez
 */
public class EnvaseTest {
    
    Envase envasePrueba = new Envase();
    
    public EnvaseTest() {
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
     * Test of getNombre method, of class Envase.
     */
    @Test
    public void testGetNombre() {
        envasePrueba.setNombre("Botella");
        String expResult = "Botella";
        String result = envasePrueba.getNombre();
        assertEquals(expResult, result);

    }

    /**
     * Test of getMaterial method, of class Envase.
     */
    @Test
    public void testGetMaterial() {
        envasePrueba.setMaterial("Metal");
        String expResult = "Metal";
        String result = envasePrueba.getMaterial();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setNombre method, of class Envase.
     */
    @Test
    public void testSetNombre() {
        String unNombre = "Tupper";
        envasePrueba.setNombre(unNombre);
        assertEquals(unNombre, envasePrueba.getNombre());

    }

    /**
     * Test of setMaterial method, of class Envase.
     */
    @Test
    public void testSetMaterial() {
        String unMaterial = "Vidrio";
        envasePrueba.setMaterial(unMaterial);
        assertEquals(unMaterial, envasePrueba.getMaterial());
    }

    /**
     * Test of getNroEnvase method, of class Envase.
     */
    @Test
    public void testGetNroEnvase() {
        envasePrueba.setNroEnvase(1);
        int expResult = 1;
        int result = envasePrueba.getNroEnvase();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNroEnvase method, of class Envase.
     */
    @Test
    public void testSetNroEnvase() {
        
        int nroEnvase = 2;
        envasePrueba.setNroEnvase(nroEnvase);
        assertEquals(nroEnvase, envasePrueba.getNroEnvase());
    }

    /**
     * Test of equals method, of class Envase.
     */
    @Test
    public void testEquals() {
        Envase envasePrueba2 = new Envase();
        envasePrueba2.setNroEnvase(1);
        envasePrueba.setNroEnvase(1);
        boolean expResult = true;
        boolean result = envasePrueba.equals(envasePrueba2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEquals2() {
        Envase envasePrueba2 = new Envase();
        envasePrueba2.setNroEnvase(2);
        envasePrueba.setNroEnvase(1);
        boolean expResult = false;
        boolean result = envasePrueba.equals(envasePrueba2);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Envase.
     */
    @Test
    public void testToString() {
        envasePrueba.setNombre("Caja");
        String expResult = "Caja";
        String result = envasePrueba.toString();
        assertEquals(expResult, result);
    }
    
}



