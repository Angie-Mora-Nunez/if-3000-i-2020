/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucr.lab.NumberBucket;
import java.util.Random;

/**
 *
 * @author Angie Mora Núñez
 */

public class AddNumbersToBucket implements Runnable {
    private NumberBucket bucket;

    public AddNumbersToBucket(NumberBucket bucket) {
        this.bucket = bucket;
    }//addNumbersBucket

    @Override
    public void run() {
        for (int count = 1000; count > 0; count--)
            bucket.add(new Random().nextInt(10));
    }//run
}//addnumbersBucket