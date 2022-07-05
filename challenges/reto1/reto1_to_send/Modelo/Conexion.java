/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author EL MAGO
 */
public class Conexion {
    
    //instance of connection class from sql
    Connection connection;
    
    //attributes
    String driver = "com.mysql.cj.jdbc.Drive";
    //connection with sql through my port
    String cadenaConexion = "jdbc:mysql://localhost:3306/reto1_g53_db";
    String usuario = "root";
    String contrasena = "";
    
    //constructor

    public Conexion() {
        
        try{
            //connect with dbase
            Class.forName(driver);
            connection = DriverManager.getConnection(cadenaConexion, usuario, contrasena);
            
            //check if connection returns something
            if (connection != null){
                
                System.out.println("Conexión exitosa");
                
            }
            
        }catch(ClassNotFoundException | SQLException e){
            
            System.out.println("No se pudo establecer conexión con la base de datos");
            
        }
        
    }
    
    //function
    //return the class of the connection to check whether there was connection or not
    public Connection getConnection(){
        
        return connection;
        
    }
    
    
    
}
