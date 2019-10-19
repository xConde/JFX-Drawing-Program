package shapes;

/**
 * Shape class. TODO description <<<<<
 *
 */
public abstract class Shape {
	
	protected double xCord, yCord;
	protected Color color;
	
	abstract public void draw();
	abstract void delete(); 


	public double getxCord() {
		return xCord;
	}
	public void setxCord(double xCord) {
		this.xCord = xCord;
	}
	public double getyCord() {
		return yCord;
	}
	public void setyCord(double yCord) {
		this.yCord = yCord;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
		
}
