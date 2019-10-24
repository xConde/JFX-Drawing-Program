package command;

import launcher.Launcher;
import shapes.Shape;

/**
 * DrawSceneCommand class. Draws all shapes in the scene using their current origins and colors. Output for each shape is the same as using the DRAW command. 
 *
 */
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
