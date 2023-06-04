package chapter17.task1;

public class OuterPushGestureCommand extends AbstractGestureCommand {
    private Gesture gesture;

    public OuterPushGestureCommand(Gesture gesture) {
        this.gesture = gesture;
    }

    @Override
    void execute() {
        System.out.println("OuterPushGestureCommand");
        this.gesture.outer();
    }
}
