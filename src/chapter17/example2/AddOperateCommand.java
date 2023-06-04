package chapter17.example2;

import java.util.ArrayList;

public class AddOperateCommand extends AbstractOperateCommand {
    private Operation adder;
    private final ArrayList<Integer> integers = new ArrayList<>();

    public AddOperateCommand(Operation adder) {
        this.adder = adder;
    }

    @Override
    int execute(int i) {
        integers.add(i);
        return adder.add(i);
    }

    @Override
    int undo() {
        if (integers.size() > 0) {
            Integer integer = integers.get(integers.size() - 1);
            integers.remove(integers.size() - 1);
            return adder.add(-integer);
        } else {
            return 0;
        }
    }
}
