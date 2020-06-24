/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucr.rp.ExamenII;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

/**
 *
 * @author Angie Mora Núñez B95185
 * 
 */
public class ActividadCaridad {

   
    public static void main(String[] args) {
       BlockingQueue<String> regalos = new LinkedBlockingQueue<>();
       ExecutorService servicio = Executors.newCachedThreadPool();
       
        System.out.println("----------------------*Actividad de Caridad*----------------------");
       servicio.submit(new Recolector(regalos, "Manuelo"));
       servicio.submit(new Recolector(regalos, "Lucho"));
       servicio.submit(new Recolector(regalos, "Lolo"));
       servicio.submit(new Receptor(regalos, "Artemis"));
       servicio.submit(new Receptor(regalos, "Johan"));
       servicio.submit(new Receptor(regalos, "Deibid"));
       servicio.submit(new Receptor(regalos, "Estoncio"));
       servicio.submit(new Receptor(regalos, "Carmelo"));
       servicio.shutdown();
        
        
    }//main
    
}//EndActividadCaridad
