package Controlador;

import Modelo.*;

import Vistas.AddUserForm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class ControllerSucursalPuestoTrabajo implements ActionListener {

    //the VIEW!
    private final AddUserForm view;

    Conexion conexion = new Conexion();
    Connection connection;
    Statement st;
    //when no sucursal is selected
    PreparedStatement pst;
    ResultSet rs;

    ArrayList<DatosSucursalPuestoTrabajo> list;
    DatosModelDB model = new DatosModelDB();

    public final void events() {
        //something is selected in cbSucursal? activated listener
        view.cbSucursal.addActionListener(this);
    }

    //controller must get the view (AddUserForm)
    public ControllerSucursalPuestoTrabajo(AddUserForm view) {
        this.view = view;
        this.getListaSucursales();
        //capture selected option in combobox sucursal
        Sucursal sucursal = (Sucursal) view.cbSucursal.getSelectedItem();
        getPuestoTrabajo(sucursal.getIdSucursal());
        //events of interface: when a click is made, etc
        events();
    }

    public final void getListaSucursales() {
        list = model.getSucursales(0);
        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                int idSucursal = list.get(i).getIdSucursal();
                String nombreSucursal = list.get(i).getNombrePuestoTrabajo();
                System.out.println(idSucursal + " - " + nombreSucursal);
                view.cbSucursal.addItem(new Sucursal(idSucursal, nombreSucursal));
            }
        } else {
            //null and not this, cuase it is not in the view by itself
            JOptionPane.showMessageDialog(null, "No se encontraron sucursales", "", JOptionPane.ERROR_MESSAGE);
        }

    }

    public final void getPuestoTrabajo(int idSucursal) {
        list = model.getPuestoTrabajo(idSucursal);
        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                
                DefaultComboBoxModel model=(DefaultComboBoxModel)view.cbOcupacion.getModel();
                
                int idPuestoTrabajo = list.get(i).getIdPuestoTrabajo();
                String nombrePuestoTrabajo = list.get(i).getNombrePuestoTrabajo();
                System.out.println(idPuestoTrabajo + " " + nombrePuestoTrabajo);
                //to begin from
                limpiarListaDesplegable();
                
                view.cbOcupacion.addItem(new PuestoTrabajo(idPuestoTrabajo, nombrePuestoTrabajo));
            }
        } else {
            //null and not this, cuase it is not in the view by itself
            JOptionPane.showMessageDialog(null, "No se encontraron puestos de trabajo", "", JOptionPane.ERROR_MESSAGE);
        }
    }

    //clean combobox cbOcupacion or cbSucursal
    public void limpiarListaDesplegable() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) view.cbOcupacion.getModel();
        System.out.println(model);
        model.removeAllElements();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object evento = ae.getSource();
        if (evento.equals(view.cbSucursal)) {
            limpiarListaDesplegable();
            Sucursal sucursal = (Sucursal) view.cbSucursal.getSelectedItem();
            getPuestoTrabajo(sucursal.getIdSucursal());
        }
    }
}
