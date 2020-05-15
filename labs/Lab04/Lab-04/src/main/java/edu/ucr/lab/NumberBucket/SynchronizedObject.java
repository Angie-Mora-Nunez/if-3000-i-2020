/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucr.lab.NumberBucket;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Angie Mora Núñez
 */

public class SynchronizedObject {

    public static void main(String[] args) throws InterruptedException {
       
        NumberBucket bucket = new NumberBucket();
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(new AddNumbersToBucket(bucket));
        service.execute(new AddNumbersToBucket(bucket));
        
//        do {
            Thread.sleep(5000);
            System.out.println(bucket.size());
//        }//do
        service.shutdown();
    }//main
}//syncronized
