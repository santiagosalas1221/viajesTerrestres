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

import java.util.List;
import java.util.Scanner;

public class ViajesProject {

    private static ControllerMunicipio controllerMunicipio = new ControllerMunicipio();
    private static ControllerBus controllerBus = new ControllerBus();
    private static ControllerPersonas controllerPersonas = new ControllerPersonas();

    public static void main(String[] args) {

        Scanner entradaOpc = new Scanner(System.in);
        controllerPersonas.verMsgAsociacion("MENÚ "+"\n"+
                "Digite el número según la opción que desea: "+"\n"+
                "1. Listar" +"\n"+
                "2. Crear Bus "+"\n"+
                "3. Crear Municipios"+"\n"+
                "4. Agregar pasajero a un bus"+"\n"+
                "5. Consultar pasajero en todos los buses");
        int opc= entradaOpc.nextInt();

        switch (opc){
            case 1:
                Scanner entradaOpclist = new Scanner(System.in);

                controllerPersonas.verMsgAsociacion("Listar"+"\n"+
                        "Digite el número según la opción que desea: "+"\n"+
                        "1. Buses" +"\n"+
                        "2. Municipios "+"\n"+
                        "3. Pasajeros");

                int opclist = entradaOpclist.nextInt();

                switch (opclist){
                    case 1:
                        controllerBus.verBuses();
                        break;
                    case 2:
                        controllerMunicipio.verMunicipios();
                        break;
                    case 3:
                        controllerPersonas.verPersonas();
                        break;
                    default:
                        controllerPersonas.verMsgAsociacion("Datos erróneos");
                        break;
                }
                break;
            case 2:
                Scanner entradapuestos = new Scanner(System.in);
                controllerPersonas.verMsgAsociacion("Ingrese número de puestos que tendrá el bus nuevo.");
                int NroPuestos=entradapuestos.nextInt();
                controllerBus.registrar(new Buses (0, NroPuestos));
                break;
            case 3:
                Scanner entradaNombre = new Scanner(System.in);
                controllerPersonas.verMsgAsociacion("Ingrese nombre del nuevo municipio");
                String nombrem = entradaNombre.nextLine();
                controllerMunicipio.registrar(new Municipio(0, nombrem));
                break;
            case 4:
                asociarPersona();
                break;
            case 5:
                consultarPasajeroAllbus();
                break;
            default:
                controllerPersonas.verMsgAsociacion("Datos erróneos");
                break;
        }

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

        controllerMunicipio.verMunicipios();

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
