package View;

import Entidades.Personas;

import java.util.List;

public class ViewPersonas {

    public void verPersona(Personas persona) {
        System.out.println("Datos del pasajero: Identificación: "+persona.getNro_documento()+", Nombre: "+persona.getNombre() + ", Origen: "+persona.getOrigen().getNombre_Municipio()  + ", Destino "+persona.getDestino().getNombre_Municipio());
    }

    public void verPersonas(List<Personas> personas) {
        for (Personas persona : personas) {
            System.out.println("Datos del pasajero: Identificación: "+persona.getNro_documento()+", Nombre: "+persona.getNombre() + ", Origen: "+persona.getOrigen().getNombre_Municipio()  + ", Destino "+persona.getDestino().getNombre_Municipio());
        }
    }


    public void personaAsociacion(String mensaje){
        System.out.println(mensaje);
    }

}
