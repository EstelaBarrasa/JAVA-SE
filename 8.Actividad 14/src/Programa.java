import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Programa {
	static Scanner teclado = new Scanner(System.in); 
	public static void main(String[] args) throws SQLException {
		HacerConexion hacerconexion = new HacerConexion();
		DAO dao=new DAO();
		boolean seguir = true;
		Connection conexion = null;
		if (!hacerconexion.registrarDriver() && dao.registrarDriver())
			return;
		do {
			dao.getConexion();
			System.out.println("=====MENU TIPO CONEXIONES=====");
			System.out.println("1. Conexion con un parámetro");
			System.out.println("2. Conexion con tres parámetros");
			System.out.println("3. Conexion con properties");
			System.out.println("4. Obtener Statement");
			System.out.println("5. Obtener PreparedStatement");
			System.out.println("6. Contar socios");
			System.out.println("7. Contar productos");
			System.out.println("8. Contar ventas");
			System.out.println("9. Salir");
			System.out.println("==============================");
			char opcion = '9';
			boolean erroneo = true;
			do {
				System.out.print("Teclea opcion: ");
				opcion = teclado.next().charAt(0);
				if (opcion >= '1' && opcion <= '9')
					erroneo = false;
			} while (erroneo);
			if (opcion == '9')
				seguir = false;
			else {
				switch (opcion) {
				case '1':
					conexion = hacerconexion.getConexion01(); 
					break;
				case '2':
					hacerconexion.getConexion02(); 
					break;
				case '3':
					hacerconexion.getConexion03();
					break;
				case '4':
					Statement stm=dao.obtenerStatement();
				case '5':
					PreparedStatement ps=dao.obtenerPreparedStatement();
					break;	
				case '6':
					numeroSocios
					break;
				case '7':
					numeroProductos
					break;
				case '8':
					numeroVentas
					break;
				}
				if (conexion.isClosed())
					System.out.println("Conexion cerrada");
			}
		} while (seguir);
	}
}