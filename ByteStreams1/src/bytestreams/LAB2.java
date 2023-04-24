/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bytestreams;

import java.io.*;

/**
 *
 * @author Student
 */
public class LAB2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream output = new FileOutputStream("data.dat");
        String s = "Hello World";
        byte[] b = s.getBytes();
        output.write(b);
        FileInputStream input = new FileInputStream("data.dat");
        int value;
        while((value=input.read()) != -1){
            System.out.println((char)value);
        }
    }
}

