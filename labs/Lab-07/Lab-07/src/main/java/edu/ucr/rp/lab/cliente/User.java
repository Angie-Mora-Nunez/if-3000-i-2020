/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucr.rp.lab.cliente;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 *
 * @author Equipo
 */
public class User {
   
       

    public static void sendMessage(String server, int port, String questions) throws InterruptedException {
        Socket clientSocket=null;
        try {
            clientSocket = new Socket(server, port);
            Thread.sleep(5000);
            ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream());
            out.writeObject(questions);
            ObjectInputStream in = new ObjectInputStream(clientSocket.getInputStream());
            System.out.println(in.readObject());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                clientSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    
    
    
    
}//cliente
