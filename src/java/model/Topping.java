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
public class Topping {
    private int id;
    private String name;
    private double additionPrice;

    public Topping() {
    }

    public Topping(int id, String name, double additionPrice) {
        this.id = id;
        this.name = name;
        this.additionPrice = additionPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAdditionPrice() {
        return additionPrice;
    }

    public void setAdditionPrice(double additionPrice) {
        this.additionPrice = additionPrice;
    }
    
    
}
