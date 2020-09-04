/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author santi
 */
public class Personas {


    private int nro_docuemento;
    private String nombre;
    private Buses bus;
    private Municipio origen;
    private Municipio destino;


    public Personas(int nro_docuemento, String nombre, Buses bus, Municipio origen, Municipio destino) {
        this.nro_docuemento = nro_docuemento;
        this.nombre = nombre;
        this.bus = bus;
        this.origen = origen;
        this.destino = destino;
    }

    public int getNro_docuemento() {
        return nro_docuemento;
    }

    public void setNro_docuemento(int nro_docuemento) {
        this.nro_docuemento = nro_docuemento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Buses getBus() {
        return bus;
    }

    public void setBus(Buses bus) {
        this.bus = bus;
    }

    public Municipio getOrigen() {
        return origen;
    }

    public void setOrigen(Municipio origen) {
        this.origen = origen;
    }

    public Municipio getDestino() {
        return destino;
    }

    public void setDestino(Municipio destino) {
        this.destino = destino;
    }

}
