package com.ajit;

public class CalculateTotalBasketCost {
	public static double getTotal(Basket basket) {
		int total = 0;
		if(basket != null ) {
			for(Item item : basket.getList()) {
				int unitPrice = item.getUnitPrice();
				int quantity = item.getQuantity();
				total = total + unitPrice * quantity;
			}
			System.out.println("total cost : "+total);
			
		}
		return total;
	}
}
