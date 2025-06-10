/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sql;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author daw127
 */
public class conexionsql {
     Connection conexion = null;
    String url ="jdbc:postgresql://localhost/bar_db2";
    String usuario = "postgres";
    String clave = "iamwillruiz";
    
    //Class.forName inicializa el driver que ingresamos en la libreria
    //Iniciamos la variable conexion donde agregaremos toda la informacion que tenemos para acceder al servidor
    public Connection conectar(){
       try{
           Class.forName("org.postgresql.Driver");
           conexion = DriverManager.getConnection(url,usuario,clave);
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error al conectar "+e,"Error",JOptionPane.ERROR_MESSAGE);
       }
       return conexion;
    }
}
