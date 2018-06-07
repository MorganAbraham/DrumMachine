/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drum_machine;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author Morgan
 */
public class ButtonFlash implements Runnable{
    
    public static void main(String args[]) {
        (new Thread(new ButtonFlash())).start();
    }

    @Override
    public void run() {
        JButton pd = Drum_Machine.pad;
        
        if (pd != null){
            pd.setOpaque(true);
            if (pd.getBackground() == Color.RED){
                pd.setBackground(null);
            }
            else{
                pd.setBackground(Color.RED);
            }
           JPanel MPC = (JPanel) pd.getParent();
            try {
                //MPC.revalidate();
                //MPC.repaint();
                //MPC.removeAll();
                //JOptionPane.showMessageDialog(MPC, MPC.getComponents());
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(ButtonFlash.class.getName()).log(Level.SEVERE, null, ex);
            }
         pd.setBackground(null);
         Drum_Machine.pad = null;
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
