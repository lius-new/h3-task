package chapter15.example1;

public abstract class AbstractPermission {
    abstract void modifyUserInfo();
    abstract void viewNote();
    abstract void publishNode();
    abstract void modifyNote();

    abstract void setLevel(int level);
}
