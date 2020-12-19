package com.example.context;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/save")
public class SaveController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Note note = createNote(request);
        saveNote(note, request);
        String noteUrl = NoteUtils.buildNoteUrl(note);
        request.setAttribute("noteUrl", noteUrl);
        request.getRequestDispatcher("/confirmation.jsp").forward(request, response);
    }

    private Note createNote(HttpServletRequest request) {
        String noteId = request.getParameter("noteId");
        String noteContent = request.getParameter("noteContent");
        String noteType = request.getParameter("noteType");
        return new Note(noteId, noteContent, noteType);
    }

    private void saveNote(Note note, HttpServletRequest request) {
        if (note.getType().equals(Note.TYPE_PRIVATE)) {
            request.getSession().setAttribute(note.getId(), note.getContent());
        } else if (note.getType().equals(Note.TYPE_PUBLIC)) {
            ServletContext servletContext = getServletContext();
            servletContext.setAttribute(note.getId(), note.getContent());
        }
    }
}
