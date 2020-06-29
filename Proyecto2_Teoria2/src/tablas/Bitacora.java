/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas;

/**
 *
 * @author David
 */
public class Bitacora {
    String tabla;
    String operacion;
    String llave_primaria;
    String datos;

    public Bitacora(String tabla, String operacion, String llave_primaria, String datos) {
        this.tabla = tabla;
        this.operacion = operacion;
        this.llave_primaria = llave_primaria;
        this.datos = datos;
    }

    public Bitacora() {
    }

    public String getTabla() {
        return tabla;
    }

    public void setTabla(String tabla) {
        this.tabla = tabla;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getLlave_primaria() {
        return llave_primaria;
    }

    public void setLlave_primaria(String llave_primaria) {
        this.llave_primaria = llave_primaria;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }
    
    
    
}
