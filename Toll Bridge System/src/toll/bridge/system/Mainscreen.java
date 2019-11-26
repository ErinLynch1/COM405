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

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JFrame; 
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Mainscreen extends JFrame {
    private GridBagConstraints constraints; 
    private JLabel lblTitle; 
    private JLabel lblRegnum; 
    private JLabel lblWeight; 
    private JLabel lblConfirmation;
    private JLabel lblFee; 
    
    private JTextField txtRegnum; 
    private JTextField txtWeight; 
    
    private JButton btnAdd; 
    private JButton btnRemove; 
    
    public Mainscreen(){
        constraints = new GridBagConstraints(); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridBagLayout());
        
        initComponents();
        
        layoutComponents();
    }
    
    public void initComponents(){
        
        lblTitle = new JLabel ("Toll Bridge"); 
        
        lblRegnum = new JLabel ("Registration"); 
        txtRegnum = new JTextField();

        lblWeight = new JLabel ("Weight"); 
        txtWeight = new JTextField(); 
        
        btnAdd = new JButton ("Add"); 
        btnRemove = new JButton ("Remove");
        
        lblConfirmation = new JLabel("You have been added");
        lblFee = new JLabel ("Fee = £5.00"); 

    }
    
    public void layoutComponents(){
          constraints.gridy = 0;
          constraints.gridx = 0; 
          constraints.gridwidth = 3; 
          this.add(lblTitle, constraints); 
          
          constraints.gridy = 2;
          constraints.gridx = 0; 
          constraints.gridwidth = 1; 
          this.add(lblRegnum, constraints);
          
          constraints.gridx = 2; 
          constraints.fill = GridBagConstraints.HORIZONTAL;
          this.add(txtRegnum, constraints);
          
          constraints.gridy = 3;
          constraints.gridx = 0; 
          constraints.gridwidth = 1; 
          this.add(lblWeight, constraints);
          
          constraints.gridx = 2; 
          constraints.fill = GridBagConstraints.HORIZONTAL;
          this.add(txtWeight, constraints);
          
          constraints.fill = GridBagConstraints.NONE;
          constraints.gridy = 4;
          constraints.gridx = 1;
          this.add(btnAdd, constraints);
          
          constraints.fill = GridBagConstraints.NONE;
          constraints.gridy = 4;
          constraints.gridx = 2;
          this.add(btnRemove, constraints);
          
          constraints.gridy = 6;
          constraints.gridx = 1; 
          constraints.gridwidth = 1; 
          this.add(lblConfirmation, constraints);
          
          constraints.gridy = 7;
          constraints.gridx = 1; 
          constraints.gridwidth = 1; 
          this.add(lblFee, constraints);
          
          
    }

    
}
