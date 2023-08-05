import java.io.File;
import java.util.Scanner;

import javax.sound.sampled.*;


public class NewMusic{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        File file = new File("DogHowling.wav");
       
        AudioInputStream aduio = AudioInputStream.getAudioInputStream("DogHowling.wav");
        
    }

}