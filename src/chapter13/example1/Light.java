package chapter13.example1;

public class Light {
    private final String position;

    public Light(String position) {
        this.position = position;
    }
    public void on(){
        System.out.println(position + "灯打开.");
    }
    public void off(){
        System.out.println(position + "灯关闭.");
    }
}
