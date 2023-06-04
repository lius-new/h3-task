package chapter17.example2;

import java.util.List;

public class CalculatorForm {
    private AbstractOperateCommand addOperateCommand, subOperateCommand, mulOperateCommand, divOperateCommand;
    private String last;

    public CalculatorForm() {
        Operation operation = new Operation();
        this.addOperateCommand = new AddOperateCommand(operation);
        this.subOperateCommand = new SubOperateCommand(operation);
        this.mulOperateCommand = new MulOperateCommand(operation);
        this.divOperateCommand = new DivOperateCommand(operation);
    }

    public void computeAdd(int value) {
        this.last = "add";
        int execute = this.addOperateCommand.execute(value);
        System.out.println("执行运算,结果为: " + execute);
    }

    public void computeSub(int value) {
        this.last = "sub";
        int execute = this.subOperateCommand.execute(value);
        System.out.println("执行运算,结果为: " + execute);
    }

    public void computeMul(int value) {
        this.last = "mul";
        int execute = this.mulOperateCommand.execute(value);
        System.out.println("执行运算,结果为: " + execute);
    }

    public void computeDiv(int value) {
        this.last = "div";
        int execute = this.divOperateCommand.execute(value);
        System.out.println("执行运算,结果为: " + execute);
    }

    public void undo() {
        int execute = 0;
        switch (this.last) {
            case "add":
                execute = this.addOperateCommand.undo();
                break;
            case "sub":
                execute = this.subOperateCommand.undo();
                break;
            case "mul":
                execute = this.mulOperateCommand.undo();
                break;
            case "div":
                execute = this.divOperateCommand.undo();
                break;
        }
        System.out.println("执行撤销,结果为: " + execute);
    }
}
