import java.io.IOException;
import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Snippet2 {

    public static void main(String[] args) throws Exception {
        try {

            InputStream input = Snippet.class.getResource("lpg.wav").openStream();
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(input);
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.loop(Clip.LOOP_CONTINUOUSLY);

            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    // A GUI element to prevent the Clip's daemon Thread
                    // from terminating at the end of the main()
                    JOptionPane.showMessageDialog(null, "Close to exit!");
                }
            });
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

