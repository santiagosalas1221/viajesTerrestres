package View;

import Entidades.Personas;

import java.util.List;

public class ViewPersonas {

    public void verPersona(Personas persona) {
        System.out.println("Datos de pasajero: "+persona);
    }

    public void verPersonas(List<Personas> personas) {
        for (Personas persona : personas) {
            System.out.println("Datos del pasajero: Nombre: "+persona.getNro_documento()+" "+persona.getNombre() + " "+persona.getOrigen().getNombre_Municipio()  + " "+persona.getDestino().getNombre_Municipio());
        }
    }
}
