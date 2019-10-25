package command;

import launcher.Launcher;

/**
 * ColorCommand class. Sets the color of the currently selected shape by utilizing Color.java enum. 
 *
 */
public class ColorCommand extends Command {

    private String color;
    private String prevColor;

    /**
     * ColorCommand constructor
     * @param color
     */
    ColorCommand(String color) {
        this.color = color;
    }

    /**
     * Reverse method Override returns a command. 
     */
    @Override
    public Command Reverse() {
        return new ColorCommand(this.prevColor);
    }

    /**
     * Do method Override. Sets previous as current color and sets current color as the new color. 
     */
    @Override
    public void Do() {
        this.prevColor = Launcher.selectedShape.getColor().toString();
        Launcher.selectedShape.setColor(shapes.Color.valueOf(this.color.toUpperCase()));
    }
}
