import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.*;

public class firstexam
{
	static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
	static final string DB_URL="jdbc:mysql://localhost/anagha";
	
	//Database credential
	static final String user="student";
	static final String passwd="student";
	
	public static void main(String args []) throws ClassNotFoundException
	{
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		try
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager .getConnection ("jdbc:mtsql://localhost/anagha", user,