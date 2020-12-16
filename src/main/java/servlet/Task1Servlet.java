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
        pwriter.print("Approach1: Use a hashmap as counter to store the frequencies of integers in the array. "
                + "Iterate the entries and return the key of the entry with greatest value.");
        pwriter.print("</br>");
        pwriter.print("<pre>");
        pwriter.print("<code class=\"language-java\">");
        pwriter.print("private static Integer findMostFrequent1(int[] arr) {</br>");
        pwriter.print("	if(arr == null || arr.length == 0) {</br>");
        pwriter.print("		return null;</br>");
        pwriter.print("	}</br>");
        pwriter.print("	Map<Integer, Integer> counter = new HashMap<>();</br>");
        pwriter.print("	for(int x : arr) {</br>");
        pwriter.print("		counter.put(x, counter.getOrDefault(x,0)+1);</br>");
        pwriter.print("	}</br>");
        pwriter.print("	int freq = 1;</br>");
        pwriter.print("	Integer result = 0;</br>");
        pwriter.print("	for(Map.Entry<Integer, Integer> entry : counter.entrySet()) {</br>");
        pwriter.print("		if(entry.getValue() >= freq) {</br>");
        pwriter.print("			result = entry.getKey();</br>");
        pwriter.print("			freq = entry.getValue();</br>");
        pwriter.print("		}</br>");
        pwriter.print("	}</br>");
        pwriter.print("	return result;</br>");
        pwriter.print("}</br>");
        pwriter.print("</code>");
        pwriter.print("</pre>");
        pwriter.print("</br>");
        pwriter.print("Approach2: Use a hashmap as counter to store the frequencies of integers in the array. "
                + "Sort the map entries based on its value in descending order.");
        pwriter.print("</br>");
        pwriter.print("<pre>");
        pwriter.print("<code class=\"language-java\">");
        pwriter.print("private static Integer findMostFrequent2(int[] arr) {</br>");
        pwriter.print("	if(arr == null || arr.length == 0) {</br>");
        pwriter.print("		return null;</br>");
        pwriter.print("	}</br>");
        pwriter.print("	Map<Integer, Integer> counter = new HashMap<>();</br>");
        pwriter.print("	for(int x : arr) {</br>");
        pwriter.print("		counter.put(x, counter.getOrDefault(x,0)+1);</br>");
        pwriter.print("	}</br>");
        pwriter.print("	List<Map.Entry<Integer, Integer>> list = new ArrayList<>(counter.entrySet());</br>");
        pwriter.print("	Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {</br>");
        pwriter.print("		public int compare(Map.Entry<Integer, Integer> e1, Map.Entry<Integer, Integer> e2) {</br>");
        pwriter.print("			return e2.getValue()-e1.getValue();</br>");
        pwriter.print("		}</br>");
        pwriter.print("	});</br>");
        pwriter.print("	return (Integer)list.get(0).getKey();</br>");
        pwriter.print("}</br>");
        pwriter.print("</code>");
        pwriter.print("</pre>");

        pwriter.print("</body>");
        pwriter.print("</html>");
    }
}
