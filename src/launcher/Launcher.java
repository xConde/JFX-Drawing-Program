package launcher;

import command.Command;
import command.CommandReader;
import shapes.NoShape;
import shapes.Shape;

import java.util.ArrayList;
import java.util.Stack;

public class Launcher {
    Shape noShape = new NoShape();
    public static Shape prevSelectedShape = new NoShape();
    public static Shape selectedShape = new NoShape();
    public static ArrayList<Shape> shapesInScene = new ArrayList<>();
    public static Stack<Command> commandHistory = new Stack<>();

    public static void main(String[] args){
        CommandReader reader = new CommandReader();
        reader.readCommands();

        for(Command cmd : reader.getCommandsToExecute()){
            if(cmd != null){
                cmd.Do();
                commandHistory.push(cmd.Reverse());
            }
            else { // "UNDO"
                commandHistory.pop().Do();
            }
        }
    }

}
