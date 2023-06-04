package chapter15.example1;

public class PermissionProxy extends AbstractPermission{
    AbstractPermission permission = new RealPermission();
    int level = 0;

    @Override
    void modifyUserInfo() {
        if (level == 0){
            System.out.println("对不起你没有权限修改用户");
        }else if(level == 1){
            permission.modifyUserInfo();
        }
    }

    @Override
    void viewNote() {
        permission.viewNote();
    }

    @Override
    void publishNode() {
        if (level == 0){
            System.out.println("对不起你没有权限发布帖子");
        }else if(level == 1){
            permission.publishNode();
        }
    }

    @Override
    void modifyNote() {
        if (level == 0){
            System.out.println("对不起你没有权限修改帖子");
        }else if(level == 1){
            permission.modifyNote();
        }
    }

    @Override
    void setLevel(int level) {
        this.level = level;
    }
}
