package chapter12.example2;

import javax.swing.*;

public class ComponentDecorator extends Component{
    private Component component;

    public ComponentDecorator(Component component) {
        this.component = component;
    }

    @Override
    protected void display() {
        this.component.display();
    }
}
