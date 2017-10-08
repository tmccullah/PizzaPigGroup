package com.company;

public class Side {//class for drink type food

    private String name;//name

    private double price;//price

    private int quantity;

    public String getName() {

        return name;

    }

    public Side(double price) {//constructor to set variables

        super();

        this.name= "Side";

        this.price = price;

    }

/* getters and setters */

    public void setName(String name) {

        this.name = name;

    }

    public double getPrice() {

        return price;

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

