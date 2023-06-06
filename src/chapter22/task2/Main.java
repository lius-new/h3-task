package chapter22.task2;

public class Main {
    public static void main(String[] args) {

        Airplane airplane = new Airplane("直升机");
        airplane.setStartFlyVertical(new StartFlyVertical()); // 设置具体策略类
        airplane.setFlyCharacter(new SubSonicFlyCharacter());

        airplane.getAirplaneFly(); // 获取飞机特征
    }
}
