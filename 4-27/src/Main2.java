import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class Main2 {
    public static void main(String[] args) {
        try {
            // 検索キーワードをCQL形式で設定
            String query = "title = Java"; // CQLフォーマット
            String encodedQuery = URLEncoder.encode(query, "UTF-8");

            // 国立国会図書館APIのエンドポイント
            String endpoint = "https://ndlsearch.ndl.go.jp/api/sru";

            // APIリクエストのURLを構築
            String requestUrl = endpoint + "?operation=searchRetrieve"
                + "&version=1.2"
                + "&query=" + encodedQuery
                + "&maximumRecords=10"
                + "&recordSchema=dc";
            // ここにコードを書いてください
            URL url = new URL(requestUrl);

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(
                    new InputStreamReader(connection.getInputStream(), "UTF-8")
                );
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine).append("\n");
                }
                in.close();

                System.out.println(response.toString());
            } else {
                System.out.println("HTTPリクエスト失敗。ステータスコード: " + responseCode);
            }

            connection.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}