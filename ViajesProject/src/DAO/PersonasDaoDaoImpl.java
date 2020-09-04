package DAO;

import Entidades.Personas;
import Connection.ConexionDB;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class PersonasDaoDaoImpl implements IPersonasDao {


    @Override
    public boolean CrearPasajero(Personas personas) {

        boolean registrar = false;

        Statement stm= null;
        Connection con=null;

        String sql="INSERT INTO buses values (NULL,'"+personas.getNro_documento()+ " " + personas.getNombre() +personas.getBus().getId_bus()+ " " + personas.getOrigen().getId_municipio()
        + " " + personas.getDestino().getId_municipio() + "')";

        try {
            con= ConexionDB.conectar();
            stm= con.createStatement();
            stm.execute(sql);
            registrar=true;
            stm.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error:No se pudo registrar la persona");
            e.printStackTrace();
        }
        return registrar;
    }

    @Override
    public List<Personas> obtener() {
        return null;
    }
}
