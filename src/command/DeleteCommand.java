package command;

import launcher.Launcher;
import shapes.NoShape;
import shapes.Shape;

/**
 * DeleteCommand class. Removes the selected from the scene. Sets the currently selected shape to a "no shape" value.
 *
 */
public class DeleteCommand extends Command {

    Shape deletedShape;
    
    /**
     * Reverse method Override returns a command
     */
    @Override
    public Command Reverse() {
        CreateCommand create = null;
        
        if (deletedShape != null) {
            create = new CreateCommand(deletedShape);
        }
        
        return create;
    }

    /**
     * Do method Override removes the shape from scene and sets the selected shape as no shape. 
     * 
     */
    @Override
    public void Do() {
        this.deletedShape = Launcher.selectedShape;
        Launcher.shapesInScene.remove(Launcher.selectedShape);
        Launcher.selectedShape = new NoShape();
    }
}
