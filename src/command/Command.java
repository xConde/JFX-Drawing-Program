package command;

/**
 * Command class to follow actions such as SELECT, MOVE, COLOR, CREATE, DELETE to undo the most recent command in the drawing list.
 *
 */
public abstract class Command {

	public abstract Command Reverse();
	public abstract void Do();
	
}

