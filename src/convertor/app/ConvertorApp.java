/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertor.app;


import java.io.*;
import java.util.Properties;
import java.util.Scanner;



/**
 *
 * @author Dewmith Akalanka
 */
public class ConvertorApp {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException  {
       

            
            Properties p = new Properties();
            InputStream is = new FileInputStream("config.txt");
            p.load(is); 
            

            
            Scanner scanner = new Scanner(System.in);
            System.out.println("Select the conversion\n 1 for Mp4 to Mp3\n 2 for Mp4 to Mkv\n 3 for Mp4 to Flv");
            int input = scanner.nextInt();
            
            
            if(input == 1){
               File VideoMp3 = new File(p.getProperty("inputPathMp3"));
               Mp4toMp3.ConvertMp4toMp3(VideoMp3);
               System.out.println("Converted to Mp3");
            }
            if(input == 2){
                File VideoMkv = new File(p.getProperty("inputPathMkv"));
                Mp4toMkv.ConvertMp4toMkv(VideoMkv); 
                System.out.println("Converted to Mkv");
            }
            if(input == 3){
                File VideoFlv = new File(p.getProperty("inputPathFlv"));
                Mp4toFlv.ConvertMp4toFlv(VideoFlv);    
                System.out.println("Converted to FLV");
            }
            else{
                System.out.println("Wrong Input");
            }

                  



              

    }
}
