package command;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

import shapes.Rectangle;
import shapes.Shape;
import shapes.ShapeType;

public class CommandReader {
    Stack<Command> commandsToExecute = new Stack<>();
    Stack<Command> commandHistory = new Stack<>();
    File inFile = new File("commands1.txt");
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

            switch(words[0]){
                case "CREATE":
                    ShapeType sType = ShapeType.valueOf(words[1]);
                    int[] x;
                    x[0] = Integer.parseInt(words[2]);
                    
                    if(sType == ShapeType.RECTANGLE) {
                        x[1] = Integer.parseInt(words[3]);
                    }

                    command = new CreateCommand(sType, x);
                    commandsToExecute.push(command);
                    commandHistory.push(command.Reverse());
                    break;
                case "SELECT":
                    command = new SelectCommand();
                    commandsToExecute.push(command);
                    commandHistory.push(command.Reverse());
                    break;
                case "MOVE":
                    command = new MoveCommand();
                    commandsToExecute.push(command);
                    commandHistory.push(command.Reverse());
                    break;
                case "DRAW":
                    command = new DrawCommand();
                    commandsToExecute.push(command);
                    commandHistory.push(command.Reverse());
                    break;
                case "COLOR":
                    command = new ColorCommand();
                    commandsToExecute.push(command);
                    commandHistory.push(command.Reverse());
                    break;
                case "DELETE":
                    command = new DeleteCommand();
                    commandsToExecute.push(command);
                    commandHistory.push(command.Reverse());
                    break;
                case "DRAWSCENE":
                    command = new DrawSceneCommand();
                    commandsToExecute.push(command);
                    commandHistory.push(command.Reverse());
                    break;
                case "UNDO":
                    command = commandHistory.pop();
                    commandsToExecute.push(command);
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
