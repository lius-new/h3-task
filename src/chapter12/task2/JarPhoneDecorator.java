package chapter12.task2;

public class JarPhoneDecorator extends AbstractPhone {
    private final AbstractPhone abstractPhone;

    public JarPhoneDecorator(AbstractPhone abstractPhone) {
        this.abstractPhone = abstractPhone;
    }

    @Override
    void playCall() {
        setPlayCallMethod();
        this.abstractPhone.playCall();
    }


    void setPlayCallMethod(){
        System.out.print("/发出提示震动");
    }
}
