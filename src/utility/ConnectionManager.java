package utility;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;


public class ConnectionManager
{
	public Connection getConnection() throws SQLException, ClassNotFoundException, IOException
	{
		Properties prop=null;
		prop=loadPropertiesFile();
		final String driver=prop.getProperty("driver");
		final String url=prop.getProperty("url");
		Class.forName(driver);
		Connection ob= null;
		ob=DriverManager.getConnection(url);
		if(ob!=null)
			System.out.println("Established");
		return ob;
	}
	public static Properties loadPropertiesFile() throws IOException
	{
		Properties prop=new Properties();
		InputStream in=ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
		prop.load(in);
		in.close();
		return prop;
		}
}
