package Presentacion;

import Entidades.Cliente;
import LogicaNegocio.LNCliente;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * 2-4-22
 *
 * @author Andrés Villalobos
 */
public class frmClientes extends javax.swing.JDialog {

    DefaultTableModel modelo;

    public frmClientes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        this.setLocationRelativeTo(null);

        //Cuando cargue el formulario se establecen estos valores
        RBActivo.doClick();
        RBInactivo.setSelected(false);

        try {
            CargarDatos("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCod = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtTelefono = new javax.swing.JTextField();
        RBActivo = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleados = new javax.swing.JTable();
        RBInactivo = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtCod.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel1.setText("COD");

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel2.setText("ID");

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel8.setText("Nombre");

        jLabel9.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel9.setText("Apellido");

        btnGuardar.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel10.setText("Telefono");

        btnEliminar.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        RBActivo.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        RBActivo.setText("Activo");

        tblEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmpleados);

        RBInactivo.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        RBInactivo.setText("Inactivo");

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel5.setText("Estado");

        btnSalir.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(13, 13, 13))
                    .addComponent(txtCod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2)))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RBInactivo)
                    .addComponent(RBActivo)
                    .addComponent(jLabel5))
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpiar)
                .addGap(38, 38, 38)
                .addComponent(btnGuardar)
                .addGap(30, 30, 30)
                .addComponent(btnEliminar)
                .addGap(36, 36, 36)
                .addComponent(btnSalir)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addComponent(jLabel1))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel2))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel9))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RBActivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RBInactivo)))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnLimpiar)
                    .addComponent(btnEliminar)
                    .addComponent(btnSalir))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

// <editor-fold desc="Limpiar Tabla" defaultstate="collapsed">    
    private void LimpiarTablas() {
        // Se hace un overide cuando se hace la instancia
        modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        tblEmpleados.setModel(modelo); // La tabla se le establece el modelo y el modelo tiene los datos a ingresar
        modelo.addColumn("Código");
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
    }
// </editor-fold> 

// <editor-fold desc="MÉTODO CARGAR DATOS" defaultstate="collapsed">    
    //Mostrar en la tabla del formulario el contenido de la tabala Clientes de la BD
    private void CargarDatos(String condicion) throws Exception {

        try {
            LNCliente logica = new LNCliente();
            List<Cliente> lista;
            LimpiarTablas();
            Object[] fila = new Object[6]; // Se usará para guardar los datos de cada registro para guardos y enviarlos al modelo

            lista = logica.ListaRegistros(condicion);

            //Este for recorre la lista (la lista puede tener varios registros) y va ingresando con el loop
            for (Cliente cliente : lista) {
                fila[0] = cliente.getCod_cliente();
                fila[1] = cliente.getId();
                fila[2] = cliente.getNombre();
                fila[3] = cliente.getApellido1();
                fila[4] = cliente.getTelefono();
                fila[5] = cliente.isEstado();

                modelo.addRow(fila);
            }
        } catch (Exception e) {
            throw e;
        }

    }
// </editor-fold>  

// <editor-fold desc="Limpiar" defaultstate="collapsed">
    private void Limpiar() {
        txtCod.setText("");
        txtID.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtTelefono.setText("");
        RBActivo.doClick();
        RBInactivo.setSelected(false);
    }
// </editor-fold>

// <editor-fold desc="MÉTODO GENERAR ENTIDAD" defaultstate="collapsed">    
    private Cliente GenerarEntidad() {
        Cliente empleado1 = new Cliente();
        try {
            if (!txtCod.getText().equals("")) {
                empleado1.setExiste(true);
                empleado1.setCod_cliente(Integer.parseInt(txtCod.getText()));
            }
            empleado1.setId(Integer.parseInt(txtID.getText()));
            empleado1.setNombre(txtNombre.getText());
            empleado1.setApellido1(txtApellido.getText());
            empleado1.setTelefono(txtTelefono.getText());

            if (RBActivo.isSelected()) { //?
                empleado1.setEstado(true);
            } else if (RBInactivo.isSelected()) {
                empleado1.setEstado(false);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

        return empleado1;
    }
// </editor-fold> 

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        LNCliente logica = new LNCliente();
        Cliente cliente1 = GenerarEntidad();

        try {
            if (cliente1.isExiste()) {
                logica.Modificar(cliente1);
            } else {
                logica.Insertar(cliente1);
            }
            JOptionPane.showMessageDialog(this, logica.getMensaje());

            Limpiar();

            CargarDatos("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        LNCliente logica = new LNCliente();
        Cliente cliente1;

        try {
            cliente1 = GenerarEntidad();
            if (cliente1.isExiste()) {
                if (logica.Eliminar(cliente1) > 0) {
                    JOptionPane.showMessageDialog(this, logica.getMensaje());

                    Limpiar();
                    CargarDatos("");
                } else { // Si afectó a CERO registros
                    JOptionPane.showMessageDialog(this, "No fue posible eliminar el cliente");
                }

            } else { // Si el cliente no existe (txtCodigo está vacío)
                JOptionPane.showMessageDialog(this, "Debe seleccionar un registro");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage()); // EL this significa que se muestre en este formulario
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void tblEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpleadosMouseClicked

        try {
            LNCliente logica = new LNCliente();
            Cliente cliente;
            String condicion;

            if (evt.getClickCount() == 2) {
                //A cuál fila se le dió click:
                int fila = tblEmpleados.rowAtPoint(evt.getPoint());
                txtCod.setText(tblEmpleados.getValueAt(fila, 0).toString());
                //                txtNombre.setText(tblClientes.getValueAt(fila, 1).toString());
                //                txtTelefono.setText(tblClientes.getValueAt(fila, 2).toString());
                //                txtDireccion.setText(tblClientes.getValueAt(fila, 3).toString());

                condicion = String.format("COD_CLIENTE = %s", txtCod.getText());
                cliente = logica.ObtenerRegistro(condicion);

                txtCod.setText(String.valueOf(cliente.getCod_cliente()));
                txtID.setText(String.valueOf(cliente.getId()));
                txtNombre.setText(String.valueOf(cliente.getNombre()));
                txtApellido.setText(String.valueOf(cliente.getApellido1()));
                txtTelefono.setText(String.valueOf(cliente.getTelefono()));

                if (cliente.isEstado() == true) {
                    RBActivo.setSelected(true);
                    RBInactivo.setSelected(false);
                } else if (cliente.isEstado() == false) {
                    RBInactivo.setSelected(true);
                    RBActivo.setSelected(false);
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_tblEmpleadosMouseClicked

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(frmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmClientes dialog = new frmClientes(new javax.swing.JFrame(), true);
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
    private javax.swing.JRadioButton RBActivo;
    private javax.swing.JRadioButton RBInactivo;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmpleados;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
