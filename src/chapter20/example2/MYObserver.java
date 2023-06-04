package chapter20.example2;

import chapter19.example1.AbstractChatroom;

public abstract class MYObserver {
    protected String name;
    protected ControlCenter center;

    public void beAttack() {
        System.out.println(this.name + "受到攻击,请求帮助");
        center.notifyPlayer(this.name);
    }

    public abstract void help();

    public MYObserver() {
    }

    public MYObserver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ControlCenter getCenter() {
        return center;
    }

    public void setCenter(ControlCenter center) {
        this.center = center;
    }

}
