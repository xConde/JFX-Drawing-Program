package shapes;

public class Circle extends Shape {
	
	protected int radius;
	
	public Circle(int radius) {
		this.radius = radius;
		this.xCord = 0;
		this.yCord = 0;
		this.color = Color.BLUE;
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
