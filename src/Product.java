/**
 *
 * This class will hold all information about a product object including basePrice, #person need, and material type etc
 * @author ziqifeng
 *
 */
public class Product {
	
	//class instance to count how many produce has been created 
	private static int count=0;
	/**
	 * This enum Material contains the name of the material type 
	 * the index of the type will be used as numeric codes to allow user to assign the associated material to product
	 * putting material as a inner enum because it will be access only by Product class
	 * most importantly, there is a protect value associated to each Constant and we dont want others but Product Object to access them
	 *
	 */
	public enum Material {
			PHARMACEUTICALS(0.075), FOOD(0.13), ELECTRONIC(0.02), OTHERS(0);
			
			protected double rate;

			private Material(double value) {
				this.rate = value;
			}
		}
	
	private double FLAT_RATE = 0.05;
	private double LABOR_RATE = 0.012;
	private double basePrice;
	private int numPerson;
	private Product.Material type;
	private double totalCost;
	
	public Product(double basePrice, int numPerson, Product.Material type) {
		this.basePrice = basePrice;
		this.numPerson = numPerson;
		this.type = type;		
		this.totalCostHelper();
		count+=1;
	}
	
	/**
	 * 
	 * @return the base price of the product
	 */
	public double getPrice() {
		return basePrice;
	}
	
	/**
	 * 
	 * @return the number of people need to finish the makeup
	 */
	public int getPersonNum() {
		return numPerson;
	}
	
	/**
	 * 
	 * @return the material of the product
	 */
	public Product.Material getMaterial() {
		return type;
	}
	
	/**
	 * 
	 * @return total cost of the product
	 */
	public double getTotalCost() {
		return totalCost;
	}
	
	/**
	 * This method calculates the total makeup cost based on the rules
	 * and the final value will be assigned to a Product instance
	 */
	private void totalCostHelper() {
		// flate cost
		double baseCost = (1 + FLAT_RATE) * basePrice;

		// extra cost
		double totalLaborRate = numPerson * LABOR_RATE;
		double materialRate = type.rate;

		this.totalCost = baseCost * (1 + totalLaborRate + materialRate);
	}
	
	/**
	 * @return a string including info of input base price, number of people, material type of the produce
	 */
	public String toString() {
		String input = String.format("$%,.2f", this.basePrice) + ", " + this.numPerson + " people, " + type;
		return input;
	}
	
	public static int getCount(){
		return count;
	}

	
}
