/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucr.rp.lab.ConcurrentObject;

import java.util.List;
import java.util.Random;

/**
 *
 *  @author Angie Mora Núñez
 */
    public class AddNumbers implements Runnable{
    
     private List<Integer> numbers;
     
    public AddNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }//addnumbers

    @Override
    public void run() {
            for (int count=1000;count>0;count--) 
                numbers.add(new Random().nextInt(10));
                
    }//run
    
    
    
    
}//addnumbers
    