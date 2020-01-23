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

    /*
     * Test of cs method, of class Employee.
     * Se comprueba que se esta calculando el salario final del empleado de forma correcta dando un salario normal de 300 dolares , con currrency "USD" y 0.5 de bonus , resultaado esperado:
     */
    @Test
    public void testCs() {
        System.out.println("cs");
        Employee instance = new Employee(300.0f, "USD", 0.5f, EmployeeType.Worker);
        float expResult = 364.33F;
        float result = instance.cs();
        assertEquals(expResult, result, 1);

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /*
     * Test of cs method, of class Employee.
     * Se comprueba que se esta calculando el salario final del empleado de forma correcta dando un salario normal de 300 dolares , con currrency diferente de "USD" y 0.5 de bonus , resultaado esperado:
     */
    public void testCsBonus() {
        System.out.println("cs");
        Employee instance = new Employee(300.0f, "EUR", 0.5f, EmployeeType.Worker);
        float expResult = 349.5F;
        float result = instance.cs();
        assertEquals(expResult, result, 0.1);

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /*
     * Test of cs method, of class Employee.
     * Se comprueba que se esta calculando el salario final del empleado de forma correcta dando un salario normal de 300 dolares , con currrency diferente de "USD" y 0.5 de bonus , resultaado esperado:
     */

    public void testCsSinBonus() {
        System.out.println("cs");
        Employee instance = new Employee(300.0f, "EUR", 0f, EmployeeType.Worker);
        float expResult = 364.5F;
        float result = instance.cs();
        assertEquals(expResult, result, 0.1);

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /*
     * Test of cs method, of class Employee.
     * Se comprueba que se esta calculando el salario final del empleado de forma correcta dando un salario normal de 300 dolares , con currrency de "USD" y 15 de bonus , 
     resultaado esperado para un trabajador de tipo supervisor :
     */
    public void testCsBonus_Supervisor() {
        System.out.println("cs");
        Employee instance = new Employee(300.0f, "USD", 15f, EmployeeType.Supervisor);
        float expResult = 369.0F;
        float result = instance.cs();
        assertEquals(expResult, result, 0.1);

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /*
     * Test of cs method, of class Employee.
     * Se comprueba que se esta calculando el salario final del empleado de forma correcta dando un salario normal de 300 dolares , con currrency de "USD" y 15 de bonus , 
     resultaado esperado para un trabajador de tipo manager :
     */
    public void testCsBonus_Manager() {
        System.out.println("cs");
        Employee instance = new Employee(300.0f, "USD", 15f, EmployeeType.Manager);
        float expResult = 374.5F;
        float result = instance.cs();
        assertEquals(expResult, result, 0.1);

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of CalculateYearBonus method, of class Employee. Calculo de bonus
     * anual para empleado tipo Worker
     */
    @Test
    public void testCalculateYearBonus_Worker() {
        System.out.println("CalculateYearBonus");
        Employee instance = new Employee(400.0f, "USD", 0.0f, EmployeeType.Worker);
        float expResult = 386.0f;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result, 0.00);
    }

    /**
     * Test of CalculateYearBonus method, of class Employee. Calculo del bonus
     * anual en con empleado Manager
     */
    @Test
    public void testCalculateYearBonus_Manager() {
        System.out.println("CalculateYearBonus");
        Employee instance = new Employee(400.0f, "USD", 0.0f, EmployeeType.Manager);
        float expResult = 786.0f;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result, 0.1);
    }

    /**
     * Test of CalculateYearBonus method, of class Employee. Calculo del bonus
     * anual en con empleado Manager
     */
    @Test
    public void testCalculateYearBonus_Supervisor() {
        System.out.println("CalculateYearBonus");
        Employee instance = new Employee(400.0f, "USD", 0.0f, EmployeeType.Supervisor);
        float expResult = 593.0f;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result, 0.1);
    }

    /**
     * Test of CalculateYearBonus method, of class Employee. Calculo de bonus
     * anual para empleado tipo Worker Con moneda de Euros
     */
    @Test
    public void testCalculateYearBonus_Worker_EUR() {
        System.out.println("CalculateYearBonus");
        Employee instance = new Employee(400.0f, "EUR", 0.0f, EmployeeType.Worker);
        float expResult = 386.0f;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result, 0.00);
    }

    /**
     * Test of CalculateYearBonus method, of class Employee. Calculo del bonus
     * anual en con empleado Manager Con moneda de Euros
     */
    @Test
    public void testCalculateYearBonus_Manager_EUR() {
        System.out.println("CalculateYearBonus");
        Employee instance = new Employee(400.0f, "EUR", 0.0f, EmployeeType.Manager);
        float expResult = 766.0f;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result, 0.1);
    }

    /**
     * Test of CalculateYearBonus method, of class Employee. Calculo del bonus
     * anual en con empleado Manager Con moneda de Euros
     */
    @Test
    public void testCalculateYearBonus_Supervisor_EUR() {
        System.out.println("CalculateYearBonus");
        Employee instance = new Employee(400.0f, "EUR", 0.0f, EmployeeType.Supervisor);
        float expResult = 573.0f;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result, 0.1);
    }

    /**
     * Test of CalculateYearBonus method, of class Employee. Calculo del bonus
     * anual en con empleado Worker Con moneda de Euros Con BonusPercentage
     */
    @Test
    public void testCalculateYearBonus_Worker_EUR_bonusPercentage() {
        System.out.println("CalculateYearBonus");
        Employee instance = new Employee(400.0f, "EUR", 0.2f, EmployeeType.Worker);
        float expResult = 386.0f;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result, 0.00);
    }

    /**
     * Test of CalculateYearBonus method, of class Employee. Calculo del bonus
     * anual en con empleado Manager Con moneda de Euros Con BonusPercentage
     */
    @Test
    public void testCalculateYearBonus_Manager_EUR_bonusPercentage() {
        System.out.println("CalculateYearBonus");
        Employee instance = new Employee(400.0f, "EUR", 0.3f, EmployeeType.Manager);
        float expResult = 766.0f;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result, 0.1);
    }

    /**
     * Test of CalculateYearBonus method, of class Employee. Calculo del bonus
     * anual en con empleado Manager Con moneda de Euros Con BonusPercentage
     */
    @Test
    public void testCalculateYearBonus_Supervisor_EUR_bonusPercentage() {
        System.out.println("CalculateYearBonus");
        Employee instance = new Employee(400.0f, "EUR", 0.40f, EmployeeType.Supervisor);
        float expResult = 573.0f;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result, 0.1);
    }
}
