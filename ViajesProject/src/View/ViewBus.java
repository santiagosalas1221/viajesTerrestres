package View;

import Entidades.Buses;

import java.util.List;

public class ViewBus {
    public void verBus(Buses bus) {
        System.out.println("Datos del Bus: "+bus);
    }

    public void verBuses(List<Buses> buses) {
        for (Buses bus : buses) {
            System.out.println("Datos del Bus: id: "+bus.getId_bus()+" Nro puestos: "+bus.getPuestos());
        }
    }
}
