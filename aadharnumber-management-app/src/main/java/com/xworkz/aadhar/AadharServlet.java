package com.xworkz.aadhar;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.details;
import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.title;

@WebServlet  ("/validate")
public class AadharServlet extends HttpServlet{

    public AadharServlet(){
        System.out.println("AadharServlet created now it can handle the"+"requst and response");

    }
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp){
        System.out.println("doGet method invoked");
    }
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("doPost method invoked");
        String userName = req.getParameter("username");
        System.out.println("user name is:"+ userName);

        String aadharNumber = req.getParameter("aadharnumber");
        System.out.println("Aadharcard number is:"+ aadharNumber);

        PrintWriter write = resp.getWriter();
        resp.setContentType("text/html");
        write.print("<html>");
        write.print("<head>");
        write.print("<titlt>"+"Aadhar card:"+"</title>");
        write.print("</head>");
        write.print("<body>");
        write.print("<h1>"+"Entered details are:"+"</h1>");
        write.print("<h2>"+userName+"</h2>");
        write.print("<h2>"+aadharNumber+"</h2>");
        write.print("</body>");
        write.print("</head>");


    }

}
