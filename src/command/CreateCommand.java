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

    /**
     * Overloaded CreateCommand constructor takes 2 params
     * @param sType
     * @param x
     */
    public CreateCommand(ShapeType sType, int[] x){
        this.shape = ShapeBuilder.createShape(sType, x);
    }

    /**
     * Overloaded CreateCommand constructor takes 1 param
     * @param shape
     */
    public CreateCommand(Shape shape){
        this.shape = shape;
    }

    /**
     * Reverse method Override deletes the command. 
     */
    @Override
    public Command Reverse() {
        return new DeleteCommand();
    }

    /**
     * Do method Override adds shape into scene. 
     */
    @Override
    public void Do() {
        Launcher.shapesInScene.add(shape);
    }
}
