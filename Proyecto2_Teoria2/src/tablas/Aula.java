/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas;

/**
 *
 * @author djbrz
 */
public class Aula {
    String numero, edificio, datashow ,pizarra ,capacidad, aire ,compu, internet;

    public Aula(String numero, String edificio, String datashow, String pizarra, String capacidad, String aire, String compu, String internet) {
        this.numero = numero;
        this.edificio = edificio;
        this.datashow = datashow;
        this.pizarra = pizarra;
        this.capacidad = capacidad;
        this.aire = aire;
        this.compu = compu;
        this.internet = internet;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEdificio() {
        return edificio;
    }

    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

    public String getDatashow() {
        return datashow;
    }

    public void setDatashow(String datashow) {
        this.datashow = datashow;
    }

    public String getPizarra() {
        return pizarra;
    }

    public void setPizarra(String pizarra) {
        this.pizarra = pizarra;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getAire() {
        return aire;
    }

    public void setAire(String aire) {
        this.aire = aire;
    }

    public String getCompu() {
        return compu;
    }

    public void setCompu(String compu) {
        this.compu = compu;
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }
    
}
