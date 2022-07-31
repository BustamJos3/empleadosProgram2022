package Controlador;

import Modelo.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;

public class ComboboxSucursal {

    //consult info from DBase
    Conexion conexion = new Conexion();
    Connection connection;
    Statement st;
    ResultSet rs;

    public ComboboxSucursal() {
    }

    public ArrayList getListaSucursales() {
        //--->message to indicate ingress to function
        System.out.println("Función getListaSucursales()");
        //array that it will be receiving the info
        ArrayList mListaSucursales = new ArrayList();
        //instance of Sucursal class
        Sucursal sucursal = null;
        //make connection with db
        try {
            connection = conexion.getConnection();
            st = connection.createStatement();
            //obtain id and sucursal name
            rs = st.executeQuery("SELECT idSucursal, nombreSucursal FROM sucursal;");
            while (rs.next()) {
                sucursal = new Sucursal();
                sucursal.setIdSucursal(rs.getInt("idSucursal"));
                sucursal.setNombreSucursal(rs.getString("nombreSucursal"));
                //add to array sucursal
                mListaSucursales.add(sucursal);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return mListaSucursales;
    }
}
