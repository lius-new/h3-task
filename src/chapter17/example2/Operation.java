package chapter17.example2;

public class Operation {
    private int num = 0;

    public int add(int num) {
        this.num += num;
        return this.num;
    }

    public int sub(int num) {
        this.num -= num;
        return this.num;
    }

    public int mul(int num) {
        this.num *= num;
        return this.num;
    }

    public int div(int num) {
        this.num /= num;
        return this.num;
    }
}
