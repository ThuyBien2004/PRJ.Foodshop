<%-- 
    Document   : newjsp
    Created on : Oct 14, 2024, 7:51:22 PM
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
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div>TODO write content</div>
        <a href="newhtml.html">Go to newhtml.html</a>
        <a href="product/newhtml.html">Go to product newhtml.html</a>
        <a href="InfoLink">Go to InfoLink</a>

        <!--<form action="InfoLink" method="get">-->
        <div>Order Food</div>
        <form action="InfoLink" method="post">
            <select name="foodId" id="dish-select">
                <option value="">--Please choose a dish--</option>
                <%
                    for (Food food : foodList) {
                %>
                <!--khối code dùng để in giá trị ra trang web-->
                <option value="<%=food.getId() %>"><%=food.getName() %></option>
                <%
                    }
                %>
            </select>

            <select name="toppingId" id="topping-select">
                <option value="">--Please choose a Topping--</option>
                <option value="1">hanh</option>
                <option value="2">rau</option>
            </select>   
            Voucher <input type ="text" name="voucher" placeholder="123"/>
            <input type="submit" value="Order"/>
        </form>

        <form action="FoodCreateServlet">
            <div>Create new food</div>
            <!--<label>Id</label><input type="text" name="id"/>-->
            <label>Food name</label><input type="text" name="name"/>
            <label>Price</label><input type="number" name="price"/>
            <input type="submit" value="Create new food"/>
        </form>
    </body>
</html>
