import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DAO {

	private String password="";
	private String url="jdbc:mysql://localhost:3306/cursosjdbc";
	private String user="root";
	private Connection conexion;
	
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
	
	public Connection getConexion(){

		try{
			conexion=DriverManager.getConnection(url,user,password);
		}
		catch(SQLException sqle){
			System.out.println("No se puede conectar a la base de datos");
		}
		return conexion;
	}
	
	public void cerrarConexion(){
		try{
			conexion.close();
		}
		catch(SQLException sqle){
			System.out.println("Fallo al cerrar la conexion");
		}
	}
	
	public PreparedStatement obtenerPreparedStatement(String sql){
		PreparedStatement ps=null;
		try{
			ps=conexion.prepareStatement(sql);
		}
		catch(SQLException sqle){
			System.out.println("No se ha podido crear un preparedStatement");
		}
		return ps;
	}
	
	public Statement obtenerStatement(){
		Statement stm=null;
		try{
			stm=conexion.createStatement();
		}
		catch(SQLException sqle){
			System.out.println("No se ha podido crear el statement");
		}
		return stm;
	}
	
	public int numeroProductos(){
		
		int n=-1;
		
		try(
				PreparedStatement ps=obtenerPreparedStatement("select count(idproducto) as n from productos");
				ResultSet rs=ps.executeQuery();){
			n=rs.getInt("n");
		}
		catch(SQLException sqle){
			System.out.println("No se puede acceder a la base de datos");
		}
		return n;
	}
	
	public int numeroSocios(){
		
		int n=-1;
		
		try(
				PreparedStatement ps=obtenerPreparedStatement("select count(idsocio) as n from socios");
				ResultSet rs=ps.executeQuery();){
			n=rs.getInt("n");
		}
		catch(SQLException sqle){
			System.out.println("No se puede acceder a la base de datos");
		}
		return n;
	}
	
	public int numeroVentas(){
	
		int n=-1;
	
		try(
				PreparedStatement ps=obtenerPreparedStatement("select count(idventa) as n from ventas");
				ResultSet rs=ps.executeQuery();){
			n=rs.getInt("n");
		}
		catch(SQLException sqle){
			System.out.println("No se puede acceder a la base de datos");
		}
		return n;
	}
	
	public boolean insertarProducto(DTOProducto){
		String sql="insert into productos (idproducto,nombre,precio) values (?,?,?)";
		try(PreparedStatement ps=obtenerPreparedStatement(sql)){
			ps.setInt(1,p.getIdproducto() );
			ps.setString(2, getNombre());
			ps.setDouble(3, getPrecio());
			ps.executeUpdate();
			return true;
		}
		catch(SQLException sqle){
			System.out.println("Fallo al insertar producto");
			return false;
		}
	}
	
	public boolean actualizarProducto(DTOProducto p){
		String sql="update productos set nombre=? ,precio=?, where idproducto=?)";
		try(PreparedStatement ps=obtenerPreparedStatement(sql)){
			ps.setString(1,p.getNombre() );
			ps.setDouble(2, p.getPrecio());
			ps.setInt(3, p.getIdproducto());
			ps.executeUpdate();
			return true;
		}
		catch(SQLException sqle){
			System.out.println("Fallo al actualizar producto");
			return false;
		}
	}
	
	public boolean borrarProducto(int idproducto){
		String sql="delete from productoswhere idproducto=?";
		try(PreparedStatement ps=obtenerPreparedStatement(sql)){
			ps.setInt(3,idproducto);
			ps.executeUpdate();
			return true;
		}
		catch(SQLException sqle){
			System.out.println("Fallo al borrar producto");
			return false;
		}
	}
	
	public ArrayList<DTOProducto> listarProdcutos(){
		ArrayList<DTOProducto> listado=new ArrayList<DTOProducto>();
		
		String sql="select * from prodcuto order by nombre asc";
		try(PreparedStatement ps=obtenerPreparedStatement(sql);
				ResultSet rs=ps.executeQuery();){
			
			while(rs.next()){
				DTOProducto p=new DTOProducto();
				p.setIdproducto(rs.getInt("idproducto"));
				p.setNombre(rs.getString("nombre"));
				p.setPrecio(rs.getDouble("precio"));
				listado.add(p);
			}
		}
		catch(SQLException sqle){
			System.out.println("No se puede leer de la base de datos");
		}
	}
	
}
