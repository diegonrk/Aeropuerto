/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.mycompany.aeropuerto.gui;

import com.mycompany.aeropuerto.dto.CompanyaAerea;
import com.mycompany.aeropuerto.dto.VueloBase;
import com.mycompany.aeropuerto.dto.VueloDiario;
import com.mycompany.aeropuerto.logica.LogicaNegocio;
import static com.mycompany.aeropuerto.logica.LogicaNegocio.borrarVueloBase;
import static com.mycompany.aeropuerto.logica.LogicaNegocio.getAllVuelosBase;
import static com.mycompany.aeropuerto.logica.LogicaNegocio.getAllVuelosDiarios;
import static com.mycompany.aeropuerto.logica.LogicaNegocio.leerCompanyasCSV;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.RowFilter;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Diego
 */
public class BajaVueloBase extends javax.swing.JDialog {

    TableRowSorter<VuelosBaseTableModel> FiltrosVB;

    /**
     * Creates new form BajaVueloBase
     */
    public BajaVueloBase(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

    }

    public BajaVueloBase() {
        initComponents();
        cargarCBXComp();
        pnlConfirmacion.setVisible(false);
        tblVuelosBase.setModel(new VuelosBaseTableModel(LogicaNegocio.getAllVuelosBase()));
        lblInfoBorrado.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblVuelosBase = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        pnlConfirmacion = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSiBorrar = new javax.swing.JButton();
        btnNoBorrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cbxCompanya = new javax.swing.JComboBox<>();
        btnBorrar = new javax.swing.JButton();
        lblInfoBorrado = new javax.swing.JLabel();
        lblExisteVuelo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblVuelosBase.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblVuelosBase);

        jLabel9.setBackground(new java.awt.Color(255, 255, 204));
        jLabel9.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("BORRADO DE  VUELOS BASE");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel1.setText("¿Desea realmente borrar el vuelo seleccionado?");

