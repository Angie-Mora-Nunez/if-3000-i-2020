/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucr.rp.examenprogra;

import java.util.List;

/**
 *
 * @author Angie Mora Núñez B95185
 */
public class Cliente extends Customer{
   
    public void sendMessage(){
         String refuse ="";
         Customer c = new Cliente();
         c.setName("Manolo");
         c.addNumbers("87575454");
         c.addMail("España", "Andorra", 25631455, "Costado suroeste del de la mancha");
         c.addEMail("manolo756@gmail.com");
         
         
        System.out.println("Enviando mensaje a:"+getName()); 
        
        for (int i = 0; i < email.size(); i++) {
            refuse+=email.get(i).getCorreoElectronico();
            System.out.println("Enviando mensaje al email"+refuse);
        }//for telefono
        for (int i = 0; i < numers.size(); i++) {
            numers.get(i);
            System.out.println("Enviando mensaje al email: "+numers);
        }//for email
        
        for (int i = 0; i < listaMails.size(); i++) {
            listaMails.get(i);
            System.out.println("Enviando mensaje a la dirección: "+listaMails);
        }//for direccion
        
    }//enviarMensaje
    
}//Cliente 
