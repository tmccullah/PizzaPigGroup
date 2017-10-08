package com.company;

public class Drink {//class for drink type food

    private String name;//name

    private double price;//price

    private int quantity;


    public Drink(double price) {

        super();

        this.name="Drink";

        this.price = price;

    }

    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public double getPrice() {

        return price * quantity;

    }

    public void setPrice(double price) {

        this.price = price;

    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}