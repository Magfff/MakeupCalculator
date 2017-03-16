import static org.junit.Assert.*;

import org.junit.Test;

public class MaterialTest {

	@Test
	public void testMaterialRate() {
		Material type=Material.FOOD;
		assertEquals(0.13,type.rate,0);
	}
	
	public void testMaterialCode(){

		 // The numeric material type code is associated to the index of Material
		assertEquals(Material.values()[0],Material.PHARMACEUTICALS);
		assertEquals(Material.values()[1],Material.FOOD);
		assertEquals(Material.values()[2],Material.ELECTRONIC);
		assertEquals(Material.values()[3],Material.OTHERS);
	}
}
