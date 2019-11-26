/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toll.bridge.system;

import java.awt.event.ActionEvent;

/**
 *
 * @author 3lynce57
 */
public class TollBridgeSystem {
    private Bridge Bridge;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mainscreen gui = new Mainscreen(); 
        gui.pack();
        gui.setVisible(true); 
        
        Bridge = new Bridge(); 
    }
    
    public void actionPreformed (ActionEvent ev){
        
    }
    
}
