package ru.academits.filimonov.hello_world_servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

public class HelloWorldServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        try (Writer writer = resp.getWriter()) {
            writer.write("<h1>You've got it!</h1>");
        }
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        try (Writer writer = resp.getWriter()) {
            writer.write("<h1>You've posted it!</h1>");
        }
    }
}
