package test.java;

import static org.junit.Assert.*;
import main.java.*;
import org.junit.Test;

public class ProductTest {

	@Test
	public void testBasePrice() {
		Product product=new Product(1299.99,3,Product.Material.FOOD);
		assertEquals(1299.99,product.getPrice(),0.0);
	}
	
	@Test
	public void testNumPerson() {
		Product product=new Product(1299.99,3,Product.Material.FOOD);
		assertEquals(3,product.getPersonNum());
	}	
	
	@Test
	public void testMaterialRate() {
		Product.Material type=Product.Material.FOOD;
		assertEquals(0.13,type.rate,0);
	}
	
	@Test
	public void testMaterialCode(){

		 // The numeric material type code is associated to the index of Material
		assertEquals(Product.Material.values()[0],Product.Material.PHARMACEUTICALS);
		assertEquals(Product.Material.values()[1],Product.Material.FOOD);
		assertEquals(Product.Material.values()[2],Product.Material.ELECTRONIC);
		assertEquals(Product.Material.values()[3],Product.Material.OTHERS);
	}
	
	@Test
	public void testMaterial() {
		Product product=new Product(1299.99,3,Product.Material.FOOD);
		assertEquals(Product.Material.FOOD,product.getMaterial());
	}	
	
	@Test
	public void testTotalCost() {
		double precison=0.01;
		/**
		 * Example 1:
		 *  Input:  $1,299.99, 3 people, food
		 *  Output: $1,591.58
		 */

		Product product=new Product(1299.99,3,Product.Material.FOOD);
		assertEquals(1591.58,product.getTotalCost(),precison);
		
		/**
		 * Example 2:
		 *  Input:  $5,432.00, 1 person, drugs
		 * 	Output: $6,199.81
		 */
		product=new Product(5432.00,1,Product.Material.PHARMACEUTICALS);
		assertEquals(6199.81,product.getTotalCost(),precison);
		
		/**
		 * Example 3:
		 *  Input:  $12,456.95, 4 people, books
		 *  Output: $13,707.63
		 */
		product=new Product(12456.95,4,Product.Material.OTHERS);
		assertEquals(13707.63,product.getTotalCost(),precison);
	}	
	
	@Test
	public void testCount(){
		//create 3 product objects
		Product product=new Product(1299.99,3,Product.Material.FOOD);
		product=new Product(5432.00,1,Product.Material.PHARMACEUTICALS);
		product=new Product(12456.95,4,Product.Material.OTHERS);
		
		assertEquals(3,Product.getCount());
	}
}
