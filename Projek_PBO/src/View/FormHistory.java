/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.ControllerHistory;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
/**
 *
 * @author ASUS
 */
public class FormHistory extends javax.swing.JFrame {

    /**
     * Creates new form FormHistory
     */
    public FormHistory() {
        initComponents();
        ctHistory = new ControllerHistory(this);
        ctHistory.isiTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonReset = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        buttonInsert = new javax.swing.JButton();
        butttonUpdate = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        setKategori = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDeskripsi = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtJumlah = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtId_transaksi = new javax.swing.JTextField();
        txtTanggal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        buttonDelete1 = new javax.swing.JButton();
        buttonInsert1 = new javax.swing.JButton();
        butttonUpdate1 = new javax.swing.JButton();
        buttonReset1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TabelData = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        buttonReset.setBackground(new java.awt.Color(204, 204, 204));
        buttonReset.setText("Reset");
        buttonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResetActionPerformed(evt);
            }
        });

        buttonDelete.setBackground(new java.awt.Color(204, 204, 204));
        buttonDelete.setText("Hapus");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        buttonInsert.setBackground(new java.awt.Color(204, 204, 204));
        buttonInsert.setText("Simpan");
        buttonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInsertActionPerformed(evt);
            }
        });

        butttonUpdate.setBackground(new java.awt.Color(204, 204, 204));
        butttonUpdate.setText("Ubah");
        butttonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butttonUpdateActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        setKategori.setBackground(new java.awt.Color(224, 227, 235));
        setKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pemasukan", "Pengeluaran" }));
        setKategori.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(74, 119, 145)));
        setKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setKategoriActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Kategori Transaksi");

        jLabel5.setBackground(new java.awt.Color(153, 153, 153));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Jumlah");

        txtDeskripsi.setBackground(new java.awt.Color(224, 227, 235));
        txtDeskripsi.setColumns(20);
        txtDeskripsi.setRows(5);
        txtDeskripsi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(74, 119, 145)));
        jScrollPane1.setViewportView(txtDeskripsi);

        jLabel3.setBackground(new java.awt.Color(153, 153, 153));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("ID Transaksi");

        jLabel7.setBackground(new java.awt.Color(153, 153, 153));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Deskripsi");

        txtId.setBackground(new java.awt.Color(224, 227, 235));
        txtId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(74, 119, 145)));
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        txtJumlah.setBackground(new java.awt.Color(224, 227, 235));
        txtJumlah.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(74, 119, 145)));

        jLabel6.setBackground(new java.awt.Color(153, 153, 153));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("ID Properti");

        txtId_transaksi.setBackground(new java.awt.Color(224, 227, 235));
        txtId_transaksi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(74, 119, 145)));
        txtId_transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtId_transaksiActionPerformed(evt);
            }
        });

        txtTanggal.setBackground(new java.awt.Color(224, 227, 235));
        txtTanggal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(74, 119, 145)));
        txtTanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTanggalActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(153, 153, 153));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Tanggal Transaksi");

        buttonDelete1.setBackground(new java.awt.Color(236, 240, 243));
        buttonDelete1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonDelete1.setForeground(new java.awt.Color(102, 102, 102));
        buttonDelete1.setText("Hapus");
        buttonDelete1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(74, 119, 145), 2));
        buttonDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDelete1ActionPerformed(evt);
            }
        });

        buttonInsert1.setBackground(new java.awt.Color(236, 240, 243));
        buttonInsert1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonInsert1.setForeground(new java.awt.Color(102, 102, 102));
        buttonInsert1.setText("Simpan");
        buttonInsert1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(74, 119, 145), 2));
        buttonInsert1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInsert1ActionPerformed(evt);
            }
        });

        butttonUpdate1.setBackground(new java.awt.Color(236, 240, 243));
        butttonUpdate1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        butttonUpdate1.setForeground(new java.awt.Color(102, 102, 102));
        butttonUpdate1.setText("Ubah");
        butttonUpdate1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(74, 119, 145), 2));
        butttonUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butttonUpdate1ActionPerformed(evt);
            }
        });

        buttonReset1.setBackground(new java.awt.Color(236, 240, 243));
        buttonReset1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonReset1.setForeground(new java.awt.Color(102, 102, 102));
        buttonReset1.setText("Reset");
        buttonReset1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(74, 119, 145), 2));
        buttonReset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonReset1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(74, 119, 145));
        jButton1.setText("<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Imprint MT Shadow", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(74, 119, 145));
        jLabel10.setText("HISTORY");

        TabelData.setBackground(new java.awt.Color(224, 227, 235));
        TabelData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Transaksi", "ID Properti", "Tanggal Transaksi", "Kategori", "Jumlah", "Deskripsi"
            }
        ));
        TabelData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelDataMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TabelData);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/WhatsApp Image 2024-05-25 at 20.08.21.jpeg"))); // NOI18N

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(74, 119, 145), 2));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtId)
                            .addComponent(txtTanggal)
                            .addComponent(setKategori, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtJumlah)
                            .addComponent(jScrollPane1)
                            .addComponent(txtId_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(buttonInsert1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(butttonUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(buttonDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(buttonReset1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(262, 262, 262)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(setKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(butttonUpdate1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonInsert1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonReset1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        // TODO add your handling code here:
        ctHistory.delete();
        ctHistory.isiTable();
        ctHistory.reset();
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void txtId_transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtId_transaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtId_transaksiActionPerformed

    private void buttonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInsertActionPerformed
        // TODO add your handling code here:
        ctHistory.insert();
        ctHistory.isiTable();
        ctHistory.reset();
    }//GEN-LAST:event_buttonInsertActionPerformed

    private void butttonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butttonUpdateActionPerformed
        // TODO add your handling code here:
        ctHistory.update();
        ctHistory.isiTable();
        ctHistory.reset();
    }//GEN-LAST:event_butttonUpdateActionPerformed

    private void buttonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResetActionPerformed
        // TODO add your handling code here:
        ctHistory.reset();
    }//GEN-LAST:event_buttonResetActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtTanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTanggalActionPerformed

    private void buttonDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDelete1ActionPerformed
        // TODO add your handling code here:
        ctHistory.delete();
        ctHistory.isiTable();
        ctHistory.reset();
    }//GEN-LAST:event_buttonDelete1ActionPerformed

    private void buttonInsert1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInsert1ActionPerformed
        // TODO add your handling code here:
        ctHistory.insert();
        ctHistory.isiTable();
        ctHistory.reset();
    }//GEN-LAST:event_buttonInsert1ActionPerformed

    private void butttonUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butttonUpdate1ActionPerformed
        // TODO add your handling code here:
        ctHistory.update();
        ctHistory.isiTable();
        ctHistory.reset();
    }//GEN-LAST:event_butttonUpdate1ActionPerformed

    private void buttonReset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonReset1ActionPerformed
        // TODO add your handling code here:
        ctHistory.reset();
    }//GEN-LAST:event_buttonReset1ActionPerformed

    private void TabelDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelDataMouseClicked
        int row = TabelData.getSelectedRow();
        ctHistory.isiField(row);
    }//GEN-LAST:event_TabelDataMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Home home = new Home();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void setKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setKategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_setKategoriActionPerformed

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
            java.util.logging.Logger.getLogger(FormHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormHistory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelData;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonDelete1;
    private javax.swing.JButton buttonInsert;
    private javax.swing.JButton buttonInsert1;
    private javax.swing.JButton buttonReset;
    private javax.swing.JButton buttonReset1;
    private javax.swing.JButton butttonUpdate;
    private javax.swing.JButton butttonUpdate1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> setKategori;
    private javax.swing.JTextArea txtDeskripsi;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtId_transaksi;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtTanggal;
    // End of variables declaration//GEN-END:variables

    
ControllerHistory ctHistory;
    
    public JTable getTabelData(){
        return TabelData;
        
    }
    public JTextField gettxtId_Transaksi(){
        return txtId_transaksi;
    }
    
    public JTextField gettxtId(){
        return txtId;
    }
    
    public JTextField gettxtTanggal(){
        return txtTanggal;
    }
    
    public JComboBox gettxtKategori(){
        return setKategori;
    }

    public JTextField gettxtJumlah(){
        return txtJumlah;
    }
    
    public JTextArea gettxtDeskripsi(){
        return txtDeskripsi;
    }
}
