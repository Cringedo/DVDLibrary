/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dvd.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ca
 */
public class ErrorPageServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List errorMsgs = (List) request.getAttribute("errorMsgs");
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>DVD Library Application Error Page</title>");
            out.println("</head>");
            out.println("<body bgcolor='white'>");
            out.println("<h2>Error Report</h2>");
            out.println("<font color='red'>Please correct the following errors:");
            out.println("<ul>");
            Iterator items = errorMsgs.iterator();
            while(items.hasNext()){
                String message = (String) items.next();
                out.println("   <li>" + message + "</li>");
            }
            out.println("</ul>");
            out.println("Back up and try again");
            out.println("</font>");
            
            out.println("<body>");
            out.println("<h1>Add DVD</h1>");
            out.println("<form action='add_dvd.do' method='POST'>");
            out.println("Title: <input type='text' name='title'> <br/> <br/>");
            out.println("Year: <input type='text' name='year'> <br/> <br/>");
            out.println("Genre: <select name='genre'>");
            out.println("<option value='Sci-fi'>Sci-fi</option>");
            out.println("<option value='Drama'>Drama</option>");
            out.println("<option value='Comedy'>Comedy</option>");
            out.println("</select>");
            out.println("or new genre: <input type='text' name='newGenre'> <br><br>");
            out.println("<input type='submit'>");
            out.println("</form>");
            out.println("</body>");
            
            out.println("<br/><a href='index.html'>Home</a>");
            
            out.println("</html>");
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
