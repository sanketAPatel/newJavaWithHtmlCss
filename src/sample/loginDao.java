package sample;
import java.util.*;
import java.sql.*; 

import com.mysql.jdbc.Connection;

public class loginDao {
	
	
	private static String jdbcURL = "jdbc:mysql://localhost:3306/javaproject";
	private static String jdbcUsername = "root";
	private static String jdbcPassword = "admin";
	
	private static final String SELECT_admin_ID = "select * from login where uname=? and pass=?";
	
	
	public  boolean getadminConnection(String uname ,String pass){  
        Connection con=null;  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            con=(Connection) DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);  
            
            PreparedStatement ps=con.prepareStatement(SELECT_admin_ID);  
            ps.setString(1,uname);  
            ps.setString(2,pass);  
            
            ResultSet rs =ps.executeQuery();
            if(rs.next()) {
            	
            	return true;
            }
              
            con.close();
        }catch(Exception e){System.out.println(e);}  
        return false;  
    }  
	

}
