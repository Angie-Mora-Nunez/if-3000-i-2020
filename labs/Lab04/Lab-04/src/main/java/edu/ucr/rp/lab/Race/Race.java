/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucr.rp.lab.Race;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Angie Mora Núñez
 */

public class Race {
    private Racer racer1;
    private Racer racer2;
    private Racer racer3;
    
public static void main(String[] args) {
    Race race = new Race();
    race.prepareRace();
    race.startRace();
}//main
    
public void prepareRace(){
    racer1= new Racer("La Pulga");
    racer2= new Racer("El Fenómeno");
    racer3= new Racer("El Bicho");
}//prepareRace
    
public void startRace(){
    Thread oldRacer = new Thread(new Racer("O Mei"));
    oldRacer.start();//una forma antigua de generar hilos es menos efectiva 
   
//Deberíamos usarlo es más rápido
    ExecutorService threadExecutor = Executors.newCachedThreadPool();//catched genera uno por defecto
    Executors.newFixedThreadPool(2);//el dos nos dice el máximo de hilos hay que analizar cuantos necesito se pueden crear hasta 10 pero es el máximo puedo atender según asi lo decido
    threadExecutor.execute(racer1);//hay más hilos que ejecutores
    threadExecutor.execute(racer2);
    threadExecutor.execute(racer3);
    threadExecutor.execute(new Racer("El 4"));
    threadExecutor.execute(new Racer("El 5"));
    threadExecutor.execute(new Racer("El 6"));
    threadExecutor.shutdown();//¿Qué pasa por los hilos que estan corriendo? 
}//startRace
    
    
}//Race
