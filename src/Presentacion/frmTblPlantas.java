package Presentacion;

import Entidades.Planta;
import LogicaNegocio.LNPlanta;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * 3-4-22
 * @author Andrés Villalobos
 */
public class frmTblPlantas extends javax.swing.JDialog {

    DefaultTableModel modelo;
    
    public frmTblPlantas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
         this.setLocationRelativeTo(null);

        try {
            CargarDatos("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        tblPlantas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblPlantas.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPlantas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPlantasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblPlantas);

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel1.setText("Código");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
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

        tblPlantas.setModel(modelo); // La tabla se le establece el modelo y el modelo tiene los datos a ingresar
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
            LNPlanta logica = new LNPlanta();
            List<Planta> lista;
            LimpiarTablas();
            Object[] fila = new Object[8]; // Se usará para guardar los datos de cada registro para guardos y enviarlos al modelo

            lista = logica.ListaRegistros(condicion);

            //Este for recorre la lista (la lista puede tener varios registros) y va ingresando con el loop
            for (Planta planta : lista) {
                fila[0] = planta.getCod_planta();
                fila[1] = planta.getNombre();
                fila[2] = planta.getDescripcion();
                fila[3] = planta.getPrecio();
                fila[4] = planta.getCantidad_disponible();
                fila[5] = planta.getCantidad_Regado();
                fila[6] = planta.getTiempo_luz_solar();
                fila[7] = planta.getExtras_caracteristicas();

                modelo.addRow(fila);
            }
        } catch (Exception e) {
            throw e;
        }

    }
// </editor-fold>     
    
// <editor-fold desc="OBTENER ID" defaultstate="collapsed">    
    public int ObtenerId() {
        int codigo = -1;
        if (!txtCodigo.getText().equals("")) {
            codigo = Integer.parseInt(txtCodigo.getText());
        }

        return codigo;
    }
// </editor-fold> 
    
    private void tblPlantasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPlantasMouseClicked

        int fila = tblPlantas.rowAtPoint(evt.getPoint());

        txtCodigo.setText(tblPlantas.getValueAt(fila, 0).toString());

        this.dispose();
    }//GEN-LAST:event_tblPlantasMouseClicked
   
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
            java.util.logging.Logger.getLogger(frmTblPlantas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTblPlantas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTblPlantas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTblPlantas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmTblPlantas dialog = new frmTblPlantas(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblPlantas;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}
