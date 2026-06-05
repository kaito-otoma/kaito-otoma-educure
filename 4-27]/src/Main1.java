import java.io.*;
import java.net.*;

public class Main1 {
    public static void main(String[] args) throws IOException {
        String keyword = "Java";
        URL url = new URL("https://www.google.com/search");
        InputStream is = url.openStream();
        // Googleの検索URLに検索キーワードを付けてURLを作成
        String searchURL = "https://www.google.com/search?q=" + URLEncoder.encode(keyword, "UTF-8");
        // ここにコードを書いてください
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64)");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } finally {
            connection.disconnect();
        }
    }
}
