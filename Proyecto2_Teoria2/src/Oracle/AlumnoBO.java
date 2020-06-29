/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oracle;

import conexiones.conexionOracle;
import java.sql.Connection;
import java.sql.SQLException;
import tablas.Alumno;

/**
 *
 * @author David
 */
public class AlumnoBO {
        public String mensaje="";
     public AlumnoDAO edao=new AlumnoDAO();
    
    public String agregarAlumno(Alumno e) throws SQLException{
        Connection con =conexionOracle.getConnection(conexionOracle.login, conexionOracle.password, conexionOracle.url);
        try {
            mensaje=edao.agregarAlumno(con, e);
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
    
    public String modificarAlumno(Alumno e) throws SQLException{
         Connection con =conexionOracle.getConnection(conexionOracle.login, conexionOracle.password, conexionOracle.url);
        try {
            mensaje=edao.modificarAlumno(con, e);
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
    
    public String eliminarAlumno(String ID) throws SQLException{
         Connection con =conexionOracle.getConnection(conexionOracle.login, conexionOracle.password, conexionOracle.url);
        try {
            mensaje=edao.eliminarAlumno(con, ID);
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
