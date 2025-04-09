package databaseconnexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseConnection {
	public static Connection  connect () {
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("Driver O.K.");
	String url = "jdbc:mysql://localhost:3306/Equipementvole";
	String user = "root";
	String passwd = "";
	Connection conn = DriverManager.getConnection(url, user,
	passwd);
	System.out.println("Connexion effective !");
	return conn ;
	} catch (Exception e) {
	e.printStackTrace();

	
	}
	return null;
	}

	public static Statement getInstance() {
		// TODO Auto-generated method stub
		return null;
	}
	public static void main(String []args) {
		Connection cn = connect();
	};

}
