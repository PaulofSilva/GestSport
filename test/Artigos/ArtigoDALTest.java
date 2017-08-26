/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Artigos;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paulo Silva
 */
public class ArtigoDALTest
{
    
    public ArtigoDALTest()
    {
    }

    @BeforeClass
    public static void setUpClass() throws Exception
    {
    }

    @AfterClass
    public static void tearDownClass() throws Exception
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of Insert method, of class ArtigoDAL.
     */
    @Test
    public void testInsert()
    {
        System.out.println("Insert");
        Artigo st = null;
        ArtigoDAL instance = new ArtigoDAL();
        boolean expResult = false;
        boolean result = instance.Insert(st);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Update method, of class ArtigoDAL.
     */
    @Test
    public void testUpdate()
    {
        System.out.println("Update");
        Artigo st = null;
        ArtigoDAL instance = new ArtigoDAL();
        boolean expResult = false;
        boolean result = instance.Update(st);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Delete method, of class ArtigoDAL.
     */
    @Test
    public void testDelete()
    {
        System.out.println("Delete");
        String codartigo = "";
        ArtigoDAL instance = new ArtigoDAL();
        boolean expResult = false;
        boolean result = instance.Delete(codartigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SelectAll method, of class ArtigoDAL.
     */
    @Test
    public void testSelectAll()
    {
        System.out.println("SelectAll");
        ArtigoDAL instance = new ArtigoDAL();
        ArrayList expResult = null;
        ArrayList result = instance.SelectAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchByNome method, of class ArtigoDAL.
     */
    @Test
    public void testSearchByNome()
    {
        System.out.println("searchByNome");
        String Field = "";
        String Nome = "";
        ArtigoDAL instance = new ArtigoDAL();
        ArrayList expResult = null;
        ArrayList result = instance.searchByNome(Field, Nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
