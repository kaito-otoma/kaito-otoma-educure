import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

public class Main2 {
    public static void main(String[] args) {
        // プロパティファイルのパス
        String filePath = "excersise.properties";

        //パスの作成
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            writer.println("username=tanaka");
            writer.println("password=12345");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Properties オブジェクトを作成
        Properties properties = new Properties();

    try (FileInputStream input = new FileInputStream(filePath)) {
        properties.load(input);
        System.out.println("Username: " + properties.getProperty("username"));
        System.out.println("password: " + properties.getProperty("password"));
    } catch (IOException e) {
        e.printStackTrace();
        }
    }
}
