package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DATOS.DB;
import MODELO.Avion;

public class DAOAvion {
	
	private Connection con=DB.getConexion();
	
	public boolean create(Avion p){
		
		String sql="insert into avion (idavion,descripcion,peso) values (?,?)";
		
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,p.getIdavion());
			ps.setString(2,p.getDescripcion());
			ps.setDouble(3,p.getPeso());
			ps.executeUpdate();
			ps.close();
			return true;
		}
		catch(SQLException sqle){
			sqle.printStackTrace();
			return false;
		}
		
	}
	
	public Avion read(int idavion){
		Avion p=null;
		
		String sql="select descripcion from avion where idavion=?";
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,idavion);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				p=new Avion(idavion,rs.getString("Descripcion"),rs.getDouble("Peso"));
			}
			rs.close();
		}
		catch(SQLException sqle){
			sqle.printStackTrace();
		}
		return p;
	}
	
	public boolean update(Avion p){
		String sql="update avion set"
				+ " idAvion="
				+ " descripcion=?"
				+ " peso=?";
		
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,p.getIdavion());
			ps.setString(2,p.getDescripcion());
			ps.setDouble(3,p.getPeso());
			ps.executeUpdate();
			return true;
		}
		catch(SQLException sqle){
			sqle.printStackTrace();
			return false;
		}
	}
	
	public boolean delete(Avion p){
		String sql="delete from avion where idavion=?";
		
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,p.getIdavion());
			ps.executeUpdate();
			return true;
		}
		catch(SQLException sqle){
			sqle.printStackTrace();
			return false;
		}
	}
	
	public ArrayList<Avion> listar(){
		ArrayList<Avion> aviones=new ArrayList<Avion>();
		
		String sql="select * from aviones order by idavion";
		
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Avion p=new Avion(rs.getInt("IdAvion"),rs.getString("Descripcion"),rs.getDouble("Peso"));
				aviones.add(p);
			}
			rs.close();
		}
		catch(SQLException sqle){
			sqle.printStackTrace();
		}
		
		return aviones;
	}
}
