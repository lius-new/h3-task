package chapter12.example2;

public class BlockBorderDecorator extends ComponentDecorator{
    public BlockBorderDecorator(Component component) {
        super(component);
    }


    public void setDecorator(){
        System.out.println("黑边框/");
    }

    @Override
    protected void display() {
        setDecorator();
        super.display();
    }

}
