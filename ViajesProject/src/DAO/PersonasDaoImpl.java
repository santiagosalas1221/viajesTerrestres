package DAO;

import Entidades.Personas;
import Connection.ConexionDB;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class PersonasDaoImpl implements IPersonasDao {


    @Override
    public boolean CrearPasajero(Personas personas) {

        boolean registrar = false;

        Statement stm;
        Connection con;


     /*   String sql= "INSERT INTO personas (nro_documento, nombre_pasajero, id_origen, id_destino, id_Bus) values ( '" + personas.getNro_documento() + " " + personas.getNombre() + " " + personas.getOrigen().getId_municipio() + " " + personas.getDestino().getId_municipio() + " " +
                personas.getBus().getId_bus() + "')";*/

        String sql="INSERT INTO personas values ('"+personas.getNro_documento()+ " , " + personas.getNombre() + " , " + personas.getOrigen().getId_municipio()
        + " , " + personas.getDestino().getId_municipio() + " , " + personas.getBus().getId_bus() + "')";

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



}
