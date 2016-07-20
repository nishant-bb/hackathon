package com.bankbazaar.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by nishant on 20/7/16.
 */
public class HackathonServlet extends HttpServlet {

    private Map<String, String> userNamePasswordMap = new HashMap<String, String>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getContextPath());
        String page = req.getParameter("page");
        page = (page == null) ? "sample" : page;
        RequestDispatcher dispatcher = req.getRequestDispatcher("/" + page + ".jsp");
        dispatcher.forward(req,resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    private String processAdminRequest(HttpServletRequest req, HttpServletResponse resp)
    {
        return "admin";
    }

    private String processCustomerRequest(HttpServletRequest req, HttpServletResponse resp)
    {
        return "customer";
    }
}
