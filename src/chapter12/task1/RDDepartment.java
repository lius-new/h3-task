package chapter12.task1;

public class RDDepartment extends AbstractUnit {
    void releaseMsg() {
        String name = "研发部门";
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
