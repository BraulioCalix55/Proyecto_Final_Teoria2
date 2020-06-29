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
public class Docente {
    String nombre ,apellidos, facultad, id, cuenta , años ,genero, doble;

    public Docente(String nombre, String apellidos, String facultad, String id, String cuenta, String años, String genero, String doble) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.facultad = facultad;
        this.id = id;
        this.cuenta = cuenta;
        this.años = años;
        this.genero = genero;
        this.doble = doble;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
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


    public String getAños() {
        return años;
    }

    public void setAños(String años) {
        this.años = años;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDoble() {
        return doble;
    }

    public void setDoble(String doble) {
        this.doble = doble;
    }
    
}
