package command;

import java.util.Stack;

/**
 * UndoCommand class. "Undoes" the most recent command in the drawing list by restoring the previous. 
 *
 */
public class UndoCommand {
	
	private static Stack<Command> Undo;
	
	/**
	 * UndoCommand constructor initializing new stacks.
	 */
	public UndoCommand() {
		Undo = new Stack();
	}
	
	
	/**
	 * Undo method that pops the most recent command and renews the previous.
	 */
	public void Undo() {
		if (Undo.isEmpty())
			return;
		Command command = Undo.pop();
		command.Reverse();
	}

	
	public void addUndo(Command command) {
		Undo.push(command);
	}
}
