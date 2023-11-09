/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libreriapuertomontt;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
/**
 *
 * @author luisslamanca
 */
public class LibreriaPuertoMontt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/libreria";
        String usuario="root";
        String contraseña="Lola202319*@";

        try{
            Connection conexion=DriverManager.getConnection(url,usuario,contraseña);
            if(conexion!=null){
//                JOptionPane.showMessageDialog(null,"Conexión exitosa");
                String sql="INSERT INTO libro (idlibro, tituloLibro, autorLibro, precioLibro, disponible) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement stmt=conexion.prepareStatement(sql);
                stmt.setInt(1, 7);
                stmt.setString(2, "Padre rico, padre pobre");
                stmt.setString(3, "Robert Kiyosaki");
                stmt.setInt(4, 5000);
                stmt.setString(5, "Si");
                stmt.executeUpdate();
                stmt.close();
                conexion.close();
                JOptionPane.showMessageDialog(null,"Libro agregado");

            }
        } catch (SQLException ex){
            System.out.println(ex);
        }
    }
    
}
