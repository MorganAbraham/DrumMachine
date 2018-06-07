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
                //File soundFile = new File("C:\\Users\\Morgan\\Desktop\\hihat.wav");
                File soundFile = getSoundFile(i);
                AudioInputStream inputStream = AudioSystem.getAudioInputStream(soundFile);
                clip.open(inputStream);
                clip.start(); 
            }
        catch(Exception e){
            //JOptionPane.showMessageDialog(null,e.getMessage(),"Welcome to the drum machine!",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public static File getSoundFile(int i){
        String soundPath = System.getProperty("user.dir") + "\\Default Sounds\\";
        String[] defaultSounds = new String[]{"kick1.wav", "snare1.wav", "chihat.wav",
            "shaker1.wav","shaker1.wav","shaker2.wav","bongo1.wav","huh.wav","stab1.wav"};
        if(i > -1 && i < defaultSounds.length){
            soundPath += defaultSounds[i];
        }else{
            soundPath = null;
        }
        
        if (soundPath != null){
            return new File(soundPath);
        }
        return null;
    }
    
}
