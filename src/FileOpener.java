
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import javax.swing.JFileChooser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simon
 */
public class FileOpener {
    
    JFileChooser file_chooser = new JFileChooser();
    StringBuilder strb = new StringBuilder();
    
    public void choose_me() throws FileNotFoundException {
        
        if (file_chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) 
        {
            
            File file = file_chooser.getSelectedFile();
            Scanner input = new Scanner(file);
            
            while (input.hasNext())
            {
                
                strb.append(input.nextLine());
                strb.append("\n");
                
                
                
            }
            
            input.close();
            
            
            
        }
        else {
            
            strb.append("No File selected");
        }
        
    }
    
    
    
}
