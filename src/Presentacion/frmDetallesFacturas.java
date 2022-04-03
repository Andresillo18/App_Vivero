package Presentacion;

import Entidades.Detalle_Factura;
import Entidades.Factura;
import Entidades.Herramienta_Producto;
import Entidades.Planta;
import LogicaNegocio.LNDetalle_Factura;
import LogicaNegocio.LNFactura;
import LogicaNegocio.LNHerram_Prod;
import LogicaNegocio.LNPlanta;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * 3-4-22
 *
 * @author Andrés Villalobos
 */
public class frmDetallesFacturas extends javax.swing.JDialog {

    DefaultTableModel modelo;

    //Variables globales para el uso del calendario
    Calendar fecha = new GregorianCalendar();

    public frmDetallesFacturas() {
        initComponents();

        DCFecha.setDate(fecha.getTime()); // para que asigne la fecha de hoy

        this.setLocationRelativeTo(null); // Centrar el formulario

        try {
            CargarDatos("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtCod = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetallesFactura = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtCantidadHerrProd = new javax.swing.JSpinner();
        DCFecha = new com.toedter.calendar.JDateChooser();
        btnSalir = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtCodFactura = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCodProdHerram = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCantidadPlanta = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        txtCodPlanta = new javax.swing.JTextField();
        txtObservaciones = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtTotalPagar = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        MCMes = new com.toedter.calendar.JMonthChooser();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtResumenVentas = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel7.setText("Fecha");

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

        txtCod.setEnabled(false);

        btnLimpiar.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel1.setText("COD");

        tblDetallesFactura.setModel(new javax.swing.table.DefaultTableModel(
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
        tblDetallesFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDetallesFacturaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDetallesFactura);

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel5.setText("Cantidad Productos");

        btnSalir.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel8.setText("COD Factura");

        jLabel9.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel9.setText("COD Producto");

        jLabel10.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel10.setText("Cantidad Plantas");

        jLabel11.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel11.setText("COD Planta");

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel3.setText("Observaciones");

        jLabel12.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel12.setText("Total a Pagar");

        jButton1.setFont(new java.awt.Font("sansserif", 3, 14)); // NOI18N
        jButton1.setText("Resumir Ventas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jButton2.setText("Añadir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jButton3.setText("Añadir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jButton4.setText("Añadir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel13.setText("Bono");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(MCMes, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(txtResumenVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpiar)
                .addGap(38, 38, 38)
                .addComponent(btnGuardar)
                .addGap(30, 30, 30)
                .addComponent(btnEliminar)
                .addGap(35, 35, 35)
                .addComponent(btnSalir))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DCFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel7)))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(227, 227, 227))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jButton2)
                                .addGap(46, 46, 46)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel8)
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel9))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(49, 49, 49)
                                        .addComponent(txtCodFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(67, 67, 67)
                                        .addComponent(txtCodProdHerram, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCantidadHerrProd, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(txtCodPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCantidadPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCodFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCodProdHerram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCantidadHerrProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9)
                                .addComponent(jLabel5))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantidadPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DCFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btnLimpiar)
                            .addComponent(btnEliminar)
                            .addComponent(btnSalir)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(MCMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(txtResumenVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19))
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

        tblDetallesFactura.setModel(modelo); // La tabla se le establece el modelo y el modelo tiene los datos a ingresar
        modelo.addColumn("Código");
        modelo.addColumn("COD Factura");
        modelo.addColumn("COD Producto");
        modelo.addColumn("Cantidad Productos");
        modelo.addColumn("COD Plantas");
        modelo.addColumn("Cantidad Plantas");
    }
// </editor-fold> 

