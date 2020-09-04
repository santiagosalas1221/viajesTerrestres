/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Controller.ControllerBus;
import Controller.ControllerPersonas;
import Entidades.Buses;
import Entidades.Personas;

public class ViajesProject {

    public static void main(String[] args) {
        Buses bus = new Buses(0, 40);

        // controlador
        ControllerBus controller = new ControllerBus();

        // Guarda un bus a través del controlador
        controller.registrar(bus);

        // ver buses
        controller.verBuses();


        ControllerPersonas controllerP = new ControllerPersonas();

        Personas p = new Personas(1014294, "Santiago", )

        //ver personas
        controllerP.registrar(p);
    }
}
