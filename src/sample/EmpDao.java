package sample;
import java.util.*;



import java.sql.*; 

public class EmpDao {  
	public EmpDao() {
		super();
	}
	  
	
	private static String jdbcURL = "jdbc:mysql://localhost:3306/javaproject";
	private static String jdbcUsername = "root";
	private static String jdbcPassword = "admin";
	
	
	
	
	private static final String INSERT_EMP_SQL = "insert into user905" + "(name,password,email,country) VALUES "
			+ " (?, ?, ?,?);";

	private static final String SELECT_EMP_BY_ID = "select * from user905 where id=?";
	private static final String SELECT_ALL_EMP = "select * from user905";
	private static final String DELETE_EMP_SQL = "delete from user905 where id=?";
	private static final String UPDATE_EMP_SQL = "update user905 set name=?,password=?,email=?,country=? where id=?";
	
	
	
    public static Connection getConnection(){  
        Connection con=null;  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            con=DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);  
        }catch(Exception e){System.out.println(e);}  
        return con;  
    }  
	
	
	public static int save(Emp e) throws Exception  {
		//System.out.println(INSERT_EMP_SQL);
		int status = 0;
		try (Connection con = getConnection();
				PreparedStatement ps = con.prepareStatement(INSERT_EMP_SQL)) {
			ps.setString(1,e.getName());  
            ps.setString(2,e.getPassword());  
            ps.setString(3,e.getEmail());  
            ps.setString(4,e.getCountry());  
              
            status=ps.executeUpdate();  
              
            con.close(); 
            
		} catch(Exception ex)
		{ex.printStackTrace();}
		return status;
	}
    
	

    public static int update(Emp e){  
        int status=0;  
        try{  
            Connection con=EmpDao.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
            		UPDATE_EMP_SQL);  
            ps.setString(1,e.getName());  
            ps.setString(2,e.getPassword());  
            ps.setString(3,e.getEmail());  
            ps.setString(4,e.getCountry());  
            ps.setInt(5,e.getId());  
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
   
    
    public static int delete(int id){  
        int status=0;  
        try{  
            Connection con=EmpDao.getConnection();  
            PreparedStatement ps=con.prepareStatement(DELETE_EMP_SQL);  
            ps.setInt(1,id);  
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return status;  
    }  
    
    
    
	
    public static Emp getEmployeeById(int id){  
        Emp e=new Emp();  
          
        try{  
            Connection con=EmpDao.getConnection();  
            PreparedStatement ps=con.prepareStatement(SELECT_EMP_BY_ID);  
            ps.setInt(1,id);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
                e.setId(rs.getInt(1));  
                e.setName(rs.getString(2));  
                e.setPassword(rs.getString(3));  
                e.setEmail(rs.getString(4));  
                e.setCountry(rs.getString(5));  
            }  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return e;  
    }  
    public static List<Emp> getAllEmployees(){  
        List<Emp> list=new ArrayList<Emp>();  
          
        try{  
            Connection con=EmpDao.getConnection();  
            PreparedStatement ps=con.prepareStatement(SELECT_ALL_EMP);  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Emp e=new Emp();  
                e.setId(rs.getInt(1));  
                e.setName(rs.getString(2));  
                e.setPassword(rs.getString(3));  
                e.setEmail(rs.getString(4));  
                e.setCountry(rs.getString(5));  
                list.add(e);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
    }  
}  