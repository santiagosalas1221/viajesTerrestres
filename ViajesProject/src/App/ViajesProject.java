/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Controller.ControllerBus;
import Controller.ControllerMunicipio;
import Entidades.Buses;
import Entidades.Municipio;

public class ViajesProject {

    public static void main(String[] args) {
        //Buses bus = new Buses(0, 40);
        Municipio municipio = new Municipio(0,"Medellin");

        // controlador
        ControllerBus controller = new ControllerBus();
        ControllerMunicipio controller2 = new ControllerMunicipio();

        // Guarda un bus a través del controlador
        //controller.registrar(bus);
        controller2.registrar(municipio);

        // ver buses
        controller.verBuses();
    }
}
