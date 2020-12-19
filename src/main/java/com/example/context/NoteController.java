package com.example.context;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.Optional;

@WebServlet(urlPatterns = {"/private", "public"})
public class NoteController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        findNote(request).ifPresent(note -> request.setAttribute("note", note));
        request.getRequestDispatcher("/note.jsp").forward(request, response);
    }

    private Optional<String> findNote(HttpServletRequest request) {
        String servletPath = request.getServletPath();
        String noteId = request.getParameter("id");
        String note = null;
        if (servletPath.contains(NoteUtils.PRIVATE_PATH)) {
            note = (String) request.getSession().getAttribute(noteId);
        } else if (servletPath.contains(NoteUtils.PUBLIC_PATH)) {
            note = (String) getServletContext().getAttribute(noteId);
        }
        return Optional.ofNullable(note);
    }
}
