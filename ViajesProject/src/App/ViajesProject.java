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

            asociarPersona();
            asociarPersona();

          //ControllerPersonas controllerP = new ControllerPersonas();
          //controllerP.verPersonas();



       // Personas p = new Personas(1014294, "Santiago", bus, municipio, municipio1);

        //ver personas
       // controllerP.registrar(p);
      //  controller2.registrar(municipio);
      //  controller2.registrar(municipio1);
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


        System.out.println("Hola: Digita tu documento");
        Documento= entradaD.nextInt();

        System.out.println("Digita tu nombre");
        Nombre= entradaN.nextLine();

        cm.verMunicipios();

        System.out.println("Ingresa código del municipio de origen según la lista anterior");
        Origen=entradaO.nextInt();

        System.out.println("Ingresa código del municipio de destino según la lista anterior");
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
            System.out.println("NO puede viajar.");
        }else{
            System.out.println("Feliz viaje.");
        }
    }
}
