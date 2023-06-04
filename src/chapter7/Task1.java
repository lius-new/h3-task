package chapter7;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;

/**
 * Sunny软件公司欲开发一个视频播放软件，为了给用户使用提供方便，该播放软件提供多种界面显示模式，
 * 如完整模式、精简模式、记忆模式、网络模式等。在不同的显示模式下主界面的组成元素有所差异，
 * 如在完整模式下将显示菜单、播放列表、主窗口、控制条等，在精简模式下只显示主窗口和控制条，而在记忆模式下将显示主窗口、控制条、收藏列表等。尝试使用建造者模式设计该软件。
 */
public class Task1 {
    static Object getBuilder() {
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder;
            documentBuilder = documentBuilderFactory.newDocumentBuilder();

            Document document;
            document = documentBuilder.parse(new File("src/chapter7/config.xml"));
            NodeList brandName = document.getElementsByTagName("videomodel.build.class");
            Node firstChild = brandName.item(0).getFirstChild();
            String trim = firstChild.getNodeValue().trim();
            Class<?> aClass = Class.forName(trim);
            Object o = aClass.newInstance();
            return o;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

        VideoBuilder videoBuilder = (VideoBuilder) getBuilder();
        VideoLeader videoLeader = new VideoLeader();
        videoLeader.setVideoBuilder(videoBuilder);
        VideoPlay construct = videoLeader.construct();
        System.out.println(construct);
    }
}
