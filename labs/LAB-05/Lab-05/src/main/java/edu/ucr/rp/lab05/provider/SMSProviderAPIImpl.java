/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucr.rp.lab05.provider;

import java.util.Random;

/**
 *
 * @author Equipo
 */
public class SMSProviderAPIImpl {
    /**
     * esto es un javadogs
     * @param service numero de teléfono.
     * @param amount monto de recarga.
     * @return true si se hace.
     */
    public boolean recharge(String service, Integer amount){
    boolean attempt = new Random().nextBoolean();//genera un boolean aleatorio
        if (attempt) {
            System.out.printf("Recarga exitosa al número teléfonico: %s de un monto de %d colones. \n",service,amount);//no concatena el primero retorna servicio s o de admite s string y d dijito supongo que o object se le agrega el \n
        }else{
            System.out.println("Recarga Fallida");
        }//endif-else
    
    return attempt;//el retorno es el que importa
    }//endBoolean
    
    
    
    
}//end
