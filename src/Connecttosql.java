/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fox0fNight
 */
public class Connecttosql {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url="jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "";
        try(Connection conn =  DriverManager.getConnection(url, user, password)){
            System.out.println("Ket noi thanh cong");
            System.out.println(conn.getCatalog());
        }   catch (SQLException ex) {
            Logger.getLogger(Connecttosql.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
