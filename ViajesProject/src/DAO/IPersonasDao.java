package DAO;

import Entidades.Personas;

import java.util.List;

/**
 * Interface encargada de registrar los metodos del CRUD, contiene solo la firma de los metodos
 */
public interface IPersonasDao {

    public boolean CrearPasajero(Personas personas);
   // public List<Personas> obtener();
}
