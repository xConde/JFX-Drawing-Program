package shapes;

/**
 * Rectangle class. Width and height are required for a rectangle. The origin is (0,0). The color of a created rectangle is Red. 
 *
 */
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

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	

}
