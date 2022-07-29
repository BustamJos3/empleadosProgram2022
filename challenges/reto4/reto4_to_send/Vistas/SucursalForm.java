/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Modelo.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author EL MAGO
 */
public class SucursalForm extends javax.swing.JDialog {

    //connection variable
    Connection connection;
    Conexion conexion = new Conexion();
    Statement st;
    ResultSet rs;

    public SucursalForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(parent);
    }

    public void recibeIdDireccion(int idDireccion) {
        String sucursal = txtSucursal.getText();
        System.out.println("Recibe: " + idDireccion);
        //idDireccion doesnt required '' cause is not text (int)
        String query = "INSERT INTO `sucursal`(`nombreSucursal`, `FK_nit`, `FK_idDireccion`) VALUES ('" + sucursal + "',999999991," + idDireccion + ");";
        System.out.println(query);
        //make connection with dbase
        try {
            connection = conexion.getConnection();
            //prepare statement
            st = connection.createStatement();
            st.executeUpdate(query);

        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void recibirDatosDireccion(String departamento, String zona, String tipoCalle, String numero1, String numero2, String numero3) {
        String sucursal = txtSucursal.getText();
        if (!sucursal.isEmpty()) {
            String query = "INSERT INTO `direccion`(`zona`, `tipoCalle`, `numero1`, `numero2`,`numero3`, `nombreDepartamento`) VALUES ('" + zona + "','" + tipoCalle + "','" + numero1 + "','" + numero2 + "','" + numero3 + "','" + departamento + "');";
            System.out.println(query);
            try {
                connection = conexion.getConnection();
                st = connection.createStatement();
                st.executeQuery(query);
                String queryIdDireccion = "SELECT idDireccion FROM `direccion` WHERE nombreDepartamento = '" + departamento + "' AND zona = '" + zona + "' AND tipoCalle = '" + tipoCalle + "' AND numero1 = '" + numero1 + "'AND numero2 ='" + numero2 + "' AND numero3 = '" + numero3 + "';";
                System.out.println(queryIdDireccion);
                try {
                    rs = st.executeQuery(queryIdDireccion);
                    while (rs.next()) {
                        int idDireccion = rs.getInt("idDireccion");
                        String queryInsertSucursal = "INSERT INTO `sucursal`(`nombreSucursal`, `FK_nit`,`FK_idDireccion`) VALUES ('" + sucursal + "',999999991," + idDireccion + ")";
                        System.out.println(queryInsertSucursal);
                        try {
                            st.executeUpdate(queryInsertSucursal);
                            JOptionPane.showMessageDialog(this, "La sucursal ha sido creada.");
                        } catch (SQLException e) {
                            System.out.println("ERROR recibiendo datos de direccion 1 " + e);
                        }
                    }
                } catch (SQLException e) {
                    System.out.println("ERROR recibiendo datos de direccion 2 " + e);
                }
            } catch (SQLException e) {
                System.out.println("ERROR recibiendo datos de direccion 3 " + e);
                JOptionPane.showMessageDialog(this, "No fue posible crear la direccon", "Sucursales Mision TIC", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtSucursal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("Nombre Sucursal");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/confirmIcon.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(0, 109, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SucursalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SucursalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SucursalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SucursalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SucursalForm dialog = new SucursalForm(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtSucursal;
    // End of variables declaration//GEN-END:variables
}
