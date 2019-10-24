package shapes;

/**
 * Shape class. Super class for shape type rectangle, circle, and "no shape".
 *
 */
public abstract class Shape {
	
	protected int xCord, yCord;
	protected Color color;
	
	abstract public void draw();
	abstract void delete(); 


	public double getxCord() {
		return xCord;
	}
	public void setxCord(int xCord) {
		this.xCord = xCord;
	}
	public double getyCord() {
		return yCord;
	}
	public void setyCord(int yCord) {
		this.yCord = yCord;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
		
}
