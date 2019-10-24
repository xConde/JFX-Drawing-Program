package shapes;

/**
 * ShapeType enum. Allows us to pick shapes rectangle, circle, and no shape. 
 *
 */
public enum ShapeType {
	RECTANGLE("RECTANGLE"), CIRCLE("CIRCLE"), NOSHAPE("NOSHAPE");
	
	private final String shapesText;
	
	/**
	 * Shape constructor takes in a specified text for shape and makes it more visually appealing.
	 */
	ShapeType(String shapesText) {
		this.shapesText = shapesText;
	}
	
	public String getShapesText() {
		return this.shapesText;
	}

}
