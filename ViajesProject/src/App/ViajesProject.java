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

import javax.print.Doc;
import java.util.List;
import java.util.Scanner;

public class ViajesProject {

    private static ControllerMunicipio cm = new ControllerMunicipio();
    private static ControllerBus controllerBus = new ControllerBus();
    private static ControllerPersonas controllerPersonas = new ControllerPersonas();

    public static void main(String[] args) {

        Buses bus = new Buses(0, 2);
        Municipio municipio = new Municipio(1,"Medellin");
        Municipio municipio1 = new Municipio(2,"RioNegro");

        // controlador

        //ControllerMunicipio controller2 = new ControllerMunicipio();

        // Guarda un bus a través del controlador
           // controllerBus.registrar(bus);

        // ver buses
       // controller.verBuses();

        // ver personas

            //asociarPersona();
            //asociarPersona();

          //ControllerPersonas controllerP = new ControllerPersonas();
          //controllerP.verPersonas();



       // Personas p = new Personas(1014294, "Santiago", bus, municipio, municipio1);

        //ver personas
       // controllerP.registrar(p);
      //  controller2.registrar(municipio);
      //  controller2.registrar(municipio1);

        //asociarPersona();
        consultarPasajeroAllbus();
    }

    public static void asociarPersona(){
        String Nombre;
        int Documento;
        int Origen;
        int Destino;

        Scanner entradaD = new Scanner(System.in);
        Scanner entradaN = new Scanner(System.in);
        Scanner entradaO = new Scanner(System.in);
        Scanner entradaDes = new Scanner(System.in);

        controllerPersonas.verMsgAsociacion("Hola: Digita tu documento");
        Documento= entradaD.nextInt();

        controllerPersonas.verMsgAsociacion("Digita tu nombre");
        Nombre= entradaN.nextLine();

        cm.verMunicipios();

        controllerPersonas.verMsgAsociacion("Ingresa código del municipio de origen según la lista anterior");
        Origen=entradaO.nextInt();

        controllerPersonas.verMsgAsociacion("Ingresa código del municipio de destino según la lista anterior");
        Destino=entradaDes.nextInt();

        List<Buses> buses = controllerBus.Buses();

        int sw=0;
        int i=0;
        do {
            if(controllerPersonas.VerificacionPuestos(buses.get(i))){
                controllerPersonas.registrar(Documento,Nombre,Origen,Destino,buses.get(i));
                sw=1;
            }else{
                i++;
               sw=0;
            }
        }while(sw==0 && i<buses.size());

        if(i == buses.size()){
            controllerPersonas.verMsgAsociacion("NO puede viajar.");
        }else{
            controllerPersonas.verMsgAsociacion("Feliz viaje.");
        }
    }

    public static void consultarPasajeroAllbus(){
        int Documento;
        Scanner entradaD = new Scanner(System.in);
        controllerPersonas.verMsgAsociacion("Ingresa documento:");
        Documento= entradaD.nextInt();
        controllerPersonas.verPersona(Documento);
    }

}
