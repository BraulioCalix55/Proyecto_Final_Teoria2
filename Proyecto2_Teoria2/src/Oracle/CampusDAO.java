/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import tablas.Campus;

/**
 *
 * @author David
 */
public class CampusDAO {
    String mensaje="";
    
    public String agregarCampus(Connection con, Campus e){
        PreparedStatement pst = null;
        String sql = "INSERT INTO CAMPUS VALUES (?,?,?,?,?,?)";
        
        try {
            pst =con.prepareStatement(sql);
            pst.setString(1, e.getNombre());
            pst.setString(2, e.getCiudad());
            pst.setString(3, e.getCantidad_edificios());
            pst.setString(4, e.getCantidad_almunos());
            pst.setString(5, e.getAño());
            pst.setString(6, e.getRector());
            mensaje="GUARDADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
            
        } catch (SQLException ex) {
            mensaje="NO SE PUDO GUARDAR CORRECTAMENTE\n"+ex.getMessage();
        }
        return mensaje;
    }
    
    public String modificarCampus(Connection con, Campus e){
        PreparedStatement pst = null;
        String sql = "UPDATE INTO CAMPUS SET CIUDAD =?, CANTIDAD_EDIFICIOS=?, CANTIDAD_ALUMNOS=?,ANO_FUNDACION=?,RECTOR=? WHERE NOMBRE=?";
        try {
            pst =con.prepareStatement(sql);
            pst.setString(1, e.getCiudad());
            pst.setString(2, e.getCantidad_edificios());
            pst.setString(3, e.getCantidad_almunos());
            pst.setString(4, e.getAño());
            pst.setString(5, e.getRector());
            pst.setString(6, e.getNombre());
            mensaje="MODIFICADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
            
        } catch (SQLException ex) {
            mensaje="NO SE PUDO MODIFICAR CORRECTAMENTE\n"+ex.getMessage();
        }
        
        return mensaje;
    }
    
    public String eliminarCampus(Connection con, String ID){
        PreparedStatement pst = null;
        String sql = "Delete from CAMPUS where NOMBRE ="+ID+"";
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
