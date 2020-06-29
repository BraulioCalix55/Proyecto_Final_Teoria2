/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postgre;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author David
 */
public class BitacoraDAO {
    String mensaje="";
    
     public ArrayList listarBitacora(Connection con, JTable tabla) throws SQLException{
        ArrayList <String> datos=new ArrayList();
        DefaultTableModel modelo=(DefaultTableModel) tabla.getModel();
        String sql="SELECT \"TABLA\", \"OPERACION\", \"PRIMARY_KEY\", \"DATOS\"\n" +
"	FROM public.\"BITACORA\";";
        String [] fila = new String [4];
         System.out.println("sql "+sql);
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(sql);
        try {
            while (rs.next()){
                for (int i = 0; i <4; i++) {
                    fila[i]=rs.getString(i+1);
                }
                modelo.addRow(fila);
            }
            tabla.setModel(modelo);
            rs.close();
            st.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede mostrar la tabla :( "+e.getMessage());
        }
        return datos;
    }
     
     public ArrayList selectBitacora(Connection con, String tabla) throws SQLException{
        ArrayList <String> datos=new ArrayList();
        String sql="SELECT \"OPERACION\", \"PRIMARY_KEY\", \"DATOS\"\n" +
"	FROM public.\"BITACORA\" WHERE \"TABLA\"="+tabla+";";
        String [] fila = new String [3];
         //System.out.println("sql "+sql);
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(sql);
        try {
            while (rs.next()){
                for (int i = 0; i <3; i++) {
                    datos.add(rs.getString(i+1));
                }
            }
            rs.close();
            st.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede mostrar la tabla :( "+e.getMessage());
        }
        return datos;
    }
     
      public void deleteBitacora(Connection con, String tabla) throws SQLException{
        tabla="'"+tabla.toUpperCase()+"'";
          System.out.println("tabla "+tabla);
        boolean s;
        ArrayList <String> datos=new ArrayList();
        String sql="DELETE FROM public.\"BITACORA\"\n" +
"	WHERE \"TABLA\"="+tabla+";";
        Statement st=con.createStatement();
        s=st.execute(sql);
        try {
           // rs.close();
            st.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede mostrar la tabla :( "+e.getMessage());
        }
        
    }
    
}
