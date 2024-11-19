package servlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dao.FoodDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Food;

/**
 *
 * @author HuyBui
 */
@WebServlet(urlPatterns = {"/FoodListServlet"})
public class FoodListServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");

        FoodDAO foodDao = new FoodDAO();
        List<Food> foodList = new ArrayList<>();
        foodList = foodDao.getAllFood();
        System.out.println("=== Get all food success ===");
        // Logger.getLogger(FoodListServlet.class.getName()).log(Level.INFO, "=== Get all food success ===");
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>TODO supply a title</title>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
            out.println("</head>");
            out.println("<body>");
            out.println("<div>TODO write content</div>");
            out.println("<a href=\"newhtml.html\">Go to newhtml.html</a>");
            out.println("<a href=\"product/newhtml.html\">Go to product newhtml.html</a>");
            out.println("<a href=\"InfoLink\">Go to InfoLink</a>");

            out.println("<div>Order Food</div>");
            out.println("<form action=\"InfoLink\" method=\"post\">");
            out.println("<select name=\"dish\" id=\"dish-select\">");
            for (Food food : foodList) {
                out.println("<option>"+food.getName()+"</option>");
            }
            out.println("</select>");

            out.println("<select name=\"Topping\" id=\"topping-select\">");
            out.println("<option value=\"\">--Please choose a Topping--</option>");
            out.println("<option value=\"hanh\">hanh</option>");
            out.println("<option value=\"rau\">rau</option>");
            out.println("<option value=\"tieu\">tieu</option>");
            out.println("<option value=\"tra\">tra da</option>");
            out.println("</select>");

            out.println("Voucher <input type=\"text\" name=\"voucher\" />");
            out.println("<input type=\"submit\" value=\"Order\"/>");
            out.println("</form>");

            out.println("</body>");
            out.println("</html>");
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
