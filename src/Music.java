import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Music {
    Clip clip;
    AudioInputStream sound;
    File fille = new File("DowHowling.wav");

    public void setFile(String file) {
        try {
            File file = new File("DowHowling.wav");
            sound = AudioSystem.getAudioInputStream(file);
            clip = AudioSystem.getClip();
            clip.open(sound);
        } catch (Exception e) {
        }
    }
    public void play() {
        clip.start();
    }
    public void stop() throws IOException {
        sound.close();
        clip.close();
        clip.stop();
    }

}