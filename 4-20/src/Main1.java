
import java.io.*;

public class Main1 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("example.txt", true);
            writer.write("Hello World!");
            writer.flush();
            writer.close();
            System.out.println("ファイルに書き込みが完了しました。");
        } catch(IOException error) {
            error.printStackTrace();
        }
    }
}
