/**
 *
 * This class will hold all information about a product object including basePrice, #person need, and material type etc
 * 
 * @author ziqifeng
 *
 */
public class Product {
	
	/**
	 * This enum Material contains the name of the material type 
	 * the index of the type will be used as numeric codes to allow user to assign the associated material to product
	 * putting material as a inner enum because it will be access only by Product class
	 * most importantly, there is a private value which we dont want to access by others associated to each Constant 
	 * @author ziqifeng
	 *
	 */
	public enum Material {
			PHARMACEUTICALS(0.075), FOOD(0.13), ELECTRONIC(0.02), OTHERS(0);
			
			private double rate;

			private Material(double value) {
				this.rate = value;
			}
		}
	
	private double FLAT_RATE = 0.05;
	private double LABOR_RATE = 0.012;
	private double basePrice;
	private int numPerson;
	private Product.Material type;
	
	
	
	public Product(double basePrice, int numPerson, Product.Material type) {
		this.basePrice = basePrice;
		this.numPerson = numPerson;
		this.type = type;		
	}
	
	public double getPrice() {
		return basePrice;
	}
	
	public int getPersonNum() {
		return numPerson;
	}
	
	public Product.Material getMaterial() {
		return type;
	}
	
}
