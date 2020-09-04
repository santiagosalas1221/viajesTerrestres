package DAO;

import Connection.ConexionDB;
import Entidades.Buses;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Implememtacion de la interfaz 'IBusesDao' en esta clase se ejecutan las sentencias sql para la DB
 */

public class BusDaoImpl implements IBusesDao {

    /**
     * Metodo encargado de crear nuevos buses en la BD
     */
    @Override
    public boolean CrearBuses(Buses bus) {
        boolean registrar = false;

        Statement stm= null;
        Connection con=null;

        String sql="INSERT INTO buses values (NULL,'"+bus.getPuestos()+"')";

        try {
            con=ConexionDB.conectar();
            stm= con.createStatement();
            stm.execute(sql);
            registrar=true;
            stm.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase BusDaoImple, método registrar");
            e.printStackTrace();
        }
        return registrar;
    }

    /**
     * Consulta los buses existentes en la BD
     * @return devuelve la lista de buses existentes
     */
    @Override
    public List<Buses> obtener() {
        Connection co =null;
        Statement stm= null;
        ResultSet rs=null;

        String sql="SELECT * FROM buses ORDER BY id_bus";

        List<Buses> listaBus= new ArrayList<Buses>();

        try {
            co= ConexionDB.conectar();
            stm=co.createStatement();
            rs=stm.executeQuery(sql);
            while (rs.next()) {
                Buses b= new Buses();
                b.setId_bus(rs.getInt(1));
                b.setPuestos(rs.getInt(2));
                listaBus.add(b);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase BusDaoImpl, método obtener");
            e.printStackTrace();
        }

        return listaBus;
    }
}
