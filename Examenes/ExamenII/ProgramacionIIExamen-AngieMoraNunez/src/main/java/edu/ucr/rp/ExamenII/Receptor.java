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
public class Receptor implements Runnable {
    private BlockingQueue<String> regalos;
    private Random random = new Random();
    private int random2 = new Random().nextInt(5);
    private String name;
    Recolector rE;
    public Receptor(BlockingQueue<String> regalos,String name) {
        this.regalos = regalos;
        this.name=name;
    }//endConstructorReceptor

    @Override
    public void run() {
        while (true) {
            try {
                String regalos = this.regalos.take();
                System.out.printf("%s: Recibe paquete con %s regalos, pendientes de procesar(%d)\n", name,
                        regalos, this.regalos.size());
                Thread.sleep(random.nextInt(5000));
            } catch (InterruptedException e){
                e.printStackTrace();
            }//catch
        }//while(True)

    }//EndRun   
    
    
    
}//endReceptor
