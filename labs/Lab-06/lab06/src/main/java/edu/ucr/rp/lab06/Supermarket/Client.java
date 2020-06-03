/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucr.rp.lab06.Supermarket;

import java.util.Random;

/**
 *
 * @author AngieMora
 */
public class Client implements Runnable{
     private final String name;
     superMarket superMarket;

    public Client(String name, superMarket superMarket) {
        this.name = name;
        this.superMarket = superMarket;
    }//Constructor
    
    
    @Override
    public void run() {
         System.out.printf("El cliente %s está llegando al parking\n", name);
        sleep();
        System.out.printf("El cliente %s esta esperando en la puerta \n", name);
        superMarket.gettingInLine();
        System.out.printf("El cliente %s está comprando \n", name);
        sleep();
        System.out.printf("El cliente %s ha terminado sus compras \n", name);
        superMarket.livingSuperMarket();
        
    }//lo que corre
    
    private void sleep() {
        try {
            Thread.sleep(new Random().nextInt(5000));
        } catch (InterruptedException ignored) {
        }//try/catch
    }//sleep
    
}//Runable