        btnSiBorrar.setBackground(new java.awt.Color(51, 255, 0));
        btnSiBorrar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnSiBorrar.setText("Si");
        btnSiBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiBorrarActionPerformed(evt);
            }
        });

        btnNoBorrar.setBackground(new java.awt.Color(255, 51, 0));
        btnNoBorrar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnNoBorrar.setText("No");
        btnNoBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlConfirmacionLayout = new javax.swing.GroupLayout(pnlConfirmacion);
        pnlConfirmacion.setLayout(pnlConfirmacionLayout);
        pnlConfirmacionLayout.setHorizontalGroup(
            pnlConfirmacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConfirmacionLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel1)
                .addGap(70, 70, 70)
                .addComponent(btnSiBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNoBorrar)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        pnlConfirmacionLayout.setVerticalGroup(
            pnlConfirmacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConfirmacionLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnlConfirmacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnSiBorrar)
                    .addComponent(btnNoBorrar))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel2.setText("Selecciona  la compañía:");

        cbxCompanya.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "comp..." }));
        cbxCompanya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCompanyaActionPerformed(evt);
            }
        });

        btnBorrar.setBackground(new java.awt.Color(255, 51, 0));
        btnBorrar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        lblExisteVuelo.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblInfoBorrado, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlConfirmacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(106, 106, 106)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxCompanya, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(121, 121, 121)
                            .addComponent(jLabel9)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(55, Short.MAX_VALUE)
                        .addComponent(lblExisteVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnBorrar)
                        .addGap(44, 44, 44)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbxCompanya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorrar)
                    .addComponent(lblExisteVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(pnlConfirmacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInfoBorrado, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiBorrarActionPerformed
        try {
            int x = tblVuelosBase.convertRowIndexToModel(tblVuelosBase.getSelectedRow());
            VuelosBaseTableModel model = (VuelosBaseTableModel) tblVuelosBase.getModel();
            String cod = (String) model.getValueAt(x, 0);
            borrarVueloBase(cod);
            lblInfoBorrado.setText("Vuelo borrado correctamente.");
            lblInfoBorrado.setVisible(true);
            /*
        BajaVueloBase bajaVueloBase = new BajaVueloBase();
        bajaVueloBase.revalidate();
        bajaVueloBase.repaint();
             */
            tblVuelosBase.setModel(new VuelosBaseTableModel(LogicaNegocio.getAllVuelosBase()));
        } catch (Exception e) {
            lblInfoBorrado.setText("ERROR!! Operación cancelada.");
            lblInfoBorrado.setVisible(true);
        }


    }//GEN-LAST:event_btnSiBorrarActionPerformed

    private void btnNoBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoBorrarActionPerformed
        lblExisteVuelo.setText("Operación cancelada.");
               pnlConfirmacion.setVisible(false);
 
        lblInfoBorrado.setVisible(true);    }//GEN-LAST:event_btnNoBorrarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        List<VueloDiario> lstVuelosDiarios = getAllVuelosDiarios();
        int x = tblVuelosBase.convertRowIndexToModel(tblVuelosBase.getSelectedRow());
        VuelosBaseTableModel model = (VuelosBaseTableModel) tblVuelosBase.getModel();
        String cod = (String) model.getValueAt(x, 0);
        
        for(VueloDiario vd: lstVuelosDiarios){
            
        if(vd.getCodigoVueloBase().equals(cod)){
        lblExisteVuelo.setText("Ya hay vuelos diarios de este vuelo base, no se puede borrar.");
        lblExisteVuelo.setVisible(true);
        
        } else {
                  
pnlConfirmacion.setVisible(true);
        lblExisteVuelo.setText("No hay vuelos diarios aún, se puede borrar.");
        lblExisteVuelo.setVisible(true);
        }
        }
        
        
        
        
        

    }//GEN-LAST:event_btnBorrarActionPerformed

    private void cbxCompanyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCompanyaActionPerformed
        String companya = cbxCompanya.getSelectedItem().toString();
        String codigo = "";

        List<CompanyaAerea> lstComp = leerCompanyasCSV();
        List<VueloBase> lstVB = getAllVuelosBase();
        List<VueloBase> lstVueloBase = new ArrayList<>();
        for (CompanyaAerea ca : lstComp) {
            if (ca.getNombre().equals(companya)) {

                codigo = ca.getCodigo();
            }
        }

        for (CompanyaAerea ca : lstComp) {

            for (VueloBase vb : lstVB) {
                String codigoVB = vb.getCodigoVuelo();
                if (codigoVB.contains(ca.getCodigo())) {
                    lstVueloBase.add(vb);
                }
            }

        }

        tblVuelosBase.setModel(new VuelosBaseTableModel(lstVueloBase));
        FiltrosVB = new TableRowSorter<>(new VuelosBaseTableModel(lstVueloBase));
        TableRowSorter<VuelosBaseTableModel> FiltrosVB = new TableRowSorter<>(new VuelosBaseTableModel(lstVueloBase));
        tblVuelosBase.setRowSorter(FiltrosVB);
        List<RowSorter.SortKey> skLlegadas = new ArrayList<>();
        skLlegadas.add(new RowSorter.SortKey(2, SortOrder.ASCENDING));
        FiltrosVB.setSortKeys(skLlegadas);
        RowFilter<VuelosBaseTableModel, Integer> rfL = RowFilter.regexFilter(codigo, 0);
        FiltrosVB.setRowFilter(rfL);


    }//GEN-LAST:event_cbxCompanyaActionPerformed

    public void cargarCBXComp() {
        List<VueloBase> lstVuelosBase = getAllVuelosBase();
        List<CompanyaAerea> lstCompanyas = leerCompanyasCSV();
        Set<String> lstCodigos = new HashSet<>();

        for (VueloBase vb : lstVuelosBase) {
            lstCodigos.add(vb.getCodigoVuelo());
        }

        for (CompanyaAerea c : lstCompanyas) {
            for (String s : lstCodigos) {
                if (c.getCodigo().equals(s)) {
                    cbxCompanya.addItem(c.getNombre());
                }
            }
        }
    }

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
            java.util.logging.Logger.getLogger(BajaVueloBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BajaVueloBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BajaVueloBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BajaVueloBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BajaVueloBase dialog = new BajaVueloBase(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnNoBorrar;
    private javax.swing.JButton btnSiBorrar;
    private javax.swing.JComboBox<String> cbxCompanya;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblExisteVuelo;
    private javax.swing.JLabel lblInfoBorrado;
    private javax.swing.JPanel pnlConfirmacion;
    private javax.swing.JTable tblVuelosBase;
    // End of variables declaration//GEN-END:variables
}
