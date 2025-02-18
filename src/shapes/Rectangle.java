package shapes;

/**
 * Rectangle class. Width and height are required for a rectangle. The origin is (0,0). The color of a created rectangle is Red. 
 *
 */
public class Rectangle extends Shape {
	
	protected int width, height;
	
	/**
	 * Rectangle constructor. 
	 * @param width
	 * @param height
	 */
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		this.xCord = 0;
		this.yCord = 0;
		this.color = Color.RED;
	}

	/**
	 * draw method Override for Rectangle 
	 */
	@Override
	public void draw() {
		System.out.println(String.format("Rectangle, Color: %s, Origin: (%d,%d), Width: %d, Height: %d", color, xCord, yCord, width, height));
		
	}

	/**
	 * delete method Override for Rectangle 
	 */
	@Override
	void delete() {
		// TODO Auto-generated method stub
		
	}

}
