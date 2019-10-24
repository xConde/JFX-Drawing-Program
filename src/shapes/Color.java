package shapes;

/**
 * Color enum
 *
 */
public enum Color {
	RED("Red"), BLUE("Blue"), YELLOW("Yellow"), ORANGE("Orange"), GREEN("Green");
	
	private final String colorText;
	
	/**
	 * Color constructor takes in a specified text for color and makes it more visually appealing.
	 */
	Color(String colorText) {
		this.colorText = colorText;
	}
	
	public String getColorText() {
		return this.colorText;
	}
}
