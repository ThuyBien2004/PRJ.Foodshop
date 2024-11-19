/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author doixu
 */
public class Order {
    private int id;
    private int foodId;
    private int toppingId;
    private String voucher;

    public Order() {
    }
    public Order(int foodId, int toppingId) {
        this.foodId = foodId;
        this.toppingId = toppingId;
    }

    public Order(int id, int foodId, int toppingId, String voucher) {
        this.id = id;
        this.foodId = foodId;
        this.toppingId = toppingId;
        this.voucher = voucher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public int getToppingId() {
        return toppingId;
    }

    public void setToppingId(int toppingId) {
        this.toppingId = toppingId;
    }

    public String getVoucher() {
        return voucher;
    }

    public void setVoucher(String voucher) {
        this.voucher = voucher;
    }
    
    
}
