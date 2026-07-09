import java.io.*;

public class Main2 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("exercise.txt");
            int data;
        while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }
            reader.close();
        } catch(IOException error) {
            System.out.println("ファイルの読み込み中にエラーが発生しました。");
        }
    }
}
