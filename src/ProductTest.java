import static org.junit.Assert.*;

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
	public void testMaterial() {
		Product product=new Product(1299.99,3,Product.Material.FOOD);
		assertEquals(Product.Material.FOOD,product.getMaterial());
	}	
}
