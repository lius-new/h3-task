package chapter5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tv tv = null;
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        tv = (Tv) TvFactory.productTv(s);
//        if (s.equalsIgnoreCase("xiaomi")){
//            tv = new XiaoMiTv();
//        } else if (s.equalsIgnoreCase("huawei")) {
//            tv = new HuaWeiTv();
//        }
        tv.play();
    }
}