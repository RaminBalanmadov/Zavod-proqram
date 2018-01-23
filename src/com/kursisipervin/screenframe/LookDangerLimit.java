package com.kursisipervin.screenframe;

import com.kursisipervin.dboperations.DBOperation;
import com.kursisipervin.model.DangerLimit;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class LookDangerLimit extends javax.swing.JFrame {

    DBOperation db = new DBOperation();

    public LookDangerLimit() {

        setResizable(false);
        initComponents();
        getContentPane().setBackground(Color.DARK_GRAY);

    }
    int countDan = 0;
    int countMax = 0;

    String name;
    String asagi;
    String coxasagi;
    String norma;
    String yuxari;
    String coxyuxari;
    int countDanger;
    long count;

    public LookDangerLimit(String name, String asagi, String coxasagi, String norma, String yuxari, String coxyuxari, int countDanger, long count) {
        initComponents();
        this.name = name;
        this.asagi = asagi;
        this.coxasagi = coxasagi;
        this.norma = norma;
        this.yuxari = yuxari;
        this.coxyuxari = coxyuxari;
        this.countDanger = countDanger;
        this.count = count;
    }
    String na = "";

    class ThreadOne extends Thread {

        @Override
        public void run() {
            if (count % 2 == 0) {
                String name = java.lang.Thread.currentThread().getName();
                for (DangerLimit dl : db.allNameMax()) {

                    for (double i = count; i <= dl.getCoxyuxari(); i++) {
                        try {
                            if (i == dl.getCoxyuxari()) {
                                thread.stop();
                            }
                            java.lang.Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Thread.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        lblContinue.setText(Double.toString(i));

                        System.out.println(i);
                    }
                }
            } else {
                String name = java.lang.Thread.currentThread().getName();
                for (DangerLimit dl : db.allNameMax()) {

                    for (double i = dl.getNorma(); i >= dl.getCoxasagi(); i--) {
                        try {
                            if (i == dl.getCoxasagi()) {
                                thread.stop();
                            }
                            java.lang.Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Thread.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        lblContinue.setText(Double.toString(i));

                        System.out.println(i);
                    }
                }
            }
        }

    }

    Thread thread = new Thread(new LookDangerLimit.ThreadOne());

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCoxAsagi = new javax.swing.JLabel();
        lblNorma = new javax.swing.JLabel();
        lblAsagi = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblCoxYuxari = new javax.swing.JLabel();
        lblName5 = new javax.swing.JLabel();
        lblName6 = new javax.swing.JLabel();
        lblName7 = new javax.swing.JLabel();
        lblName8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taMessage = new javax.swing.JTextArea();
        btnTenzimle = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListParam = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        lblName9 = new javax.swing.JLabel();
        lblName10 = new javax.swing.JLabel();
        lblName11 = new javax.swing.JLabel();
        lblContinue = new javax.swing.JLabel();
        lblYuxari = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        AddParam = new javax.swing.JMenu();
        LookParam = new javax.swing.JMenu();
        mnMenu = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 51));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblCoxAsagi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        lblNorma.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        lblAsagi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        lblName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        lblCoxYuxari.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        lblName5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblName5.setText("Norma");

        lblName6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblName6.setText("Aşağı");

        lblName7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblName7.setText("Çox aşağı");

        lblName8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblName8.setText("Yuxarı");

        taMessage.setColumns(20);
        taMessage.setFont(new java.awt.Font("Monospaced", 3, 14)); // NOI18N
        taMessage.setLineWrap(true);
        taMessage.setRows(5);
        jScrollPane1.setViewportView(taMessage);

        btnTenzimle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnTenzimle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTenzimleActionPerformed(evt);
            }
        });

        ListParam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListParamMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ListParam);

        lblName9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblName9.setText("Tənzimləyici Parametrlər");

        lblName10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblName10.setText("Çox yuxarı");

        lblName11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblName11.setText("Hazırkı vəziyyət");

        lblContinue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        lblYuxari.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblName10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblName11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblName7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblName6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblName5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblName8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCoxAsagi, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                            .addComponent(lblAsagi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNorma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCoxYuxari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblContinue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblYuxari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnTenzimle, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblName9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(150, 150, 150))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(btnTenzimle, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblName7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblName6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblName5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblName8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCoxAsagi, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblAsagi, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblNorma, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(lblYuxari, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCoxYuxari, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblContinue, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int lenth1 = 0;
    int lenth2 = 0;
    int lenth3 = 0;
    int lenth4 = 0;
    int lenth5 = 0;
    int lenth6 = 0;
    int lenth7 = 0;
    int lenth8 = 0;
    int lenth9 = 0;
    int lenth10 = 0;
    int lenth = 0;

    String parametr1 = "";
    String parametr2 = "";
    String parametr3 = "";
    String parametr4 = "";
    String parametr5 = "";
    String parametr6 = "";
    String parametr7 = "";
    String parametr8 = "";
    String parametr9 = "";
    String parametr10 = "";

    int coun = 1;
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        lblName.setText(name);
        DefaultListModel listModel = new DefaultListModel();

        for (DangerLimit dl : db.allNameMax()) {
            if (name.equalsIgnoreCase(dl.getName())) {
                lblCoxAsagi.setText(coxasagi);
                lblAsagi.setText(asagi);
                lblNorma.setText(norma);
                lblYuxari.setText(yuxari);
                lblCoxYuxari.setText(coxyuxari);
                taMessage.setText(dl.getMessage());
                ListParam.setModel(listModel);

                lenth = dl.getDangerMaxParam().indexOf(",");
                listModel.addElement(dl.getDangerMaxParam().substring(0, lenth));

                parametr1 = dl.getDangerMaxParam().substring(lenth + 1, dl.getDangerMaxParam().length()).trim();
                lenth1 += parametr1.trim().indexOf(",");
                if (parametr1.isEmpty()) {
                    coun++;
                    break;
                }
                listModel.addElement(parametr1.substring(0, lenth1));

                parametr2 = parametr1.substring(lenth1 + 1, parametr1.length()).trim();
                lenth2 += parametr2.trim().indexOf(",");
                if (parametr2.isEmpty()) {
                    coun++;
                    break;
                }
                listModel.addElement(parametr2.substring(0, lenth2));

                parametr3 = parametr2.substring(lenth2 + 1, parametr2.length()).trim();
                lenth3 += parametr3.trim().indexOf(",");
                if (parametr3.isEmpty()) {
                    coun++;
                    break;
                }
                listModel.addElement(parametr3.substring(0, lenth3));

                parametr4 = parametr3.substring(lenth3 + 1, parametr3.length()).trim();
                lenth4 += parametr4.trim().indexOf(",");
                if (parametr4.isEmpty()) {
                    coun++;
                    break;
                }
                listModel.addElement(parametr4.substring(0, lenth4));

                parametr5 = parametr4.substring(lenth4 + 1, parametr4.length()).trim();
                lenth5 += parametr5.trim().indexOf(",");
                if (parametr5.isEmpty()) {
                    coun++;
                    break;
                }
                listModel.addElement(parametr5.substring(0, lenth5));

                parametr6 = parametr5.substring(lenth5 + 1, parametr5.length()).trim();
                lenth6 += parametr6.trim().indexOf(",");
                if (parametr6.isEmpty()) {
                    coun++;
                    break;
                }
                listModel.addElement(parametr6.substring(0, lenth6));

                parametr7 = parametr6.substring(lenth6 + 1, parametr6.length()).trim();
                lenth7 += parametr7.trim().indexOf(",");
                if (parametr7.isEmpty()) {
                    coun++;
                    break;
                }
                listModel.addElement(parametr7.substring(0, lenth7));

                parametr8 = parametr7.substring(lenth7 + 1, parametr7.length()).trim();
                lenth8 += parametr8.trim().indexOf(",");
                if (parametr8.isEmpty()) {
                    coun++;
                    break;
                }
                listModel.addElement(parametr8.substring(0, lenth8));

                parametr9 = parametr8.substring(lenth8 + 1, parametr8.length()).trim();
                lenth9 += parametr9.trim().indexOf(",");
                if (parametr9.isEmpty()) {
                    coun++;
                    break;
                }
                listModel.addElement(parametr9.substring(0, lenth9));

                parametr10 = parametr9.substring(lenth9 + 1, parametr9.length()).trim();
                lenth10 += parametr10.trim().indexOf(",");
                if (parametr10.isEmpty()) {
                    coun++;
                    break;
                }
                listModel.addElement(parametr10.substring(0, lenth10));

            }
        }

        thread.start();
        System.out.println("coun;" + coun);
    }//GEN-LAST:event_formWindowOpened

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

    private void ListParamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListParamMouseClicked

        btnTenzimle.setText(ListParam.getSelectedValue().toString());
    }//GEN-LAST:event_ListParamMouseClicked

    private void btnTenzimleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTenzimleActionPerformed

        lblContinue.setText(lblNorma.getText());
        thread.stop();
    }//GEN-LAST:event_btnTenzimleActionPerformed

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
            java.util.logging.Logger.getLogger(LookDangerLimit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LookDangerLimit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LookDangerLimit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LookDangerLimit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LookDangerLimit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AddParam;
    private javax.swing.JList<String> ListParam;
    private javax.swing.JMenu LookParam;
    private javax.swing.JButton btnTenzimle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAsagi;
    private javax.swing.JLabel lblContinue;
    private javax.swing.JLabel lblCoxAsagi;
    private javax.swing.JLabel lblCoxYuxari;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName10;
    private javax.swing.JLabel lblName11;
    private javax.swing.JLabel lblName5;
    private javax.swing.JLabel lblName6;
    private javax.swing.JLabel lblName7;
    private javax.swing.JLabel lblName8;
    private javax.swing.JLabel lblName9;
    private javax.swing.JLabel lblNorma;
    private javax.swing.JLabel lblYuxari;
    private javax.swing.JMenu mnMenu;
    private javax.swing.JTextArea taMessage;
    // End of variables declaration//GEN-END:variables
}
