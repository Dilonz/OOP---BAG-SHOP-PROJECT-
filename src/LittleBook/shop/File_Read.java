/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LittleBook.shop;


import java.io.FileReader;
import java.io.IOException;



public class File_Read {
    public static void main(String[] args) {
      char[]data = new char[100];
        try {
            FileReader input = new FileReader("LittleBagShop.txt");
            input.read(data);
            System.out.println("Data received from a file");
            System.out.println("data");
            input.close();
            
        } catch (IOException ex) {
            
            System.out.println("File read error..");
        }
      
    }
}
