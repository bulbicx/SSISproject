
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 * This class display a file chooser enabling the GUI to display different type of file.
 *
 * @author Marco Castellana
 * @author Simone Agus
 */
public class FileOpener {
    
    JFileChooser file_chooser = new JFileChooser(); //creating a file chooser window
    
    public void chooseMe() throws FileNotFoundException {
        
        if (file_chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) 
        {
            File file = file_chooser.getSelectedFile();
            String path = file.getAbsolutePath();
            try {
                Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler " + path);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Invalid path");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Runtime error");
        }
    }
}
