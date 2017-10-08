package com.company;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class Pizza
{
    NumberFormat formatter = NumberFormat.getCurrencyInstance();

    String name;
    Double price;
    String crust;
    String size;
    int quantity = 1;

    List<String> toppings = new ArrayList<>();


    public Pizza(double price) {//constructor to set variables

        super();

        this.name="Pizza";

        this.price = price;

    }

/* getters and setters */

    public void setName(String name) {

        this.name = name;

    }

    public double getPrice() {

        return price * quantity;

    }

    public void setPrice(double price) {

        this.price = price;

    }

    public void setCrust(String crust){
        this.crust = crust;
    }

    public String getCrust(){
        return crust;
    }

    public void setSize(String size){
        this.size = size;
    }

    public String getSize(){
        return size;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getQuantity(){
        return quantity;
    }

    public String toString(){
        String toString;

        StringBuilder toStringBuilder = new StringBuilder(this.quantity + " " + this.size + " " + this.name + " pizza w/ ");
        toStringBuilder.append(toppings.remove(0));
        for (String t: toppings){
            toStringBuilder.append(", ").append(t);
        }
        toStringBuilder.append(" = " + formatter.format(this.price));
        toString = toStringBuilder.toString();
        return toString;
    }
    public void addTopping(String topping, double price){
        toppings.add(topping);
        this.price += price;
    }

}

