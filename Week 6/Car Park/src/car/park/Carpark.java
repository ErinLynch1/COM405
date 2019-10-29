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
public class Carpark {
    
    private Car [] Carinto; 
    
    public Carpark(){
        
       Carinto = new Car [15];
    }
    
    public boolean addCar (Car carIn){
        for (int i = 0; i < Carinto.length;i++){
            if (Carinto[i] == null){
                Carinto[i] = carIn;
                return true;
            }
        }
        return false; 
    }
    
        public boolean removeCar (String regnum){
        for (int i = 0; i < Carinto.length;i++){
            if (Carinto[i] != null){
              String carID = Carinto[i].getRegnum();
                if (carID.equals(regnum)){
                    Carinto[i] = null;
                    return true;   
                }
            }
        }
        return false; 
    }
        
    public Car getPassenger(int id){
        for (int i = 0; i < Carinto.length;i++){
            if (Carinto[i] != null){
              int passID = Carinto[i].getId();
                if (passID == id){                  
                   return Carinto[i];  
                }
            }
        }
        return null; 
    }   
        
     public String toString() {
         String ret = ""; 
         
         for (int i= 0; i<Carinto.length;i++){
            ret = ret + "Car Space" + i + "\n";
            
            if (Carinto[i]!= null )
            {
                ret = ret+ "Car ID :" + Carinto[i].getId() + "\n" + 
                            "Car Regnum:" + Carinto[i].getRegnum() + "\n";
            }else{
                ret = ret + "This Space is Empty\n";       
            } 
         }return ret; 
    }
     
     /*Retrieve the number of passengers on the bus.*/
            public int NumSpaces(){
                int tally = 0; 
        /*if seat is not null then system print out the total number of passengers on this bus are the total array - the number of seats that are not null*/
        for (Car Carinto1 : Carinto) {
            if (Carinto1 != null) {
                tally++;
            }
        }
             return tally;
            }
            
            public int RemainSpaces(){
                int tally = 15; 
        /*if seat is not null then system print out the total number of passengers on this bus are the total array - the number of seats that are not null*/
        for (Car Carinto1 : Carinto) {
            if (Carinto1 != null) {
                tally--;
            }
        }
             return tally;
            }
    
}
