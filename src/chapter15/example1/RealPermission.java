package chapter15.example1;

public class RealPermission extends AbstractPermission{

    @Override
    void modifyUserInfo() {
        System.out.println("修改用户信息");
    }

    @Override
    void viewNote() {
        System.out.println("查看用户帖子");
    }

    @Override
    void publishNode() {
        System.out.println("上传用户帖子");
    }

    @Override
    void modifyNote() {
        System.out.println("修改用户帖子");
    }

    @Override
    void setLevel(int level) {
    }
}
