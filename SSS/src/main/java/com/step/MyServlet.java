package com.step;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/welcome"})
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Welcome</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<form action=\"/shop\" method=\"get\">\n" +
                "    <div> Welcome to online shop!</div>\n" +
                "    <div></div>\n" +
                "    <div></div>\n" +
                "    <input type=\"text\" placeholder=\"your name\" name=\"userName\">\n" +
                "    <div></div>\n" +
                "    <input type=\"submit\" value=\"enter\">\n" +
                "</form>\n" +
                "</body>\n" +
                "</html>");
    }
}
