/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucr.rp.web.jetty.servlet;

import edu.ucr.rp.web.jetty.domain.User;
import edu.ucr.rp.web.jetty.repository.UserRepository;
import edu.ucr.rp.web.jetty.util.FileUtil;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class WelcomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html; charset=UTF-8");
        resp.getWriter().println(FileUtil.readFromFile("welcome.html"));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = req.getParameter("fname");
        String lastName = req.getParameter("lname");
        String email = req.getParameter("email");

        UserRepository.getInstance().add(new User(name, lastName, email));

        resp.sendRedirect("room?email="+email);//room?name=jcartero@vecindad.com

    }
}










