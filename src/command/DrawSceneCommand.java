package command;

import launcher.Launcher;
import shapes.Shape;

public class DrawSceneCommand extends Command{

    @Override
    public Command Reverse() {
        return null;
    }

    @Override
    public void Do() {
        for(Shape shp : Launcher.shapesInScene){
            shp.draw();
        }
    }
}
