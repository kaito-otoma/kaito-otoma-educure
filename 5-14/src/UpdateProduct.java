import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateProduct {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/educure_db"; // データベースURL
        String user = "postgres"; // データベースのユーザー名
        String password = "CYV94XpcfV"; // データベースのパスワード
        
        String updatePriceSQL = "UPDATE products SET price = price - 5000 WHERE product_name = 'タブレット'";
        String updateStockSQL = "UPDATE products SET stock = stock + 5 WHERE price < 50000";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            
            try (PreparedStatement pstmtPrice = conn.prepareStatement(updatePriceSQL)) {
                int priceRows = pstmtPrice.executeUpdate();
                System.out.println("価格を値下げした行数: " + priceRows);
            }
            
            try (PreparedStatement pstmtStock = conn.prepareStatement(updateStockSQL)) {
                int stockRows = pstmtStock.executeUpdate();
                System.out.println("在庫を増やした行数: " + stockRows);
            }
            
        } catch (SQLException e) {
            System.out.println("データベースエラーが発生しました。");
            e.printStackTrace();
        }
    }
}
