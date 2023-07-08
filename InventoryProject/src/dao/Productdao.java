package dao;
import java.sql.*;
import connectionmanagement.Connectionmanager;

import model.Product;

public class Productdao {
	public void addProduct(Product product) throws ClassNotFoundException, SQLException 



	{



		Connectionmanager conm = new Connectionmanager();



		Connection con = conm.establishConnection();



		



		String sql_query = "insert into product(productId,productName,minSellquantity,price,quantity) values(?,?,?,?,?)";



		PreparedStatement ps = con.prepareStatement(sql_query);



		ps.setInt(1,product.getProductId());



		ps.setString(2,product.getProductname());



		ps.setInt(3,product.getMinSellquantity());



		ps.setInt(4,product.getPrice());



		ps.setInt(5,product.getQuantity());



		



		ps.executeUpdate();



	



		conm.closeConnection();



		



		



	}

	public void display() throws ClassNotFoundException, SQLException

	{

		Connectionmanager conm = new Connectionmanager();



		Connection con = conm.establishConnection();

           Statement st=con.createStatement();

    	

    	ResultSet rt=st.executeQuery("select * from product");

    	while(rt.next())

    	{

    	   System.out.println(rt.getInt("productId")+" "+rt.getString("productname")+" "+rt.getInt("minSellquantity")+" "+rt.getInt("price")+" "+rt.getInt("quantity"));



    	}

    	conm.closeConnection();

    	}

	}