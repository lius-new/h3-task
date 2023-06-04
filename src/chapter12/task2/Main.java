package chapter12.task2;

/**
 *
 * 简单的手机（SimplePhone）在接收来电的时候，会发出声音提醒主人；
 * 而现在我们需要为该手机添加一项功能，在接收来电的时候，除了有声音还能产生振动（JarPhone）；
 * 还可以得到更加高级的手机(ComplexPhone),来电时它不仅能够发声，产生振动，而且还有灯光闪烁提示。现用装饰模式模拟手机的升级过程。
 *
 */
public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        SimplePhoneDecorator simplePhoneDecorator = new SimplePhoneDecorator(phone);
        JarPhoneDecorator jarPhoneDecorator = new JarPhoneDecorator(simplePhoneDecorator);
        ComplexDecorator complexDecorator = new ComplexDecorator(jarPhoneDecorator);

        complexDecorator.playCall();

    }
}
