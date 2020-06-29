/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oracle;

import conexiones.conexionOracle;
import java.sql.Connection;
import java.sql.SQLException;
import tablas.Docente;

/**
 *
 * @author David
 */
public class DocenteBO {
    public String mensaje="";
     public DocenteDAO edao=new DocenteDAO();
    
    public String agregarDocente(Docente e) throws SQLException{
        Connection con =conexionOracle.getConnection(conexionOracle.login, conexionOracle.password, conexionOracle.url);
        try {
            mensaje=edao.agregarDocente(con, e);
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
    
    public String modificarDocente(Docente e) throws SQLException{
         Connection con =conexionOracle.getConnection(conexionOracle.login, conexionOracle.password, conexionOracle.url);
        try {
            mensaje=edao.modificarDocente(con, e);
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
    
    public String eliminarDocente(String ID) throws SQLException{
         Connection con =conexionOracle.getConnection(conexionOracle.login, conexionOracle.password, conexionOracle.url);
        try {
            mensaje=edao.eliminarDocente(con, ID);
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
