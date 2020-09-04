package DAO;

import Entidades.Buses;

import java.util.List;

public interface IBusesDao {
    public boolean CrearBuses(Buses bus);
    public List<Buses> obtener();
}
