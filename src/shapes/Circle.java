package shapes;

/**
 * Circle class. Radius is required for a circle, origin is set to (0,0), and the color is created as Blue.
 *
 */
public class Circle extends Shape {
	
	protected int radius;
	
	public Circle(int radius) {
		this.radius = radius;
		this.color = Color.BLUE;
		this.xCord = 0;
		this.yCord = 0;
	}

	@Override
	public void draw() {
		String.format("Circle, Color: %s, Origin: (%d,%d), Radius: %d", color, xCord, yCord, radius);
		
	}

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
