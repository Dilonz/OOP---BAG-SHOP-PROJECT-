/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LittleBook.shop;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class File_Write {
  
 public static void main(String[] args) {
     String data = "The Little Bag Shop";
     try {
         FileWriter output = new FileWriter("Viewproducts.txt");
         output.write(data);
         System.out.println("Data is written succesfully!...");
         output.close();
         
     } catch (IOException ex) {
         Logger.getLogger(File_Write.class.getName()).log(Level.SEVERE, null, ex);
         System.out.println("File write error....");
     }
     
     
 }   
    
       
    
}
