/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2_teoria2;

/**
 *
 * @author djbrz
 */
public class Alumno {

    String nombre, apellido, id, cuenta, carrera, telefono, fechaingres;

    public Alumno(String nombre, String apellido, String id, String cuenta, String carrera, String telefono, String fechaingres) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.cuenta = cuenta;
        this.carrera = carrera;
        this.telefono = telefono;
        this.fechaingres = fechaingres;
    }

    public Alumno() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaingres() {
        return fechaingres;
    }

    public void setFechaingres(String fechaingres) {
        this.fechaingres = fechaingres;
    }
}
