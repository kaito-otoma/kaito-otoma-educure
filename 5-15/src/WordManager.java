import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class WordManager {
    private DBManager dbManager;

    public WordManager(DBManager dbManager) {
        this.dbManager = dbManager;
    }

    public void addWord(Word word) {
        if (getWordCount() >= 1000) {
            System.out.println("エラー: 文字数制限（最大100文字）を超過しています。");
            return;
        }

        String checkSql = "SELECT COUNT(*) FROM words WHERE english = ?;";
        String insertSql = "INSERT INTO words (english, japanese) VALUES (?, ?);";

        try (Connection conn = dbManager.getConnection();
             PreparedStatement checkStmt = conn.prepareStatement(checkSql)) {
            
            checkStmt.setString(1, word.getEnglish());
            try (ResultSet rs = checkStmt.executeQuery()) {
                if (rs.next() && rs.getInt(1) > 0) {
                    return; 
                }
            }

            try (PreparedStatement insertStmt = conn.prepareStatement(insertSql)) {
                insertStmt.setString(1, word.getEnglish());
                insertStmt.setString(2, word.getJapanese());
                insertStmt.executeUpdate();
            }

        } catch (SQLException e) {
            System.out.println("エラー: 単語の登録に失敗しました。");
        }
    }

    public List<Word> getWords() {
        List<Word> words = new ArrayList<>();
        String sql = "SELECT english, japanese FROM words;";
        try (Connection conn = dbManager.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                words.add(new Word(rs.getString("english"), rs.getString("japanese")));
            }
        } catch (SQLException e) {
            System.out.println("エラー: 単語リストの取得に失敗しました。");
        }
        return words;
    }

    public int getWordCount() {
        String sql = "SELECT COUNT(*) FROM words;";
        try (Connection conn = dbManager.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println("エラー: 単語数の取得に失敗しました。");
        }
        return 0;
    }

    public void deleteWord(String english) {
        String sql = "DELETE FROM words WHERE english = ?;";
        try (Connection conn = dbManager.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, english);
            int rows = pstmt.executeUpdate();
            if (rows == 0) {
                System.out.println("エラー: 指定された英単語「" + english + "」は登録されていません。");
            } else {
                System.out.println("単語の削除に成功しました。");
            }
        } catch (SQLException e) {
            System.out.println("エラー: 削除に失敗しました。");
        }
    }

    public void updateWord(String english, String newJapanese) {
        String sql = "UPDATE words SET japanese = ? WHERE english = ?;";
        try (Connection conn = dbManager.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, newJapanese);
            pstmt.setString(2, english);
            int rows = pstmt.executeUpdate();
            if (rows == 0) {
                System.out.println("エラー: 指定された英単語「" + english + "」は登録されていません。");
            }else {
                System.out.println("単語の更新に成功しました。");
            }
        } catch (SQLException e) {
            System.out.println("エラー: 更新に失敗しました。");
        }
    }
}
