/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Controller.ControllerBus;
import Controller.ControllerMunicipio;
import Controller.ControllerPersonas;
import Entidades.Buses;
import Entidades.Municipio;
import Entidades.Personas;

public class ViajesProject {

    public static void main(String[] args) {
        Buses bus = new Buses(1, 40);
        Municipio municipio = new Municipio(1,"Medellin");
        Municipio municipio1 = new Municipio(2,"RioNegro");

        // controlador
       // ControllerBus controller = new ControllerBus();
        ControllerMunicipio controller2 = new ControllerMunicipio();

        // Guarda un bus a través del controlador
       // controller.registrar(bus);

        // ver buses
       // controller.verBuses();


        ControllerPersonas controllerP = new ControllerPersonas();

        Personas p = new Personas(1014294, "Santiago", bus, municipio, municipio1);

        //ver personas
        controllerP.registrar(p);
      //  controller2.registrar(municipio);
        controller2.registrar(municipio1);
    }
}
