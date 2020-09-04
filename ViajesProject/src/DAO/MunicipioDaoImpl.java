package DAO;

import Entidades.Buses;
import Entidades.Municipio;
import Connection.ConexionDB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MunicipioDaoImpl implements IMunicipioDao {
    @Override
    public boolean CrearMunicipio(Municipio municipio) {
        boolean registrar = false;

        Statement stm= null;
        Connection con=null;

        String sql="INSERT INTO municipios values (NULL,'"+municipio.getNombre_Municipio()+"')";

        try {
            con= ConexionDB.conectar();
            stm= con.createStatement();
            stm.execute(sql);
            registrar=true;
            stm.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase MunicipioDaoImple, método registrar");
            e.printStackTrace();
        }
        return registrar;
    }

    @Override
    public List<Municipio> obtener() {
        Connection co =null;
        Statement stm= null;
        ResultSet rs=null;

        String sql="SELECT * FROM municipios ORDER BY id_municipio";

        List<Municipio> listaMunicipios= new ArrayList<Municipio>();

        try {
            co= ConexionDB.conectar();
            stm=co.createStatement();
            rs=stm.executeQuery(sql);
            while (rs.next()) {
                Municipio m= new Municipio();
                m.setId_municipio(rs.getInt(1));
                m.setNombre_Municipio(rs.getString(2));
                listaMunicipios.add(m);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase MunicipioDaoImpl, método listamunicipios");
            e.printStackTrace();
        }

        return listaMunicipios;
    }
}
