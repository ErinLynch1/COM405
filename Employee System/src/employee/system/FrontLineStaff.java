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
public class FrontLineStaff extends Employee{
  
    public FrontLineStaff(String nameIn, double payIn, int hoursIn, int holidayIn){
   
        super (nameIn,payIn,hoursIn,holidayIn);
    }
    
    @Override
    public double viewSalary(){
        System.out.println("Your yearly salary is " + pay * 52);
        return pay;      
    }
        
}