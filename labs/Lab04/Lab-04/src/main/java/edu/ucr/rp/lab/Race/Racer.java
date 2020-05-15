/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * 
 */

package edu.ucr.rp.lab.Race;
import static java.lang.String.format;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Angie Mora Núñez
 */

public class Racer implements Runnable {
       private String name;
   
public Racer(String name){this.name=name;}//constructor
    
@Override
public void run(){
        //format del string ayuda a remplzar por cada variable pongo %s printF
        System.out.println(String.format("%s starts to run", name));//forma alternativa de introducir variables a un método 
        //forma para decirle al hilo que descanse recibe en milisegundos se le puede pasar un random  
           try {
               Thread.sleep(new Random().nextInt(5000)); //solo lo instancio y aquí funciona y aquí muere
           }//try 
           catch (InterruptedException ex) {
               Logger.getLogger(Racer.class.getName()).log(Level.SEVERE, null, ex);
           }//catch
        System.out.println(String.format("%s ends to run", name));
}//run
   
}//Racer
