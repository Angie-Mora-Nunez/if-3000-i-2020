/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucr.lab.NumberBucket;
   import java.util.ArrayList;
   import java.util.List;

/**
 *
 * @author Angie Mora Núñez
 */
public class NumberBucket {
 
    private List<Integer> numbers;

    public NumberBucket() { numbers = new ArrayList<>(); }//constructor
    public void add(Integer value) {//segundo  hilo
        synchronized(this){ //sgndo ? se puede acceder monitor-lock es true
            numbers.add(value);//primer hilo en progreso
        }//syncronized primer monitor-lock es false
        System.out.println("Added: "+value);
    }//add
    
    //this hace instancia this y numbers a numbers se utiliza mucho más this this es un sémaforo una bandera para poder entrar 
    //se mantiene la referencia aunque se cambie en otro lugar 
    
    public void remove(int index){//instanciar el proceso
        synchronized(this){//tercero pide acceso
        numbers.remove(index);
    }//syncronized
    
    }//remove
    
    public int size() { 
        return numbers.size(); 
    }//size


}//numberBucket
