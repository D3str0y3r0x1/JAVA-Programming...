import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Music{
 
  public void playSound() 
  {
    try {
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("D://MusicPlayer//fml.mp3").getAbsoluteFile());
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        clip.start();
    } catch(Exception ex) {
        System.out.println("Error with playing sound.");
        ex.printStackTrace();
    }
  }


public static void main(String args[]){
Music m = new Music();
m.playSound();
 
}
}
