/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Order;
import utils.DBUtils;

/**
 *
 * @author doixu
 */
public class OrderDAO {
    public void createOrders(Order orders) {
        Connection con = DBUtils.makeConnection();

        String sql = "insert into [Order] (foodId, toppingId) values (?,?)";

        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1, orders.getFoodId());
            stm.setInt(2, orders.getToppingId());

            stm.executeUpdate();

        } catch (SQLException ex) {
            System.err.println("==== Loi truy van SQL - " + ex.getMessage());
        }
    }
}
