package chapter12.task1;

public class HRDepartment extends AbstractUnit {

    @Override
    void releaseMsg() {
        String name = "人力部门";
        System.out.println(name + "发布通知");
    }

    @Override
    void add(AbstractUnit abstractUnit) {
        System.out.println("不支持此功能");
    }

    @Override
    void remove(AbstractUnit abstractUnit) {
        System.out.println("不支持此功能");
    }

    @Override
    AbstractUnit get(int i) {
        System.out.println("不支持此功能");
        return null;
    }
}
