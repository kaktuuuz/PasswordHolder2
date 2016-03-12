/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;


import java.io.File;
import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import objects.MyBean;
import static passwordholder2.PasswordHolder2.beans;
import static passwordholder2.PasswordHolder2.file;

/**
 *
 * @author Toshiba
 */
public class FileUtils {
    public static void writeToFile() throws FileNotFoundException, IOException{
        FileOutputStream fileOutPut = new FileOutputStream(file);
        
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutPut);
        
        outputStream.writeObject(beans);
        System.out.println("Zapis: "+beans.size());
        
        fileOutPut.close();
        outputStream.close();
        
    }
    
    
    public static void writeToFile(MyBean bean) throws IOException{
        beans.add(bean);
        writeToFile();
        
        
        
    }
    public static void readFromFile(File file, ArrayList<MyBean> beans) throws FileNotFoundException, IOException, ClassNotFoundException{           
       FileInputStream fip = new FileInputStream(file);
        ObjectInputStream objectInput = new ObjectInputStream(fip);
        Object object = objectInput.readObject();
        fip.close();
        objectInput.close();
        
        
        passwordholder2.PasswordHolder2.beans=(ArrayList<MyBean>)object;
      //  System.out.println("Pro4itano "+object.getClass());
        
        
                
                
                
    }
    
    
}
