package chapter17.example2;

import java.util.ArrayList;

public class MulOperateCommand extends AbstractOperateCommand {
    private Operation muler;
    private final ArrayList<Integer> integers = new ArrayList<>();

    public MulOperateCommand(Operation muler) {
        this.muler = muler;
    }

    @Override
    int execute(int i) {
        integers.add(i);
        return muler.mul(i);
    }

    @Override
    int undo() {
        if (integers.size() > 0) {
            Integer integer = integers.get(integers.size() - 1);
            integers.remove(integers.size() - 1);
            return muler.div(integer);
        } else {
            return 0;
        }
    }
}
