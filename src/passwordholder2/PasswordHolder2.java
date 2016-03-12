/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordholder2;

import GUI.FirstStart;
import GUI.StartForm;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import objects.MyBean;
import utils.FileUtils;
import static utils.FileUtils.readFromFile;


/**
 *
 * @author Toshiba
 */
public class PasswordHolder2 {
public static ArrayList<MyBean> beans= new ArrayList<MyBean>();
public static File file = new File("data");
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        // TODO code application logic here
        
        
        
     
       if(!file.exists()){
            FirstStart firstStart = new FirstStart();
            firstStart.setVisible(true); 
            
        }
       else{
           
           readFromFile(file, beans);
         StartForm start = new StartForm();
          start.setVisible(true);
       }
            
    }
}
    

