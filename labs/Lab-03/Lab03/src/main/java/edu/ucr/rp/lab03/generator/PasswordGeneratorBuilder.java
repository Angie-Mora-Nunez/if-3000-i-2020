/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucr.rp.lab03.generator;

/**
 *
 * @author Angie Mora Núñez
 */
public class PasswordGeneratorBuilder {

    
    
    private Integer MinSpecialChars;
    private Integer minUpperCase;
    private Integer minNumbers;
    private Integer maxLength;
    private char[] specialChars;
    private Integer MaxLength;
    
   
//2mayusy min
    
    public PasswordGeneratorBuilder withMinSpecialChars(Integer MinSpecialChars){
            this.MinSpecialChars=MinSpecialChars;  
    return this;
    }//passwodorbuilderSpecialchars
    
    public PasswordGeneratorBuilder withMinUpperCase(Integer minUpperCase){
            this.minUpperCase=minUpperCase;
    return this;
    }//passwodorbuilderUppercase
    
    public PasswordGeneratorBuilder withminNumbers(Integer minNumbers){
            this.minNumbers=minNumbers;
    return this;
    }//passwodorbuilderminnumbers
    
     public PasswordGeneratorBuilder withmaxLength(Integer maxLength){//no se usara
    this.maxLength=maxLength;
    return this;
    }//passwodorbuildermaxlength
     
      public PasswordGeneratorBuilder withspecialChars(char[] specialChars){
    this.specialChars=specialChars;
    return this;
    }//passwodorbuilderspecialChars
      
      public PasswordGeneratorBuilder withMaxLength(int MaxLength){
    this.MaxLength=MaxLength;
    return this;
    }//passwodorbuilders
    
   public PasswordGenerator build(){//sirve para crear la instancia de password el objeto por medio de recetas ejemplo toma los ingredientes de arriba
       if (MaxLength==null) {
           MaxLength=Integer.MAX_VALUE;
       }//if
   return new PasswordGenerator(MinSpecialChars, //es el unico que genera el pasworgenerator y se va alos constructores grandes
           minUpperCase, 
           minNumbers, 
           maxLength, 
           specialChars
             );
   
   }//passworGenerator

}//PasswordGeneratorBuild