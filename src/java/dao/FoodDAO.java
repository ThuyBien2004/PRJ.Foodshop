/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Food;
import utils.DBUtils;

/**
 *
 * @author HuyBui
 */
// DAO - Data access object
public class FoodDAO {

    // Get all food
    public List<Food> getAllFood() {
        List<Food> foodList = new ArrayList<>();
        // Tao connection
        Connection con = DBUtils.makeConnection();

        // Thuc hien truy van (Prepare Statement)
        String sql = "Select * from Food";

        try {
            PreparedStatement stm = con.prepareStatement(sql);

            // Lay ket qua tu Result Set
            ResultSet rs = stm.executeQuery();

            // Nếu vẫn còn kết quả kế tiếp từ truy vấn
            while (rs.next()) {
                // id: 2 - name: Com tam - price: 120
                int ID = rs.getInt("id"); // Lấy giá trị từ cột id từ kết quả truy vấn
                String name = rs.getNString("name"); // Pho
                double price = rs.getDouble("price"); // 100

                Food food = new Food(ID, name, price);
                foodList.add(food);
            }

        } catch (SQLException ex) {
            System.err.println("==== Loi truy van SQL - " + ex.getMessage());
            Logger.getLogger(FoodDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return foodList;
    }

    // Get food by id
    // Create new food
    public void createFood(Food food) {
        // Tao connection
        Connection con = DBUtils.makeConnection();

        // Thuc hien truy van (Prepare Statement) 
        // id, name, price
        // String sql = "Insert into Food values(?, ?, ?)";
        String sql = "Insert into Food(name, price) values(?, ?)";

        try {
            PreparedStatement stm = con.prepareStatement(sql);
            // stm.setInt(1, food.getId());
            // stm.setNString(2, food.getName());
            // stm.setDouble(3, food.getPrice());

            stm.setNString(1, food.getName());
            stm.setDouble(2, food.getPrice());

            stm.executeUpdate();

        } catch (SQLException ex) {
            System.err.println("==== Loi truy van SQL - " + ex.getMessage());
        }
    }

    // Update food by id
    public void updateFood(Food food) {
        // Tao connection
        Connection con = DBUtils.makeConnection();

        // Thuc hien truy van (Prepare Statement) 
        // id, name, price
        // String sql = "Insert into Food values(?, ?, ?)";
        String sql = "update Food set name = ?, price = ? where id = ?";

        try {
            PreparedStatement stm = con.prepareStatement(sql);
            // stm.setInt(1, food.getId());
            // stm.setNString(2, food.getName());
            // stm.setDouble(3, food.getPrice());

            stm.setNString(1, food.getName());
            stm.setDouble(2, food.getPrice());
            stm.setInt(3, food.getId());

            stm.executeUpdate();

        } catch (SQLException ex) {
            System.err.println("==== Loi truy van SQL - " + ex.getMessage());
        }
    }

    // Delete food by id
    public void deleteFood(int id ) {
        // Tao connection
        Connection con = DBUtils.makeConnection();

        // Thuc hien truy van (Prepare Statement) 
        // id, name, price
        // String sql = "Insert into Food values(?, ?, ?)";
        String sql = "DELETE FROM Food WHERE id = ?";

        try {
            PreparedStatement stm = con.prepareStatement(sql);
            // stm.setInt(1, food.getId());
            // stm.setNString(2, food.getName());
            // stm.setDouble(3, food.getPrice());

            stm.setInt(1,id);

            int rowsAffected = stm.executeUpdate();

        } catch (SQLException ex) {
            System.err.println("==== Loi truy van SQL - " + ex.getMessage());
        }
    }
}
