package DAO;

/**
 * Implememtacion de la interfaz 'IPersonasDao' en esta clase se ejecutan las sentencias sql para la DB
 */
import Entidades.Buses;
import Entidades.Municipio;
import Entidades.Personas;
import Connection.ConexionDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PersonasDaoImpl implements IPersonasDao {


    /**
     * Metodo encargado de crear nuevos pasajeros en la BD
     */
    @Override
    public boolean CrearPasajero(Personas personas) {

        boolean registrar = false;

        Statement stm;
        Connection con;


        String sql="INSERT INTO personas values ('"+personas.getNro_documento()+"','" + personas.getNombre() + "','" + personas.getOrigen().getId_municipio()
        + "','" + personas.getDestino().getId_municipio() + "','" + personas.getBus().getId_bus() + "')";

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

        Connection co =null;
        Statement stm= null;
        ResultSet rs=null;

        String sql="SELECT * FROM personas";

        List<Personas> listaPersonas= new ArrayList<Personas>();

        try {
            co= ConexionDB.conectar();
            stm=co.createStatement();
            rs=stm.executeQuery(sql);
            while (rs.next()) {
                Personas m= new Personas();
                m.setNro_documento(rs.getInt(1));
                m.setNombre(rs.getString(2));
                Buses bus = consultaBus(rs.getInt(5));
                m.setBus(bus);
                Municipio origen = consultaMunicipio(rs.getInt(3));
                m.setOrigen(origen);
                Municipio destino = consultaMunicipio(rs.getInt(4));
                m.setDestino(destino);
                listaPersonas.add(m);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase personaDaoImpl, método lista personas");
            e.printStackTrace();
        }
        return listaPersonas;
    }

    /**
     * Metodo encargado de consultar municipios por id
     * @param id_objetivo
     * @return municipio
     */
    public static Municipio consultaMunicipio(int id_objetivo){

        Connection co =null;
        Statement stm= null;
        ResultSet rs=null;


        String sql="SELECT * FROM municipios WHERE id_municipio =  '" + id_objetivo + "' ";

        Municipio municipio= new Municipio();

        try {
            co= ConexionDB.conectar();
            stm=co.createStatement();
            rs=stm.executeQuery(sql);
            while (rs.next()) {
                municipio.setId_municipio(rs.getInt(1));
                municipio.setNombre_Municipio(rs.getString(2));
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase PersonasImplDao consulta municipio Id" + "");
            e.printStackTrace();
        }
        return municipio;
    }


    public static Buses consultaBus(int id_objetivo){

        Connection co =null;
        Statement stm= null;
        ResultSet rs=null;


        String sql="SELECT * FROM buses WHERE id_bus =  '" + id_objetivo + "' ";

        Buses bus= new Buses();

        try {
            co= ConexionDB.conectar();
            stm=co.createStatement();
            rs=stm.executeQuery(sql);
            while (rs.next()) {
                bus.setId_bus(rs.getInt(1));
                bus.setPuestos(rs.getInt(2));
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase PersonasImplDao consulta Buses Id" + "");
            e.printStackTrace();
        }
        return bus;
    }


}
