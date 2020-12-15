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
public class Task3Servlet extends GenericServlet {
    public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException{
        res.setContentType("text/html");
        PrintWriter pwriter=res.getWriter();
        pwriter.print("<html>");
        pwriter.print("<body>");
        pwriter.print("<h2>Description</h2>");
        pwriter.print("Develop an algorithm to reverse a string both iteratively and recursively. Additional credits for unit testing the code.");
        pwriter.print("<h2>Solution</h2>");
        pwriter.print("Github URL: https://github.com/zhangriqi/MyHelloWeb");
        pwriter.print("</body>");
        pwriter.print("</html>");
    }
}
