/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Font;
import static java.lang.Math.abs;
import java.util.Random;
import javax.swing.JTextField;

/**
 *
 * @author Toshiba
 */
public class GUIUtils {
    
    
    //запись текста в поле 
    public static void writeTextField(JTextField tf,String text){
        tf.setForeground(Color.BLACK);
        tf.setFont(new Font(tf.getFont().getFontName(), Font.PLAIN, tf.getFont().getSize()));
        tf.setText(text);
        
    }
    
    
    //Запись в формате по умолчанию
    public static void writeDefaultTextField(JTextField tf){
        tf.setForeground(Color.LIGHT_GRAY);
        tf.setText(getDefaultText(tf));
        tf.setFont(new Font(tf.getFont().getFontName(), Font.ITALIC, tf.getFont().getSize()));
    }
    
    
    
    
    //Текст по умолчанию для каждого TextField
    public static String getDefaultText(JTextField tf){
        if(tf.getName().equals("tfWhereFrom")){
            return "Имя сервиса";
        }
        else if(tf.getName().equals("tfLogin")){
            return "Логин";}
        else if(tf.getName().equals("tfPassword")){
        return "Пароль";}
        else if(tf.getName().equals("tfPassword2")){
        return "Повторите пароль";}
        
        else if(tf.getName().equals("tfOptions")){
            return "Дополнительно";}
        else return "";
    }
    
    public static void focusGained(JTextField tf){
        if(tf.getText().equals(getDefaultText(tf))){
            writeTextField(tf, "");
        }}
    public static void focusLost(JTextField tf){
        if(tf.getText().equals("")){
            writeDefaultTextField(tf);
            
        }
    } 
    
   
    public static String passwordGenerator(int count){
         char[] symbols = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o',
                       'p','q','r','s','t','u','v','w','x','y','z','A','B','C','D',
                        'E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S',
                        'T','U','V','W','X','Y','Z','0','1','2','3','4','5','6','7','8','9'};
        
        StringBuilder password = new StringBuilder();
        
        Random r = new Random();
        
        for(int i=0; i<count;i++){
            int tmp = r.nextInt();
            tmp=abs(tmp%symbols.length);
            //System.out.println("Случайное число: "+tmp);
            password.append(symbols[tmp]) ;
        }
    
        return password.toString();}
    }
    
    
    
   
    
    
    
    
    

