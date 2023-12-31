package banking.system;

import java.sql.*;
import javax.swing.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Hp
 */
public class Instant_Payment extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    String accountNum="";
    String profile="";
    public Instant_Payment(String acc,String pp) {
        accountNum=acc;
        profile = pp;
    	initComponents();
    }
    
     public String currentdateTime(){
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return  dtf.format(now);
    }
//    public Instant_Payment2() {
//        initComponents();
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pay_bodyPanel = new javax.swing.JPanel();
        pay_headerPanel = new javax.swing.JPanel();
        Instant_payment = new javax.swing.JLabel();
        backLabel = new javax.swing.JLabel();
        select_OrgLabel = new javax.swing.JLabel();
        orgNameField = new javax.swing.JTextField();
        org_listComboBox = new javax.swing.JComboBox<>();
        accountField = new javax.swing.JTextField();
        select_accountLabel = new javax.swing.JLabel();
        select_amountLabel = new javax.swing.JLabel();
        amountField = new javax.swing.JTextField();
        purposeField = new javax.swing.JTextField();
        select_purposeLabel = new javax.swing.JLabel();
        SubmitPayBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pay_bodyPanel.setBackground(new java.awt.Color(156, 189, 238));

        pay_headerPanel.setBackground(new java.awt.Color(70, 100, 168));

        Instant_payment.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Instant_payment.setForeground(new java.awt.Color(241, 240, 240));
        Instant_payment.setText("Instant Payment");

        javax.swing.GroupLayout pay_headerPanelLayout = new javax.swing.GroupLayout(pay_headerPanel);
        pay_headerPanel.setLayout(pay_headerPanelLayout);
        pay_headerPanelLayout.setHorizontalGroup(
            pay_headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pay_headerPanelLayout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(Instant_payment, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pay_headerPanelLayout.setVerticalGroup(
            pay_headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pay_headerPanelLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(Instant_payment, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        backLabel.setBackground(new java.awt.Color(255, 51, 51));
        backLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        backLabel.setForeground(new java.awt.Color(222, 0, 0));
        backLabel.setText("Back");
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelMouseClicked(evt);
            }
        });
        accountField.setText(accountNum);
        select_OrgLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        select_OrgLabel.setForeground(new java.awt.Color(0, 0, 51));
        select_OrgLabel.setText("Select Organization");

        org_listComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Addis Ababa Science and Technology University", "Addis Ababa University", "Adama Science And Technology University", "Hawassa University", "Jimma University" }));
        org_listComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                org_listComboBoxActionPerformed(evt);
            }
        });

        select_accountLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        select_accountLabel.setForeground(new java.awt.Color(0, 0, 51));
        select_accountLabel.setText("Account Number");

        select_amountLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        select_amountLabel.setForeground(new java.awt.Color(0, 0, 51));
        select_amountLabel.setText("Amount");

        select_purposeLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        select_purposeLabel.setForeground(new java.awt.Color(0, 0, 51));
        select_purposeLabel.setText("Purpose");

        SubmitPayBtn.setBackground(new java.awt.Color(0, 153, 153));
        SubmitPayBtn.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        SubmitPayBtn.setForeground(new java.awt.Color(255, 255, 255));
        SubmitPayBtn.setText("PAY");
        SubmitPayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitPayBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pay_bodyPanelLayout = new javax.swing.GroupLayout(pay_bodyPanel);
        pay_bodyPanel.setLayout(pay_bodyPanelLayout);
        pay_bodyPanelLayout.setHorizontalGroup(
            pay_bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pay_headerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pay_bodyPanelLayout.createSequentialGroup()
                .addGroup(pay_bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pay_bodyPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pay_bodyPanelLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(pay_bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(select_OrgLabel)
                            .addComponent(select_accountLabel)
                            .addComponent(select_amountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(select_purposeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(pay_bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(org_listComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(orgNameField)
                            .addComponent(amountField)
                            .addComponent(accountField)
                            .addComponent(purposeField, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(155, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pay_bodyPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SubmitPayBtn)
                .addGap(90, 90, 90))
        );
        pay_bodyPanelLayout.setVerticalGroup(
            pay_bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pay_bodyPanelLayout.createSequentialGroup()
                .addComponent(pay_headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backLabel)
                .addGap(20, 20, 20)
                .addGroup(pay_bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orgNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(select_OrgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(org_listComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(pay_bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(select_accountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(pay_bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(select_amountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pay_bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(purposeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(select_purposeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(61, 61, 61)
                .addComponent(SubmitPayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pay_bodyPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pay_bodyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitPayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
        	Class.forName("com.mysql.cj.jdbc.Driver");
    		System.out.println("driver loaded");
    		Connection conn= DriverManager.getConnection("jdbc:mysql://192.168.43.86:3306/banking_system","client","cl@#12_nt");
    		System.out.println("database connected");
    		
                String Org_name = orgNameField.getText();
//                System.out.println(Org_name);
                String sqlorg = "select Org_Account from organization where Org_Name = '" + Org_name+"'";
                PreparedStatement orgst = conn.prepareStatement(sqlorg);
                ResultSet orgsl2=orgst.executeQuery(sqlorg);
//                System.out.println("asda");
                if(orgsl2.next()){
                    String Org_account =orgsl2.getString("Org_Account");
                  
    		String amnt = amountField.getText();
                String account_num = accountField.getText();
                int amntInt= Integer.parseInt(amnt);
//                System.out.println("error getting");

                String sql2 = "select accountbalance from account where accountnumber = " + account_num+"";
                PreparedStatement ptstmt = conn.prepareStatement(sql2);

                ResultSet rs = ptstmt.executeQuery(sql2);
            
                if(rs.next()){
                    String accbalance= rs.getString("accountbalance");
                    int accbalanceInt= Integer.parseInt(accbalance);
                
                    int leftover = accbalanceInt - amntInt;
            
                    String sql3= "Update account SET accountbalance = "+leftover+" where accountnumber = "+ account_num+"";
                    PreparedStatement pt = conn.prepareStatement(sql3);
                    if(accbalanceInt < amntInt){
                        JOptionPane.showMessageDialog(null,"Account has Insufficient Amount!!!");
                    }
                    else{
                        pt.execute();
                        
            
            String sqorgdep = "select * from organization where Org_Account ="+Org_account+"";
           
            PreparedStatement rtstorg = conn.prepareStatement(sqorgdep);
           
            ResultSet rsl2org=rtstorg.executeQuery(sqorgdep);
            if(rsl2org.next()){
            String Raccountblc =rsl2org.getString("Org_Balance");
            int Rtotalaccountblc= Integer.parseInt(Raccountblc) + amntInt;
            String sql4="update organization SET Org_Balance = "+Rtotalaccountblc+" WHERE Org_Account = " + Org_account;
            PreparedStatement ptmt2 = conn.prepareStatement(sql4);
            ptmt2.execute();
            }
                
//                    System.out.println("before transaction");    
                        
                String transql ="insert into transaction (Account_num,Amount,Status,To_Or_From_Acc,Reason,Date) values(?,?,?,?,?,?)";
                PreparedStatement transacstmt = conn.prepareStatement(transql);

                    transacstmt.setString(1, accountNum);
                    transacstmt.setInt(2, amntInt);
                    transacstmt.setString(4, Org_account);
                    transacstmt.setString(3, "Debit");
                    transacstmt.setString(5, "Instant Payment");
                    transacstmt.setString(6, currentdateTime());

                    transacstmt.executeUpdate();
//                    System.out.println("before action");
                String sql = "insert into transaction (Account_num,Amount,Status,To_Or_From_Acc,Reason,Date) values(?,?,?,?,?,?)";
                    PreparedStatement ptst= conn.prepareStatement(sql);
                    
                    ptst.setString(4, accountField.getText());
                    ptst.setString(2, amountField.getText());
                    ptst.setString(1, Org_account);
                    ptst.setString(3, "Credit");
                    ptst.setString(5, purposeField.getText());
                    ptst.setString(6, currentdateTime());

                    ptst.executeUpdate();
                
            JOptionPane.showMessageDialog(null, "Amount has been transferred Successfully!");
            conn.close();
            }
                }
                }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error while establishing connection!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void org_listComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_org_listComboBoxActionPerformed
        // TODO add your handling code here:
        String selectedValue= org_listComboBox.getSelectedItem().toString();
        orgNameField.setText(selectedValue);
    }//GEN-LAST:event_org_listComboBoxActionPerformed

    private void backLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseClicked
        // TODO add your handling code here:
        Dashboard obj = new Dashboard(accountNum,profile);
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_backLabelMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
//        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Instant_payment;
    private javax.swing.JButton SubmitPayBtn;
    private javax.swing.JTextField accountField;
    private javax.swing.JTextField amountField;
    private javax.swing.JLabel backLabel;
    private javax.swing.JTextField orgNameField;
    private javax.swing.JComboBox<String> org_listComboBox;
    private javax.swing.JPanel pay_bodyPanel;
    private javax.swing.JPanel pay_headerPanel;
    private javax.swing.JTextField purposeField;
    private javax.swing.JLabel select_OrgLabel;
    private javax.swing.JLabel select_accountLabel;
    private javax.swing.JLabel select_amountLabel;
    private javax.swing.JLabel select_purposeLabel;
    // End of variables declaration//GEN-END:variables
}
