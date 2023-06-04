package chapter12.example2;

public class ScrollBarDecorator extends ComponentDecorator{
    public ScrollBarDecorator(Component component) {
        super(component);
    }


    public void setDecorator(){
        System.out.println("滚动条/");
    }

    @Override
    protected void display() {
        setDecorator();
        super.display();
    }

}
