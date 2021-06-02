package com.techmeskills.servlet;

import com.techmeskills.Calculator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/calculator")
public class MainServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }

    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Calculator calculator = new Calculator(req.getParameter("a"), req.getParameter("b"));
        PrintWriter writer = resp.getWriter();
        writer.write("Addition result: " + calculator.sum(req.getParameter("a"), req.getParameter("b")) + "\n");
        writer.write("Subtraction result: " + calculator.minus(req.getParameter("a"), req.getParameter("b")) + "\n");
        writer.write("Multiplication result: " + calculator.multiplication(req.getParameter("a"), req.getParameter("b")) + "\n");
        writer.write("Division result: " + calculator.division(req.getParameter("a"), req.getParameter("b")) + "\n");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/calculator.html");
        dispatcher.forward(req, resp);
    }
}
