package chapter15.example1;

public class Main {
    public static void main(String[] args) {
        PermissionProxy permissionProxy = new PermissionProxy();
        permissionProxy.publishNode();
        permissionProxy.setLevel(1);
        permissionProxy.publishNode();

    }
}
