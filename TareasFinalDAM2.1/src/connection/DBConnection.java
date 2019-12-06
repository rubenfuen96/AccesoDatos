package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
	
	public static Connection instance = null;

	public DBConnection() {
	}

	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		try {
			Class.forName("com.mysql.jdbc.Driver");// Cargar el driver

			if (instance == null) {
				instance = (Connection) DriverManager.getConnection("jdbc:mysql://vl21970.dinaserver.com", "uss026", "cebra2019");
				//crearTablas();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		return instance;
	}
}