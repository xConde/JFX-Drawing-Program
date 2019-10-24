package shapes;

/**
 * Circle class. Radius is required for a circle, origin is set to (0,0), and the color is created as Blue.
 *
 */
public class Circle extends Shape {
	
	protected int radius;
	
	/**
	 * Circle constructor.
	 * @param radius
	 */
	public Circle(int radius) {
		this.radius = radius;
		this.xCord = 0;
		this.yCord = 0;
		this.color = Color.BLUE;
	}

	/**
	 * draw method Override for Circle
	 */
	@Override
	public void draw() {
		System.out.println(String.format("Circle, Color: %s, Origin: (%d,%d), Radius: %d", color, xCord, yCord, radius));
	}

	/**
	 * delete method Override for circle
	 */
	@Override
	void delete() {
		// TODO Auto-generated method stub
		
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
}
