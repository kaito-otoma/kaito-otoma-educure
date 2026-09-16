import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertProduct {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/educure_db"; // データベースURL
        String user = "postgres"; // データベースのユーザー名
        String password = "CYV94XpcfV"; // データベースのパスワード
        
        String insertSQL = "INSERT INTO products (product_name, price, stock) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            
            try (PreparedStatement pstmtInsert = conn.prepareStatement(insertSQL)) {
                pstmtInsert.setString(1, "スマートフォン");
                pstmtInsert.setInt(2, 80000);
                pstmtInsert.setInt(3, 30);
                
                int rowsInserted = pstmtInsert.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("商品が正常に追加されました。");
                }
            }
            
        } catch (SQLException e) {
            System.out.println("データベースエラーが発生しました。");
            e.printStackTrace();
        }
    }
}
