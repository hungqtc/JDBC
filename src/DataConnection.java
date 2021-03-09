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
public class DataConnection {

  private static Connection conn;
	private static final String USER = "root";
	private static final String PASSWORD = "";
	private static final String URl = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=UTF-8";

	public static Connection getConnection() {
		// load the driver
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			// create object connection
			conn = DriverManager.getConnection(URl, USER, PASSWORD);
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return conn;

	}
}
