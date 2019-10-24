package command;

import launcher.Launcher;

/**
 * MoveCommand class. Moves the currently selected shapes origin to the specified (x,y)
 *
 */
public class MoveCommand extends Command{

    int x, y;
    int prevX, prevY;

    /**
     * MoveCommand constructor
     * @param x
     * @param y
     */
    MoveCommand(int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
     * Reverse method Override that returns a command
     */
    @Override
    public Command Reverse() {
        return new MoveCommand(this.prevX, this.prevY);
    }

    /**
     * Do method Override that sets current to previous and moves to new coordinates. 
     */
    @Override
    public void Do() {
        this.prevX = this.x;
        this.prevY = this.y;
        Launcher.selectedShape.setxCord(x);
        Launcher.selectedShape.setyCord(y);
    }
}
