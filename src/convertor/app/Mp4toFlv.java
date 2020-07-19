/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertor.app;

import it.sauronsoftware.jave.AudioAttributes;
import it.sauronsoftware.jave.Encoder;
import it.sauronsoftware.jave.EncodingAttributes;
import it.sauronsoftware.jave.VideoAttributes;
import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;



/**
 *
 * @author Dewmith Akalanka
 */
public class Mp4toFlv {
    
        public static void ConvertMp4toFlv(File video) throws IOException {
            
       
            Properties p = new Properties();
            InputStream is = new FileInputStream("config.txt");
            p.load(is); 
            
            
            System.out.println("Started.....");
            File VideoOut = new File (p.getProperty("outputPathFlv"));
       
            //VideoEncoding
            VideoAttributes videoAttr = new VideoAttributes();
            videoAttr.setBitRate(12800);
            videoAttr.setFrameRate(25);
            videoAttr.setBitRate(12800);
              
            //AudioEncoding
            AudioAttributes audio = new AudioAttributes();
            audio.setCodec("libmp3lame");
            audio.setBitRate(12800);
            audio.setChannels(2);
            audio.setSamplingRate(44100);

          
       
            EncodingAttributes attr = new EncodingAttributes();
   
       
      
            attr.setFormat("flv");
            attr.setVideoAttributes(videoAttr);
            attr.setAudioAttributes(audio);
       
            Encoder encode = new Encoder();
        
       try{
           encode.encode(video, VideoOut, attr);
           System.out.println("Finished !!!");
       }catch(Exception e){
           System.out.println("Coversion failed : " + e.toString());
       }
    }
}
