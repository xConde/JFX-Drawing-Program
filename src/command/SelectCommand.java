package command;

import launcher.Launcher;

/**
 * SelectCommand class. Selects a shape to use with future commands MOVE, DRAW, COLOR DELETE from [1..n]. Selected shape defaults to "no shape". 
 * Calling SELECT on a shape that does not exist in the list will produce an error message.
 *
 */
public class SelectCommand extends Command{

    int selectShape;

    /**
     * SelectCommand constructor
     * @param x
     */
    SelectCommand(int x) {
        this.selectShape = x;
    }
    
    /**
     * Reverse method Override that returns a command
     */
    @Override
    public Command Reverse() {
        return new SelectCommand(Launcher.shapesInScene.indexOf(Launcher.prevSelectedShape)+1);
    }

    /**
     * do method Override that sets previous as current and selected shape as new current. 
     */
    @Override
    public void Do() {
        if(Launcher.shapesInScene.size() < selectShape){
            System.out.println("ERROR: invalid shape for SELECT");
            return;
        }
        
        Launcher.prevSelectedShape = Launcher.selectedShape;
        Launcher.selectedShape = Launcher.shapesInScene.get(selectShape-1);
    }
}
