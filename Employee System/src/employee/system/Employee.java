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
public abstract class Employee {
    protected String name; 
    protected double pay; 
    protected int hours;
    protected int holiday; 
    
    public Employee (String nameIn, double payIn, int hoursIn, int holidayIn){
        name = nameIn;
        pay = payIn; 
        hours = hoursIn; 
        holiday = holidayIn; 
    }
    
    public String getName(){
        return name; 
    }
    public double getPay(){
        return pay; 
    }
    public double getHours(){
        return hours; 
    }
    public int getHoliday(){
        return holiday;
    }
          
    public double changePay(){
        double newPay= 0; 
        if (hours > 40) {
            System.out.println("You are working too many hours, so your pay will not increase");
        }else if (hours >= 35){
            System.out.println("You are working the right amount of hours. Your pay will now increase " + newPay);
            newPay = pay + (pay/5); 
        }else if (hours >= 30){
            System.out.println("You have worked well. Your pay will now increase to " + newPay);
            newPay = pay + (pay/10); 
        }else if(hours >= 25){
            System.out.println("You have worked well. Your pay will now increase to " + newPay);
            newPay = pay + (pay/15); 
        }
        else if(hours >= 20){
            newPay = pay + (pay/10); 
            System.out.println("You have worked well. Your pay will now increase to " + newPay);
        }
        else if(hours >= 15){
            System.out.println("You have worked well. Your pay will now increase to " + newPay);
            newPay = pay + (pay/5); 
        }
        else if(hours >= 10){
            System.out.println("You have worked well. Your pay will now increase to " + newPay);
            newPay = pay + (pay/2.5); 
        }else if(hours < 10){
            System.out.println("You are not working enough hours, so your pay will not change");
        }return pay;
    }
    public int changeHours(){
        int newhours = 0; 
        if (hours > 40) {
            System.out.println("You need to reduce your hours as you are working too many");
        }else if (hours >= 35){
            System.out.println("You are working the right amount of hours. They will not change");
        }else if (hours >= 30){
            System.out.println("We are going to increase your hours by 5.Your new hours are " + newhours);
            newhours = hours + 5; 
        }else if(hours >= 25){
            System.out.println("We are going to increase your hours by 10.Your new hours are " + newhours);
            newhours = hours + 10; 
        }
        else if(hours >= 20){
            System.out.println("We are going to increase your hours by 15.Your new hours are " + newhours);
            newhours = hours + 15; 
        }
        else if(hours >= 15){
            System.out.println("We are going to increase your hours by 10.Your new hours are " + newhours);
            newhours = hours + 10; 
        }
        else if(hours >= 10){
            System.out.println("We are going to increase your hours by 5.Your new hours are " + newhours);
            newhours = hours + 5; 
        }else if(hours < 10){
            System.out.println("You are not working enough hours, so you no longer work for us");
        }return hours; 
    }
    public double viewSalary(){
        {
        System.out.println("Your yearly salary is" + pay);
        }return pay; 
    }
    public int bookHoliday(){
        boolean bookHoliday = true;
        
        if (bookHoliday){
            holiday--;  
        }return holiday;
    }
    public String employeeDetails(){
        System.out.println("Name: " + name + "\n"
                            + "Hours: " + hours + "\n"
                            + "Pay: " + pay + "\n"
                            + "Holiday: " + holiday + "\n");
        
        return null;
   }
}
