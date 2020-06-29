/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import tablas.Edificio;

/**
 *
 * @author David
 */
public class EdificioDAO {
    String mensaje="";
    
    public String agregarEdificio(Connection con, Edificio e){
        PreparedStatement pst = null;
        String sql = "INSERT INTO EDIFICIO VALUES (?,?,?,?,?,?)";
        
        try {
            pst =con.prepareStatement(sql);
            pst.setString(1, e.getNumero_edi());
            pst.setString(2, e.getNombre_edi());
            pst.setString(3, e.getNumero_pisos());
            pst.setString(4, e.getCantidad_aulas());
            pst.setString(5, e.getAno_fundacion());
            pst.setString(6, e.getCantidad_banos());
            mensaje="GUARDADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
            
        } catch (SQLException ex) {
            mensaje="NO SE PUDO GUARDAR CORRECTAMENTE\n"+ex.getMessage();
        }
        return mensaje;
    }
    
    public String modificarEdificio(Connection con, Edificio e){
        PreparedStatement pst = null;
        String sql = "UPDATE INTO EDIFICIO SET NOMBRE =?, NUMERO_PISOS=?, CANTIDAD_AULAS=?,ANO_FUNDACION=?,CANTIDAD_BANOS=? WHERE NUMERO=?";
        try {
            pst =con.prepareStatement(sql);
            pst.setString(1, e.getNombre_edi());
            pst.setString(2, e.getNumero_pisos());
            pst.setString(3, e.getCantidad_aulas());
            pst.setString(4, e.getAno_fundacion());
            pst.setString(5, e.getCantidad_banos());
            pst.setString(6, e.getNumero_edi());
            mensaje="MODIFICADO CORRECTAMENTE";
            pst.execute();
            pst.close();
            
            
        } catch (SQLException ex) {
            mensaje="NO SE PUDO MODIFICAR CORRECTAMENTE\n"+ex.getMessage();
        }
        
        return mensaje;
    }
    
    public String eliminarEdificio(Connection con, String ID){
        PreparedStatement pst = null;
        String sql = "Delete from EDIFICIO where NUMERO ="+ID+"";
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
