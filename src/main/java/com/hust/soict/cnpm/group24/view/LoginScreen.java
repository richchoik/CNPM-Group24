/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.hust.soict.cnpm.group24.view;

import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author ADMIN
 */
public class LoginScreen extends javax.swing.JFrame {

    /**
     * Creates new form LoginScreen
     */
    public LoginScreen() {
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

        login_panel = new javax.swing.JPanel();
        login_label = new javax.swing.JLabel();
        account_label = new javax.swing.JLabel();
        password_label = new javax.swing.JLabel();
        account_field = new javax.swing.JTextField();
        password_field = new javax.swing.JPasswordField();
        question_label = new javax.swing.JLabel();
        signup_bt_panel = new javax.swing.JPanel();
        signup_bt_label = new javax.swing.JLabel();
        login_bt_panel = new javax.swing.JPanel();
        login_bt_label = new javax.swing.JLabel();
        login_message_panel = new javax.swing.JPanel();
        login_message_label = new javax.swing.JLabel();
        back_ground_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Blue Manager - Đăng nhập");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login_panel.setBackground(new java.awt.Color(0, 0, 0,40));
        login_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login_label.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        login_label.setForeground(new java.awt.Color(255, 255, 255));
        login_label.setText("ĐĂNG NHẬP");
        login_panel.add(login_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, 41));

        account_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        account_label.setForeground(new java.awt.Color(255, 255, 255));
        account_label.setText("Tài khoản:");
        login_panel.add(account_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 87, 40));

        password_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        password_label.setForeground(new java.awt.Color(255, 255, 255));
        password_label.setText("Mật khẩu:");
        login_panel.add(password_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 75, 40));

        account_field.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        login_panel.add(account_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 135, 40));

        password_field.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        login_panel.add(password_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 135, 40));

        question_label.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        question_label.setForeground(new java.awt.Color(255, 255, 255));
        question_label.setText("Bạn chưa có tài khoản?");
        login_panel.add(question_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 139, 28));

        signup_bt_panel.setBackground(new java.awt.Color(204, 255, 255));
        signup_bt_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signup_bt_panelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signup_bt_panelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                signup_bt_panelMousePressed(evt);
            }
        });

        signup_bt_label.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        signup_bt_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signup_bt_label.setText("Đăng ký");

        javax.swing.GroupLayout signup_bt_panelLayout = new javax.swing.GroupLayout(signup_bt_panel);
        signup_bt_panel.setLayout(signup_bt_panelLayout);
        signup_bt_panelLayout.setHorizontalGroup(
            signup_bt_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signup_bt_label, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        signup_bt_panelLayout.setVerticalGroup(
            signup_bt_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signup_bt_label, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        login_panel.add(signup_bt_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 90, 50));

        login_bt_panel.setBackground(new java.awt.Color(204, 255, 255));
        login_bt_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                login_bt_panelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                login_bt_panelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                login_bt_panelMousePressed(evt);
            }
        });

        login_bt_label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        login_bt_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login_bt_label.setText("Login");

        javax.swing.GroupLayout login_bt_panelLayout = new javax.swing.GroupLayout(login_bt_panel);
        login_bt_panel.setLayout(login_bt_panelLayout);
        login_bt_panelLayout.setHorizontalGroup(
            login_bt_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login_bt_label, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        login_bt_panelLayout.setVerticalGroup(
            login_bt_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login_bt_label, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        login_panel.add(login_bt_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        login_message_panel.setBackground(new java.awt.Color(0, 0, 0,0));

        login_message_label.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        login_message_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout login_message_panelLayout = new javax.swing.GroupLayout(login_message_panel);
        login_message_panel.setLayout(login_message_panelLayout);
        login_message_panelLayout.setHorizontalGroup(
            login_message_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login_message_label, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        login_message_panelLayout.setVerticalGroup(
            login_message_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login_message_label, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        login_panel.add(login_message_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, 30));

        getContentPane().add(login_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 310, 390));

        back_ground_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/blue_moon3.jpg"))); // NOI18N
        getContentPane().add(back_ground_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signup_bt_panelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signup_bt_panelMouseEntered
        // TODO add your handling code here:
        signup_bt_panel.setBackground(new Color(51,255,255));
    }//GEN-LAST:event_signup_bt_panelMouseEntered

    private void signup_bt_panelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signup_bt_panelMouseExited
        // TODO add your handling code here:
        signup_bt_panel.setBackground(new Color(204,255,255));
    }//GEN-LAST:event_signup_bt_panelMouseExited

    private void signup_bt_panelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signup_bt_panelMousePressed
        // TODO add your handling code here:
        SignupScreen.showSignup();
        this.dispose();
    }//GEN-LAST:event_signup_bt_panelMousePressed

    private void login_bt_panelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_bt_panelMousePressed
        // TODO add your handling code here:
        String username = account_field.getText();
        char[] passwordChar = password_field.getPassword();
        String password = new String(passwordChar);
        if("admin".equals(username))
        {
            if("1".equals(password))
            {
                MainScreen mainScreen = new MainScreen();
                this.dispose();
            }
            else
            {
                if("".equals(password))
                {
                    login_message_label.setText("Hãy nhập mật khẩu");
                    login_message_label.setForeground(Color.white);
                    login_message_panel.setBackground(Color.red);
                }
                else
                {
                    login_message_label.setText("Sai mật khẩu");
                    login_message_label.setForeground(Color.white);
                    login_message_panel.setBackground(Color.red);
                }
            }
        }
        else
        {
            if("".equals(username))
            {
                login_message_label.setText("Hãy nhập tài khoản");
                login_message_label.setForeground(Color.white);
                login_message_panel.setBackground(Color.red);
            }
            else
            {
                login_message_label.setText("Tài khoản không tồn tại");
                login_message_label.setForeground(Color.white);
                login_message_panel.setBackground(Color.red);
            }
            
        }
    }//GEN-LAST:event_login_bt_panelMousePressed

    private void login_bt_panelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_bt_panelMouseExited
        // TODO add your handling code here:
        login_bt_panel.setBackground(new Color(204,255,255));
    }//GEN-LAST:event_login_bt_panelMouseExited

    private void login_bt_panelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_bt_panelMouseEntered
        // TODO add your handling code here:
        login_bt_panel.setBackground(new Color(51,255,255));
    }//GEN-LAST:event_login_bt_panelMouseEntered

    /**
     * @param args the command line arguments
     */
    public static void ShowLogin() {
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
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField account_field;
    private javax.swing.JLabel account_label;
    private javax.swing.JLabel back_ground_label;
    private javax.swing.JLabel login_bt_label;
    private javax.swing.JPanel login_bt_panel;
    private javax.swing.JLabel login_label;
    private javax.swing.JLabel login_message_label;
    private javax.swing.JPanel login_message_panel;
    private javax.swing.JPanel login_panel;
    private javax.swing.JPasswordField password_field;
    private javax.swing.JLabel password_label;
    private javax.swing.JLabel question_label;
    private javax.swing.JLabel signup_bt_label;
    private javax.swing.JPanel signup_bt_panel;
    // End of variables declaration//GEN-END:variables
}
