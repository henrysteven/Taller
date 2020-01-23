/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpruebas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Henry
 */
public class EmployeeTest {
    
    public EmployeeTest() {
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
     * Test of cs method, of class Employee.
     */
    @Test
    public void testCs() {
        System.out.println("cs");
        Employee instance = new Employee(0, "USD", 0, EmployeeType.Worker);
        float expResult = 64.33F;
        float result = instance.cs();
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of CalculateYearBonus method, of class Employee.
     * Calculo de bonus anual para empleado tipo Worker
     */
    @Test
    public void testCalculateYearBonus_Worker() {
        System.out.println("CalculateYearBonus");
        Employee instance = new Employee(400.0f,"USD", 0.0f, EmployeeType.Worker);
        float expResult = 386.0f;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result, 0.00);
    }
    
    /**
     * Test of CalculateYearBonus method, of class Employee.
     * Calculo del bonus anual en con empleado Manager
     */
    @Test
    public void testCalculateYearBonus_Manager() {
        System.out.println("CalculateYearBonus");
        Employee instance = new Employee(400.0f,"USD", 0.0f, EmployeeType.Manager);
        float expResult = 786.0f;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result, 0.1);
    }
    
    /**
     * Test of CalculateYearBonus method, of class Employee.
     * Calculo del bonus anual en con empleado Manager
     */
    @Test
    public void testCalculateYearBonus_Supervisor() {
        System.out.println("CalculateYearBonus");
        Employee instance = new Employee(400.0f,"USD", 0.0f, EmployeeType.Supervisor);
        float expResult = 593.0f;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result, 0.1);
    }
    
    /**
     * Test of CalculateYearBonus method, of class Employee.
     * Calculo de bonus anual para empleado tipo Worker
     * Con moneda de Euros
     */
    @Test
    public void testCalculateYearBonus_Worker_EUR() {
        System.out.println("CalculateYearBonus");
        Employee instance = new Employee(400.0f,"EUR", 0.0f, EmployeeType.Worker);
        float expResult = 386.0f;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result, 0.00);
    }
    
    /**
     * Test of CalculateYearBonus method, of class Employee.
     * Calculo del bonus anual en con empleado Manager
     * Con moneda de Euros
     */
    @Test
    public void testCalculateYearBonus_Manager_EUR() {
        System.out.println("CalculateYearBonus");
        Employee instance = new Employee(400.0f,"EUR", 0.0f, EmployeeType.Manager);
        float expResult = 766.0f;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result, 0.1);
    }
    
    /**
     * Test of CalculateYearBonus method, of class Employee.
     * Calculo del bonus anual en con empleado Manager
     * Con moneda de Euros
     */
    @Test
    public void testCalculateYearBonus_Supervisor_EUR() {
        System.out.println("CalculateYearBonus");
        Employee instance = new Employee(400.0f,"EUR", 0.0f, EmployeeType.Supervisor);
        float expResult = 573.0f;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result, 0.1);
    }
    
    @Test
    public void testCalculateYearBonus_Worker_EUR_bonusPercentage() {
        System.out.println("CalculateYearBonus");
        Employee instance = new Employee(400.0f,"EUR", 0.2f, EmployeeType.Worker);
        float expResult = 386.0f;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result, 0.00);
    }
    
    /**
     * Test of CalculateYearBonus method, of class Employee.
     * Calculo del bonus anual en con empleado Manager
     * Con moneda de Euros
     */
    @Test
    public void testCalculateYearBonus_Manager_EUR_bonusPercentage() {
        System.out.println("CalculateYearBonus");
        Employee instance = new Employee(400.0f,"EUR", 0.3f, EmployeeType.Manager);
        float expResult = 766.0f;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result, 0.1);
    }
    
    /**
     * Test of CalculateYearBonus method, of class Employee.
     * Calculo del bonus anual en con empleado Manager
     * Con moneda de Euros
     */
    @Test
    public void testCalculateYearBonus_Supervisor_EUR_bonusPercentage() {
        System.out.println("CalculateYearBonus");
        Employee instance = new Employee(400.0f,"EUR", 0.40f, EmployeeType.Supervisor);
        float expResult = 573.0f;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result, 0.1);
    }
}
