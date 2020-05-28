/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import edu.ucr.rp.lab05.service.RechargueService;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 *
 * @author Equipo
 */
public class ThreadPool {
    private static ExecutorService service;
    
    public static ExecutorService getPool(){
        
        if (service==null) {
            service=Executors.newCachedThreadPool();
        }//if
    
    return service;
    
    }//endgetPool
    public void run(){
    RechargueService.Status status;
    
    
    }//endrun
    
    
}//service
