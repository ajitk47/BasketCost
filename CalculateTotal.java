package com.ajit;


import java.util.ArrayList;
import java.util.List;


public class CalculateTotal {

	public static void main(String[] args) {
		List<Item> items = new ArrayList<>();
		Basket basket = new Basket();
		
		Item banana = new Item("Banana",5,1);
		Item oranges = new Item("Oranges",6,1);
		Item apples = new Item("Apples",7,1);
		Item lemon = new Item("Lemons",5,1);
		Item peaches = new Item("Peaches",10,2);
		
		items.add(banana);
		items.add(oranges);
		items.add(apples);
		items.add(lemon);
		items.add(peaches);
		
		basket.setList(items);
		
		CalculateTotalBasketCost.getTotal(basket);
		
	}
	
	
	
}	

	