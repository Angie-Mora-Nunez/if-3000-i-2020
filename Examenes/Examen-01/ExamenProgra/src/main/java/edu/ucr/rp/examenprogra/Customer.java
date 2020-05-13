/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucr.rp.examenprogra;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Angie Mora Núñez B95185
 */
public class Customer {
    private String name;
//    private Arraylist<Mail>listaMails;
    public List<EmailCorreoElectronico>email;
    public List<NumerosTelefonicos>numers;
    public List<Mail>listaMails;
    public String getName() {
        return name;
    }//getname


    
    public Customer(){
        listaMails= new ArrayList<>();
        email=new ArrayList<>();
        numers= new ArrayList<>();
  }//customer
    
    
    public void setName(String name) {
        this.name = name;
    }//setName
    
    public void addMail(String country , String City , int zip , String otherSings ){
        Mail mail = new Mail(country,City,zip,otherSings);
        listaMails.add(mail);
    }//addmail
   
   public String showListMail(){
       String output="";
       for (int i = 0; i < listaMails.size(); i++) {
           output+=listaMails.get(i).getPais()+" "+listaMails.get(i).getCiudad()+" "+listaMails.get(i).getCodigoZip()+" "+listaMails.get(i).getOtrasSeñas()+"\n";
   }//for
       return output;
   }//show
   
    public void addNumbers(String num){
       NumerosTelefonicos nT = new NumerosTelefonicos(num);
       numers.add(nT);
    }//addmail
    
    
     public String muestraLista(){
       String output="";
       for (int i = 0; i < numers.size(); i++) {
           output+=numers.get(i).getNumber();
       }//for
       return output;
     }//show
     
     public void addEMail(String ema){
       EmailCorreoElectronico eCe = new EmailCorreoElectronico(ema);
       email.add(eCe);
     }//addmail
     
     public String muestraListaEmail(){
       String output="";
       for (int i = 0; i < email.size(); i++) {
           output+=email.get(i).getCorreoElectronico();
       }//for
       return output;
   }//show
     
    
    
}//cliente 
