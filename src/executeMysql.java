/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Fox0fNight
 */
public class executeMysql {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
                String sql = "SELECT * FROM categories";
                 try (
                Connection con = DataConnection.getConnection();
                Statement st = con.createStatement(
                      // TYPE_SCROLL_INSENSITIVE : cho phép duyệt lùi, sang trái, sang phải. Loại này không nhạy với các sự thay đổi dữ liệu dưới database. Nghĩa là trong quá trình duyệt qua một bản ghi và lúc nào đó duyệt lại bản ghi đó, nó không lấy các dữ liệu mới nhất của bản ghi mà có thể bị ai đó thay đổi.
                        //CONCUR_READ_ONLY : Khi duyệt dữ liệu với các ResultSet kiểu này bạn chỉ có thể đọc dữ liệu.
                        ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                ResultSet rs = st.executeQuery(sql);
            ) {
 
            while (rs.next()) {
                showCat(rs);
            }
        }

    }
     private static void showCat(ResultSet rs) throws SQLException {
        System.out.println("Id: " + rs.getInt(1));
        System.out.println("Name: " + rs.getString(2));
        System.out.println("---");
    }
    
}
