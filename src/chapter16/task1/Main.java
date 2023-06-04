package chapter16.task1;

/**
 * 某物资管理系统中物资的采购需要分级审批。
 * 主任可以审批1万元及以下的采购单，部门经理可以审批5万以下的采购单，副总经理可以审批10万元以下的采购单，总经理可以审批20万以下的采购单，20万以上的需要开领导大会决定。
 * 采用职责链模式设计该系统。
 */
public class Main {
    public static void main(String[] args) {
        Leader l1,l2,l3,l4;
        l1 = new Director("张三");
        l2 = new Department("李四");
        l3 = new ViceGeneralManager("王五");
        l4 = new GeneralManager("赵七");
        l1.setSuccessor(l2);
        l2.setSuccessor(l3);
        l3.setSuccessor(l4);

        l1.handleRequest(new PurchaseAmount("田六",1000000.0));

    }
}
