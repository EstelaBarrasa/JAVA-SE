import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class HacerConexion {
	
	private String password="";
	private String url="jdbc:mysql://localhost:3306/cursosjdbc";
	private String user="root";
	
	public boolean registrarDriver(){
		boolean r=false;
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(ClassNotFoundException cnfe){
			System.out.println("Driver jdbc no encontrado");
		}
		return r;
	}
	
	public Connection getConexion01(){
		//Con un parametro en getConnection
		Connection con =null;
		
		try{
			con=DriverManager.getConnection(url+"?user",user+"&password=",password);
		}
		catch(SQLException sqle){
			System.out.println("No se puede conectar a la base de datos");
		}
		return con;
	}
	public Connection getConexion02(){
		//Con tres parametros en getConnection
		Connection con =null;
		
		try{
			con=DriverManager.getConnection(url,user,password);
		}
		catch(SQLException sqle){
			System.out.println("No se puede conectar a la base de datos");
		}
		return con;
	}
	public Connection getConexion03(){
		//Con properties en getConnection
		Connection con =null;
		
		Properties connectionProps=new Properties();
		connectionProps.put("user",user);
		connectionProps.put("password",password);
		
		try{
			con=DriverManager.getConnection(url,connectionProps);
		}
		catch(SQLException sqle){
			System.out.println("No se puede conectar a la base de datos");
		}
		return con;
	}

}
