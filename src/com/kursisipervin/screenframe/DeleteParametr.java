/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kursisipervin.screenframe;

import com.kursisipervin.dboperations.DBOperation;
import com.kursisipervin.model.DangerLimit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

public class DeleteParametr extends javax.swing.JFrame {

    public DeleteParametr() {
        setResizable(false);
       setContentPane(new JLabel(new ImageIcon("C:\\Users\\Balanmadov\\Documents\\NetBeansProjects\\KursIsiPervin\\src\\image\\119_clarke_push_100818792316401611.jpg")));
        initComponents();
    }


    DBOperation db = new DBOperation();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbDangerLimit = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        tfTableRow = new javax.swing.JTextField();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        AddParam = new javax.swing.JMenu();
        LookParam = new javax.swing.JMenu();
        mnMenu = new javax.swing.JMenu();

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
                "Id", "Təhlükə növü", "Normal hədd", "Təhlükə həddi", "Maksimal hədd"
            }
        ));
        tbDangerLimit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDangerLimitMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDangerLimit);

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setText("Sil");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        tfTableRow.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfTableRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTableRowActionPerformed(evt);
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

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(tfTableRow, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTableRow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int id = 0;
    private void tbDangerLimitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDangerLimitMouseClicked
        int rowNum = tbDangerLimit.getSelectedRow();
        tfTableRow.setText(tbDangerLimit.getValueAt(rowNum, 1).toString());
        id = (int) tbDangerLimit.getValueAt(rowNum, 0);
    }//GEN-LAST:event_tbDangerLimitMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        DangerLimit dl = new DangerLimit();
        dl.setId(id);
        db.DeleteParametr(dl);
        DefaultTableModel tableModel = (DefaultTableModel) tbDangerLimit.getModel();
        tfTableRow.setText("");
        tableModel.setRowCount(0);
        formWindowOpened(null);
        
    }//GEN-LAST:event_btnDeleteActionPerformed

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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DefaultTableModel tableModel = (DefaultTableModel) tbDangerLimit.getModel();
        for (DangerLimit dl : db.allNameMax()) {
            
            
            tableModel.addRow(new Object[]{dl.getId(), dl.getName(), dl.getCoxasagi(), dl.getAsagi(), dl.getNorma(),dl.getYuxari(),dl.getCoxyuxari()});
        }

    }//GEN-LAST:event_formWindowOpened

    private void tfTableRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTableRowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTableRowActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteParametr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteParametr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteParametr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteParametr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteParametr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AddParam;
    private javax.swing.JMenu LookParam;
    private javax.swing.JButton btnDelete;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu mnMenu;
    private javax.swing.JTable tbDangerLimit;
    private javax.swing.JTextField tfTableRow;
    // End of variables declaration//GEN-END:variables
}
