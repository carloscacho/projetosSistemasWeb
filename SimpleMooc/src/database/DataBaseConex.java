package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConex {
	
	public static DataBaseConex instance = null;
	private static Connection conex = null;
	
	//strings
	private String link = "jdbc:mysql://127.0.0.1:3306/simplemooc";
	private String user = "root";
	private String senha = "@univag";
	
	private DataBaseConex() {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			this.conex = DriverManager.getConnection(link, user,senha);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static Connection getInstance() {
		if(instance == null) {
			instance = new DataBaseConex();
		}
		
		return conex;
	}

}
