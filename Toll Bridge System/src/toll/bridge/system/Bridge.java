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
public class Bridge {
    private int totalweight; 
    Vehicle[] Vehiclelist = new  Vehicle[20];
    
    public int calcTotalWeight(){
    for (int i = 0; i < Vehiclelist.length;i++){
           totalweight = Vehiclelist[i].getWeight(); 
    } return totalweight;         
    }
    
    public boolean addVehicle(Vehicle vehicleIn){
       for (int i = 0; i < Vehiclelist.length;i++){
        if (Vehiclelist[i] == null){
            if (totalweight < 30000){
                Vehiclelist[i] = vehicleIn;
                System.out.println("The vehicle " + Vehiclelist[i].getregnum() + "can access the bridge");
            }else{
                System.out.println("The vehicle " + Vehiclelist[i].getregnum() + "cannot access the bridge as he weight is too high");
            }   
    }
   } return false;
  }
    public boolean removeVehicle(String regnum){
        for (int i = 0; i < Vehiclelist.length;i++){
        if (Vehiclelist[i] != null){
               if (Vehiclelist[i].getregnum().equals(regnum)){
                Vehiclelist[i] = null;
                System.out.println("The vehicle " + Vehiclelist[i].getregnum() + "has been removed");
            }else{
                System.out.println("The vehicle is not in here");
            }   
    }
   }return false;
  }
}
