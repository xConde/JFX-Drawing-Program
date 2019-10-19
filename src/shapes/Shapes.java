package shapes;

/**
 * Shapes enum
 *
 */
public enum Shapes {
	RECTANGLE("Rectangle"), CIRCLE("Circle"), NOSHAPE("Noshape");
	
	private final String shapesText;
	
	/**
	 * Color constructor takes in a specified text for color and makes it more visually appealing.
	 */
	Shapes(String shapesText) {
		this.shapesText = shapesText;
	}
	
	public String getColorText() {
		return this.shapesText;
	}

}
