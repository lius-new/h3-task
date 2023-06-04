package chapter17.example2;

import java.util.ArrayList;

public class SubOperateCommand extends AbstractOperateCommand {
    private Operation suber;
    private final ArrayList<Integer> integers = new ArrayList<>();

    public SubOperateCommand(Operation suber) {
        this.suber = suber;
    }

    @Override
    int execute(int i) {
        integers.add(i);
        return suber.sub(i);
    }

    @Override
    int undo() {
        if (integers.size() > 0) {
            Integer integer = integers.get(integers.size() - 1);
            integers.remove(integers.size() - 1);
            return suber.sub(-integer);
        } else {
            return 0;
        }
    }
}
