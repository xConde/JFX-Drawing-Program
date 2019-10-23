package command;

import launcher.Launcher;
import shapes.NoShape;
import shapes.Shape;

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
