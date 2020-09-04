package DAO;

import Entidades.Buses;
import Entidades.Personas;

import java.util.List;

/**
 * Interface encargada de registrar los metodos del CRUD, contiene solo la firma de los metodos
 */
public interface IPersonasDao {

    public boolean CrearPasajero(int doc, String nombre, int id_origen, int id_destino, Buses bus);
    public List<Personas> obtener();
    public int PersonasXBus(int id_bus);
    public Personas pasajero(int doc);
}
