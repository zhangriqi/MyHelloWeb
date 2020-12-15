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
        pwriter.print("</br>");
        pwriter.print("<textarea id=\"w3review\" name=\"w3review\" rows=\"4\" cols=\"50\">");
        pwriter.print("Use a hashmap as counter to store the frequencies of integers in the array. "
                + "Iterate the entries and return the key of the entry with greatest value.");
        pwriter.print("</textarea>");

        pwriter.print("Approach2:....");
        pwriter.print("</br>");
        pwriter.print("<textarea id=\"w3review\" name=\"w3review\" rows=\"4\" cols=\"50\">");
        pwriter.print("Use a hashmap as counter to store the frequencies of integers in the array. "
                + "Sort the map entries based on its value in descending order.");
        pwriter.print("</textarea>");

        pwriter.print("</body>");
        pwriter.print("</html>");
    }
}
