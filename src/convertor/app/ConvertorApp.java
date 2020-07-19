/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertor.app;


import java.io.*;



/**
 *
 * @author Dewmith Akalanka
 */
public class ConvertorApp {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws IOException  {
       

              
        
        
              File VideoMp3 = new File("C:\\\\Users\\\\Dewmith Akalanka\\\\Documents\\\\NetBeansProjects\\\\convertor-app\\\\source\\\\mp4Tomp3\\\\input.mp4");
              Mp4toMp3.ConvertMp4toMp3(VideoMp3);
                  
              File VideoMkv = new File("C:\\\\Users\\\\Dewmith Akalanka\\\\Documents\\\\NetBeansProjects\\\\convertor-app\\\\source\\\\mp4Tomkv\\\\input.mp4");
              Mp4toMkv.ConvertMp4toMkv(VideoMkv);

              File VideoFlv = new File("C:\\\\Users\\\\Dewmith Akalanka\\\\Documents\\\\NetBeansProjects\\\\convertor-app\\\\source\\\\mp4Toflv\\\\input.mp4");
              Mp4toFlv.ConvertMp4toFlv(VideoFlv);
              

    }
}
