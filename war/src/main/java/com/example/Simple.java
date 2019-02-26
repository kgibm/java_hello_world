package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.istack.internal.logging.Logger;

@WebServlet("/simple")
public class Simple extends HttpServlet
{
    private static final long serialVersionUID = -8008309355741650683L;

    private static final Logger logger = Logger.getLogger(Simple.class);

    @Override
    protected void service(final HttpServletRequest request, final HttpServletResponse response)
                    throws ServletException, IOException
    {
        if (logger.isLoggable(Level.FINER))
        {
            logger.entering(request, response);
        }

        PrintWriter out = response.getWriter();
        out.println("Hello World @ " + new java.util.Date());

        if (logger.isLoggable(Level.FINE))
        {
            logger.fine("Test parameter: " + request.getParameter("test"));
        }

        if (logger.isLoggable(Level.FINER))
        {
            logger.exiting();
        }
    }
}
