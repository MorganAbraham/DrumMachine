/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drum_machine;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Morgan
 */
public class Drum_Machine {
    public static JButton pad = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        frmMPC MPC = new frmMPC();
        MPC.setVisible(true);
    }
    
    public static void playsound(int i){
        try{
                Clip clip = AudioSystem.getClip();
                //File f = new File("C:\\Users\\Morgan\\Desktop\\hihat.wav");
                File f = GetFile(i);
                AudioInputStream inputStream = AudioSystem.getAudioInputStream(f);
                clip.open(inputStream);
                clip.start(); 
            }
        catch(Exception e){
            //JOptionPane.showMessageDialog(null,e.getMessage(),"Welcome to the drum machine!",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public static File GetFile(int i){
        String padSound = "C:\\Users\\Morgan\\Documents\\NetBeansProjects\\Drum_Machine\\Default Sounds\\";
        switch(i){
            case 1:
                padSound = padSound + "kick1.wav";
                break;
            case 2:
                padSound = padSound + "snare1.wav";
                break;
            case 3:
                padSound = padSound + "chihat.wav";
                break;
            case 4:
                padSound = padSound + "shaker1.wav";
                break;
            case 5:
                padSound = padSound + "shaker2.wav";
                break;
            case 6:
                padSound = padSound + "bongo1.wav";
                break;
            case 7:
                padSound = padSound + "huh.wav";
                break;
            case 8:
                padSound = padSound + "stab1.wav";
                break;
            case 9:
                //padSound = padSound + "";
                padSound = null;
                break;
            default:
                    padSound = null;
        }
        if (padSound != null){
            return new File(padSound);
        }
        return null;
    }
    
}
