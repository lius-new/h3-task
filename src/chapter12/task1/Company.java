package chapter12.task1;

import java.util.ArrayList;
import java.util.List;

public class Company extends AbstractUnit {
    private final List<AbstractUnit> abstractUnits = new ArrayList<>();
    private final String name;

    public Company(String name){
        this.name = name;
    }

    @Override
    void releaseMsg() {
        System.out.println(this.name);
        for (AbstractUnit ab : abstractUnits) {
            ab.releaseMsg();
        }
    }

    @Override
    void add(AbstractUnit abstractUnit) {
        abstractUnits.add(abstractUnit);
    }

    @Override
    void remove(AbstractUnit abstractUnit) {
        abstractUnits.remove(abstractUnit);
    }

    @Override
    AbstractUnit get(int i) {
        return abstractUnits.get(i);
    }

}
