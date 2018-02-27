/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg10;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author perezda
 */
public class CalculadoraVisualTest {
    
    public CalculadoraVisualTest() {
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
     * Test of main method, of class CalculadoraVisual.
     */

    
    @Test
    public void testverificaDecimales() {
        System.out.println("verifica decimales");
        String analizar="1.4.5+4";
        int longitud= 7;
        CalculadoraVisual instance = new CalculadoraVisual();
        boolean expResult= false;
        boolean result= instance.verificaDecimales(analizar,longitud);
        assertEquals(expResult,result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testverificaParentesis() {
        System.out.println("verifica paréntesis");
        String [] analizar = {"(","(",")"};
        int longitud= analizar.length;
        CalculadoraVisual instance = new CalculadoraVisual();
        boolean expResult= false;
        boolean result= instance.verificaParentesis(analizar,longitud);
        assertEquals(expResult,result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        fail("The test case is a prototype.");
    }
    
        @Test
    public void testverificaOperadoresRepetidos() {
        System.out.println("verifica operadores repetidos");
        String [] analizar = {"+","3"};
        int longitud= analizar.length;
        CalculadoraVisual instance = new CalculadoraVisual();
        boolean expResult= false;
        boolean result= instance.verificaOperadoresRepetidos(analizar,longitud);
        assertEquals(expResult,result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult)
        fail("The test case is a prototype.");
    }

    
}
