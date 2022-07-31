package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

import java.util.ArrayList;

public class DatosModelDB {

    Conexion conexion = new Conexion();
    Connection connection;
    Statement st;
    //when no sucursal is selected
    PreparedStatement pst;
    ResultSet rs;

    ArrayList list = new ArrayList();
    DatosSucursalPuestoTrabajo datosDB;

    public ArrayList<DatosSucursalPuestoTrabajo> getPuestoTrabajo(int idSucursal) {
        String query = "SELECT idPuestoTrabajo, nombrePuestoTrabajo, salario, FK_idSucursal FROM puestoTrabajo INNER JOIN sucursal ON (sucursal.idSucursal=puestoTrabajo.FK_idSucursal) WHERE sucursal.idSucursal=1;";
        try {
            connection = conexion.getConnection();
            pst = connection.prepareStatement(query);
            st = connection.createStatement();
            rs = pst.executeQuery(query);
            //when no sucursal is selected, set puestosTrabajo from sucursal 1
            pst.setInt(1, idSucursal);
            while (rs.next()) {
                datosDB = new DatosSucursalPuestoTrabajo();
                datosDB.setIdPuestoTrabajo(rs.getInt("idPuestoTrabajo"));
                datosDB.setNombrePuestoTrabajo(rs.getString("nombrePuestoTrabajo"));
                datosDB.setSalario(rs.getFloat("salario"));
                list.add(datosDB);
            }
        } catch (SQLException e) {
            System.out.println("ERROR obteniendo puestos de trabajo " + e);
        }
        return list;
    }

    public ArrayList<DatosSucursalPuestoTrabajo> getSucursales(int idSucursal) {
        String query = "SELECT idSucursal, nombreSucursal FROM sucursal;";
        try {
            connection = conexion.getConnection();
            pst = connection.prepareStatement(query);
            rs = pst.executeQuery(query);
            while (rs.next()) {
                datosDB = new DatosSucursalPuestoTrabajo();
                datosDB.setIdSucursal(rs.getInt("idSucursal"));
                datosDB.setNombreSucursal(rs.getString("nombreSucursal"));
                list.add(datosDB);
            }
        } catch (SQLException e) {
            System.out.println("ERROR obteniendo sucursales " + e);
        }
        return list;
    }

}
