import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateStock {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/educure_db";
        String user = "postgres";
        String password = "CYV94XpcfV";

        String checkStockSQL = "SELECT COUNT(*) FROM products WHERE stock > 0";
        String updateSQL = "UPDATE products SET stock = CASE WHEN stock >= 10 THEN stock - 10 ELSE 0 END";
    
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            
            try (PreparedStatement pstmtCheck = conn.prepareStatement(checkStockSQL);
                 ResultSet rs = pstmtCheck.executeQuery()) {
                
                if (rs.next()) {
                    int activeStockCount = rs.getInt(1);
                    
                    if (activeStockCount == 0) {
                        System.out.println("エラー: 在庫のある商品が存在しないため、更新処理を中止しました。");
                        return;
                    }
                }
            }

            try (PreparedStatement pstmtUpdate = conn.prepareStatement(updateSQL)) {
                int rowsUpdated = pstmtUpdate.executeUpdate();
                
                if (rowsUpdated > 0) {
                    System.out.println("在庫が正常に更新されました。");
                }
            }
            
        } catch (SQLException e) {
            System.out.println("データベースエラーが発生しました。");
            e.printStackTrace();
        }
    }
}
