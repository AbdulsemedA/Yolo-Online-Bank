/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package banking.system;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Hp
 */
public class AdminDashboard extends javax.swing.JFrame {

    /**
     * Creates new form AdminDashboard
     */
    DataInputStream di;
    public AdminDashboard() {
        
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

        dashboardPanel = new javax.swing.JPanel();
        admin_bodyPanel = new javax.swing.JPanel();
        admin_headerPanel = new javax.swing.JPanel();
        adminDashboardLabel = new javax.swing.JLabel();
        backLabel = new javax.swing.JLabel();
        startServerBtn = new javax.swing.JButton();
        createAccBtn = new javax.swing.JButton();
        depositAccBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        admin_bodyPanel.setBackground(new java.awt.Color(255, 204, 0));

        admin_headerPanel.setBackground(new java.awt.Color(0, 51, 51));
        admin_headerPanel.setForeground(new java.awt.Color(0, 51, 51));

        adminDashboardLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        adminDashboardLabel.setForeground(new java.awt.Color(255, 204, 0));
        adminDashboardLabel.setText("ADMIN DASHBOARD");

        javax.swing.GroupLayout admin_headerPanelLayout = new javax.swing.GroupLayout(admin_headerPanel);
        admin_headerPanel.setLayout(admin_headerPanelLayout);
        admin_headerPanelLayout.setHorizontalGroup(
            admin_headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(admin_headerPanelLayout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(adminDashboardLabel)
                .addContainerGap(275, Short.MAX_VALUE))
        );
        admin_headerPanelLayout.setVerticalGroup(
            admin_headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, admin_headerPanelLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(adminDashboardLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        backLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        backLabel.setForeground(new java.awt.Color(153, 0, 0));
        backLabel.setText("BACK");
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelMouseClicked(evt);
            }
        });

        startServerBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        startServerBtn.setForeground(new java.awt.Color(0, 51, 51));
        startServerBtn.setText("Start Server");
        startServerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startServerBtnActionPerformed(evt);
            }
        });

        createAccBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        createAccBtn.setText("Create Account");
        createAccBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccBtnActionPerformed(evt);
            }
        });

        depositAccBtn.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        depositAccBtn.setText("Deposit Account");
        depositAccBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositAccBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout admin_bodyPanelLayout = new javax.swing.GroupLayout(admin_bodyPanel);
        admin_bodyPanel.setLayout(admin_bodyPanelLayout);
        admin_bodyPanelLayout.setHorizontalGroup(
            admin_bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(admin_headerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(admin_bodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(startServerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(admin_bodyPanelLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(createAccBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(depositAccBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        admin_bodyPanelLayout.setVerticalGroup(
            admin_bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(admin_bodyPanelLayout.createSequentialGroup()
                .addComponent(admin_headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(admin_bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startServerBtn))
                .addGap(99, 99, 99)
                .addGroup(admin_bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createAccBtn)
                    .addComponent(depositAccBtn))
                .addContainerGap(186, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dashboardPanelLayout = new javax.swing.GroupLayout(dashboardPanel);
        dashboardPanel.setLayout(dashboardPanelLayout);
        dashboardPanelLayout.setHorizontalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(admin_bodyPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dashboardPanelLayout.setVerticalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboardPanelLayout.createSequentialGroup()
                .addComponent(admin_bodyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseClicked
        // TODO add your handling code here:
        AdminLogin obj =new AdminLogin();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_backLabelMouseClicked

    private void startServerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startServerBtnActionPerformed
        // TODO add your handling code here:
        try{
            ServerSocket ss = new ServerSocket(8000);
//            dispose();
            Socket s = ss.accept();
            s.setKeepAlive(true);
//            if(s.isConnected()){
            di = new DataInputStream(s.getInputStream());
            CreateAccount obj = new CreateAccount(di);
            obj.setVisible(true);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
//        BankServer obj = new BankServer();
//        obj.setVisible(true);
    }//GEN-LAST:event_startServerBtnActionPerformed

    private void createAccBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccBtnActionPerformed
        // TODO add your handling code here:
        CreateAccount obj;
		try {
			obj = new CreateAccount(di);
			obj.setVisible(true);
	        dispose();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }//GEN-LAST:event_createAccBtnActionPerformed

    private void depositAccBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositAccBtnActionPerformed
        // TODO add your handling code here:
        DepositAccount obj = new DepositAccount();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_depositAccBtnActionPerformed

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
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AdminDashboard(di).setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminDashboardLabel;
    private javax.swing.JPanel admin_bodyPanel;
    private javax.swing.JPanel admin_headerPanel;
    private javax.swing.JLabel backLabel;
    private javax.swing.JButton createAccBtn;
    private javax.swing.JPanel dashboardPanel;
    private javax.swing.JButton depositAccBtn;
    private javax.swing.JButton startServerBtn;
    // End of variables declaration//GEN-END:variables
}
