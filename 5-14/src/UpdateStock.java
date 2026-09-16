import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateStock {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/educure_db"; // データベースURL
        String user = "postgres"; // データベースのユーザー名
        String password = "CYV94XpcfV"; // データベースのパスワード

        String checkStockSQL = "SELECT COUNT(*) FROM products WHERE stock > 0";
        String updateSQL = "UPDATE products SET stock = CASE WHEN stock >= 10 THEN stock - 10 ELSE 0 END";
    
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            
            try (PreparedStatement pstmtUpdate = conn.prepareStatement(updateSQL)) {
                int rowsUpdated = pstmtUpdate.executeUpdate();
                
                if (rowsUpdated > 0) {
                    System.out.println("在庫が正常に更新されました。");
                }
            }
            
            try (PreparedStatement pstmtCheck = conn.prepareStatement(checkStockSQL);
                 ResultSet rs = pstmtCheck.executeQuery()) {
                
                if (rs.next()) {
                    int activeStockCount = rs.getInt(1);
                    
                    if (activeStockCount == 0) {
                        System.out.println("エラー: すべての商品の在庫数が0になりました。");
                    }
                }
            }
            
        } catch (SQLException e) {
            System.out.println("データベースエラーが発生しました。");
            e.printStackTrace();
            }
        }
    }