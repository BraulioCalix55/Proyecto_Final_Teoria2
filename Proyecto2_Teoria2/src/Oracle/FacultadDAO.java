/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import tablas.Facultad;

/**
 *
 * @author David
 */
public class FacultadDAO {
    String mensaje="";
    
    public String agregarFacultad(Connection con, Facultad e){
        PreparedStatement pst = null;
        String sql = "INSERT INTO FACULTAD VALUES (?,?,?,?,?)";
        
        try {
            pst =con.prepareStatement(sql);
            pst.setString(1, e.getNombre());
            pst.setString(2, e.getAñocreacion());
            pst.setString(3, e.getCantidad_docentes());
            pst.setString(4, e.getCantidad_alumnos());
            pst.setString(5, e.getCantidad_clases());
            mensaje="GUARDADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
            
        } catch (SQLException ex) {
            mensaje="NO SE PUDO GUARDAR CORRECTAMENTE\n"+ex.getMessage();
        }
        return mensaje;
    }
    
    public String modificarFacultad(Connection con, Facultad e){
        PreparedStatement pst = null;
        String sql = "UPDATE INTO FACULTAD SET ANO_CREACION =?, CANTIDAD_DOCENTES=?, CANTIDAD_ALUMNOS=?,CANTIDAD_CLASES=? WHERE NOMBRE=?";
        try {
            pst =con.prepareStatement(sql);
            pst.setString(1, e.getAñocreacion());
            pst.setString(2, e.getCantidad_docentes());
            pst.setString(3, e.getCantidad_alumnos());
            pst.setString(4, e.getCantidad_clases());
            pst.setString(5, e.getNombre());
            mensaje="MODIFICADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
            
        } catch (SQLException ex) {
            mensaje="NO SE PUDO MODIFICAR CORRECTAMENTE\n"+ex.getMessage();
        }
        
        return mensaje;
    }
    
    public String eliminarFacultad(Connection con, String ID){
        PreparedStatement pst = null;
        String sql = "Delete from FACULTAD where ID ="+ID+"";
        try {
            pst =con.prepareStatement(sql);
            System.out.println("Borro");
            mensaje="ELIMINO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
            
        } catch (SQLException e) {
            mensaje="NO SE PUDO ELIMINAR CORRECTAMENTE\n"+e.getMessage();
        }

        
        return mensaje;
    }
}
