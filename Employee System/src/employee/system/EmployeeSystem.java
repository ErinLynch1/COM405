/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.system;

/**
 *
 * @author 3lynce57
 */
public class EmployeeSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FrontLineStaff f1 = new FrontLineStaff("A",200,22,21); 
        AdminStaff A1 = new AdminStaff("B",21000,32,35,"C");
        Managers M1 = new Managers("C",40000,38,40); 
        
        System.out.println(f1.getPay());
        
        f1.changePay();
        
        System.out.println(f1.viewSalary());
        System.out.println(A1.employeeDetails());
        System.out.println(M1.employeeDetails());
    }
    
}
