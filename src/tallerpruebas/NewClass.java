/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpruebas;

/**
 *
 * @author Henry
 */
public class NewClass {

    public static void main(String[] args) {
        Employee instance = new Employee(400.0f,"USD", 0.0f, EmployeeType.Manager);
        
        System.out.println(instance.CalculateYearBonus());
        
    }
}
