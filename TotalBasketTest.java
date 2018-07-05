import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Before;

import com.ajit.Basket;
import com.ajit.CalculateTotalBasketCost;

import com.ajit.Item;


public class TotalBasketTest extends TestCase{

	Basket basket;
	@Before
	public void setUp() throws Exception {
		
		List<Item> items = new ArrayList<>();
		basket = new Basket();
		
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
		
	}

	public void testAdd() {
		double total = 43;
		double sum = CalculateTotalBasketCost.getTotal(basket);
		assertEquals(sum, total);
	}
		
	public void testFailedAdd() {
		double total = 44;
		double sum = CalculateTotalBasketCost.getTotal(basket);
		assertNotEquals(sum, total);
	}

}
