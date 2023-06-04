package chapter5;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class TvFactory {

    public static Tv swiftTv(String name) {
        Tv tv = null;
        if (name.equalsIgnoreCase("xiaomi")) {
            tv = new XiaoMiTv();
        } else if (name.equalsIgnoreCase("huawei")) {
            tv = new HuaWeiTv();
        }
        return tv;
    }

    public static String getBrandName() {
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = null;
            documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document;
            document = documentBuilder.parse(new File("chapter5/config.xml"));
            NodeList brandName = document.getElementsByTagName("brandName");
            Node firstChild = brandName.item(0).getFirstChild();
            String trim = firstChild.getNodeValue().trim();
            return trim;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Object productTv(String name) {
        try {
            Class<?> c = Class.forName(name);

            //Constructor<?> declaredConstructor = c.getDeclaredConstructor();
            //declaredConstructor.setAccessible(true);

            Object o = c.newInstance();
            return o;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
