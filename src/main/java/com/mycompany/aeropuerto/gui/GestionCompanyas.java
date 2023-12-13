/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.mycompany.aeropuerto.gui;

import com.mycompany.aeropuerto.dto.CompanyaAerea;
import static com.mycompany.aeropuerto.logica.LogicaNegocio.escribirCSVComp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author Diego
 */
public class GestionCompanyas extends javax.swing.JDialog {

    /**
     * Creates new form GestionCompanyas
     */
    public GestionCompanyas() {

        initComponents();
    }

    public GestionCompanyas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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
        jLabel1 = new javax.swing.JLabel();
        txtPrefijoComp = new javax.swing.JTextField();
        txtCodigoComp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombreComp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDirSedeCentral = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMunicipioSedeCentral = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTlfInfoPasajeros = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTlfInfoAeropuerto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnGuardarComp = new javax.swing.JButton();
        btnNuevaComp = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblErrPrefijo = new javax.swing.JLabel();
        lblErrCodigo = new javax.swing.JLabel();
        lblErrNombre = new javax.swing.JLabel();
        lblErrDir = new javax.swing.JLabel();
        lblErrMunicipio = new javax.swing.JLabel();
        lblErrTlfPas = new javax.swing.JLabel();
        lblErrTlfAero = new javax.swing.JLabel();
        lblErrEmpty = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel9.setBackground(new java.awt.Color(255, 255, 204));
        jLabel9.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ALTA DE NUEVA COMPAÑÍAS AÉREAS");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel1.setText("Prefijo:");

        txtPrefijoComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrefijoCompActionPerformed(evt);
            }
        });

        jLabel2.setText("Código:");

        jLabel3.setText("Nombre Compañía:");

        jLabel4.setText("Dirección Sede Central:");

        jLabel5.setText("Municipio Sede Central:");

        jLabel6.setText("Teléfono info. pasajeros:");

        jLabel7.setText("Teléfono info. aeropuertos:");

        btnGuardarComp.setBackground(new java.awt.Color(50, 225, 50));
        btnGuardarComp.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnGuardarComp.setText("Guardar");
        btnGuardarComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCompActionPerformed(evt);
            }
        });

        btnNuevaComp.setBackground(new java.awt.Color(51, 204, 255));
        btnNuevaComp.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnNuevaComp.setText("Nueva compañía");
        btnNuevaComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaCompActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 51, 51));
        btnSalir.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblErrPrefijo.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblErrPrefijo.setForeground(new java.awt.Color(255, 0, 0));

        lblErrCodigo.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblErrCodigo.setForeground(new java.awt.Color(255, 0, 0));

        lblErrNombre.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblErrNombre.setForeground(new java.awt.Color(255, 0, 0));

        lblErrDir.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblErrDir.setForeground(new java.awt.Color(255, 0, 0));

        lblErrMunicipio.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblErrMunicipio.setForeground(new java.awt.Color(255, 51, 0));

        lblErrTlfPas.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblErrTlfPas.setForeground(new java.awt.Color(255, 0, 0));

        lblErrTlfAero.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblErrTlfAero.setForeground(new java.awt.Color(255, 0, 0));

        lblErrEmpty.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblErrEmpty.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevaComp, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnGuardarComp)
                            .addComponent(btnSalir)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblErrNombre)
                            .addComponent(lblErrPrefijo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTlfInfoAeropuerto, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                            .addComponent(txtTlfInfoPasajeros)
                            .addComponent(txtMunicipioSedeCentral)
                            .addComponent(txtDirSedeCentral)
                            .addComponent(txtNombreComp)
                            .addComponent(txtCodigoComp)
                            .addComponent(txtPrefijoComp)
                            .addComponent(lblErrCodigo)
                            .addComponent(lblErrDir)
                            .addComponent(lblErrMunicipio)
                            .addComponent(lblErrTlfPas)
                            .addComponent(lblErrTlfAero)
                            .addComponent(lblErrEmpty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(86, 86, 86))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel9)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPrefijoComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrPrefijo, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDirSedeCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrDir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMunicipioSedeCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrMunicipio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTlfInfoPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrTlfPas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTlfInfoAeropuerto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblErrTlfAero))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblErrEmpty)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarComp)
                    .addComponent(btnNuevaComp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrefijoCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrefijoCompActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrefijoCompActionPerformed

    private void btnGuardarCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCompActionPerformed
        boolean valido = true;
        try {
            CompanyaAerea compAerea = new CompanyaAerea();
            
            if (txtCodigoComp.getText().length() != 2 || !txtCodigoComp.getText().substring(0).matches("[A-Z]*")
                    || !txtCodigoComp.getText().substring(1).matches("[A-Z][0-9]*")) {
                lblErrCodigo.setText("Formato incorrecto para el código.");
                lblErrCodigo.setVisible(true);
                valido = false;
            }
            if (txtTlfInfoPasajeros.getText().length() > 15) {
                lblErrTlfPas.setText("El número de teléfono no es válido.");
                lblErrTlfPas.setVisible(true);
                valido = false;
            } else if (txtTlfInfoAeropuerto.getText().length() > 15) {
                lblErrTlfAero.setText("El número de teléfono no es válido.");
                lblErrTlfAero.setVisible(true);
                valido = false;
            }
            if (txtPrefijoComp.getText().isEmpty() || txtCodigoComp.getText().isEmpty() || txtTlfInfoPasajeros.getText().isEmpty()
                    || txtTlfInfoAeropuerto.getText().isEmpty() || txtNombreComp.getText().isEmpty()) {
                lblErrEmpty.setText("No puede haber campos vacíos.");
                lblErrEmpty.setVisible(true);
                valido = false;
            }
            int prefijo = Integer.parseInt(txtPrefijoComp.getText());

            if (prefijo <= 0 || prefijo > 999) {
                lblErrPrefijo.setText("Formato incorrecto para el prefijo.");
                 lblErrPrefijo.setText("Formato incorrecto para el prefijo.");
                lblErrPrefijo.setVisible(true);
                lblErrEmpty.setVisible(true);

                valido = false;
            }
            do {

                compAerea.setPrefijo(Integer.parseInt(txtPrefijoComp.getText()));
                compAerea.setCodigo(txtCodigoComp.getText());
                compAerea.setNombre(txtNombreComp.getText());
                compAerea.setDireccion(txtDirSedeCentral.getText());
                compAerea.setNumInfoAeropuerto(txtTlfInfoPasajeros.getText());
                compAerea.setNumInfoPasajero(txtTlfInfoAeropuerto.getText());
                compAerea.setMunicipio(txtMunicipioSedeCentral.getText());

                System.out.println(compAerea.getNombre() + " " + compAerea.getCodigo() + " " + compAerea.getDireccion());
                escribirCSVComp(compAerea);
                valido = false;

            } while (valido);
        } catch (Exception e) {
            lblErrPrefijo.setText("Formato incorrecto para el prefijo.");
            lblErrPrefijo.setVisible(true);
        }

    }//GEN-LAST:event_btnGuardarCompActionPerformed

    private void btnNuevaCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaCompActionPerformed
        txtPrefijoComp.setText("");
        txtCodigoComp.setText("");
        txtNombreComp.setText("");
        txtDirSedeCentral.setText("");
        txtTlfInfoPasajeros.setText("");
        txtTlfInfoAeropuerto.setText("");
        txtMunicipioSedeCentral.setText("");

    }//GEN-LAST:event_btnNuevaCompActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(GestionCompanyas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionCompanyas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionCompanyas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionCompanyas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GestionCompanyas dialog = new GestionCompanyas(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnGuardarComp;
    private javax.swing.JButton btnNuevaComp;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblErrCodigo;
    private javax.swing.JLabel lblErrDir;
    private javax.swing.JLabel lblErrEmpty;
    private javax.swing.JLabel lblErrMunicipio;
    private javax.swing.JLabel lblErrNombre;
    private javax.swing.JLabel lblErrPrefijo;
    private javax.swing.JLabel lblErrTlfAero;
    private javax.swing.JLabel lblErrTlfPas;
    private javax.swing.JTextField txtCodigoComp;
    private javax.swing.JTextField txtDirSedeCentral;
    private javax.swing.JTextField txtMunicipioSedeCentral;
    private javax.swing.JTextField txtNombreComp;
    private javax.swing.JTextField txtPrefijoComp;
    private javax.swing.JTextField txtTlfInfoAeropuerto;
    private javax.swing.JTextField txtTlfInfoPasajeros;
    // End of variables declaration//GEN-END:variables
}
