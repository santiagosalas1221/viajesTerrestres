package Controller;

import DAO.IMunicipioDao;
import DAO.MunicipioDaoImpl;
import Entidades.Municipio;
import View.ViewMunicipio;

import java.util.ArrayList;
import java.util.List;

public class ControllerMunicipio {
    private ViewMunicipio vista= new ViewMunicipio();

    public ControllerMunicipio() {
    }
    //llama al DAO para guardar un munipio
    public void registrar(Municipio municipio ) {
        IMunicipioDao dao= new MunicipioDaoImpl();
        dao.CrearMunicipio(municipio);
    }
    //llama al DAO para obtener todos los municipios y luego los muestra en la vista
    public void verMunicipios(){
        List<Municipio> municipios = new ArrayList<Municipio>();
        IMunicipioDao dao= new MunicipioDaoImpl();
        municipios=dao.obtener();
        vista.verMunicipios(municipios);
    }
}
