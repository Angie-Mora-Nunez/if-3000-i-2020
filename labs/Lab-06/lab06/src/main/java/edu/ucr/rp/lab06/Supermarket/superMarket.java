/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucr.rp.lab06.Supermarket;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AngieMora
 */
public class superMarket {
    private Semaphore pass;

    public superMarket(int aviableSlots) {
        pass= new Semaphore(aviableSlots);
    }// llamada del semaphore
    
    public void gettingInLine(){
      
        try {
            pass.acquire();
        } catch (InterruptedException ignored) {
            
        }//try/catch
    }//getinIne 
    public void livingSuperMarket(){
        pass.release();
    }//livingSupermarkt
    
   
}//Supermarket



