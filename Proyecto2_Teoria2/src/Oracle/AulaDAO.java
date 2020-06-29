/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import tablas.Aula;

/**
 *
 * @author David
 */
public class AulaDAO {
    String mensaje="";
    
    public String agregarAula(Connection con, Aula e){
        PreparedStatement pst = null;
        String sql = "INSERT INTO AULA VALUES (?,?,?,?,?,?,?,?)";
        
        try {
            pst =con.prepareStatement(sql);
            pst.setString(1, e.getNumero());
            pst.setString(2, e.getEdificio());
            pst.setString(3, e.getDatashow());
            pst.setString(4, e.getPizarra());
            pst.setString(5, e.getCapacidad());
            pst.setString(6, e.getAire());
            pst.setString(7, e.getCompu());
            pst.setString(8, e.getInternet());
            mensaje="GUARDADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
            
        } catch (SQLException ex) {
            mensaje="NO SE PUDO GUARDAR CORRECTAMENTE\n"+ex.getMessage();
        }
        return mensaje;
    }
    
    public String modificarAula(Connection con, Aula e){
        PreparedStatement pst = null;
        String sql = "UPDATE INTO ALUMNO SET EDIFICIO =?, DATASHOW=?, PIZARRA=?,CAPACIDAD=?,AIRE_ACONDICIONADO=?, COMPUTADORA=?,INTERNET=? WHERE NUMERO=?";
        try {
            pst =con.prepareStatement(sql);
            pst.setString(1, e.getEdificio());
            pst.setString(2, e.getDatashow());
            pst.setString(3, e.getPizarra());
            pst.setString(4, e.getCapacidad());
            pst.setString(5, e.getAire());
            pst.setString(6, e.getCompu());
            pst.setString(7, e.getInternet());
            pst.setString(8, e.getNumero());
            mensaje="MODIFICADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
            
        } catch (SQLException ex) {
            mensaje="NO SE PUDO MODIFICAR CORRECTAMENTE\n"+ex.getMessage();
        }
        
        return mensaje;
    }
    
    public String eliminarAula(Connection con, String ID){
        PreparedStatement pst = null;
        String sql = "Delete from AULA where NUMERO ="+ID+"";
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
