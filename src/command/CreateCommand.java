package command;

import launcher.Launcher;
import shapes.ShapeType;
import shapes.Shape;
import shapes.ShapeBuilder;

/**
 * CreateCommand class. Controls the dynamic of the commands.
 *
 */
public class CreateCommand extends Command {

    Shape shape;

    public CreateCommand(ShapeType sType, int[] x){
        this.shape = ShapeBuilder.createShape(sType, x);
    }

    public CreateCommand(Shape shape){
        this.shape = shape;
    }

    @Override
    public Command Reverse() {
        return new DeleteCommand();
    }

    @Override
    public void Do() {
        Launcher.shapesInScene.add(shape);
    }
}
