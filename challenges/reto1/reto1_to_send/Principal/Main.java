/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Modelo.*;
import Vistas.*;


/**
 *
 * @author EL MAGO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //call Login
        Login login = new Login();
        //show Login: method to show window from Main class
        login.setVisible(true);
        
        //instance of class Connection
        Conexion conexion = new Conexion();
        conexion.getConnection();
        
    }
    
}
