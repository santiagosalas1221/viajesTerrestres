package Controller;


import DAO.IPersonasDao;
import DAO.PersonasDaoDaoImpl;
import Entidades.Personas;
import View.ViewPersonas;

public class ControllerPersonas {

    private ViewPersonas vista= new ViewPersonas();

    public ControllerPersonas() {
    }
    //llama al DAO para guardar una persona
    public void registrar(Personas Persona ) {
        IPersonasDao dao= new PersonasDaoDaoImpl();
        dao.CrearPasajero(Persona);
    }
    /*//llama al DAO para obtener todos los buses y luego los muestra en la vista
    public void verBuses(){
        List<Buses> buses = new ArrayList<Buses>();
        IBusesDao dao= new  BusDaoImpl();
        buses=dao.obtener();
        vista.verBuses(buses);
    }*/
}
