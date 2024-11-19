package servlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dao.OrderDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Order;

/**
 * 
 * @author HuyBui
 */
public class InfoClass extends HttpServlet {

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
        request.setCharacterEncoding("UTF-8");
        
        // Lay thong tin
        int foodId = Integer.parseInt(request.getParameter("foodId"));
        int toppingId = Integer.parseInt(request.getParameter("toppingId"));
        
        // Tao order
        Order order = new Order(foodId,toppingId);
        
        OrderDAO orderDao = new OrderDAO();
        orderDao.createOrders(order);
        
        response.sendRedirect("newjsp.jsp");
        
//        String orderDish = request.getParameter("dish"); 
//        String orderTopping = request.getParameter("Topping");
//        String password = request.getParameter("voucher");
//        
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet InfoServlet</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet InfoServlet at " + request.getContextPath() + "</h1>");
//            
//            String[] voucherList = {"123", "khachmoi"};
//            if (password.equals("123")) {
//                out.println("<p>Chao mung den voi quan pho</p>");
//                System.out.println("Voucher thanh cong");
//            }
//            else {
//                System.out.println(request.getContextPath() +"/product/error-voucher.html");
//                
//                response.sendRedirect(request.getContextPath() +"/product/error-voucher.html");
//            }
//            out.println("<h1>Ban da dat " + orderDish + " va "+ orderTopping+"</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
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
