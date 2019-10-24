package command;

import shapes.ShapeType;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

/**
 * CommandReader class. Handles reading an input file to sort commands by cases. 
 *
 */
public class CommandReader {
    Stack<Command> commandsToExecute = new Stack<>();
    File inFile = new File("src/commands1.txt");
    Scanner scanner;

    {
        try {
            scanner = new Scanner(inFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void readCommands(){
        String line;
        String[] words;
        Command command;
        while(scanner.hasNextLine()){
            line = scanner.nextLine();
            words = line.split(" ");
            int[] x = new int[2];

            switch(words[0]){
                case "CREATE":
                    ShapeType sType = ShapeType.valueOf(words[1]);
                    x[0] = Integer.parseInt(words[2]);
                    
                    if(sType == ShapeType.RECTANGLE) {
                        x[1] = Integer.parseInt(words[3]);
                    }

                    command = new CreateCommand(sType, x);
                    commandsToExecute.push(command);
                    break;
                case "SELECT":
                    command = new SelectCommand(Integer.parseInt(words[1]));
                    commandsToExecute.push(command);
                    break;
                case "MOVE":
                    command = new MoveCommand(Integer.parseInt(words[1]), Integer.parseInt(words[2]));
                    commandsToExecute.push(command);
                    break;
                case "DRAW":
                    command = new DrawCommand();
                    commandsToExecute.push(command);
                    break;
                case "COLOR":
                    command = new ColorCommand(words[1]);
                    commandsToExecute.push(command);
                    break;
                case "DELETE":
                    command = new DeleteCommand();
                    commandsToExecute.push(command);
                    break;
                case "DRAWSCENE":
                    command = new DrawSceneCommand();
                    commandsToExecute.push(command);
                    break;
                case "UNDO":
                    commandsToExecute.push(null);
                    break;
                default:
                    System.out.println("Invalid command: " + line);
                    break;

            }
        }
    }


    public Stack<Command> getCommandsToExecute() {
        return commandsToExecute;
    }
}
