package chapter12.task2;

public class SimplePhoneDecorator extends AbstractPhone {
    private final AbstractPhone abstractPhone;

    public SimplePhoneDecorator(AbstractPhone abstractPhone) {
        this.abstractPhone = abstractPhone;
    }

    @Override
    void playCall() {
        setPlayCallMethod();
        this.abstractPhone.playCall();
    }


    void setPlayCallMethod(){
        System.out.print("/发出提示声音");
    }
}
