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
public class Campus {
    String nombre, ciudad ,cantidad_edificios, cantidad_almunos, año, rector;

    public Campus() {
    }

    public Campus(String nombre, String ciudad, String cantidad_edificios, String cantidad_almunos, String año, String rector) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.cantidad_edificios = cantidad_edificios;
        this.cantidad_almunos = cantidad_almunos;
        this.año = año;
        this.rector = rector;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCantidad_edificios() {
        return cantidad_edificios;
    }

    public void setCantidad_edificios(String cantidad_edificios) {
        this.cantidad_edificios = cantidad_edificios;
    }

    public String getCantidad_almunos() {
        return cantidad_almunos;
    }

    public void setCantidad_almunos(String cantidad_almunos) {
        this.cantidad_almunos = cantidad_almunos;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getRector() {
        return rector;
    }

    public void setRector(String rector) {
        this.rector = rector;
    }
    
    
}
