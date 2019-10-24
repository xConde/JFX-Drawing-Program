package launcher;

import command.Command;
import command.CommandReader;
import shapes.NoShape;
import shapes.Shape;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Launcher class. Invokes the project by assigning presets for objects and starting the reader. Can handle commands such as "UNDO", but will only read
 * if there is something available. 
 *
 */
public class Launcher {
	
    Shape noShape = new NoShape();
    
    //prevSelectedShape, instantiates a new shape declared as NoShape.
    public static Shape prevSelectedShape = new NoShape();
    
    //selectedShape, instantiates a new shape declared as NoShape. 
    public static Shape selectedShape = new NoShape();
    
    //shapesInScene, instantiates a new ArrayList of type shape. 
    public static ArrayList<Shape> shapesInScene = new ArrayList<>();
    
    //commandHistory, instantiates a new Stack of type command. 
    public static Stack<Command> commandHistory = new Stack<>();
    
    /**
     * Main class for Launcher. 
     * @param args
     */
    public static void main(String[] args) {
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
