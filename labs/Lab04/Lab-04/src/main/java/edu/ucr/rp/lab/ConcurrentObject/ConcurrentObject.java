/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucr.rp.lab.ConcurrentObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 *  @author Angie Mora Núñez
 */
public class ConcurrentObject {

public static void main(String[] args) throws InterruptedException {
        
  //    List numbers = new ArrayList<Integer>();
        List numbers = new Vector<Integer>();//se le agrega vector para que de el numero exacto los hilos esperan hasta que se desocupen los espacios
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(new AddNumbers(numbers));
        service.execute(new AddNumbers(numbers));
        
//        while (true) {
             
                 Thread.sleep(5000);
                 System.out.println(numbers.size());
          
            
//        }//While
          service.shutdown();
        
}//static
    
}//concurrent
