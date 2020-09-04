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


    private int nro_documento;
    private String nombre;
    private Buses bus;
    private Municipio origen;
    private Municipio destino;


    public Personas(int nro_documento, String nombre, Buses bus, Municipio origen, Municipio destino) {
        this.nro_documento = nro_documento;
        this.nombre = nombre;
        this.bus = bus;
        this.origen = origen;
        this.destino = destino;
    }

    public int getNro_documento() {
        return nro_documento;
    }

    public void setNro_documento(int nro_documento) {
        this.nro_documento = nro_documento;
    }

    public Personas(){ }

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
