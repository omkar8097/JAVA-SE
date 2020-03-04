package dbConnection;

import java.io.*;
import java.sql.*;
import java.util.Properties;



public class DBTestConnection
{

	private static Connection connection = null;
	
	String dbURL=null;
	String username =null;
	String password = null;
	
	public static Connection getConnection() throws Exception
	{
		
		
		FileInputStream fs = new FileInputStream("Connection.properties");
		Properties prop = new Properties();
		prop.load(fs);
		
		
		String name = (String) prop.getProperty("name");
		String surname = (String) prop.get("surname");
		
		System.out.println(name);
		System.out.println(surname);
		
		return connection;
	}
}
