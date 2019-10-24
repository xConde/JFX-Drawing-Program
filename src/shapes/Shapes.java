package shapes;

/**
 * Shapes enum
 *
 */
public enum Shapes {
	RECTANGLE("Rectangle"), CIRCLE("Circle"), NOSHAPE("Noshape");
	
	private final String shapesText;
	
	/**
	 * Shapes constructor takes in a specified text for a type of shape.
	 */
	Shapes(String shapesText) {
		this.shapesText = shapesText;
	}
	
	public String getColorText() {
		return this.shapesText;
	}

}
