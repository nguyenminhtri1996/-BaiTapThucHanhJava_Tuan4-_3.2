/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bachamhai;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

/**
 *
 * @author Minh Tri
 */
public class BaChamHai {

    /**
     * @param args the command line arguments
     */
    JFrame f; 
    BaChamHai()
    {  
        f=new JFrame();  

        JRadioButton r1=new JRadioButton("A) Male");  
        JRadioButton r2=new JRadioButton("B) FeMale");  
        r1.setBounds(50,100,70,30);  
        r2.setBounds(50,150,70,30);  

        ButtonGroup bg=new ButtonGroup();  
        bg.add(r1);bg.add(r2);  

        f.add(r1);f.add(r2);  

        f.setSize(300,300);  
        f.setLayout(null);  
        f.setVisible(true);  
    }  
    public static void main(String[] args) {
        // TODO code application logic here
        new BaChamHai();  
    }
    
}
