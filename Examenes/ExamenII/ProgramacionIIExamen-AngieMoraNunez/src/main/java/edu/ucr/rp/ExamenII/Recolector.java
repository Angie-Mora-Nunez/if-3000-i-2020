/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucr.rp.ExamenII;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

/**
 *
 * @author Angie Mora Núñez B95185
 * 
 */
public class Recolector implements Runnable{
  
    private BlockingQueue<String> regalos;
    private int count;
    private Random random = new Random();
    private String name;
    public int rand = new Random().nextInt(5)+1;
    public Integer contador = rand;
    

    public Recolector(BlockingQueue<String> regalos,String name) { 
        this.regalos = regalos; 
        this.name=name;
    }//constructorRecolector
    
    @Override
    public void run() {

//        while (true) {
            
            System.out.printf("%s: Recolecta paquete con  %s regalo(s) \n",name,contador);
            regalos.add(contador+"");
            try {
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException e) {//try
                e.printStackTrace();
            }//catch
//        }//whileTrue
    }//endRun
    
    
    
    
    
    
    
    
    
    
}//endRecolector
