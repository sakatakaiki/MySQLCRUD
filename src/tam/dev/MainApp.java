package tam.dev;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import tam.dev.data.CategoryImpl;
import tam.dev.data.UserImpl;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = getConnection();
		CategoryImpl categoryImpl = new CategoryImpl(conn);
		UserImpl userImpl = new UserImpl(conn);
//		categoryImpl.insert();
//		categoryImpl.update();
//		categoryImpl.delete();
		categoryImpl.select();
//		userImpl.insert();
//		userImpl.update();
//		userImpl.delete();
//		userImpl.select();
		userImpl.find(3);
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
	
	
}
