package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ArithmaticServlet extends HttpServlet {

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

       

 
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalc.jsp").forward(request, response);
        return;
    }

    @Override

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String m1 = request.getParameter("n1");
        String m2 = request.getParameter("n2");
        request.setAttribute("first", m1);
        request.setAttribute("second", m2);
        String message = "";
        try {
            int i1 = Integer.parseInt(m1);
            int i2 = Integer.parseInt(m2);
            int t = 0;

            String action = request.getParameter("op");
            switch (action) {
                case "+":
                    t = i1 + i2;
                    break;
                case "-":
                    t = i1 - i2;
                    break;
                case "*":
                    t = i1 * i2;
                    break;
                case "/":
                    t = i1 / i2;
                    break;
                default:
                    break;
            }
            message = "---" + t;
             request.setAttribute("message", message);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalc.jsp").forward(request, response);
            return;
        } catch (Exception e) {

            message = "You must enter a numeric value";

            request.setAttribute("message", message);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalc.jsp").forward(request, response);
            return;

        }

    }

}
