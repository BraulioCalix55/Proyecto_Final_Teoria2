/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oracle;

import conexiones.conexionOracle;
import java.sql.Connection;
import java.sql.SQLException;
import tablas.Edificio;

/**
 *
 * @author David
 */
public class EdificioBO {
    public String mensaje="";
     public EdificioDAO edao=new EdificioDAO();
    
    public String agregarEdificio(Edificio e) throws SQLException{
        Connection con =conexionOracle.getConnection(conexionOracle.login, conexionOracle.password, conexionOracle.url);
        try {
            mensaje=edao.agregarEdificio(con, e);
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
    
    public String modificarEdificio(Edificio e) throws SQLException{
         Connection con =conexionOracle.getConnection(conexionOracle.login, conexionOracle.password, conexionOracle.url);
        try {
            mensaje=edao.modificarEdificio(con, e);
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
    
    public String eliminarEdificio(String ID) throws SQLException{
         Connection con =conexionOracle.getConnection(conexionOracle.login, conexionOracle.password, conexionOracle.url);
        try {
            mensaje=edao.eliminarEdificio(con, ID);
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
