/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertor.app;

import it.sauronsoftware.jave.*;

import java.io.File;
import java.io.IOException;



/**
 *
 * @author Dewmith Akalanka
 */
public class Mp4toMkv {
    

    
    
        public static void ConvertMp4toMkv(File video) throws  IOException  {

            System.out.println("Started.....");
            File VideoOut = new File ("C:\\\\Users\\\\Dewmith Akalanka\\\\Documents\\\\NetBeansProjects\\\\convertor-app\\\\output\\\\mp4Tomkv-coverted\\\\VideoOutMkv.mkv");

       
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
   
       
      
            attr.setFormat("matroska");
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