// <editor-fold desc="MÉTODO CARGAR DATOS" defaultstate="collapsed">    
    //Mostrar en la tabla del formulario el contenido de la tabala Clientes de la BD
    private void CargarDatos(String condicion) throws Exception {

        try {
            LNDetalle_Factura logica = new LNDetalle_Factura();
            List<Detalle_Factura> lista;
            LimpiarTablas();
            Object[] fila = new Object[7]; // Se usará para guardar los datos de cada registro para guardos y enviarlos al modelo

            lista = logica.ListaRegistros(condicion);

            //Este for recorre la lista (la lista puede tener varios registros) y va ingresando con el loop
            for (Detalle_Factura DF : lista) {
                fila[0] = DF.getCod_detalle();
                fila[1] = DF.getCod_factura();
                fila[2] = DF.getCod_herramienta_prod();
                fila[3] = DF.getCantidad_herramienta_prod();
                fila[4] = DF.getCod_planta();
                fila[5] = DF.getCantidad_plantas();

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
        txtCodFactura.setText("");
        txtCodProdHerram.setText("");
        txtCantidadHerrProd.setValue(0);
        txtCodPlanta.setText("");
        txtCantidadPlanta.setValue(0);
        txtTotalPagar.setValue(0);
        DCFecha.setDate(fecha.getTime());
        txtObservaciones.setText("");
    }
// </editor-fold>

// <editor-fold desc="MÉTODO GENERAR ENTIDAD" defaultstate="collapsed">    
    private Detalle_Factura GenerarEntidad() {
        Detalle_Factura DF = new Detalle_Factura();
        try {
            if (!txtCod.getText().equals("")) {
                DF.setExiste(true);
                DF.setCod_factura(Integer.parseInt(txtCod.getText()));
            }
            DF.setCod_factura(Integer.parseInt(txtCodFactura.getText()));
            DF.setCod_herramienta_prod(Integer.parseInt(txtCodProdHerram.getText()));
            DF.setCantidad_herramienta_prod(Integer.parseInt(txtCantidadHerrProd.getValue().toString()));
            DF.setCod_planta(Integer.parseInt(txtCodPlanta.getText()));
            DF.setCantidad_plantas(Integer.parseInt(txtCantidadPlanta.getValue().toString()));
            DF.setTotal_pagar(Integer.parseInt(txtTotalPagar.getValue().toString()));
            DF.setFecha(new java.sql.Date((DCFecha.getDate()).getTime()));
            DF.setObservaciones(txtObservaciones.getText());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

        return DF;
    }
// </editor-fold>     

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        LNDetalle_Factura logica = new LNDetalle_Factura();
        Detalle_Factura DF = GenerarEntidad();

        try {
            if (!txtCodFactura.getText().equals("") && DCFecha.getDate() != null) {

                if (DF.isExiste()) {
                    logica.Modificar(DF);
                } else {
                    logica.Insertar(DF);
                }
                JOptionPane.showMessageDialog(this, logica.getMensaje());

                Limpiar();

                CargarDatos("");
            } else {
                JOptionPane.showMessageDialog(null, "Falta ingresar datos");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No es posible ingresar los datos");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        LNDetalle_Factura logica = new LNDetalle_Factura();
        Detalle_Factura DF;

        try {
            DF = GenerarEntidad();
            if (DF.isExiste()) {
                if (logica.Eliminar(DF) > 0) {
                    JOptionPane.showMessageDialog(this, logica.getMensaje());

                    Limpiar();
                    CargarDatos("");
                } else { // Si afectó a CERO registros
                    JOptionPane.showMessageDialog(this, "No fue posible eliminar el detalle de esta factura");
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

    private void tblDetallesFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDetallesFacturaMouseClicked
        try {
            LNDetalle_Factura logica = new LNDetalle_Factura();
            Detalle_Factura DF;
            String condicion;

            if (evt.getClickCount() == 2) {
                //A cuál fila se le dió click:
                int fila = tblDetallesFactura.rowAtPoint(evt.getPoint());
                txtCod.setText(tblDetallesFactura.getValueAt(fila, 0).toString());

                condicion = String.format("COD_DETALLE = %s", txtCod.getText());
                DF = logica.ObtenerRegistro(condicion);

                txtCod.setText(String.valueOf(DF.getCod_herramienta_prod()));
                txtCodFactura.setText(String.valueOf(DF.getCod_factura()));
                txtCodProdHerram.setText(String.valueOf(DF.getCod_herramienta_prod()));
                txtCantidadHerrProd.setValue(DF.getCantidad_herramienta_prod());
                txtCodPlanta.setText(String.valueOf(DF.getCod_planta()));
                txtCantidadPlanta.setValue(DF.getCantidad_plantas());
                txtTotalPagar.setValue(DF.getTotal_pagar());
                try {
                    DCFecha.setDate(DF.getFecha());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Error al recuperar la fecha: " + ex.getMessage());
                }
                txtObservaciones.setText(String.valueOf(DF.getObservaciones()));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_tblDetallesFacturaMouseClicked

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        frmTblFacturas facturas = new frmTblFacturas(); // EL primero es si pertenece a alguien (parent) y el segundo es si un modal
        facturas.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                try {
                    int id = facturas.ObtenerId(); // Puede llamar al método por hacer una instancia de ese anteriormente
                    String condicion = "";
                    LNFactura logica = new LNFactura();
                    Factura fact;

                    if (id > -1) {
                        condicion = String.format("COD_FACTURA= %d", id);

                        fact = logica.ObtenerRegistro(condicion);

                        txtCodFactura.setText(String.valueOf(fact.getCod_factura()));
                    } else {
                        txtCodFactura.setText("");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });

        facturas.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        frmTblProductos THP = new frmTblProductos(null, true); // EL primero es si pertenece a alguien (parent) y el segundo es si un modal

        THP.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                try {
                    int id = THP.ObtenerId(); // Puede llamar al método por hacer una instancia de ese anteriormente
                    String condicion = "";
                    LNHerram_Prod logica = new LNHerram_Prod();
                    Herramienta_Producto HP;

                    if (id > -1) {
                        condicion = String.format("COD_HERRAMIENTA_PROD= %d", id);

                        HP = logica.ObtenerRegistro(condicion);

                        txtCodProdHerram.setText(String.valueOf(HP.getCod_herramienta_prod()));
                    } else {
                        txtCodProdHerram.setText("");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });

        THP.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        frmTblPlantas TPlantas = new frmTblPlantas(null, true); // EL primero es si pertenece a alguien (parent) y el segundo es si un modal

        TPlantas.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                try {
                    int id = TPlantas.ObtenerId(); // Puede llamar al método por hacer una instancia de ese anteriormente
                    String condicion = "";
                    LNPlanta logica = new LNPlanta();
                    Planta planta1;

                    if (id > -1) {
                        condicion = String.format("COD_PLANTA= %d", id);

                        planta1 = logica.ObtenerRegistro(condicion);

                        txtCodPlanta.setText(String.valueOf(planta1.getCod_planta()));
                    } else {
                        txtCodPlanta.setText("");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });

        TPlantas.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            LNDetalle_Factura logica = new LNDetalle_Factura();

            float resumen;
            resumen = logica.Resumir_Ventas(MCMes.getMonth());

            txtResumenVentas.setText(String.valueOf(resumen));
            if (resumen != 0) {

                JOptionPane.showMessageDialog(this, "Resumen del mes obtenido");
            } else {
                JOptionPane.showMessageDialog(this, "Resumen no obtenido, escoge un mes con factura");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DCFecha;
    private com.toedter.calendar.JMonthChooser MCMes;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDetallesFactura;
    private javax.swing.JSpinner txtCantidadHerrProd;
    private javax.swing.JSpinner txtCantidadPlanta;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtCodFactura;
    private javax.swing.JTextField txtCodPlanta;
    private javax.swing.JTextField txtCodProdHerram;
    private javax.swing.JTextField txtObservaciones;
    private javax.swing.JTextField txtResumenVentas;
    private javax.swing.JSpinner txtTotalPagar;
    // End of variables declaration//GEN-END:variables
}
