package chapter12.task2;

public class ComplexDecorator extends AbstractPhone {
    private final AbstractPhone abstractPhone;

    public ComplexDecorator(AbstractPhone abstractPhone) {
        this.abstractPhone = abstractPhone;
    }

    @Override
    void playCall() {
        setPlayCallMethod();
        this.abstractPhone.playCall();
    }


    void setPlayCallMethod(){
        System.out.print("/灯光闪烁");
    }
}
