/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
       char kp = ke.getKeyChar();
       if(kp >= '1'  && kp <= '9'){
           JButton pad = null;
           switch(kp){
                case '1':
                    pad = jPad1;
                    break;
                case '2':
                    pad = jPad2;
                    break;
                case '3':
                    pad = jPad3;
                    break;
                case '4':
                    pad = jPad4;
                    break;
                case '5':
                    pad = jPad5;
                    break;
                case '6':
                    pad = jPad6;
                    break;
                case '7':
                    pad = jPad7;
                    break;
                case '8':
                    pad = jPad8;
                    break;
                case '9':
                    pad = jPad9;
                    break;
                default:
                        break;
           }
          //Drum_Machine.pad = pad;
          ButtonFlash bf = new ButtonFlash();
          Thread trd = new Thread(bf);
          trd.start();
          //JOptionPane.showMessageDialog(null,kp); 
          int snd = Character.getNumericValue(kp);
          Drum_Machine.playsound(snd);
       }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
