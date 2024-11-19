<%-- 
    Document   : updateFood.jsp
    Created on : Nov 7, 2024, 11:31:53 PM
    Author     : doixu
--%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Food"%>
<%@page import="dao.FoodDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%!
    // Khối code này dùng để khai báo biến mới
    FoodDAO foodDao = new FoodDAO();
    List<Food> foodList = new ArrayList<>();
%>

<%
    // Khối code java
    foodList = foodDao.getAllFood();
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Update food!</h1>
        <form action="FoodUpdateServlet" method="post">
            <select name="foodId" id="dish-select">
                <option value="">--Please choose a food id--</option>
                <%
                    for (Food food : foodList) {
                %>
                <!--khối code dùng để in giá trị ra trang web-->
                <option value="<%=food.getId()%>"><%=food.getName()%></option>
                <%
                    }
                %>
            </select>

            <label>New name</label><input type="text" name="newName"/>
            <label>New price</label><input type="number" name="newPrice"/>
            <input type="submit" value="Update food"/>
        </form>
            
        <h1>Delete food!</h1>
        <form action="FoodDeleteServlet" method="post">
            <select name="foodId" id="dish-select">
                <option value="">--Please choose a food id--</option>
                <%
                    for (Food food : foodList) {
                %>
                <!--khối code dùng để in giá trị ra trang web-->
                <option value="<%=food.getId()%>"><%=food.getName()%></option>
                <%
                    }
                %>
            </select>

                     <input type="submit" value="Delete food"/>
        </form>
    </body>
</html>
