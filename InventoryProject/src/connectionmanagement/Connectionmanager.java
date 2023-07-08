package connectionmanagement;

import java.sql.*;

public class Connectionmanager {
	Connection con =null;

	   

	public Connection establishConnection() throws ClassNotFoundException, SQLException

	{

		Class.forName("com.mysql.cj.jdbc.Driver");

		return con = DriverManager.getConnection("jdbc:mysql://localhost:3306/InventoryProject","root","Gopik@2408");



	}

	public void closeConnection() throws SQLException

	{

		con.close();

	}

}
