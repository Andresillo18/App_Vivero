package Presentacion;

import Entidades.Herramienta_Producto;
import LogicaNegocio.LNHerram_Prod;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * 1-4-22
 *
 * @author Andrés Villalobos
 */
public class frmHerram_Prod extends javax.swing.JInternalFrame {

    //Variables globales para el uso del calendario
    Calendar fecha = new GregorianCalendar();

    //Al instanciar el objeto se sobreescribe el método
    DefaultTableModel modelo;

    public frmHerram_Prod() {
        initComponents();

        DCFechaVencimi.setDate(fecha.getTime()); // para que asigne la fecha de hoy

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
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JSpinner();
        txtCantidadDisponible = new javax.swing.JSpinner();
        btnSalir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHerra_Prods = new javax.swing.JTable();
        txtDescripcion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMaterial = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        DCFechaVencimi = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();

        txtCod.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel1.setText("COD");

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel4.setText("Precio");

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel5.setText("Cantidad Disponible");

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

        tblHerra_Prods.setModel(new javax.swing.table.DefaultTableModel(
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
        tblHerra_Prods.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHerra_ProdsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHerra_Prods);

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel3.setText("Descripción");

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel6.setText("Material");

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel7.setText("Fecha de Vencimiento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(btnLimpiar)
                .addGap(38, 38, 38)
                .addComponent(btnGuardar)
                .addGap(30, 30, 30)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(118, 118, 118))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(13, 13, 13))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCantidadDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel5)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DCFechaVencimi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(59, 59, 59))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidadDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(DCFechaVencimi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3))
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnGuardar)
                    .addComponent(btnLimpiar)
                    .addComponent(btnEliminar))
                .addGap(28, 28, 28))
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

        tblHerra_Prods.setModel(modelo); // La tabla se le establece el modelo y el modelo tiene los datos a ingresar
        modelo.addColumn("Código");
        modelo.addColumn("Nombre");
        modelo.addColumn("Descripción");
        modelo.addColumn("Precio");
        modelo.addColumn("Cantidad Disponible");
    }
// </editor-fold> 

// <editor-fold desc="MÉTODO CARGAR DATOS" defaultstate="collapsed">    
    //Mostrar en la tabla del formulario el contenido de la tabala Clientes de la BD
    private void CargarDatos(String condicion) throws Exception {

        try {
            LNHerram_Prod logica = new LNHerram_Prod();
            List<Herramienta_Producto> lista;
            LimpiarTablas();
            Object[] fila = new Object[7]; // Se usará para guardar los datos de cada registro para guardos y enviarlos al modelo

            lista = logica.ListaRegistros(condicion);

            //Este for recorre la lista (la lista puede tener varios registros) y va ingresando con el loop
            for (Herramienta_Producto planta : lista) {
                fila[0] = planta.getCod_herramienta_prod();
                fila[1] = planta.getNombre();
                fila[2] = planta.getDescripcion();
                fila[3] = planta.getPrecio();
                fila[4] = planta.getCantidad_disponible();
                fila[5] = planta.getMaterial();
                fila[6] = planta.getFechaVencimiento();

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
        txtNombre.setText("");
        txtDescripcion.setText("");
        txtPrecio.setValue(0);
        txtCantidadDisponible.setValue(0);
        txtMaterial.setText("");
        DCFechaVencimi.setDate(fecha.getTime());
    }
// </editor-fold>

// <editor-fold desc="MÉTODO GENERAR ENTIDAD" defaultstate="collapsed">    
    private Herramienta_Producto GenerarEntidad() {
        Herramienta_Producto planta = new Herramienta_Producto();
        try {
            if (!txtCod.getText().equals("")) {
                planta.setExiste(true);
                planta.setCod_herramienta_prod(Integer.parseInt(txtCod.getText()));
            }
            planta.setNombre(txtNombre.getText());
            planta.setDescripcion(txtDescripcion.getText());
            planta.setPrecio(Float.parseFloat(txtPrecio.getValue().toString()));
            planta.setCantidad_disponible(Integer.parseInt(txtCantidadDisponible.getValue().toString()));
            planta.setMaterial(txtMaterial.getText());
            planta.setFechaVencimiento(new java.sql.Date((DCFechaVencimi.getDate()).getTime()));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

        return planta;
    }
// </editor-fold> 

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        LNHerram_Prod logica = new LNHerram_Prod();
        Herramienta_Producto HP = GenerarEntidad();

        try {
            if (!txtNombre.getText().equals("") && !txtCantidadDisponible.getValue().equals("") && !txtDescripcion.getText().equals("") && !txtPrecio.getValue().equals("") && DCFechaVencimi.getDate() != null) {

                if (HP.isExiste()) {
                    logica.Modificar(HP);
                } else {
                    logica.Insertar(HP);
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
        LNHerram_Prod logica = new LNHerram_Prod();
        Herramienta_Producto HP;

        try {
            HP = GenerarEntidad();
            if (HP.isExiste()) {
                if (logica.Eliminar(HP) > 0) {
                    JOptionPane.showMessageDialog(this, logica.getMensaje());

                    Limpiar();
                    CargarDatos("");
                } else { // Si afectó a CERO registros
                    JOptionPane.showMessageDialog(this, "No fue posible eliminar la herramienta o producto");
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

    private void tblHerra_ProdsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHerra_ProdsMouseClicked
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try {
            LNHerram_Prod logica = new LNHerram_Prod();
            Herramienta_Producto HP;
            String condicion;

            if (evt.getClickCount() == 2) {
                //A cuál fila se le dió click:
                int fila = tblHerra_Prods.rowAtPoint(evt.getPoint());
                txtCod.setText(tblHerra_Prods.getValueAt(fila, 0).toString());           

                condicion = String.format("COD_HERRAMIENTA_PROD = %s", txtCod.getText());
                HP = logica.ObtenerRegistro(condicion);

                txtCod.setText(String.valueOf(HP.getCod_herramienta_prod()));
                txtNombre.setText(String.valueOf(HP.getNombre()));
                txtDescripcion.setText(String.valueOf(HP.getDescripcion()));
                txtPrecio.setValue(HP.getPrecio());
                txtCantidadDisponible.setValue(HP.getCantidad_disponible());
                txtMaterial.setText(String.valueOf(HP.getMaterial()));
                try {
                    DCFechaVencimi.setDate(HP.getFechaVencimiento());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Error al recuperar la fecha: " + ex.getMessage());
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_tblHerra_ProdsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DCFechaVencimi;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHerra_Prods;
    private javax.swing.JSpinner txtCantidadDisponible;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtMaterial;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JSpinner txtPrecio;
    // End of variables declaration//GEN-END:variables
}
