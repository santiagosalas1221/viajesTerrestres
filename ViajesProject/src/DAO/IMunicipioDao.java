package DAO;

import Entidades.Buses;
import Entidades.Municipio;

import java.util.List;

public interface IMunicipioDao {
    public boolean CrearMunicipio(Municipio municipio);
    public List<Municipio> obtener();
}
