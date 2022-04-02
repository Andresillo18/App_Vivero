package Presentacion;

import Entidades.Cliente;
import Entidades.Empleado;
import LogicaNegocio.LNCliente;
import LogicaNegocio.LNEmpleado;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

/**
 * 2-4-22
 *
 * @author Andrés Villalobos
 */
public class frmFacturacion extends javax.swing.JInternalFrame {

    public frmFacturacion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        txtCodEmpleado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtCodCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCod2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnMasEmpleados = new javax.swing.JButton();
        btnMasClientes = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel1.setText("COD Empleado");

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel2.setText("COD Cliente");

        txtCod2.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel3.setText("COD");

        jButton1.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jButton1.setText("Añadir Empleado");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jButton2.setText("Añadir Cliente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnMasEmpleados.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        btnMasEmpleados.setText("Añadir");
        btnMasEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasEmpleadosActionPerformed(evt);
            }
        });

        btnMasClientes.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        btnMasClientes.setText("Añadir");
        btnMasClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(8, 8, 8))
                            .addComponent(txtCod2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnMasClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMasEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCod2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMasClientes))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMasEmpleados)))
                .addContainerGap(275, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        frmEmpleados frm = new frmEmpleados();

        frm.toFront();
        frm.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        frmClientes frm = new frmClientes(null, true);

        frm.toFront();
        frm.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnMasEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasEmpleadosActionPerformed
        
          frmTblClientes clientes = new frmTblClientes(null, true); // EL primero es si pertenece a alguien (parent) y el segundo es si un modal
        clientes.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                try {
                    int id = clientes.ObtenerId(); // Puede llamar al método por hacer una instancia de ese anteriormente
                    String condicion = "";
                    LNCliente logica = new LNCliente();
                    Cliente cliente1;

                    if (id > -1) {
                        condicion = String.format("COD_CLIENTE= %d", id);

                        cliente1 = logica.ObtenerRegistro(condicion);

                        txtCodCliente.setText(String.valueOf(cliente1.getCod_cliente()));
                    } else {
                        txtCodCliente.setText("");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });

        clientes.setVisible(true);
    }//GEN-LAST:event_btnMasEmpleadosActionPerformed

    private void btnMasClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasClientesActionPerformed

          frmTblEmpleados empleados = new frmTblEmpleados(null, true); // EL primero es si pertenece a alguien (parent) y el segundo es si un modal
        empleados.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                try {
                    int id = empleados.ObtenerId(); // Puede llamar al método por hacer una instancia de ese anteriormente
                    String condicion = "";
                    LNEmpleado logica = new LNEmpleado();
                    Empleado empleado1;

                    if (id > -1) {
                        condicion = String.format("COD_EMPLEADO= %d", id);

                        empleado1 = logica.ObtenerRegistro(condicion);

                        txtCodEmpleado.setText(String.valueOf(empleado1.getCod_empleado()));
                    } else {
                        txtCodEmpleado.setText("");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });

        empleados.setVisible(true);
    }//GEN-LAST:event_btnMasClientesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMasClientes;
    private javax.swing.JButton btnMasEmpleados;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtCod2;
    private javax.swing.JTextField txtCodCliente;
    private javax.swing.JTextField txtCodEmpleado;
    // End of variables declaration//GEN-END:variables
}
