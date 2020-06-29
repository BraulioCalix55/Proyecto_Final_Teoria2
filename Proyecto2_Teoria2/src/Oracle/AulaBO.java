/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oracle;

import conexiones.conexionOracle;
import java.sql.Connection;
import java.sql.SQLException;
import tablas.Aula;

/**
 *
 * @author David
 */
public class AulaBO {
    public String mensaje="";
     public AulaDAO edao=new AulaDAO();
    
    public String agregarAula(Aula e) throws SQLException{
        Connection con =conexionOracle.getConnection(conexionOracle.login, conexionOracle.password, conexionOracle.url);
        try {
            mensaje=edao.agregarAula(con, e);
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
    
    public String modificarAula(Aula e) throws SQLException{
         Connection con =conexionOracle.getConnection(conexionOracle.login, conexionOracle.password, conexionOracle.url);
        try {
            mensaje=edao.modificarAula(con, e);
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
    
    public String eliminarAula(String ID) throws SQLException{
         Connection con =conexionOracle.getConnection(conexionOracle.login, conexionOracle.password, conexionOracle.url);
        try {
            mensaje=edao.eliminarAula(con, ID);
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
