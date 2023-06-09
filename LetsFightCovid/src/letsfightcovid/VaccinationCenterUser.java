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
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author USER
 */
public class VaccinationCenterUser extends javax.swing.JFrame {

    /**
     * Creates new form VaccinationCenter
     */
    public VaccinationCenterUser() {
        initComponents();
        show_user();
        
    }
    
    
    public ArrayList<UserVaccine1> userList()  {
        ArrayList<UserVaccine1> userList = new ArrayList<>();
        try {
            // TODO code application logic here

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=Covid;user=sa;password=covid12345";
            
            Connection connection = DriverManager.getConnection(url);
            String sql = "Select * from VaccinationCenter ";
            PreparedStatement pst = connection.prepareStatement(sql);
            
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                UserVaccine1 user = new UserVaccine1(rs.getInt("center_ID"), rs.getString("hospital_name"), rs.getString("center_location"), rs.getString("available_vaccine"));
                userList.add(user);
            
            }
            
        } catch(Exception e){
       JOptionPane.showMessageDialog(null, e);
       }
       return userList;

    }
    public void show_user(){
        ArrayList<UserVaccine1> list =userList();
        DefaultTableModel model = (DefaultTableModel)tablevaccine.getModel();
        Object[] row = new Object[4];
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).getcenter_ID();
            row[1]=list.get(i).gethospital_name();
            row[2]=list.get(i).getcenter_location();
            row[3]=list.get(i).getavailable_vaccine();
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

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablevaccine = new javax.swing.JTable();
        available_vaccine = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        hospital_name = new javax.swing.JTextField();
        center_location = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 0, 0));
        jButton1.setText("Back To Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(40, 490, 160, 40);

        tablevaccine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CENTER ID", "HOSPITAL NAME", "CENTER LOCATION", "AVAILABLE VACCINE"
            }
        ));
        tablevaccine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablevaccineMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablevaccine);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(62, 110, 1030, 270);
        jPanel2.add(available_vaccine);
        available_vaccine.setBounds(910, 430, 170, 40);

        jLabel5.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("AVAILABLE VACCINE :");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(730, 430, 168, 19);

        hospital_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospital_nameActionPerformed(evt);
            }
        });
        jPanel2.add(hospital_name);
        hospital_name.setBounds(210, 430, 170, 40);
        jPanel2.add(center_location);
        center_location.setBounds(550, 430, 170, 40);

        jLabel4.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CENTER LOCATION :");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(390, 430, 145, 19);

        jLabel3.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("HOSPITAL NAME :");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(60, 430, 130, 19);

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 38)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("VACCINATION CENTER INFORMATION");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(250, 20, 720, 90);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BgPic.jpg"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 1150, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1147, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablevaccineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablevaccineMouseClicked
        int i = tablevaccine.getSelectedRow();
        TableModel model = tablevaccine.getModel();
        hospital_name.setText(model.getValueAt(i,1).toString());
        center_location.setText(model.getValueAt(i,2).toString());
        available_vaccine.setText(model.getValueAt(i,3).toString());
        
        // TODO add your handling code here:
    }//GEN-LAST:event_tablevaccineMouseClicked

    private void hospital_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospital_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hospital_nameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         Menu2 m = new Menu2();
        m.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(VaccinationCenterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VaccinationCenterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VaccinationCenterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VaccinationCenterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VaccinationCenterUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField available_vaccine;
    private javax.swing.JTextField center_location;
    private javax.swing.JTextField hospital_name;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablevaccine;
    // End of variables declaration//GEN-END:variables




   
}
