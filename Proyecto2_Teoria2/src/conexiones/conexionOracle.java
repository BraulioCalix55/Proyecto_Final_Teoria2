/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class conexionOracle {
    public static Connection conexion=null;
    public static String login="admin";
    public static String password="12345678";
    public static String url = "jdbc:oracle:thin:@p-oracle.cetqru1i2nki.us-east-1.rds.amazonaws.com:1521:ORCL";

    public conexionOracle(String login, String password, String url) {
        this.conexion=null;
        this.login=login;
        this.password=password;
        this.url=url;
    }
    
    public static Connection getConnection(String login, String password, String url) throws SQLException{
     try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        conexion=DriverManager.getConnection(url,login,password);
        conexion.setAutoCommit(false);
        if(conexion!=null){
         //   JOptionPane.showMessageDialog(null, "Conexion exitosa", "Atencion", JOptionPane.INFORMATION_MESSAGE);

        }
        else{
            JOptionPane.showMessageDialog(null, "Conexion no exitosa", "Atencion", JOptionPane.INFORMATION_MESSAGE);
        }
    } 
     catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Conexion Erronea" + e.getMessage());
    }
    return conexion;
}

public void desconexion(){
    try {
        conexion.close();
    } catch (Exception e) {
        System.out.println("Error al desconectar \n"+e.getMessage());
    }
}

}
