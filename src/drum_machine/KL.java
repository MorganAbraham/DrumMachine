
package drum_machine;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Morgan
 */
public class KL extends frmMPC implements KeyListener{

    @Override
    public void keyTyped(KeyEvent ke) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
       char currentKey = ke.getKeyChar();
       if(currentKey >= '1'  && currentKey <= '9'){
            int keyNumber = Character.getNumericValue(currentKey);
            keyNumber -= 1;
            
            ButtonFlash bf = new ButtonFlash();
            Thread thread = new Thread(bf);
            thread.start();
          
            Drum_Machine.playsound(keyNumber);
        }
          
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
