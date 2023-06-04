package chapter12.example2;

public class Main {
    public static void main(String[] args) {
        TextBox textBox = new TextBox();
        ScrollBarDecorator scrollBarDecorator = new ScrollBarDecorator(textBox);
        BlockBorderDecorator blockBorderDecorator = new BlockBorderDecorator(scrollBarDecorator);

        blockBorderDecorator.display();


    }
}
