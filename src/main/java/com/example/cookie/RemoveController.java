package com.example.cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/remove")
public class RemoveController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie removeVisitCookie = new Cookie("visits", "");
        removeVisitCookie.setMaxAge(0);
        response.addCookie(removeVisitCookie);
        request.getRequestDispatcher("/removeConfirm.jsp").forward(request, response);
    }
}
