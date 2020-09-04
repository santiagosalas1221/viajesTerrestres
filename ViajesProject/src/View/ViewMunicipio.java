package View;


import Entidades.Municipio;

import java.util.List;

public class ViewMunicipio {
    public void verMunicipio(Municipio municipio) {
        System.out.println("Datos del Municipio: Nombre:"+municipio.getNombre_Municipio());
    }

    public void verMunicipios(List<Municipio> municipios) {
        for (Municipio municipio : municipios) {
            System.out.println("Datos del Municipio: Nombre:"+municipio.getNombre_Municipio());
        }
    }
}
