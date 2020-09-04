package DAO;

import Entidades.Buses;

import java.util.List;

/**
 * Interface encargada de registrar los metodos del CRUD, contiene solo la firma de los metod
 */


public interface IBusesDao {
    public boolean CrearBuses(Buses bus);
    public List<Buses> obtener();
}
