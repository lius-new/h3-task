package chapter6;

public class HuaWeiFactory implements AbstractFactory {
    @Override
    public Tv productTv() {
        return new HuaWeiTv();
    }

    @Override
    public Phone productPhone() {
        return new HuaWeiPhone();
    }
}
