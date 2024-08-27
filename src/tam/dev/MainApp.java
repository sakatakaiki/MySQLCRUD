package tam.dev;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = getConnection();
		insert(conn);
	}
	private static Connection getConnection() {
        // Tên cơ sở dữ liệu
        String DB_URL = "jdbc:mysql://localhost:3306/shop";
        // Tên người dùng
        String DB_USER = "root";
        // Mật khẩu
        String DB_PASS = "";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
	
	private static void insert(Connection conn) {
        // TODO Auto-generated method stub
        String sql = "INSERT INTO CATEGORIES VALUES(NULL, ?, ?)";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "category name");
            stmt.setString(2, "url thumbnail");
            stmt.execute();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
