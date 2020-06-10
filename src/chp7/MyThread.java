/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chp7;

import java.io.FileReader;

/**
 *
 *
 */
public class MyThread extends Thread{

   String filename;
   MyThread(String fname, String tname)
   {
       super(tname);
       filename=fname;
   }
   public void run()
   {
       FileReader fr = null;
       try {
           fr = new FileReader(filename);
           int i;
           while((i=fr.read())!=-1)
           {
               Thread.sleep(100);
               System.out.println((char)i + " : "+getName());
       }
           fr.close();
       } catch (Exception e) {
           e.printStackTrace();
       }

   }
}
    

