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
public class AL extends frmMPC implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent ae) {
        JButton pd = (JButton) ae.getSource();
        Drum_Machine.pad = pd;
        ButtonFlash bf = new ButtonFlash();
        Thread thread = new Thread(bf);
        thread.start();
        String pad = ae.getActionCommand();
        pad = pad.substring(pad.length() - 1);

        int padNumber = Integer.parseInt(pad);
        Drum_Machine.playsound(padNumber - 1);
    }
    
}
