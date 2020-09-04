
package Connection;


import java.sql.*;
/**
 * Clase encargada de gestionar la conexion con
 * @author santi
 */
public class ConexionDB {
   public static Connection conectar() {
      Connection con = null;
      String password = "bielorrusia";
      String usuario = "bielorrusia";
      String url = "jdbc:mysql://localhost:3306/db_viajes?user=" + usuario
              + "&password=" + password;
      try {
         con = DriverManager.getConnection(url);
         if (con != null) {
            System.out.println("Conectado");
         }
      } catch (SQLException e) {
         System.out.println("No se pudo conectar a la base de datos");
         e.printStackTrace();
      }
      return con;
   }
}
    

