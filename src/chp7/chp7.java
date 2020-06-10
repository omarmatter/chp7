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
public class chp7{

    /**
     * @param args the command line arguments
     */


public static void main(String args[]){
   MyThread a = new MyThread ("c:\\data.txt","Thread1");
MyThread b = new MyThread ("c:\\data2.txt","Thread2");
a.start();
  b.start();
}
}

        // TODO code application logic here
    
    

