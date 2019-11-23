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


public class ClienteTest {
    
    Cliente clientePrueba = new Cliente();
    
    public ClienteTest() {
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
     * Test of getNombre method, of class Cliente.
     */
    @Test
    public void testGetNombre() {
        String expResult = "Tomas";
        clientePrueba.setNombre("Tomas");
        String result = clientePrueba.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCedula method, of class Cliente.
     */
    @Test
    public void testGetCedula() {
        int expResult = 51308435;
        clientePrueba.setCedula(51308435);
        int result = clientePrueba.getCedula();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDireccion method, of class Cliente.
     */
    @Test
    public void testGetDireccion() {
        String expResult = "Miguel Barreiro 3317 901";
        clientePrueba.setDireccion("Miguel Barreiro 3317 901");
        String result = clientePrueba.getDireccion();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNombre method, of class Cliente.
     */
    @Test
    public void testSetNombre() {
        String nombre = "Javier";
        clientePrueba.setNombre(nombre);
        assertEquals(nombre, clientePrueba.getNombre());
    }

    /**
     * Test of setCedula method, of class Cliente.
     */
    @Test
    public void testSetCedula() {
        int cedula = 12345678;
        clientePrueba.setCedula(cedula);
        assertEquals(cedula, clientePrueba.getCedula());
    }

    /**
     * Test of setDireccion method, of class Cliente.
     */
    @Test
    public void testSetDireccion() {
        String unaDireccion = "Luis de la Torre 876";
        clientePrueba.setDireccion(unaDireccion);
        assertEquals(unaDireccion, clientePrueba.getDireccion());
    }

    /**
     * Test of equals method, of class Cliente.
     */
    @Test
    public void testEquals() {
        clientePrueba.setCedula(12345678);
        Cliente cliente2 = new Cliente();
        cliente2.setCedula(12345678);
        boolean expResult = true;
        boolean result = clientePrueba.equals(cliente2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEquals2() {
        clientePrueba.setCedula(12345678);
        Cliente cliente2 = new Cliente();
        cliente2.setCedula(51308435);
        boolean expResult = false;
        boolean result = clientePrueba.equals(cliente2);
        assertEquals(expResult, result);
    }

    /**
     * Test of compareTo method, of class Cliente.
     */
    @Test
    public void testCompareTo() {
        clientePrueba.setNombre("Agustin");
        Cliente unCliente = new Cliente();
        unCliente.setNombre("Agustin");
        int expResult = 0;
        int result = clientePrueba.compareTo(unCliente);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCompareToMayor() {
        clientePrueba.setNombre("Agustin");
        Cliente unCliente = new Cliente();
        unCliente.setNombre("Santiago");
        int expResult = -18;
        int result = clientePrueba.compareTo(unCliente);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCompareToMenor() {
        clientePrueba.setNombre("Santiago");
        Cliente unCliente = new Cliente();
        unCliente.setNombre("Agustin");
        int expResult = 18;
        int result = clientePrueba.compareTo(unCliente);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Cliente.
     */
    @Test
    public void testToString() {
        clientePrueba.setNombre("Tomas");
        String expResult = "Nombre: Tomas";
        String result = clientePrueba.toString();
        assertEquals(expResult, result);
    }
    
}



