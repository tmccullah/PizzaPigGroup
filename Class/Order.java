package com.company;

import java.text.NumberFormat;
import java.util.ArrayList;

import java.util.List;

public class Order {

    NumberFormat formatter = NumberFormat.getCurrencyInstance();

    private String name;//name

    List<Pizza> pizzas= new ArrayList<>();//list to hold Pizzas

    List<Side> sides= new ArrayList<>();//list to hold Side

    List<Drink> drinks= new ArrayList<>();//list to hold drinks

/* getters and setters */

    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public List<Pizza> getPizzas() {

        return pizzas;

    }

    public void setPizzas(Pizza Pizzas) {

        this.pizzas.add(Pizzas);

    }

    public List<Side> getSides() {

        return sides;

    }

    public void setSide(Side Side) {

        this.sides.add(Side);

    }

    public void setDrinks(Drink Drinks){
        this.drinks.add(Drinks);
    }
    public List<Drink> getDrinks() {

        return drinks;

    }



    public String getTotal(){
        double total = 0.0;
        for (Pizza p : pizzas) {
            total += p.getPrice();
        }
        for (Side s : sides) {
            total += s.getPrice();
        }
        for (Drink d : drinks) {
            total += d.getPrice();
        }
        return formatter.format(total);
    }

}