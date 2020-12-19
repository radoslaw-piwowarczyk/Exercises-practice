package com.example.redirection;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/login")
public class LoginController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if ("admin".equals(username) && "admin".equals(password)) {
            request.getSession().setAttribute("username", username);
            response.sendRedirect("admin");
        } else {
            response.sendRedirect("error.jsp");
        }
    }

}
