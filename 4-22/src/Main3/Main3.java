package Main3;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import java.io.File;

public class Main3 {
        public static void main(String[] args) {
            try {
           File xmlFile = new File("exercise.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            
            Document document = builder.parse(xmlFile);
            document.getDocumentElement().normalize();

            Element root = document.getDocumentElement();

            Book book = new Book();
            book.settitle(getTagValue("title", root));
            book.setauthor(getTagValue("author", root));
            book.setprice(getTagValue("price", root));

            System.out.println("タイトル: " + book.gettitle());
            System.out.println("著者: " + book.getauthor());
            System.out.println("価格: " + book.getprice());
        } catch (Exception e) {
            e.printStackTrace(); // エラーハンドリング
        }
    }
    private static String getTagValue(String tagName, Element element) {
        NodeList nodeList = element.getElementsByTagName(tagName);
        if (nodeList != null && nodeList.getLength() > 0) {
            return nodeList.item(0).getTextContent();
        }
        return "";
    }
}
