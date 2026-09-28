import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBManager {
    private Connection connection;
    private String URL = "jdbc:postgresql://localhost:5432/vocabulary_db";
    private String USER = "postgres";
    private String PASSWORD = "CYV94XpcfV";

    public DBManager() {
        initializeDatabase();
    }

    private void initializeDatabase() {
        String createTableSql = "CREATE TABLE IF NOT EXISTS words (" +
                                "    id SERIAL PRIMARY KEY," +
                                "    english VARCHAR(100) NOT NULL," +
                                "    japanese VARCHAR(100) NOT NULL," +
                                "    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP" +
                                ");";
        
        String createIndexSql = "CREATE INDEX IF NOT EXISTS idx_english ON words (english);";

        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement()) {
            stmt.execute(createTableSql);
            stmt.execute(createIndexSql);
        } catch (SQLException e) {
            System.out.println("エラー: データベースに接続できません。");
        }
    }

    public Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        }
        return connection;
    }

    public void close() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            System.out.println("エラー: データベースのクローズに失敗しました。");
        }
    }
}
