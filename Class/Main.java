package com.company;

public class Main {

    public static void main(String[] args) {
	Pizza p1 = new Pizza(2.00);
	p1.setName("cheese");
	p1.setSize("Medium");
	p1.addTopping("pineapple", 1.00); //ewww
    p1.addTopping("spinach", 2.50);
	Side s1 = new Side(1.50);
	s1.setName("Garlic Bread");
	s1.setQuantity(3);
	Drink d1 = new Drink(0.75);
	d1.setName("Sweet Tea");

	Order myOrder = new Order();
	myOrder.setPizzas(p1);
	myOrder.setSide(s1);
	myOrder.setDrinks(d1);
	System.out.println(p1.toString());
	System.out.println("Total price: " + myOrder.getTotal());

    }
}
