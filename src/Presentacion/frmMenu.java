package Presentacion;

import java.awt.Dimension;

/**
 *
 * 1-4-22
 *
 * @author Andrés Villalobos
 */
public class frmMenu extends javax.swing.JFrame { // tiene todos los componentes de  los forms al heredarlo

    //Este método crea inicializa el formulario
    public frmMenu() {
        initComponents();

        this.setExtendedState(frmMenu.MAXIMIZED_BOTH);

        this.setTitle("Menú");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        mnuPlantas = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuHerraProd = new javax.swing.JMenuItem();
        mnuFacturacion = new javax.swing.JMenu();
        mnuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 622, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
        );

        jMenu4.setText("Inventario");
        jMenu4.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        mnuPlantas.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        mnuPlantas.setText("Plantas");
        mnuPlantas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPlantasActionPerformed(evt);
            }
        });
        jMenu4.add(mnuPlantas);
        jMenu4.add(jSeparator1);

        mnuHerraProd.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        mnuHerraProd.setText("Productos - Herramientas");
        mnuHerraProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuHerraProdActionPerformed(evt);
            }
        });
        jMenu4.add(mnuHerraProd);

        jMenuBar2.add(jMenu4);

        mnuFacturacion.setText("Facturación");
        mnuFacturacion.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        mnuFacturacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuFacturacionMouseClicked(evt);
            }
        });
        jMenuBar2.add(mnuFacturacion);

        mnuSalir.setText("Salir");
        mnuSalir.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        mnuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuSalirMouseClicked(evt);
            }
        });
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        jMenuBar2.add(mnuSalir);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed

        this.dispose(); // Cierra la ventana
    }//GEN-LAST:event_mnuSalirActionPerformed

    private void mnuPlantasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPlantasActionPerformed

        frmPlanta frm = new frmPlanta();

        escritorio.add(frm);
        frm.toFront();
        frm.setVisible(true);

// CENTRAR EL FORMULARIO INTERNO: __________________
// el tamaño de la ventana contenedor:
        Dimension size = escritorio.getSize();
// tamaño del formulario interno:
        Dimension sizeForm = frm.getSize();

        frm.setLocation(((int) size.getWidth() - (int) sizeForm.getWidth()) / 2, ((int) size.getHeight() - (int) sizeForm.getHeight()) / 2); // recibe un valor de la X y de la Y

        frm.toFront();
        frm.setVisible(true);
    }//GEN-LAST:event_mnuPlantasActionPerformed

    private void mnuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuSalirMouseClicked
        this.dispose(); // Cierra la ventana
    }//GEN-LAST:event_mnuSalirMouseClicked

    private void mnuHerraProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuHerraProdActionPerformed

        frmHerram_Prod frm = new frmHerram_Prod();

        escritorio.add(frm);
        frm.toFront();
        frm.setVisible(true);

// CENTRAR EL FORMULARIO INTERNO: __________________
// el tamaño de la ventana contenedor:
        Dimension size = escritorio.getSize();
// tamaño del formulario interno:
        Dimension sizeForm = frm.getSize();

        frm.setLocation(((int) size.getWidth() - (int) sizeForm.getWidth()) / 2, ((int) size.getHeight() - (int) sizeForm.getHeight()) / 2); // recibe un valor de la X y de la Y

        frm.toFront();
        frm.setVisible(true);

    }//GEN-LAST:event_mnuHerraProdActionPerformed

    private void mnuFacturacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuFacturacionMouseClicked

        frmFacturacion frm = new frmFacturacion();

        escritorio.add(frm);
        frm.toFront();
        frm.setVisible(true);

// CENTRAR EL FORMULARIO INTERNO: __________________
// el tamaño de la ventana contenedor:
        Dimension size = escritorio.getSize();
// tamaño del formulario interno:
        Dimension sizeForm = frm.getSize();

        frm.setLocation(((int) size.getWidth() - (int) sizeForm.getWidth()) / 2, ((int) size.getHeight() - (int) sizeForm.getHeight()) / 2); // recibe un valor de la X y de la Y

        frm.toFront();
        frm.setVisible(true);

    }//GEN-LAST:event_mnuFacturacionMouseClicked

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
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu mnuFacturacion;
    private javax.swing.JMenuItem mnuHerraProd;
    private javax.swing.JMenuItem mnuPlantas;
    private javax.swing.JMenu mnuSalir;
    // End of variables declaration//GEN-END:variables
}
