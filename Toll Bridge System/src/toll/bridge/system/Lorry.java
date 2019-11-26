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
public class Lorry extends Vehicle {
    
    public Lorry(String regnumIn,int weightIn){
        super(regnumIn,weightIn);
    }
    
    @Override
    public double Calculatefee(){
       double fee;  
       if (weight > 8000){
           fee = 15.00;
       }else{
          fee = 10.00;
       }
       return fee; 
    }

}
