package chapter17.example2;

import java.util.ArrayList;

public class DivOperateCommand extends AbstractOperateCommand {
    private Operation diver;
    private final ArrayList<Integer> integers = new ArrayList<>();

    public DivOperateCommand(Operation diver) {
        this.diver = diver;
    }

    @Override
    int execute(int i) {
        integers.add(i);
        return diver.div(i);
    }

    @Override
    int undo() {
        if (integers.size() > 0) {
            Integer integer = integers.get(integers.size() - 1);
            integers.remove(integers.size() - 1);
            System.out.println(integer);
            return diver.mul(integer);
        } else {
            return 0;
        }
    }
}
