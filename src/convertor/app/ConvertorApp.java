/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertor.app;


import java.io.*;
import java.util.Properties;



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

	    File VideoMp3 = new File(p.getProperty("inputPathMp3"));
            Mp4toMp3.ConvertMp4toMp3(VideoMp3);
                  
            File VideoMkv = new File(p.getProperty("inputPathMkv"));
            Mp4toMkv.ConvertMp4toMkv(VideoMkv);

            File VideoFlv = new File(p.getProperty("inputPathFlv"));
            Mp4toFlv.ConvertMp4toFlv(VideoFlv);
              

    }
}
