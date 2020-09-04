package DAO;

import Connection.ConexionDB;
import Entidades.Buses;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BusDaoImpl implements IBusesDao {

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
            System.out.println("Error: Clase ClienteDaoImple, método registrar");
            e.printStackTrace();
        }
        return registrar;
    }

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
