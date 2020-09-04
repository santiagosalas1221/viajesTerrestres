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
public class Municipio {

    private int id_municipio;
    private String nombre_Municipio;

    public Municipio(int id_municipio, String nombre_Municipio) {
        this.id_municipio = id_municipio;
        this.nombre_Municipio = nombre_Municipio;
    }

    public Municipio(){

    }


    public int getId_municipio() {
        return id_municipio;
    }

    public void setId_municipio(int id_municipio) {
        this.id_municipio = id_municipio;
    }

    public String getNombre_Municipio() {
        return nombre_Municipio;
    }

    public void setNombre_Municipio(String nombre_Municipio) {
        this.nombre_Municipio = nombre_Municipio;
    }
}

