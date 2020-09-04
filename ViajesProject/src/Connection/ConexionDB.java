package Connection;
import java.sql.*;
/**
 * Clase encargada de gestionar la conexion con
 * @author santi
 */
public class ConexionDB {
    private static Connection cnx = null;
    public static Connection obtener() throws SQLException, ClassNotFoundException {
        if (cnx == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                cnx = DriverManager.getConnection("jdbc:mysql://localhost/java_mysql", "bielorrusia", "bielorrusia");
            } catch (SQLException ex) {
                throw new SQLException(ex);
            } catch (ClassNotFoundException ex) {
                throw new ClassCastException(ex.getMessage());
            }
        }
        return cnx;
    }
    public static void cerrar() throws SQLException {
        if (cnx != null) {
            cnx.close();
        }
    }
}
