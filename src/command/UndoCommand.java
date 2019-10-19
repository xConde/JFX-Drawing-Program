package command;

import java.util.Stack;

/**
 * UndoCommand class. "Undoes" the most recent command in the drawing list by restoring the previous. 
 *
 */
public class UndoCommand {
	
	private static Stack<Command> Undo, Renewal;
	
	/**
	 * UndoCommand constructor initalizing new stacks. 
	 */
	public UndoCommand() {
		Undo = new Stack();
		Renewal = new Stack();
	}
	
	
	/**
	 * Undo method that pops the most recent command and renews the previous.
	 */
	public void Undo() {
		if (Undo.isEmpty())
			return;
		Command command = Undo.pop();
		command.Reverse();
		Renewal.push(command);
	}
	
	/**
	 * Renewal method that "redoes" a command.
	 */
	public void Renewal() {
		if (Renewal.isEmpty())
			return;
		Command command = Renewal.pop();
		command.Do();
		Undo.push(command);
	}
	
	public void addUndo(Command command) {
		Undo.push(command);
		Renewal.removeAllElements();
	}
	
	public void addRenewal(Command command) {
		Renewal.push(command);
	}

}
