import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DBManager {
    String url = "jdbc:postgresql://localhost:5432/vocabulary_db"; // データベースURL
    String user = "postgres"; // データベースのユーザー名
    String password = "CYV94XpcfV"; // データベースのパスワード

    String checkSql = "SELECT COUNT(*) FROM words WHERE english = ?";
    // 単語を更新
    String updSql = "UPDATE words SET japanese = ? WHERE english = ?";
     // 単語を削除
    String delSql = "DELETE FROM words WHERE english = ?";

    protected Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    private boolean isWordExists(String english) {
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(checkSql)) {
            pstmt.setString(1, english);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0;
                }
            }
        } catch (SQLException e) {
            System.out.println("エラー: 接続に失敗しました。");
        }
        return false;
    }

    public void deleteWordFlow(Scanner scanner) {
        System.out.println("--- 単語の削除 ---");
        System.out.print("削除したい英単語を入力してください: ");
        String english = scanner.nextLine();

        if (!isWordExists(english)) {
            System.out.println("エラー: 指定された英単語「" + english + "」は登録されていません。");
            return;
        }

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(delSql)) {
            pstmt.setString(1, english);
            int rows = pstmt.executeUpdate();
            
            if (rows > 0) {
                System.out.println("「" + english + "」を削除しました。");
            }
        } catch (SQLException e) {
            System.out.println("エラー: 削除に失敗しました。");
        }
    }

    public void updateWordFlow(Scanner scanner) {
        System.out.println("--- 単語の更新 ---");
        System.out.print("更新したい英単語を入力してください: ");
        String english = scanner.nextLine();

        if (!isWordExists(english)) {
            System.out.println("エラー: 指定された英単語「" + english + "」は登録されていません。");
            return;
        }

        System.out.print("新しい日本語訳を入力してください: ");
        String japanese = scanner.nextLine();

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(updSql)) {
            pstmt.setString(1, japanese);
            pstmt.setString(2, english);
            int rows = pstmt.executeUpdate();

            if (rows > 0) {
                System.out.println("「" + english + "」の日本語訳を「" + japanese + "」に更新しました。");
            }
        } catch (SQLException e) {
            System.out.println("エラー: 更新に失敗しました。");
        }
    }
}
