/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucr.rp.lab;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/**
 *
 * @author Equipo
 */
public class BallMagic {
    
    ServerSocket serverSocket;
    String arrayAswers[]={"No","Ni lo sueñe","No, mi ogra","Por su puesto","Sí","Sí, es viable","Sí, sería mágico","No sea necia","No te des por vencida", "El mundo te necesita"};
    
    public BallMagic(int port){
    
    try{
        serverSocket = new ServerSocket(port);
        System.out.println("Esperando conexión.......");
        while(true){
        Socket socket = serverSocket.accept();
        System.out.println("¡Conexión recibida!");
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
        String message = (String) in.readObject();
        System.out.println("Pregunta recibida--> "+message);
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        int i= new Random().nextInt(arrayAswers.length-1);
        System.out.println(arrayAswers[i]);
        out.writeObject(arrayAswers[i]);
        
        }
    
    
    }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();//Puede lanzar una excepción puesto que el puerto puede estar ocupado
        }
    
    
    }//port
    
    
    
    
    
    
    
}//sever
