package shapes;

/**
 * ShapeBuilder class. Creates a rectangle or circle based off case.
 *
 */
public class ShapeBuilder {
	
	/**
	 * createShape method. Creates a shape based off of shape text.
	 * @param shapeType
	 * @param x
	 * @return
	 */
    public static Shape createShape(ShapeType shapeType, int[] x) {
        Shape shape = null;
        switch(shapeType.getShapesText()) {
            case "RECTANGLE":
                shape = new Rectangle(x[0], x[1]);
                break;
            case "CIRCLE":
                shape = new Circle(x[0]);
                break;
            default:
                break;
        }
        
        return shape;
    }
}
