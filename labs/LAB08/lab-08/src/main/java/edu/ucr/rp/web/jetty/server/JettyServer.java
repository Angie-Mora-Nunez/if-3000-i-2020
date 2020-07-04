/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucr.rp.web.jetty.server;

import javax.servlet.http.HttpServlet;
import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.servlet.ServletHandler;
import org.eclipse.jetty.util.thread.QueuedThreadPool;

/**
 *
 * @author Equipo
 */
public class JettyServer {
    private Server server;
    private ServletHandler handler;
    private Integer port;
    private Integer maxThreads=100;
    private Integer minThreads=10;
    private Integer idleTimeout=120;
    
    public JettyServer(Integer port){
      this.port = port;
      handler= new ServletHandler();
    }
    public void start() throws Exception {
        QueuedThreadPool threadPool = new QueuedThreadPool(maxThreads, minThreads, idleTimeout);
        server = new Server(threadPool);
        ServerConnector connector = new ServerConnector(server);
        connector.setPort(port);
        server.setConnectors(new Connector[] {connector});
        server.setHandler(handler);

        server.start();
        server.join();
    }
    
    public void registerServlet(Class<? extends HttpServlet> servlet, String path) {
        handler.addServletWithMapping(servlet, path);
    }
    
}



