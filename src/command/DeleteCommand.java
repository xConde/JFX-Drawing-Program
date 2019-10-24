package command;

import launcher.Launcher;
import shapes.NoShape;
import shapes.Shape;

/**
 * DeleteCommand class. Removes the selected from the scene. Sets the currently selected shape to a "no shape" value.
 *
 */
public class DeleteCommand extends Command{

    Shape deletedShape;
    @Override
    public Command Reverse() {
        CreateCommand create = null;
        if(deletedShape != null){
            create = new CreateCommand(deletedShape);
        }
        return create;
    }

    @Override
    public void Do() {
        this.deletedShape = Launcher.selectedShape;
        Launcher.shapesInScene.remove(Launcher.selectedShape);
        Launcher.selectedShape = new NoShape();
    }
}
