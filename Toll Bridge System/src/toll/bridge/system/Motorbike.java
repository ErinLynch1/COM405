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
public class Motorbike extends Vehicle{
    
    public Motorbike(String regnumIn,int weightIn){
        super(regnumIn,weightIn);
    }
    
    @Override
    public double Calculatefee(){
       double fee;  
       fee = 3.00; 
       return fee;
    }
}
