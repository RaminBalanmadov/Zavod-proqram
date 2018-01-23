/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kursisipervin.screenframe;

import com.kursisipervin.dboperations.DBOperation;
import com.kursisipervin.model.DangerLimit;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ramin
 */
public class AddedParametr extends javax.swing.JFrame {

    /**
     * Creates new form AddedParametr
     */
    DBOperation db = new DBOperation();

    public AddedParametr() {
        setResizable(false);
        initComponents();
        getContentPane().setBackground(Color.DARK_GRAY);

    }
    long count = 0;
    Thread thread = new Thread(new AddedParametr.ThreadOne());

    class ThreadOne extends Thread {

        @Override
        public void run() {
            String name = java.lang.Thread.currentThread().getName();
            for (DangerLimit dl : db.allNameMax()) {

                for (double i = dl.getNorma(); i <= dl.getCoxyuxari(); i++) {
                    try {
                        if (i == dl.getCoxyuxari()) {
                            thread.stop();
                        }
                        java.lang.Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Thread.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    count = (long) i;
                    System.out.println(count);
                }
            }
        }

    }

    String name;
    String asagi;
    String coxasagi;
    String norma;
    String yuxari;
    String coxyuxari;

    String string;
    int countDanger;

    AddedParametr(String string, int countDanger) {
        initComponents();
        this.string = string;
        this.countDanger = countDanger;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbDangerLimit = new javax.swing.JTable();
        tfTableRow = new javax.swing.JTextField();
        btnSelect = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        AddParam = new javax.swing.JMenu();
        LookParam = new javax.swing.JMenu();
        mnMenu = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tbDangerLimit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tbDangerLimit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Təhlükəli parametr", "Çox aşağı", "Aşağı", "Norma", "Yuxarı", "Çox yuxarı"
            }
        ));
        tbDangerLimit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDangerLimitMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDangerLimit);

        tfTableRow.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btnSelect.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSelect.setText("Seç");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        jMenuBar2.setBackground(new java.awt.Color(102, 102, 255));

        jMenu4.setText("Səhifə seç");

        AddParam.setText("Əlavə et");
        AddParam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddParamMouseClicked(evt);
            }
        });
        AddParam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddParamActionPerformed(evt);
            }
        });
        jMenu4.add(AddParam);

        LookParam.setText("Əlavə edilmişlər");
        LookParam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LookParamMouseClicked(evt);
            }
        });
        jMenu4.add(LookParam);

        jMenuBar2.add(jMenu4);

        mnMenu.setText("Ana  səhifə");
        mnMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnMenuMouseClicked(evt);
            }
        });
        jMenuBar2.add(mnMenu);

        jMenu1.setText("Sil");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu1);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(tfTableRow, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(btnSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTableRow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelect))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        DefaultTableModel tableModel = (DefaultTableModel) tbDangerLimit.getModel();
        for (DangerLimit dl : db.allNameMax()) {

            tableModel.addRow(new Object[]{dl.getId(), dl.getName(), dl.getCoxasagi(), dl.getAsagi(), dl.getNorma(), dl.getYuxari(), dl.getCoxyuxari()});
        }

        Thread thread = new Thread(new AddedParametr.ThreadOne());
        thread.start();
        
        

    }//GEN-LAST:event_formWindowOpened

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        int rowNum = tbDangerLimit.getSelectedRow();
        name = tbDangerLimit.getValueAt(rowNum, 1).toString();
        asagi = tbDangerLimit.getValueAt(rowNum, 2).toString();
        coxasagi = tbDangerLimit.getValueAt(rowNum, 3).toString();
        norma = tbDangerLimit.getValueAt(rowNum, 4).toString();
        yuxari = tbDangerLimit.getValueAt(rowNum, 5).toString();
        coxyuxari = tbDangerLimit.getValueAt(rowNum, 6).toString();

        new LookDangerLimit(name, asagi, coxasagi, norma,yuxari,coxyuxari, countDanger, count).setVisible(true);

    }//GEN-LAST:event_btnSelectActionPerformed

    private void tbDangerLimitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDangerLimitMouseClicked
        int rowNum = tbDangerLimit.getSelectedRow();
        tfTableRow.setText(tbDangerLimit.getValueAt(rowNum, 1).toString());
    }//GEN-LAST:event_tbDangerLimitMouseClicked

    private void AddParamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddParamMouseClicked
        new AddParametr().setVisible(true);
    }//GEN-LAST:event_AddParamMouseClicked

    private void AddParamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddParamActionPerformed

    }//GEN-LAST:event_AddParamActionPerformed

    private void LookParamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LookParamMouseClicked
        new AddedParametr().setVisible(true);
    }//GEN-LAST:event_LookParamMouseClicked

    private void mnMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnMenuMouseClicked
        new Screen().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnMenuMouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        new DeleteParametr().setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

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
            java.util.logging.Logger.getLogger(AddedParametr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddedParametr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddedParametr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddedParametr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddedParametr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AddParam;
    private javax.swing.JMenu LookParam;
    private javax.swing.JButton btnSelect;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu mnMenu;
    private javax.swing.JTable tbDangerLimit;
    private javax.swing.JTextField tfTableRow;
    // End of variables declaration//GEN-END:variables
}
