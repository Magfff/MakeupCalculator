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
	public void testMaterialRate() {
		Product.Material type=Product.Material.FOOD;
		assertEquals(0.13,type.rate,0);
	}
	
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
}
