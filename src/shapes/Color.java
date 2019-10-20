package shapes;

/**
 * Color enum
 * @author Ed
 *
 */
public enum Color {
	RED("RED"), BLUE("BLUE"), YELLOW("YELLOW"), ORANGE("ORANGE"), GREEN("GREEN");
	
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
