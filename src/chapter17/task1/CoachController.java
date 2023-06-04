package chapter17.task1;

public class CoachController {
    private AbstractGestureCommand innerPushGestureCommand, outerPushGestureCommand;

    public CoachController() {
        Gesture gesture = new Gesture();
        this.innerPushGestureCommand = new InnerPushGestureCommand(gesture);
        this.outerPushGestureCommand = new OuterPushGestureCommand(gesture);
    }

    public void innerExecute(){
        this.innerPushGestureCommand.execute();
    }

    public void outerExecute(){
        this.outerPushGestureCommand.execute();
    }
}
