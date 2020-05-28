/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucr.rp.lab05.service;

import edu.ucr.rp.lab05.provider.SMSProviderAPIImpl;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.Animation.Status;
import thread.ThreadPool;

/**
 *
 * @author AngieMora
 */
public class RechargueService {
     private SMSProviderAPIImpl provider = new SMSProviderAPIImpl();
     public enum Status {IN_PROGRESS,COMPLETED,ERROR}//no necesita punto y coma y se separa por coma
    public Map<String,Status> recharges = new HashMap<>();
     
     /**
      * La  responsabilidad de este metodo es realixar la recarga si o si.
      * @param service numero de telefono
      * @param amount monto a recargar
      * @return un servicio al cual se le recarga
      * un mapa es una coleccion o una lista primer valor puede ser cualquiera
      * Map String es una lista el primer valor no se repite el segundo si se puede repetir
      * por dentro crea una cubeta es mas facil buscar en un lugar con menos 
      * busca un valor que represente un entero tiene su ciencia se crea como lo genera el ID y se usa como criterio de agrup
      * los enum limito lo que quiero usar es u enum y muere
      * 
      */
     
     public String recharge(String service, Integer amount){
         recharges.put(service, Status.IN_PROGRESS);
         ExecutorService exService = ThreadPool.getPool();
         exService.submit(()-> runRechargue(service, amount));
         return service;
    }//endRechargue
     
     
     public Status getStatus(String service){
     return recharges.get(service);
     
     }//endgetStatus

    private void runRechargue(String service, Integer amount) {
        boolean success;
        int retries=0;
        do{
        success= provider.recharge(service, amount);
        retries++;
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                System.out.println("Problemas con la recarga");
            }//endTryCatch
        }while(!success && retries <10);//end do-while 
        recharges.put(service, success? Status.COMPLETED:Status.ERROR);//puedo conectarlo con lo que sea 
        
       
    }//endRunRechargue 
    
}//endRecharge service
