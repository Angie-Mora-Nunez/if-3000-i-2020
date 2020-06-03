/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucr.rp.lab06.Supermarket;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author AngieMora
 */
public class Main {

    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        superMarket superMarket = new superMarket(3);
        //El random nos genera el numero o el Id del cliente que esta entrando al supermercado
        int randoms=(int)(Math.random()*8+1);
        System.out.println("Hay "+randoms +  " Clientes");
        for (int i = 1; i <randoms; i++) {
          String Name =""+i;
          service.submit(new Client(Name, superMarket));
        }//for
        service.shutdown();
    }//Mainb
    
}//classMaon




