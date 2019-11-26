/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toll.bridge.system;

/**
 *
 * @author 3lynce57
 */
public class Car extends Vehicle{
    
    public Car(String regnumIn,int weightIn){
        super(regnumIn,weightIn);
    }
    
    @Override
    public double Calculatefee(){
       double fee = 0;  
       if (weight <= 1590){
           fee = 5.00; 
       }else if (weight > 1590){
            fee = 5.00 + 0.10; 
       }
        return fee;
    }
}
