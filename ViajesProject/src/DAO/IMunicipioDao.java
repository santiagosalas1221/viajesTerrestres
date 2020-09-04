package DAO;


import Entidades.Municipio;

import java.util.List;

/**
 * Interface encargada de registrar los metodos del CRUD, contiene solo la firma de los metodos
 */

public interface IMunicipioDao {
    public boolean CrearMunicipio(Municipio municipio);
    public List<Municipio> obtener();
}
