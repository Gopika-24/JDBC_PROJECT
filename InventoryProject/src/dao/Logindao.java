package dao;
import model.Login;

import java.sql.*;

import connectionmanagement.Connectionmanager;

public class Logindao {
	public boolean validate(Login login) throws ClassNotFoundException, SQLException

    {

    	String username=login.getUsername();

    	String password=login.getPassword();

    	

    	Connectionmanager com=new Connectionmanager();

    	Connection con=com.establishConnection();

    	 

    	Statement st=con.createStatement();

    	

    	ResultSet rt=st.executeQuery("select * from login");

    	while(rt.next())

    	{

    	   if(username.equals(rt.getString("username")) && password.equals(rt.getString("password")))

    	    {

    		com.closeConnection();

    		return true;

    	}

    	}

    	   com.closeConnection();

    		return false;

    	}

		

    }

