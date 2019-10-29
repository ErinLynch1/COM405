/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car.park;

/**
 *
 * @author 3lynce57
 */

import java.util.Scanner;

public class MainMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Carpark CP = new Carpark (); 
        int state = 1;
        Scanner scanIn = new Scanner(System.in);
        while (state == 1) {
            System.out.println("Please enter the letter which corresponds with your choice:\n"
                    + "A – Add a car\n"
                    + "B – Remove a car\n"
                    + "C – View number of available spaces\n"
                    + "X - Exit Program");

            String input = scanIn.nextLine();

            if ("a".equals(input)) {
                System.out.println("Please enter the registration number to add: ");
                String regnum = null; 
                regnum = scanIn.nextLine();
                if (CP.addCar(new Car(1,regnum))){
                System.out.println("The car with the reg " + regnum + " has been added to the car park");
                }else{
                System.out.println("the bus is full");
                } 
            } else if ("b".equals(input)) {
                System.out.println("Please enter the registration number to remove: ");
                String regnum = null; 
                regnum = scanIn.nextLine();
                if (CP.removeCar(regnum)){
                System.out.println("The car with the reg " + regnum + " has been remove to the car park");
                }else{
                System.out.println("The car is not in the car park");
                } 
                System.out.println("The car with the reg " + regnum + " has been remove to the car park"); 
                } else if ("c".equals(input)) {
                System.out.println("The number of spaces available are" + CP.NumSpaces());
                } else if ("x".equals(input)) {
                state=0;
                System.out.println("You have exited the program");
                }

        }
        scanIn.close();
    }
    
}
