package Controller;


import DAO.BusDaoImpl;
import DAO.IPersonasDao;
import DAO.PersonasDaoImpl;
import Entidades.Buses;
import Entidades.Personas;
import View.ViewPersonas;

import java.util.ArrayList;
import java.util.List;

public class ControllerPersonas {

    private ViewPersonas vista= new ViewPersonas();

    public ControllerPersonas() {
    }
    //llama al DAO para guardar una persona
    public void registrar(int doc, String nombre, int id_origen, int id_destino, Buses bus) {
        IPersonasDao dao= new PersonasDaoImpl();
        dao.CrearPasajero(doc, nombre, id_origen, id_destino, bus);
    }

   // llama al DAO para obtener todos los buses y luego los muestra en la vista
    public void verPersonas(){
        List<Personas> personas = new ArrayList<Personas>();
        IPersonasDao dao= new PersonasDaoImpl();
        personas=dao.obtener();
        vista.verPersonas(personas);
    }

    public void verPersona(int doc){
        Personas persona = new Personas();
        IPersonasDao dao= new PersonasDaoImpl();
        persona=dao.pasajero(doc);
        vista.verPersona(persona);
    }

    public boolean VerificacionPuestos(Buses bus){
        IPersonasDao dao= new PersonasDaoImpl();
       return dao.PersonasXBus(bus.getId_bus())<(bus.getPuestos()/2);
    }

    public  void verMsgAsociacion(String msg){
        vista.personaAsociacion(msg);
    }

}
