/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.Tablas;

/**
 *
 * @author djbrz
 */
public class Edificio {
    String numero_edi, nombre_edi, numero_pisos, cantidad_aulas, año_fundacion, cantidad_baños;

    public Edificio(String numero_edi, String nombre_edi, String numero_pisos, String cantidad_aulas, String año_fundacion, String cantidad_baños) {
        this.numero_edi = numero_edi;
        this.nombre_edi = nombre_edi;
        this.numero_pisos = numero_pisos;
        this.cantidad_aulas = cantidad_aulas;
        this.año_fundacion = año_fundacion;
        this.cantidad_baños = cantidad_baños;
    }

    public String getNumero_edi() {
        return numero_edi;
    }

    public void setNumero_edi(String numero_edi) {
        this.numero_edi = numero_edi;
    }

    public String getNombre_edi() {
        return nombre_edi;
    }

    public void setNombre_edi(String nombre_edi) {
        this.nombre_edi = nombre_edi;
    }

    public String getNumero_pisos() {
        return numero_pisos;
    }

    public void setNumero_pisos(String numero_pisos) {
        this.numero_pisos = numero_pisos;
    }

    public String getCantidad_aulas() {
        return cantidad_aulas;
    }

    public void setCantidad_aulas(String cantidad_aulas) {
        this.cantidad_aulas = cantidad_aulas;
    }

    public String getAño_fundacion() {
        return año_fundacion;
    }

    public void setAño_fundacion(String año_fundacion) {
        this.año_fundacion = año_fundacion;
    }

    public String getCantidad_baños() {
        return cantidad_baños;
    }

    public void setCantidad_baños(String cantidad_baños) {
        this.cantidad_baños = cantidad_baños;
    }
    
}
