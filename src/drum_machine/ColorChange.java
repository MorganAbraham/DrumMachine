/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drum_machine;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Morgan
 */
public class ColorChange extends frmMPC implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        JButton pd = (JButton) ae.getSource();
        if (pd.getBackground() == Color.RED){
            pd.setBackground(null);
        }
        else{
            pd.setBackground(Color.RED);
        }
        /*
        try {
            Thread.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(ColorChange.class.getName()).log(Level.SEVERE, null, ex);
        }
        pd.setBackground(null);
        */
        
    }
    
    public static void cColor(JButton pd, int i){
        if (pd.getBackground() == Color.RED){
            pd.setBackground(null);
        }
        else{
            pd.setBackground(Color.RED);
        }/*
        if (i == 0)
        {
            cColor(pd,1);
        }*/
    }
}
