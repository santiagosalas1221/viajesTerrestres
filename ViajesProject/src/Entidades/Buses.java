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
public class Buses {

     private int id_bus;
    private int puestos;
    
    public Buses(int id_bus, int puestos) {
        this.id_bus = id_bus;
        this.puestos = puestos;
    }

    public Buses() { }

    //Getters and setters
    public int getId_bus() {
        return id_bus;
    }

    public void setId_bus(int id_bus) {
        this.id_bus = id_bus;
    }

    public int getPuestos() {
        return puestos;
    }

    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }
    
 
    
    
    
}
