/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio2ingsoftware;

import dominio.Local;
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
public class LocalTest {
    Local localPrueba=new Local();
    
    public LocalTest() {
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
     * Test of getDireccion method, of class Local.
     */
    @Test
    public void testGetDireccion() {
        String expResult = "direccion";
        localPrueba.setDireccion("direccion");
        String result = localPrueba.getDireccion();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDireccion method, of class Local.
     */
    @Test
    public void testSetDireccion() {
        String direccion = "Pruebadireccion";
        localPrueba.setDireccion(direccion);
        assertEquals(direccion, localPrueba.getDireccion());
    }

    /**
     * Test of getNroLocal method, of class Local.
     */
    @Test
    public void testGetNroLocal() {
        int expResult = 3;
        localPrueba.setNroLocal(3);
        int result = localPrueba.getNroLocal();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNroLocal method, of class Local.
     */
    @Test
    public void testSetNroLocal() {
        int nrolocal = 3;
        localPrueba.setNroLocal(nrolocal);
        assertEquals(nrolocal, localPrueba.getNroLocal());
    }

    /**
     * Test of equals method, of class Local.
     */
    @Test
    public void testEquals() {
        Local loc = new Local();
        localPrueba.setNroLocal(12);
        loc.setNroLocal(12);
        boolean expResult = true;
        boolean result = localPrueba.equals(loc);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Local.
     */
    @Test
    public void testToString() {
        localPrueba.setDireccion("direccionPrueba");
        localPrueba.setNroLocal(3);
        String expResult = "EcoShop: 3 Direccion: direccionPrueba";
        String result = localPrueba.toString();
        assertEquals(expResult, result);
    }
    
}
