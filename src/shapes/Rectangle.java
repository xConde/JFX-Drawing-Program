package shapes;

public class Rectangle extends Shape{
	
	protected int width, height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		this.xCord = 0;
		this.yCord = 0;
		this.color = Color.RED;
	}

	@Override
	public void draw() {
		String.format("Rectangle, Color: %s, Origin: (%d,%d), Width: %d, Height: %d", color, xCord, yCord, width, height);
		
	}

	@Override
	void delete() {
		// TODO Auto-generated method stub
		
	}

}
