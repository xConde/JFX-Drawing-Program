package command;

import launcher.Launcher;

public class SelectCommand extends Command{

    int selectShape;

    SelectCommand(int x){
        this.selectShape = x;
    }
    @Override
    public Command Reverse() {
        return new SelectCommand(Launcher.shapesInScene.indexOf(Launcher.prevSelectedShape)+1);
    }

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
