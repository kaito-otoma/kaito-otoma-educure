import java.sql.*;

public class ProductMaintenance {

    public static void main(String[] args) {
        // データベース接続情報
        String url = "jdbc:postgresql://localhost:5432/educure_db"; // データベースURL
        String username = "postgres"; // データベースのユーザー名
        String password = "CYV94XpcfV"; // データベースのパスワード
        
        String updateZeroStockSQL = "UPDATE products SET price = 0 WHERE stock = 0";
        String deleteExpensiveSQL = "DELETE FROM products WHERE price >= 200000";
        String updateLowStockSQL = "UPDATE products SET stock = 20 WHERE price >= 100000 AND stock <= 10";

        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            
            try (PreparedStatement pstmt1 = conn.prepareStatement(updateZeroStockSQL)) {
                int rows1 = pstmt1.executeUpdate();
                System.out.println("影響を受けた行数 (在庫数0の商品価格を0に設定): " + rows1);
            }
            
            try (PreparedStatement pstmt2 = conn.prepareStatement(deleteExpensiveSQL)) {
                int rows2 = pstmt2.executeUpdate();
                System.out.println("影響を受けた行数 (価格が200000以上の商品削除): " + rows2);
            }
            
            try (PreparedStatement pstmt3 = conn.prepareStatement(updateLowStockSQL)) {
                int rows3 = pstmt3.executeUpdate();
                System.out.println("影響を受けた行数 (価格100000以上、在庫数10以下の商品を在庫数20に更新): " + rows3);
            }

        } catch (SQLException e) {
            System.out.println("データベースエラーが発生しました。");
            e.printStackTrace();
        }
    }
}