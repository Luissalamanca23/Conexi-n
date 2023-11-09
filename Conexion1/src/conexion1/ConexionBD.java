package conexion1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    public String Conexion(){
        String url="jdbc:mysql://localhost:3306/libreria";
        String usuario="root";
        String contraseña="";

        try{
            Connection conexion=DriverManager.getConnection(url,usuario,contraseña);
            if(conexion!=null){
                System.out.println("Conexion exitosa");
            }
        } catch (SQLException ex){
            System.out.println(ex);
        }
        return null;
    }
}
