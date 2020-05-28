
import edu.ucr.rp.lab05.service.RechargueService;
import thread.ThreadPool;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AngieMora
 */
public class Main {

    public static void main(String[] args) {
       RechargueService service = new RechargueService();
        service.recharge("+506 8812345", 10_000);

        ThreadPool.getPool().submit(() -> {
            RechargueService.Status status;
            do {
                status = service.getStatus("93657841");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ignored) {
                }
            } while (status == RechargueService.Status.IN_PROGRESS);
            if (status==RechargueService.Status.COMPLETED) {
                System.out.println("La recarga ha sido exitosa");
            }
            System.out.println("La recarga ha fallado");

          });//end accion
    }//endLaunch
}//endMain