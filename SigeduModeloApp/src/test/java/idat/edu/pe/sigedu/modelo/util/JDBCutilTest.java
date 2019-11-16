/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idat.edu.pe.sigedu.modelo.util;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrador
 */
public class JDBCutilTest {
    
    JDBCUtil jdbc;
    
    public JDBCutilTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        jdbc = new JDBCUtil ();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        assertNotNull(jdbc.getConnecion());
        
    }
    
}
