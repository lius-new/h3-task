package chapter13.example1;

public class GeneralSwitchFacade {
    private Light lights[] = new Light[4];
    private Fan fan;
    private AirConditioner ac;
    private TV tv;

    public GeneralSwitchFacade(Light[] lights, Fan fan, AirConditioner ac, TV tv) {
        this.lights[0] = new Light("前");
        this.lights[1] = new Light("后");
        this.lights[2] = new Light("左");
        this.lights[3] = new Light("右");
        this.fan = new Fan();
        this.ac = new AirConditioner();
        this.tv = new TV();
    }

    public void on(){
        this.lights[0].on();
        this.lights[1].on();
        this.lights[2].on();
        this.lights[3].on();
        fan.on();
        ac.on();
        tv.on();
    }
    public void off(){
        this.lights[0].off();
        this.lights[1].off();
        this.lights[2].off();
        this.lights[3].off();
        fan.off();
        ac.off();
        tv.off();
    }
    public void lightOn(){
        this.lights[0].on();
        this.lights[1].on();
        this.lights[2].on();
        this.lights[3].on();
    }
    public void lightOff(){
        this.lights[0].off();
        this.lights[1].off();
        this.lights[2].off();
        this.lights[3].off();
    }
}

