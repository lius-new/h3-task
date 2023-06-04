package chapter17.task1;

public class InnerPushGestureCommand extends AbstractGestureCommand{
    private Gesture gesture;

    public InnerPushGestureCommand(Gesture gesture) {
        this.gesture = gesture;
    }

    @Override
    void execute() {
        System.out.println("InnerPushGestureCommand");
        this.gesture.inner();
    }
}
