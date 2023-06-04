package chapter14.task1;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class DeviceFactory {
    private static DeviceFactory deviceFactory = new DeviceFactory();
    private final ArrayList<NetworkDevice> devices;
    private Integer TotalTerminal = 0;

    private DeviceFactory() {
        devices = new ArrayList<>();
        devices.add(new Switch());
        devices.add(new Hub());
    }

    public static DeviceFactory getInstance() {
        return deviceFactory;
    }


    public ArrayList<NetworkDevice> getDevices(String type) {
        return this.devices.stream().filter(device -> device.getType().equals(type)).collect(Collectors.toCollection(ArrayList::new));
    }

    public Integer getTotalDevice() {
        return devices.size();
    }

    public Integer getTotalTerminal() {
        return TotalTerminal;
    }

    public void addDevice(NetworkDevice n){
        devices.add(n);
    }
}
