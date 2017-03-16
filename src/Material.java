/**
 * This enum Material contains the name of the material type 
 * the index of the type will be used as numeric codes to allow user to assign the associated material to product
 * @author ziqifeng
 *
 */
public enum Material {
		PHARMACEUTICALS(0.075), FOOD(0.13), ELECTRONIC(0.02), OTHERS(0);

		protected double rate;

		private Material(double value) {
			this.rate = value;
		}
	}