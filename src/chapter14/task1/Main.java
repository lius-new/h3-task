package chapter14.task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        NetworkDevice d1, d2,d3,d4;
        DeviceFactory instance = DeviceFactory.getInstance();

        System.out.println("设备数量 : " + instance.getTotalDevice());

        // 加入设备
        instance.addDevice(new Switch());
        System.out.println("设备数量 : " + instance.getTotalDevice());
//        instance.getDevices("Hub").forEach(NetworkDevice::use);
//        instance.getDevices("Switch").forEach(NetworkDevice::use);


    }
}
