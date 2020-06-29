/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import tablas.Docente;

/**
 *
 * @author David
 */
public class DocenteDAO {
    String mensaje="";
    
    public String agregarDocente(Connection con, Docente e){
        PreparedStatement pst = null;
        String sql = "INSERT INTO DOCENTE VALUES (?,?,?,?,?,?,?,?)";
        
        try {
            pst =con.prepareStatement(sql);
            pst.setString(1, e.getNombre());
            pst.setString(2, e.getApellidos());
            pst.setString(3, e.getFacultad());
            pst.setString(4, e.getId());
            pst.setString(5, e.getCuenta());
            pst.setString(6, e.getAños());
            pst.setString(7, e.getGenero());
            pst.setString(8, e.getDoble());
            mensaje="GUARDADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
            
        } catch (SQLException ex) {
            mensaje="NO SE PUDO GUARDAR CORRECTAMENTE\n"+ex.getMessage();
        }
        return mensaje;
    }
    
    public String modificarDocente(Connection con, Docente e){
        PreparedStatement pst = null;
        String sql = "UPDATE INTO DOCENTE SET NOMBRE =?, APELLIDOS=?, FACULTAD=?, CUENTA=?, ANOS_EXPERIENCIA=?, GENERO=?, DOBLE_TITULACION=? WHERE ID=?";
        try {
            pst =con.prepareStatement(sql);
            pst.setString(1, e.getNombre());
            pst.setString(2, e.getApellidos());
            pst.setString(3, e.getFacultad());
            pst.setString(4, e.getCuenta());
            pst.setString(5, e.getAños());
            pst.setString(6, e.getGenero());
            pst.setString(7, e.getDoble());
            pst.setString(8, e.getId());
            mensaje="MODIFICADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
            
        } catch (SQLException ex) {
            mensaje="NO SE PUDO MODIFICAR CORRECTAMENTE\n"+ex.getMessage();
        }
        
        return mensaje;
    }
    
    public String eliminarDocente(Connection con, String ID){
        PreparedStatement pst = null;
        String sql = "Delete from DOCENTE where ID ="+ID+"";
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
