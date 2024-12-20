package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.ArrayList;
import model.Food;
import dao.FoodDAO;

public final class updateFood_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    // Khối code này dùng để khai báo biến mới
    FoodDAO foodDao = new FoodDAO();
    List<Food> foodList = new ArrayList<>();

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    // Khối code java
    foodList = foodDao.getAllFood();

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1>Update Dish Information!</h1>\r\n");
      out.write("        <form action=\"FoodUpdateServlet\" method=\"post\">\r\n");
      out.write("            <select name=\"foodId\" id=\"dish-select\">\r\n");
      out.write("                <option value=\"\">--Please choose a food id--</option>\r\n");
      out.write("                ");

                    for (Food food : foodList) {
                
      out.write("\r\n");
      out.write("                <!--khối code dùng để in giá trị ra trang web-->\r\n");
      out.write("                <option value=\"");
      out.print(food.getId());
      out.write('"');
      out.write('>');
      out.print(food.getName());
      out.write("</option>\r\n");
      out.write("                ");

                    }
                
      out.write("\r\n");
      out.write("            </select>\r\n");
      out.write("\r\n");
      out.write("            <label>New name</label><input type=\"text\" name=\"newName\"/>\r\n");
      out.write("            <label>New price</label><input type=\"number\" name=\"newPrice\"/>\r\n");
      out.write("            <input type=\"submit\" value=\"Update food\"/>\r\n");
      out.write("        </form>\r\n");
      out.write("            \r\n");
      out.write("        <h1>Delete food!</h1>\r\n");
      out.write("        <form action=\"FoodDeleteServlet\" method=\"post\">\r\n");
      out.write("            <select name=\"foodId\" id=\"dish-select\">\r\n");
      out.write("                <option value=\"\">--Please choose a food id--</option>\r\n");
      out.write("                ");

                    for (Food food : foodList) {
                
      out.write("\r\n");
      out.write("                <!--khối code dùng để in giá trị ra trang web-->\r\n");
      out.write("                <option value=\"");
      out.print(food.getId());
      out.write('"');
      out.write('>');
      out.print(food.getName());
      out.write("</option>\r\n");
      out.write("                ");

                    }
                
      out.write("\r\n");
      out.write("            </select>\r\n");
      out.write("\r\n");
      out.write("                     <input type=\"submit\" value=\"Delete food\"/>\r\n");
      out.write("        </form>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
