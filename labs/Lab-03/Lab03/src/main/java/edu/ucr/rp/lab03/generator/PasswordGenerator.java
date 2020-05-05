/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucr.rp.lab03.generator;

import java.util.Random;

/**
 *
 * @author Angie Mora Núñez
 */
public class PasswordGenerator {
    
    private Integer MinSpecialChars;
    private Integer minUpperCase;
    private Integer minNumbers;
    private Integer maxLength;
    private char[] specialChars;
    private Integer MaxLength;
   
    
    public PasswordGenerator(Integer MinSpecialChars, Integer minUpperCase, Integer minNumbers, Integer MaxLength, char[] specialChars) {
        this.MinSpecialChars = MinSpecialChars;//genera un minimo de caracteres
        this.minUpperCase = minUpperCase;
        this.minNumbers = minNumbers;//minimo de números
        this.MaxLength = MaxLength;//maximo de tamaño
        this.specialChars = specialChars;//caracteres especiales
        
    }//constructor
    
     /* Clase Random del paquete java.util : esta clase tiene un método en particular
       ( nextInt(param) ) que recibe un parámetro que es el valor máximo a seleccionar un
        número aleatorio.*/
    
    public String generate(){
        
        int k=this.MinSpecialChars+this.minUpperCase+this.minNumbers;
        int value=this.MaxLength;
        Random rand = new Random(); 
        String password ="";
        String number=""; 
        String resultlowerCase="";
        String resultUppercase="";
        String specialChars ="";
        int[] numbers={1,2,3,4,5,6,7,8,9,0};
        
        char[] UpperCases={'A','B','C','D','E','F','G'
                          ,'H','I','J','K','L','M','N'
                          ,'Ñ','O','P','Q','R','S','T'
                          ,'U','V','W','X','Y','Z'};
        
        char[] LowerCases={'a','b','c','d','e','f','g'
                          ,'h','i','j','k','l','m','n'
                          ,'ñ','o','p','q','r','s','t'
                          ,'u','v','w','x','y','z'};
        
        for (int i = 0; i < this.MinSpecialChars; i++) {
        //specialChars += (rand.nextInt(36) + 38);//no realiza el random de los characteres correctos  
            specialChars += this.specialChars[rand.nextInt(this.specialChars.length)];//con specialchars no necesito pasarle un char si no que lo tomo del char anterior 
        }//for que va a mover los caracteres especiales definidos arriba y va a retornar uno para usarlo en el código
        
        for (int i = 0; i < this.minNumbers; i++) {
           number+=(int)(Math.random()*10+1);
        }//este for me validará el numero de numeros que deberá tener el código
  
        for (int i = 0; i < this.minUpperCase; i++) {
          resultUppercase+=UpperCases[(int)(rand.nextInt(UpperCases.length))];//resultUppercase+=(char)(rand.nextInt(123)+97); //no genera solo letras, también simbolos
        }//este for nos saca las letras mayusculas
    
        for (int i = 0; i < k-value; i++) {
           resultlowerCase+=LowerCases[(int)(rand.nextInt(LowerCases.length))]; 
        }//este for me genera las minusculas para completar la contraseña
       
        for (int i = 0; i <1; i++) {//el uno nos valida la cantidad de contraseñas que queremos implementar
          password+=resultUppercase+number+specialChars+resultlowerCase+"\n"; //un salto de linea para bajr 
        }//for para generar la contraseña
        
       
    return password;//concatenar con Strings toDo generate pass with params
    }//generate
}//passwordGenerator
    

    

