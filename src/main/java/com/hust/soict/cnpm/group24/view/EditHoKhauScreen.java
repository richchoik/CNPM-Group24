/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.hust.soict.cnpm.group24.view;

import java.awt.Color;

/**
 *
 * @author ADMIN
 */
public class EditHoKhauScreen extends javax.swing.JFrame {
    private MainScreen parentContext;
    /**
     * Creates new form EditHoKhauScreen
     */
    
    public EditHoKhauScreen(MainScreen pContext) {
        initComponents();
        parentContext = pContext;
        String ma_ho_khau = parentContext.getHo_khau_table().getValueAt(parentContext.getHo_khau_table().getSelectedRow(), 0).toString();
        String ten_chu_ho = parentContext.getHo_khau_table().getValueAt(parentContext.getHo_khau_table().getSelectedRow(), 1).toString();
        String ma_chu_ho = parentContext.getHo_khau_table().getValueAt(parentContext.getHo_khau_table().getSelectedRow(), 2).toString();
        ma_ho_field.setText(ma_ho_khau);
        ten_chu_ho_field.setText(ten_chu_ho);
        ma_chu_ho_field.setText(ma_chu_ho);     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logo_panel = new javax.swing.JPanel();
        logo_label = new javax.swing.JLabel();
        ma_ho_label = new javax.swing.JLabel();
        ma_ho_field = new javax.swing.JTextField();
        ten_chu_ho_label = new javax.swing.JLabel();
        ten_chu_ho_field = new javax.swing.JTextField();
        ma_chu_ho_label = new javax.swing.JLabel();
        ma_chu_ho_field = new javax.swing.JTextField();
        enter_change_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo_panel.setBackground(new java.awt.Color(67, 85, 133));

        logo_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/hust/soict/cnpm/group24/icon/Blue Manager-logos_white.png"))); // NOI18N

        javax.swing.GroupLayout logo_panelLayout = new javax.swing.GroupLayout(logo_panel);
        logo_panel.setLayout(logo_panelLayout);
        logo_panelLayout.setHorizontalGroup(
            logo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logo_panelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(logo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        logo_panelLayout.setVerticalGroup(
            logo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logo_panelLayout.createSequentialGroup()
                .addComponent(logo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        getContentPane().add(logo_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        ma_ho_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ma_ho_label.setText("Mã hộ khẩu:");
        getContentPane().add(ma_ho_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 123, 40));

        ma_ho_field.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(ma_ho_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 154, 40));

        ten_chu_ho_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ten_chu_ho_label.setText("Tên chủ hộ:");
        getContentPane().add(ten_chu_ho_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 123, 40));

        ten_chu_ho_field.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(ten_chu_ho_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 154, 40));

        ma_chu_ho_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ma_chu_ho_label.setText("Mã chủ hộ:");
        getContentPane().add(ma_chu_ho_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 123, 40));

        ma_chu_ho_field.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(ma_chu_ho_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 154, 40));

        enter_change_button.setBackground(new java.awt.Color(129, 143, 180));
        enter_change_button.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        enter_change_button.setText("XÁC NHẬN");
        enter_change_button.setFocusable(false);
        enter_change_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enter_change_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                enter_change_buttonMouseExited(evt);
            }
        });
        enter_change_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enter_change_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(enter_change_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, 181, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enter_change_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enter_change_buttonMouseEntered
        // TODO add your handling code here:
        enter_change_button.setBackground(new Color(245,232,199));
    }//GEN-LAST:event_enter_change_buttonMouseEntered

    private void enter_change_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enter_change_buttonMouseExited
        // TODO add your handling code here:
        enter_change_button.setBackground(new Color(129,143,180));
    }//GEN-LAST:event_enter_change_buttonMouseExited

    private void enter_change_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enter_change_buttonActionPerformed
        // TODO add your handling code here:
        String ma_ho_khau = ma_ho_field.getText();
        String ten_chu_ho = ten_chu_ho_field.getText();
        String ma_chu_ho = ma_chu_ho_field.getText();
        parentContext.getHo_khau_table().setValueAt(ma_ho_khau, parentContext.getHo_khau_table().getSelectedRow(), 0);
        parentContext.getHo_khau_table().setValueAt(ten_chu_ho, parentContext.getHo_khau_table().getSelectedRow(), 1);
        parentContext.getHo_khau_table().setValueAt(ma_chu_ho, parentContext.getHo_khau_table().getSelectedRow(), 2);
        this.dispose();
    }//GEN-LAST:event_enter_change_buttonActionPerformed

    
    public MainScreen getParentContext() {
        return parentContext;
    }

    /**
     * @param args the command line arguments
     */
    public void setParentContext(MainScreen parentContext) {    
        this.parentContext = parentContext;
    }

//    public void showEditHK() {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//        * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//        */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(EditHoKhauScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(EditHoKhauScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(EditHoKhauScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(EditHoKhauScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new EditHoKhauScreen().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enter_change_button;
    private javax.swing.JLabel logo_label;
    private javax.swing.JPanel logo_panel;
    private javax.swing.JTextField ma_chu_ho_field;
    private javax.swing.JLabel ma_chu_ho_label;
    private javax.swing.JTextField ma_ho_field;
    private javax.swing.JLabel ma_ho_label;
    private javax.swing.JTextField ten_chu_ho_field;
    private javax.swing.JLabel ten_chu_ho_label;
    // End of variables declaration//GEN-END:variables
}
