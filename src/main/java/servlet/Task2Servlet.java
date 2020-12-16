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
public class Task2Servlet extends GenericServlet {
    public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException{
        res.setContentType("text/html");
        PrintWriter pwriter=res.getWriter();
        pwriter.print("<html>");
        pwriter.print("<body>");
        pwriter.print("<h2>Description</h2>");
        pwriter.print("Develop an algorithm to reverse a string both iteratively and recursively. Additional credits for unit testing the code.");
        pwriter.print("<h2>Solution</h2>");
        pwriter.print("Approach1: Iterative solution");
        pwriter.print("</br>");
        pwriter.print("<pre>");
        pwriter.print("<code class=\"language-java\">");
        pwriter.print("public static String reverseIter(String s) {</br>");
        pwriter.print("	if(s == null || s.length() == 0) {</br>");
        pwriter.print("		return \"\";</br>");
        pwriter.print("	}</br>");
        pwriter.print("	String result = \"\";</br>");
        pwriter.print("	for(int i = 0; i < s.length(); i++) {</br>");
        pwriter.print("		result = s.charAt(i)+result;</br>");
        pwriter.print("	}</br>");
        pwriter.print("	return result;</br>");
        pwriter.print("}</br>");
        pwriter.print("</code>");
        pwriter.print("</pre>");
        pwriter.print("</br>");
        pwriter.print("Approach2: Recursive solution");
        pwriter.print("</br>");
        pwriter.print("<pre>");
        pwriter.print("<code class=\"language-java\">");
        pwriter.print("public static String reverseRecur(String s) {</br>");
        pwriter.print("	if(s == null || s.length() == 0) {</br>");
        pwriter.print("		return \"\";</br>");
        pwriter.print("	}</br>");
        pwriter.print("	return s.charAt(s.length()-1)+reverseRecur(s.substring(0, s.length()-1));</br>");
        pwriter.print("}</br>");
        pwriter.print("</code>");
        pwriter.print("</pre>");
        pwriter.print("</body>");
        pwriter.print("</html>");
    }
}
