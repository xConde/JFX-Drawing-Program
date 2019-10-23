package command;

import launcher.Launcher;

public class MoveCommand extends Command{

    int x, y;
    int prevX, prevY;

    MoveCommand(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public Command Reverse() {
        return new MoveCommand(this.prevX, this.prevY);
    }

    @Override
    public void Do() {
        this.prevX = this.x;
        this.prevY = this.y;
        Launcher.selectedShape.setxCord(x);
        Launcher.selectedShape.setyCord(y);
    }
}
