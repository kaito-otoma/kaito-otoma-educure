import java.sql.*;

public class ProductMaintenance {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/educure_db";
        String username = "postgres";
        String password = "CYV94XpcfV";
        
        String updateZeroStockSQL = "UPDATE products SET price = 0 WHERE stock = 0";
        String deleteExpensiveSQL = "DELETE FROM products WHERE price >= 200000";
        String updateLowStockSQL = "UPDATE products SET stock = 20 WHERE price >= 100000 AND stock <= 10";

        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url, username, password);
            
            conn.setAutoCommit(false);
            
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

            conn.commit();
            System.out.println("すべての処理が正常に確定（コミット）されました。");

        } catch (SQLException e) {
            System.out.println("データベースエラーが発生しました。");
            
            if (conn != null) {
                try {
                    conn.rollback();
                    System.out.println("エラーが発生したため、変更を元に戻しました（ロールバック成功）。");
                } catch (SQLException ex) {
                    System.out.println("ロールバック中にエラーが発生しました。");
                    ex.printStackTrace();
                }
            }
            
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
