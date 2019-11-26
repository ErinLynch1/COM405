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
public abstract class Vehicle {
    
    protected String regnum;
    protected int weight; 
    
    public Vehicle (String regnumIn, int weightIn){
        regnum = regnumIn; 
        weight = weightIn; 
    }
    
    public String getregnum (){
        return regnum; 
    }
    
    public int getWeight(){
        return weight; 
    }
    
    public abstract double Calculatefee();

}
