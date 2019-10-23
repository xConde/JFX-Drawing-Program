package command;

import launcher.Launcher;

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
