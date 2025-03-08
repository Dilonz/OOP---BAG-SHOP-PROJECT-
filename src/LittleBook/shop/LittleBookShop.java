/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LittleBook.shop;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class LittleBookShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        File myFile = new File("littlebag.txt");
        try {
            if(myFile.createNewFile()){
                System.out.println("File created succesfully!");
            }
            else
                System.out.println("File creation error!"); 
                  
            //Get file information
            System.out.println(myFile.getName());
            System.out.println(myFile.exists());
            System.out.println(myFile.getAbsoluteFile());
            System.out.println(myFile.canWrite());
            System.out.println(myFile.canRead());
            System.out.println(myFile.length());
            
            //Delete a File
            if(myFile.delete()){
                System.out.println();//("File Deleted")
                
            }else{
                System.out.println();//("No any file")
            }   
            
            
        } catch (IOException ex) {
            Logger.getLogger(LittleBookShop.class.getName()).log(Level.SEVERE, null, ex);
               System.out.println("File error....");
        }
     
    }
    
}