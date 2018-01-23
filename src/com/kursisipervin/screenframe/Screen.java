package com.kursisipervin.screenframe;

import com.kursisipervin.dboperations.DBOperation;
import com.kursisipervin.model.DangerLimit;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Screen extends javax.swing.JFrame {

    DBOperation db = new DBOperation();
    int countDanger = 0;
    int countMax = 0;

    public Screen() {
        setResizable(false);

        initComponents();

        getContentPane().setBackground(Color.lightGray); 
    }
    List<String> listDanger = new ArrayList();
    List<String> listMax = new ArrayList();
 Thread thread = new Thread(new ThreadOne());
    class ThreadOne extends Thread {

        @Override
        public void run() {
            String name = java.lang.Thread.currentThread().getName();
            for (DangerLimit dl : db.allNameMax()) {

                for (double i = dl.getNorma(); i <= dl.getCoxyuxari(); i++) {
                    try {
                        java.lang.Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Thread.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if (i == dl.getYuxari()) {
                        countDanger++;
                        listDanger.add(dl.getName());
                    }
                    if (i == dl.getCoxyuxari()) {
                        countMax++;
                        listMax.add(dl.getName());
                        thread.stop();
                    }
                    lblDanger.setText(String.valueOf(countDanger));
                    lblMax.setText(String.valueOf(countMax));
                    System.out.println(i);
                }
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblDan = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblDanger = new javax.swing.JLabel();
        lblMax = new javax.swing.JLabel();
        lblM = new javax.swing.JLabel();
        pbTimer = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        AddParam = new javax.swing.JMenu();
        LookParam = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblDan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDan.setText("Təhlükəli həddi keçən");
        lblDan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDanMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setText("Cihazların işinə nəzarət");

        lblDanger.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDanger.setForeground(new java.awt.Color(153, 0, 0));
        lblDanger.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDangerMouseClicked(evt);
            }
        });

        lblMax.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMax.setForeground(new java.awt.Color(102, 0, 0));
        lblMax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMaxMouseClicked(evt);
            }
        });

        lblM.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblM.setText("Maksimal həddə çatan");
        lblM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Cihazlardan hər hansı birində , hər hansı bir parametr");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("təhlükə yaratdığı zaman aşağıda sizə xəbərdarlıq ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("olacaq!!!");

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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pbTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblDanger, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblM)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblMax, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pbTimer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDan, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDanger, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblM, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMax, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        lblDanger.setText(String.valueOf(countDanger));
        lblMax.setText(String.valueOf(countMax));

       
        thread.start();


    }//GEN-LAST:event_formWindowOpened

    private void AddParamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddParamActionPerformed


    }//GEN-LAST:event_AddParamActionPerformed

    private void LookParamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LookParamMouseClicked
        new AddedParametr().setVisible(true);
    }//GEN-LAST:event_LookParamMouseClicked

    private void AddParamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddParamMouseClicked
        new AddParametr().setVisible(true);
    }//GEN-LAST:event_AddParamMouseClicked

    private void lblDanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDanMouseClicked
        for (String string : listDanger) {

            new AddedParametr(string,countDanger).setVisible(true);
        }

    }//GEN-LAST:event_lblDanMouseClicked

    private void lblDangerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangerMouseClicked
        for (String string : listDanger) {

            new AddedParametr(string,countDanger).setVisible(true);
        }

    }//GEN-LAST:event_lblDangerMouseClicked

    private void lblMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMMouseClicked
        for (String string : listDanger) {

            new AddedParametr(string,countMax).setVisible(true);
        }

    }//GEN-LAST:event_lblMMouseClicked

    private void lblMaxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaxMouseClicked
        for (String string : listDanger) {

            new AddedParametr(string,countMax).setVisible(true);
        }

    }//GEN-LAST:event_lblMaxMouseClicked

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
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AddParam;
    private javax.swing.JMenu LookParam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblDan;
    private javax.swing.JLabel lblDanger;
    private javax.swing.JLabel lblM;
    private javax.swing.JLabel lblMax;
    private javax.swing.JProgressBar pbTimer;
    // End of variables declaration//GEN-END:variables
}
