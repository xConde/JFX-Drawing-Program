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
	
	//commandsToExecute, creates a Stack type Command
    Stack<Command> commandsToExecute = new Stack<>();
    Scanner scanner;
    
    int[] x = new int[2];
    
    /*
     * setupScanner. Sets up scanner with an inFile 
     */
    public void setupScanner() {
        File inFile = new File("src/commands1.txt");
            
        try {
        	scanner = new Scanner(inFile);
            } catch (FileNotFoundException e) {
            	e.printStackTrace();
            }
    }

    /**
     * readCommands. Reads commands from the infile thats processed by the scanner. 
     */
    public void readCommands(){
    	setupScanner();
        String line;
        String[] words;
        
        while(scanner.hasNextLine()){
            line = scanner.nextLine();
            words = line.split(" ");
        	selectword(words, line);
        }
    }
    
    /**
     * selectWord. Hosts the switch case on words that can be read as commands.
     * @param words
     * @param line
     */
    public void selectword(String[] words, String line) {
        Command command;
        
        switch(words[0]) {
        case "CREATE":
        	ShapeType sType = create(words);
            command = new CreateCommand(sType, x);
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
    
    /**
     * create. Creates a shape based off the command CREATE. 
     * @param words
     * @return
     */
    public ShapeType create(String[] words) {
        ShapeType sType = ShapeType.valueOf(words[1]);
        x[0] = Integer.parseInt(words[2]);
        
        if(sType == ShapeType.RECTANGLE) {
            x[1] = Integer.parseInt(words[3]);
        }
        return sType;
    }

    /**
     * getCommandsToExecute. Returns the stack of commands. 
     * @return
     */
    public Stack<Command> getCommandsToExecute() {
        return commandsToExecute;
    }
}
