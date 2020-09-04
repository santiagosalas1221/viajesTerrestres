package Controller;

import DAO.BusDaoImpl;
import DAO.IBusesDao;
import Entidades.Buses;
import View.ViewBus;

import java.util.ArrayList;
import java.util.List;

public class ControllerBus {
    private ViewBus vista= new ViewBus();

    public ControllerBus() {
    }
    //llama al DAO para guardar un bus
    public void registrar(Buses bus ) {
        IBusesDao dao= new BusDaoImpl();
        dao.CrearBuses(bus);
    }
    //llama al DAO para obtener todos los buses y luego los muestra en la vista
    public void verBuses(){
        List<Buses> buses = new ArrayList<Buses>();
        IBusesDao dao= new  BusDaoImpl();
        buses=dao.obtener();
        vista.verBuses(buses);
    }

    public List<Buses> Buses(){
        IBusesDao dao= new  BusDaoImpl();
        return dao.obtener();
    }
}
