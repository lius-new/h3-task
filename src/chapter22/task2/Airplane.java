package chapter22.task2;

public class Airplane {
    private String name;
    protected FlyCharacter flyCharacter; // 飞行特征
    protected StartFlyVertical startFlyVertical; // 垂直飞行特征

    public Airplane(String name) {
        this.name = name;
    }

    public void setFlyCharacter(FlyCharacter flyCharacter) {
        this.flyCharacter = flyCharacter;
    }

    public void setStartFlyVertical(StartFlyVertical startFlyVertical) {
        this.startFlyVertical = startFlyVertical;
    }

    public void getAirplaneFly() {
        String s = this.flyCharacter.flyCharacter();
        String s1 = this.startFlyVertical.startFlyCharacter();
        System.out.println("飞机种类: " + this.name + ",起飞特征: " + s1 + ",飞行特征: " + s);
    }
}
