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
public class AdminStaff extends Employee {
    
        protected String Manager;
        
     public AdminStaff(String nameIn, double payIn, int hoursIn, int holidayIn, String ManagerIn){
   
        super (nameIn,payIn,hoursIn,holidayIn);
        Manager = ManagerIn;    
    }
     
     public String getManager(){
         return Manager; 
     }
     
        @Override
     public String employeeDetails(){
            System.out.println("Name: " + name + "\n"
                            + "Hours: " + hours + "\n"
                            + "Pay: " + pay + "\n"
                            + "Holiday: " + holiday + "\n"
                            + "Manager: " + Manager);
        return Manager;
    }
}
