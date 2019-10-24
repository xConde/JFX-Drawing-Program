package command;

import shapes.Color;

/**
 * ColorCommand class. Sets the color of the currently selected shape by utilizing Color.java enum. 
 *
 */
public class ColorCommand extends Command {
	
	private Color newColor, oldColor;
	
	public ColorCommand(Color newColor) {
		this.newColor = newColor;
		Color();
	}
	
	private void Color() {
		if (shape == null)
			return;
		this.oldColor = Shape.getColor();
		Shape.setColor(newColor);
		canvas.repaint();
	}
	
	@Override
	public void Reverse() {
		this.newColor = this.oldColor;
		Color();
	}
	
	@Override
	public void Do() {
		this.newColor = this.oldColor;
		Color();
	}

}
