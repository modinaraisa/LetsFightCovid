/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letsfightcovid;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Richi
 */
public class registerForm1 extends javax.swing.JFrame {

    /**
     * Creates new form registerForm
     */
    public registerForm1() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        userEmail = new javax.swing.JTextField();
        userName = new javax.swing.JTextField();
        userAddress = new javax.swing.JTextField();
        userContact = new javax.swing.JTextField();
        userAge = new javax.swing.JTextField();
        passwords = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Stencil", 0, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("    Registration  Form");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 23, 702, 83));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Name");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 117, 65, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 182, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Address");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(" Phone Number");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 315, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Age");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 387, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Password");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 470, -1, -1));

        userEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(userEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 184, 312, 29));

        userName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 117, 312, 29));
        getContentPane().add(userAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 250, 312, 29));
        getContentPane().add(userContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 319, 312, 29));
        getContentPane().add(userAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 389, 312, 33));

        passwords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordsActionPerformed(evt);
            }
        });
        getContentPane().add(passwords, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 470, 312, 29));

        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 537, 180, 50));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(766, 536, 130, 50));

        jPanel1.setLayout(null);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 150, 120);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BgPic.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1040, 600);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=Covid;user=sa;password=covid12345";

            Connection con = DriverManager.getConnection(url);

            String sql = "INSERT INTO MEMBERS VALUES ('"+userName.getText()+"','"+userEmail.getText()+"','"+userAddress.getText()+"','"+userContact.getText()+"','"+userAge.getText()+"','"+passwords.getText()+"')";

            PreparedStatement pst = con.prepareStatement(sql);

            if(userName.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"You have not entered your UserName!");
            }
            else if(userEmail.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"You have not entered your Member Date!");
            }
            else if(userAddress.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"You have not entered your Address!");
            }
            else if(userContact.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"You have not entered your Phone Number!");
            }
            else if(userAge.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"You have not entered your Age!");
            }
            else if(passwords.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"You have not entered your Password!");
            }

            else if(userName.getText().equals("") && userEmail.getText().equals("") && userAddress.getText().equals("") && userContact.getText().equals("") && userAge.getText().equals("")&& passwords.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Incorrect Information ");

            }
            else
            {
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null,"Successfully Registered");
                new loginpage1().setVisible(true);
                this.dispose();
            }

        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
        

        //	this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       // new loginSignup().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void passwordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordsActionPerformed

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
            java.util.logging.Logger.getLogger(registerForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registerForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registerForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registerForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registerForm1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField passwords;
    private javax.swing.JTextField userAddress;
    private javax.swing.JTextField userAge;
    private javax.swing.JTextField userContact;
    private javax.swing.JTextField userEmail;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}
