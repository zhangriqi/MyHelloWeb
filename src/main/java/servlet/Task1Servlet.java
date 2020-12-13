/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author zhangruiqi
 */
public class Task1Servlet extends GenericServlet{
    public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException{
        res.setContentType("text/html");
        PrintWriter pwriter=res.getWriter();
        pwriter.print("<html>");
        pwriter.print("<body>");
        pwriter.print("<h2>Description</h2>");
        pwriter.print("Develop an algorithm that finds the most frequent integer in an integer array. Show how you solve problems.");
        pwriter.print("<h2>Solution</h2>");
        pwriter.print("Approach1:....");
        pwriter.print("</body>");
        pwriter.print("</html>");
    }
}
