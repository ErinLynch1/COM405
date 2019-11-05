/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

/**
 *
 * @author 3lynce57
 */
public class Staff {
    private String name; 
    private double annualPay;
    private int hours; 
    private int holiday;
    
    public Staff (String nameIn, double apayIn, int hoursIn, int holidayIn){
        name = nameIn;
        annualPay = apayIn; 
        hours = hoursIn; 
        holiday = holidayIn; 
    }
    
    public String getName(){
        return name; 
    }
    public double getPay(){
        return annualPay; 
    }
    public int getHours(){
        return hours; 
    }
    public int getHoliday(){
        return holiday; 
    }
    
    public String changePay(){
        if (hours == 40){
            annualPay = 60000;
            System.out.println("Your new annual pay is" + annualPay);
        }else if (hours >= 35) {
            annualPay = 50000;
            System.out.println("Your new annual pay is" + annualPay);
        }else if (hours >= 30) {
            annualPay = 40000;
            System.out.println("Your new annual pay is" + annualPay);
        }
        else if (hours >= 25) {
            annualPay = 30000;
            System.out.println("Your new annual pay is" + annualPay);
        }
        else if (hours >= 20) {
            annualPay = 25000;
            System.out.println("Your new annual pay is" + annualPay);
        }
        else if (hours >= 15) {
            annualPay = 20000;
            System.out.println("Your new annual pay is" + annualPay);
        }
        else if (hours >= 10) {
            annualPay = 15000;
            System.out.println("Your new annual pay is" + annualPay);
        }else{
            System.out.println("You do not get paided.");
        }
        return null; 
    }
    
    public int changeHours(){
        int newhours = 0; 
          if (hours >= 41){
            System.out.println("You are working too many hours. Please reduce them");
        }else if (hours >= 35) {
            newhours = hours - 5;
            System.out.println("Congrats you have been working hard. We are going to reduce your hours. Your new hours are" + newhours);
        }else if (hours >= 30) {
            newhours = hours - 2;
            System.out.println("Congrats you have been working hard. We are going to reduce your hours. Your new hours are" + newhours);
        }
        else if (hours >= 25) {
            System.out.println("Your hours are staying the same");
        }
        else if (hours >= 20) {
            newhours = hours + 2;
            System.out.println("Your hours are now increased. Your new hours are" + newhours);
        }
        else if (hours >= 15) {
            newhours = hours + 5;
            System.out.println("Your hours are now increased. Your new hours are" + newhours);
        }
        else if (hours >= 10) {
           newhours = hours + 10;
            System.out.println("Your hours are now increased. Your new hours are" + newhours);
        }else{
            System.out.println("You are not doing any hours at the moment");
        }
          return 0; 
    }
    public double viewPay(){
        System.out.println("Your current salary is" + annualPay);
        return 0; 
    }
    public int bookHoliday(){
         return 0;
    }
    public String viewAlldetails(){
        System.out.println("The following staff details are :\n" 
                +"Name:" + name + "\n"
                +"Pay:" + annualPay + "\n" 
                +"Hours:" + hours + "\n"
                +"Holiday:" + holiday + "\n");
        return null; 
    }
}
