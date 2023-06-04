package chapter12.task2;

public class PhoneDecorator extends AbstractPhone {
    private final AbstractPhone abstractPhone;

    public PhoneDecorator(AbstractPhone abstractPhone) {
        this.abstractPhone = abstractPhone;
    }

    @Override
    void playCall() {
        this.abstractPhone.playCall();
    }
}
