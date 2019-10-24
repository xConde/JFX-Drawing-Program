package command;

import launcher.Launcher;

/**
 * DrawCommand class. Outputs the currently selected shape information to the console. E.g., "Rectangle, Color: Red, Origin: (5,5), Width 10, Height: 7"
 *
 */
public class DrawCommand extends Command{

    @Override
    public Command Reverse() {
        return null;
    }

    @Override
    public void Do() {
        Launcher.selectedShape.draw();
    }

}
