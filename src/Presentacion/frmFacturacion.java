package Presentacion;

import Entidades.Cliente;
import Entidades.Empleado;
import Entidades.Factura;
import LogicaNegocio.LNCliente;
import LogicaNegocio.LNEmpleado;
import LogicaNegocio.LNFactura;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * 2-4-22
 *
 * @author Andrés Villalobos
 */
public class frmFacturacion extends javax.swing.JInternalFrame {

    DefaultTableModel modelo;

    public frmFacturacion() {
        initComponents();

        try {
            CargarDatos("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        txtCodEmpleado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtCodCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnMasEmpleados = new javax.swing.JButton();
        btnMasClientes = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFacturas = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel1.setText("COD Empleado");

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel2.setText("COD Cliente");

        txtCod.setEnabled(false);

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

        tblFacturas.setModel(new javax.swing.table.DefaultTableModel(
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
        tblFacturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFacturasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblFacturas);

        btnSalir.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

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

        jButton3.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jButton3.setText("Detallar Facturación");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(8, 8, 8))
                                    .addComponent(txtCod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(btnLimpiar)
                                .addGap(38, 38, 38)
                                .addComponent(btnGuardar)
                                .addGap(30, 30, 30)
                                .addComponent(btnEliminar)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalir)))))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnGuardar)
                    .addComponent(btnLimpiar)
                    .addComponent(btnEliminar)
                    .addComponent(jButton3))
                .addGap(23, 23, 23))
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

        tblFacturas.setModel(modelo); // La tabla se le establece el modelo y el modelo tiene los datos a ingresar
        modelo.addColumn("Código");
        modelo.addColumn("COD Empleado");
        modelo.addColumn("COD Cliente");
    }
// </editor-fold> 

// <editor-fold desc="MÉTODO CARGAR DATOS" defaultstate="collapsed">    
    //Mostrar en la tabla del formulario el contenido de la tabala Clientes de la BD
    private void CargarDatos(String condicion) throws Exception {

        try {
            LNFactura logica = new LNFactura();
            List<Factura> lista;
            LimpiarTablas();
            Object[] fila = new Object[8]; // Se usará para guardar los datos de cada registro para guardos y enviarlos al modelo

            lista = logica.ListaRegistros(condicion);

            //Este for recorre la lista (la lista puede tener varios registros) y va ingresando con el loop
            for (Factura fact : lista) {
                fila[0] = fact.getCod_factura();
                fila[1] = fact.getCod_empleado();
                fila[2] = fact.getCod_cliente();

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
        txtCodEmpleado.setText("");
        txtCodCliente.setText("");
    }
// </editor-fold>

// <editor-fold desc="MÉTODO GENERAR ENTIDAD" defaultstate="collapsed">    
    private Factura GenerarEntidad() {
        Factura fact = new Factura();
        try {
            if (!txtCod.getText().equals("")) {
                fact.setExiste(true);
                fact.setCod_factura(Integer.parseInt(txtCod.getText()));
            }
            fact.setCod_empleado(Integer.parseInt(txtCodEmpleado.getText()));
            fact.setCod_cliente(Integer.parseInt(txtCodEmpleado.getText()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

        return fact;
    }
// </editor-fold> 

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

    private void tblFacturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFacturasMouseClicked

        try {
            LNFactura logica = new LNFactura();
            Factura fact;
            String condicion;

            if (evt.getClickCount() == 2) {
                //A cuál fila se le dió click:
                int fila = tblFacturas.rowAtPoint(evt.getPoint());
                txtCod.setText(tblFacturas.getValueAt(fila, 0).toString());
                txtCod.setText(tblFacturas.getValueAt(fila, 0).toString());

                condicion = String.format("COD_FACTURA = %s", txtCod.getText());
                fact = logica.ObtenerRegistro(condicion);

                txtCod.setText(String.valueOf(fact.getCod_factura()));
                txtCodEmpleado.setText(String.valueOf(fact.getCod_empleado()));
                txtCodCliente.setText(String.valueOf(fact.getCod_cliente()));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_tblFacturasMouseClicked

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        LNFactura logica = new LNFactura();
        Factura fact = GenerarEntidad();

        try {
            if (!txtCodEmpleado.getText().equals("") && !txtCodCliente.getText().equals("")) {

                if (fact.isExiste()) {
                    logica.Modificar(fact);
                } else {
                    logica.Insertar(fact);
                }
                JOptionPane.showMessageDialog(this, logica.getMensaje());

                Limpiar();

                CargarDatos("");
            } else {
                JOptionPane.showMessageDialog(null, "Falta ingresar datos");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        LNFactura logica = new LNFactura();
        Factura fact;

        try {
            fact = GenerarEntidad();
            if (fact.isExiste()) {
                if (logica.Eliminar(fact) > 0) {
                    JOptionPane.showMessageDialog(this, logica.getMensaje());

                    Limpiar();
                    CargarDatos("");
                } else { // Si afectó a CERO registros
                    JOptionPane.showMessageDialog(this, "No fue posible eliminar la factura");
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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        frmDetallesFacturas frm = new frmDetallesFacturas();

        frm.toFront();
        frm.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMasClientes;
    private javax.swing.JButton btnMasEmpleados;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFacturas;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtCodCliente;
    private javax.swing.JTextField txtCodEmpleado;
    // End of variables declaration//GEN-END:variables
}
