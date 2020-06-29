/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oracle;

import conexiones.conexionOracle;
import java.sql.Connection;
import java.sql.SQLException;
import tablas.Campus;

/**
 *
 * @author David
 */
public class CampusBO {
    public String mensaje="";
     public CampusDAO edao=new CampusDAO();
    
    public String agregarCampus(Campus e) throws SQLException{
        Connection con =conexionOracle.getConnection(conexionOracle.login, conexionOracle.password, conexionOracle.url);
        try {
            mensaje=edao.agregarCampus(con, e);
        } catch (Exception ex) {
            mensaje=mensaje+ " "+ex.getMessage();
        }
        finally{
            try {
                if(con!=null){
                    con.close();
                }
            } catch (Exception ex) {
                mensaje=mensaje+ " "+ex.getMessage();
            }
        }
        return mensaje;
    }
    
    public String modificarCampus(Campus e) throws SQLException{
         Connection con =conexionOracle.getConnection(conexionOracle.login, conexionOracle.password, conexionOracle.url);
        try {
            mensaje=edao.modificarCampus(con, e);
        } catch (Exception ex) {
            mensaje=mensaje+ " "+ex.getMessage();
        }
        finally{
            try {
                if(con!=null){
                    con.close();
                }
            } catch (Exception ex) {
                mensaje=mensaje+ " "+ex.getMessage();
            }
        }
        return mensaje;
       
    }
    
    public String eliminarCampus(String ID) throws SQLException{
         Connection con =conexionOracle.getConnection(conexionOracle.login, conexionOracle.password, conexionOracle.url);
        try {
            mensaje=edao.eliminarCampus(con, ID);
        } catch (Exception e) {
            mensaje=mensaje+ " "+e.getMessage();
        }
        finally{
            try {
                if(con!=null){
                    con.close();
                }
            } catch (Exception ex) {
                mensaje=mensaje+ " "+ex.getMessage();
            }
        }
        return mensaje;
    }
}
