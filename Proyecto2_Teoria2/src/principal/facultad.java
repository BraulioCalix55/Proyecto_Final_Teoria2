/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author djbrz
 */
public class facultad {
    String nombre ,añocreacion ,cantidad_docentes, cantidad_alumnos, cantidad_clases;

    public facultad(String nombre, String añocreacion, String cantidad_docentes, String cantidad_alumnos, String cantidad_clases) {
        this.nombre = nombre;
        this.añocreacion = añocreacion;
        this.cantidad_docentes = cantidad_docentes;
        this.cantidad_alumnos = cantidad_alumnos;
        this.cantidad_clases = cantidad_clases;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAñocreacion() {
        return añocreacion;
    }

    public void setAñocreacion(String añocreacion) {
        this.añocreacion = añocreacion;
    }

    public String getCantidad_docentes() {
        return cantidad_docentes;
    }

    public void setCantidad_docentes(String cantidad_docentes) {
        this.cantidad_docentes = cantidad_docentes;
    }

    public String getCantidad_alumnos() {
        return cantidad_alumnos;
    }

    public void setCantidad_alumnos(String cantidad_alumnos) {
        this.cantidad_alumnos = cantidad_alumnos;
    }

    public String getCantidad_clases() {
        return cantidad_clases;
    }

    public void setCantidad_clases(String cantidad_clases) {
        this.cantidad_clases = cantidad_clases;
    }
    
}
