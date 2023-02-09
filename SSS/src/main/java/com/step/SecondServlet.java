package com.step;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/shop"})
public class SecondServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Shop</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h1> Hello dear </h1>\n" + req.getParameter("userName") +
                "\n" +
                "\n" +
                "<form action=\"/bill\" method=\"get\">\n" +
                "    <div> Make your order</div>\n" +
                "    <h1>\n" +
                "        <select name=\"category\" size=\"5\" multiple>\n" +
                "            <option> nokia 25$</option>\n" +
                "            <option> samsung galaxy 200$</option>\n" +
                "            <option> xiomi redmi 120$</option>\n" +
                "            <option> iphone 400$</option>\n" +
                "        </select>\n" +
                "        <div>\n" +
                "\n" +
                "        </div>\n" +
                "        <input type=\"submit\" value=\"next page\">\n" +
                "    </h1>\n" +
                "</form>\n" +
                "</body>\n" +
                "</html>\n");
        req.getSession().setAttribute("name", req.getParameter("userName"));
    }
}

