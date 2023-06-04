package chapter13.task1;

public class GeneralMainFrameSwitch {
    private Cpu cpu;
    private HardDisk hardDisk;
    private Memory memory;

    public GeneralMainFrameSwitch() {
        this.cpu = new Cpu();
        this.hardDisk = new HardDisk();
        this.memory = new Memory();
    }

    public void on() throws Exception {
        check(cpu.on());
        check(hardDisk.on());
        check(memory.on());
    }
    public void check(Boolean b) throws Exception {
        if (!b) throw new Exception("启动失败");;
    }
}
