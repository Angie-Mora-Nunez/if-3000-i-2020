
import edu.ucr.rp.web.jetty.server.JettyServer;
import edu.ucr.rp.web.jetty.servlet.ResourcesServlet;
import edu.ucr.rp.web.jetty.servlet.RoomServlet;
import edu.ucr.rp.web.jetty.servlet.WelcomeServlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Equipo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) throws Exception {
        JettyServer server = new JettyServer(8080);
        server.registerServlet(WelcomeServlet.class,"/welcome");
        server.registerServlet(ResourcesServlet.class,"/resource");
        server.registerServlet(RoomServlet.class,"/room");
        
        server.start();
    }
}








