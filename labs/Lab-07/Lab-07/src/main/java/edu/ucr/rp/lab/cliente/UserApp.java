/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucr.rp.lab.cliente;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Equipo
 */
public class UserApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
         ExecutorService executorService = Executors.newCachedThreadPool();
         executorService.submit(()->{
             try {
                 String g=JOptionPane.showInputDialog(null, "Ingresa tu pregunta al app mágica");
                 User.sendMessage("127.0.0.1", 45691, g);
             } catch (InterruptedException ex) {
                 Logger.getLogger(UserApp.class.getName()).log(Level.SEVERE, null, ex);
             }
    });
        executorService.submit(()->{
             try {
                 String g=JOptionPane.showInputDialog(null, "Ingresa tu pregunta al app mágica");
                 User.sendMessage("127.0.0.1", 45691, g);
             } catch (InterruptedException ex) {
                 Logger.getLogger(UserApp.class.getName()).log(Level.SEVERE, null, ex);
             }

    });
        executorService.submit(()->{
             try {
                 String g=JOptionPane.showInputDialog(null, "Ingresa tu pregunta al app mágica");
                 User.sendMessage("127.0.0.1", 45691, g);
             } catch (InterruptedException ex) {
                 Logger.getLogger(UserApp.class.getName()).log(Level.SEVERE, null, ex);
             }
 
    });
   
    
}
}