package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
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

    public void exportOrder(){

        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://sql9.freemysqlhosting.net","sql9198591","rCHkr9glsa");
            Statement stmt=con.createStatement();
            stmt.executeUpdate("use sql9198591 ;");
            ResultSet rs=stmt.executeQuery("select * from customer");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
        }catch(Exception e){ System.out.println(e);}
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