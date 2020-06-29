/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import tablas.Alumno;

/**
 *
 * @author David
 */
public class AlumnoDAO {
    String mensaje="";
    
    public String agregarAlumno(Connection con, Alumno e){
        PreparedStatement pst = null;
        String sql = "INSERT INTO ALUMNO VALUES (?,?,?,?,?,?,?); ";
        
        try {
            pst =con.prepareStatement(sql);
            pst.setString(1, e.getNombre());
            pst.setString(2, e.getApellido());
            pst.setString(3, e.getId());
            pst.setString(4, e.getCuenta());
            pst.setString(5, e.getCarrera());
            pst.setString(6, e.getTelefono());
            pst.setString(7, e.getFechaingres());
            mensaje="GUARDADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
            
        } catch (SQLException ex) {
            mensaje="NO SE PUDO GUARDAR CORRECTAMENTE\n"+ex.getMessage();
        }
        return mensaje;
    }
    
    public String modificarAlumno(Connection con, Alumno e){
        PreparedStatement pst = null;
        String sql = "UPDATE INTO ALUMNO SET NOMBRE =?, APELLIDO=?, CUENTA=?,CARRERA=?,TELEFONO=? FECHA_INGRESO=? WHERE ID=?;";
        try {
            pst =con.prepareStatement(sql);
            pst.setString(1, e.getNombre());
            pst.setString(2, e.getApellido());
            pst.setString(3, e.getCuenta());
            pst.setString(4, e.getCarrera());
            pst.setString(5, e.getTelefono());
            pst.setString(6, e.getFechaingres());
            pst.setString(7, e.getId());
            mensaje="MODIFICADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
            
        } catch (SQLException ex) {
            mensaje="NO SE PUDO MODIFICAR CORRECTAMENTE\n"+ex.getMessage();
        }
        
        return mensaje;
    }
    
    public String eliminarAlumno(Connection con, String ID){
        PreparedStatement pst = null;
        String sql = "Delete from Alumno where ID ="+ID+";";
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
