package command;

import launcher.Launcher;

/**
 * ColorCommand class. Sets the color of the currently selected shape by utilizing Color.java enum. 
 *
 */
public class ColorCommand extends Command{

    String color;
    String prevColor;

    ColorCommand(String color){
        this.color = color;
    }

    @Override
    public Command Reverse() {
        return new ColorCommand(this.prevColor);
    }

    @Override
    public void Do() {
        this.prevColor = Launcher.selectedShape.getColor().toString();
        Launcher.selectedShape.setColor(shapes.Color.valueOf(this.color.toUpperCase()));
    }
}
