/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letsfightcovid;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class admPlasma1 extends javax.swing.JFrame {

    /**
     * Creates new form admPlasma
     */
    public admPlasma1() {
        initComponents();
         show_user();
    }
    
     public ArrayList<UserPlasma> userList() {
        ArrayList<UserPlasma> userList = new ArrayList<>();

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=Covid;user=sa;password=covid12345";

            Connection con = DriverManager.getConnection(url);
            String query1 = "SELECT  * FROM Plasma";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            UserPlasma user;
            while (rs.next()) {
                user = new UserPlasma(rs.getInt("plasma_ID"), rs.getString("donor_name"), rs.getString("donor_address"), rs.getString("blood_group"), rs.getString("donor_contact"), rs.getInt("plasma_availability"));
                userList.add(user);

            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);

        }
        return userList;
    }

    public void show_user() {
        ArrayList<UserPlasma> list = userList();
        DefaultTableModel model = (DefaultTableModel) jTable2Plasma.getModel();
        Object[] row = new Object[6];

        for (int i = 0; i < list.size(); i++) {

            row[0] = list.get(i).getPlasma_ID();
            row[1] = list.get(i).getDonor_name();
            row[2] = list.get(i).getDonor_address();
            row[3] = list.get(i).getBlood_group();
            row[4] = list.get(i).getDonor_contact();
            row[5] = list.get(i).getPlasma_availability();
            model.addRow(row);

        }

    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2Plasma = new javax.swing.JTable();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jTable2Plasma.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "plasma_ID", "donor_name", "donor_address", "blood_group", "donor_contact", "plasma_availability"
            }
        ));
        jScrollPane1.setViewportView(jTable2Plasma);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(320, 100, 710, 270);
        jPanel1.add(jTextField6);
        jTextField6.setBounds(180, 80, 120, 22);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Plasma ID:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 80, 100, 20);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setText("Update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(370, 430, 110, 40);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(153, 0, 0));
        jButton4.setText("Back To Menu");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(860, 440, 160, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(200, 430, 110, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Insert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(40, 430, 120, 40);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(180, 330, 120, 22);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4);
        jTextField4.setBounds(180, 280, 120, 22);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(180, 230, 120, 22);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(180, 180, 120, 22);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(180, 130, 120, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Plasma Availability:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 330, 140, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Donor Contact:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 280, 120, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Blood Group:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 230, 110, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Donor Address:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 180, 120, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Donar Name:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 130, 110, 20);

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Plasma Information");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(330, 30, 430, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BgPic.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1060, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1058, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost:1433;databaseName=Covid;user=sa;password=covid12345";
        
        Connection con = DriverManager.getConnection(url);
        int row =jTable2Plasma.getSelectedRow();
        String value = (jTable2Plasma.getModel().getValueAt(row, 0).toString());
        String query1 = "DELETE FROM Plasma where plasma_ID="+value;
        PreparedStatement pst = con.prepareStatement(query1);
        pst.executeUpdate();
        DefaultTableModel model = (DefaultTableModel)jTable2Plasma.getModel();
        model.setRowCount(0);
        
    show_user();
        JOptionPane.showMessageDialog(null,"Deleted Successfully");
        
         }
         catch(Exception e){
        
        JOptionPane.showMessageDialog(null,e);        
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         try{
              Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost:1433;databaseName=Covid;user=sa;password=covid12345";
        
            Connection con = DriverManager.getConnection(url);
            String query1="insert into Plasma(donor_name,donor_address,blood_group,donor_contact,plasma_availability)values(?,?,?,?,?)";
            PreparedStatement ps= con.prepareStatement(query1);
            ps.setString(1, jTextField1.getText());
            ps.setString(2, jTextField2.getText());
            ps.setString(3, jTextField3.getText());
            ps.setString(4, jTextField4.getText());
            ps.setString(5, jTextField5.getText());
            ps.executeUpdate();
            
            DefaultTableModel model=(DefaultTableModel)jTable2Plasma.getModel();
            model.setRowCount(0);
            show_user();
            JOptionPane.showMessageDialog(null, "Data Inserted Succesfully");
        
        }catch(Exception e){
        
            JOptionPane.showMessageDialog(null, e);
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         MenuAdm m = new MenuAdm();
        m.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         try{
              Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost:1433;databaseName=Covid;user=sa;password=covid12345";
        
            Connection con = DriverManager.getConnection(url);
             int row =jTable2Plasma.getSelectedRow();
             String value = (jTable2Plasma.getModel().getValueAt(row, 0).toString());
            String query1="Update  Plasma Set donor_name=?,donor_address=?,blood_group=?,donor_contact=?,plasma_availability=? where plasma_ID="+value;
            PreparedStatement ps= con.prepareStatement(query1);
            //ps.setString(6, jTextField6.getText());
            ps.setString(1, jTextField1.getText());
            ps.setString(2, jTextField2.getText());
            ps.setString(3, jTextField3.getText());
            ps.setString(4, jTextField4.getText());
            ps.setString(5, jTextField5.getText());
            ps.executeUpdate();
            
           DefaultTableModel model = (DefaultTableModel)jTable2Plasma.getModel();
           model.setRowCount(0);
        
        show_user();
        JOptionPane.showMessageDialog(null,"Updated Successfully");
        
        }catch(Exception e){
        
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(admPlasma1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admPlasma1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admPlasma1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admPlasma1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admPlasma1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2Plasma;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}