/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.mycompany.aeropuerto.gui;

/**
 *
 * @author Diego
 */
public class MenuVueloDiario extends javax.swing.JDialog {

    /**
     * Creates new form MenuVueloDiario
     */
    public MenuVueloDiario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
     public MenuVueloDiario() {
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnAltaVueloDiario = new javax.swing.JButton();
        btnBajaVueloDiario = new javax.swing.JButton();
        btnModificacionesVD = new javax.swing.JButton();
        btnConsultasVD = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel9.setBackground(new java.awt.Color(255, 255, 204));
        jLabel9.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("MENÚ VUELOS DIARIO");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel1.setLayout(new java.awt.GridLayout(4, 1));

        btnAltaVueloDiario.setBackground(new java.awt.Color(204, 204, 255));
        btnAltaVueloDiario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAltaVueloDiario.setText("ALTA");
        btnAltaVueloDiario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAltaVueloDiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaVueloDiarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnAltaVueloDiario);

        btnBajaVueloDiario.setBackground(new java.awt.Color(204, 204, 255));
        btnBajaVueloDiario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBajaVueloDiario.setText("BAJA");
        btnBajaVueloDiario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBajaVueloDiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaVueloDiarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnBajaVueloDiario);

        btnModificacionesVD.setBackground(new java.awt.Color(204, 204, 255));
        btnModificacionesVD.setFont(btnModificacionesVD.getFont().deriveFont((btnModificacionesVD.getFont().getStyle() & ~java.awt.Font.ITALIC) | java.awt.Font.BOLD));
        btnModificacionesVD.setText("MODICACIONES");
        btnModificacionesVD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(btnModificacionesVD);

        btnConsultasVD.setBackground(new java.awt.Color(204, 204, 255));
        btnConsultasVD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConsultasVD.setText("CONSULTA");
        btnConsultasVD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConsultasVD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultasVDActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultasVD);

        btnSalir.setBackground(new java.awt.Color(255, 51, 51));
        btnSalir.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAltaVueloDiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaVueloDiarioActionPerformed
        // java.awt.Frame frame = new java.awt.Frame("gestionVD");
        GestionVuelosDiarios vueloDiario = new GestionVuelosDiarios();
        vueloDiario.setVisible(true);
    }//GEN-LAST:event_btnAltaVueloDiarioActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
            this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBajaVueloDiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaVueloDiarioActionPerformed
        MenuBorrarVueloDiario mbvd = new MenuBorrarVueloDiario();
        mbvd.setVisible(true);
    }//GEN-LAST:event_btnBajaVueloDiarioActionPerformed

    private void btnConsultasVDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultasVDActionPerformed
        TablaConsultasVD tcVD = new TablaConsultasVD();
        tcVD.setVisible(true);
    }//GEN-LAST:event_btnConsultasVDActionPerformed

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
            java.util.logging.Logger.getLogger(MenuVueloDiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuVueloDiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuVueloDiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuVueloDiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MenuVueloDiario dialog = new MenuVueloDiario(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAltaVueloDiario;
    private javax.swing.JButton btnBajaVueloDiario;
    private javax.swing.JButton btnConsultasVD;
    private javax.swing.JButton btnModificacionesVD;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}