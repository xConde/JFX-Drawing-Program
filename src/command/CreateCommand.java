package command;

import shapes.ShapeType;
import shapes.Shape;
import shapes.ShapeBuilder;

public class CreateCommand extends Command {

    Shape shape;

    public CreateCommand(ShapeType sType, int[] x){
        this.shape = ShapeBuilder.createShape(sType, x);
    }

    @Override
    public Command Reverse() {
        return null;
    }

    @Override
    public void Do() {

    }
}
