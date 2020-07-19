/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertor.app;

import java.io.File;
import it.sauronsoftware.jave.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author Dewmith Akalanka
 */


public class Mp4toMp3 {
    
    public static void ConvertMp4toMp3(File video) throws FileNotFoundException, IOException {
        
        
        Properties p = new Properties();
        InputStream is = new FileInputStream("config.txt");
        p.load(is);
        
        
       System.out.println("Started.....");
       File Audio = new File ("C:\\Users\\Dewmith Akalanka\\Documents\\NetBeansProjects\\convertor-app\\output\\mp4Tomp3-coverted\\Audio.mp3");
       AudioAttributes audio = new AudioAttributes();
       audio.setCodec("libmp3lame");
       audio.setBitRate(12800);
       audio.setChannels(2);
       audio.setSamplingRate(44100);
       
       
       EncodingAttributes attr = new EncodingAttributes();
       attr.setFormat("mp3");
       attr.setAudioAttributes(audio);
       
       Encoder encode = new Encoder();
       try{
           encode.encode(video, Audio, attr);
           System.out.println("Finished !!!");
       }catch(Exception e){
           System.out.println("Coversion failed : " + e.toString());
       }
       
    }
    
    
}
 