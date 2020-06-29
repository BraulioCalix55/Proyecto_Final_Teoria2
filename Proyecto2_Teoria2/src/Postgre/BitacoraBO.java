/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postgre;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import conexiones.conexionPostgre;
import javax.swing.JTable;
import tablas.Bitacora;

/**
 *
 * @author David
 */
public class BitacoraBO {
    public String mensaje="";
    public BitacoraDAO cdao=new BitacoraDAO();
    
    public ArrayList obtenerBitacora(JTable tabla) throws SQLException{
        ArrayList <String> datos=new ArrayList();
        Connection con =conexionPostgre.getConnection(conexionPostgre.login, conexionPostgre.password, conexionPostgre.url);
        try {
            datos=cdao.listarBitacora(con, tabla);
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            try {
                if(con!=null){
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return datos;
    }
    
    public ArrayList selectBitacora(String tabla) throws SQLException{
        ArrayList <String> datos=new ArrayList();
        Connection con =conexionPostgre.getConnection(conexionPostgre.login, conexionPostgre.password, conexionPostgre.url);
        try {
            datos=cdao.selectBitacora(con, tabla);
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            try {
                if(con!=null){
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return datos;
    }
    
    public void deleteBitacora(String tabla) throws SQLException{
        ArrayList <String> datos=new ArrayList();
        Connection con =conexionPostgre.getConnection(conexionPostgre.login, conexionPostgre.password, conexionPostgre.url);
        try {
            cdao.deleteBitacora(con, tabla);
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            try {
                if(con!=null){
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
    }
}
