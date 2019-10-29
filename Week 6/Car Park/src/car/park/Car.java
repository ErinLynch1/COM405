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
public class Car {
    private String regnum;
    private int id;
    
    public Car (int idIn, String regnumIn){
        
        id = idIn; 
        regnum= regnumIn;    
    }
    
    public int getId (){
        return id; 
    }
    public String getRegnum (){
        return regnum; 
    }       
}
