/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vehicle;

import java.awt.Frame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Seetha
 */
public class FullVehicleDetails extends javax.swing.JFrame {

    /**
     * Creates new form FullVehicleDetails
     */
    public FullVehicleDetails() {
        initComponents();
        update_table();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        refreshbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vehicle List");
        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(1000, 650));
        setPreferredSize(new java.awt.Dimension(1000, 670));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setFont(new java.awt.Font("Gadugi", 1, 11)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(0, 0, 51));
        jTable1.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Vehicle ID", "Vehicle Type", "Vehicle No", "Model", "Fuel Type", "Sheats", "Year"
            }
        ));
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 18, 860, 460));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 910, 490));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 700));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Elephant", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Company All Vehicle Details List");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 12, 670, 60));

        jLabel2.setFont(new java.awt.Font("Source Serif Pro Semibold", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Search Vehicle Number");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 170, 30));

        txtsearch.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });
        jPanel2.add(txtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, 160, 30));

        refreshbtn.setBackground(new java.awt.Color(51, 51, 51));
        refreshbtn.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        refreshbtn.setForeground(new java.awt.Color(255, 255, 255));
        refreshbtn.setText("Refresh");
        refreshbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshbtnMouseClicked(evt);
            }
        });
        jPanel2.add(refreshbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 70, 120, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vehicle/2a1689998dfde4bb32e7f4e3f55be67344ce795b-1200x630.jpg"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 640));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 634));

        getAccessibleContext().setAccessibleName("Full Vehicle Details");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        int c;
        String arr[] = {};
        try {
            // TODO add your handling code here:
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Tour_Management_DataBase", "root", "");

            String sql = "select * from registration where Vehicle_No=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            String text = txtsearch.getText();
            pstmt.setString(1, text);

            ResultSet risults = pstmt.executeQuery();
            ResultSetMetaData Risults = risults.getMetaData();
            c = Risults.getColumnCount();
            

            DefaultTableModel Df = (DefaultTableModel) jTable1.getModel();
            Df.setRowCount(0);
            
                while (risults.next()) {

                    Vector v2 = new Vector();
                    for (int a = 1; a <= c; a++) {
                        v2.add(risults.getInt("ID"));
                        v2.add(risults.getString("Vehicle_Type"));
                        v2.add(risults.getString("Vehicle_No"));
                        v2.add(risults.getString("Model"));
                        v2.add(risults.getString("Type_of_Fuel"));
                        v2.add(risults.getInt("Sheats"));
                        v2.add(risults.getInt("Year"));
                    }
                    Df.addRow(v2);
                }
                
                int row = Df.getRowCount();
                if(row==0){
                    Frame f=null;
                    JOptionPane.showMessageDialog(f, "No results");
                }
           
            conn.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Vehicle_RegistrationInterface.class.getName()).log(Level.SEVERE, null, ex);
//            ex.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(Vehicle_RegistrationInterface.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_txtsearchActionPerformed

    private void refreshbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshbtnMouseClicked
        update_table();
        txtsearch.setText("");
    }//GEN-LAST:event_refreshbtnMouseClicked

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
            java.util.logging.Logger.getLogger(FullVehicleDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FullVehicleDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FullVehicleDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FullVehicleDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FullVehicleDetails().setVisible(true);
            }
        });
    }

    private void update_table() {
        int c;
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/Tour_Management_DataBase", "root", "");
            String sql1 = "select * from registration";
            PreparedStatement pstmt1 = conn1.prepareStatement(sql1);

            ResultSet risults = pstmt1.executeQuery();
            ResultSetMetaData Risults = risults.getMetaData();
            c = Risults.getColumnCount();

            DefaultTableModel Df = (DefaultTableModel) jTable1.getModel();
            Df.setRowCount(0);

            while (risults.next()) {
                Vector v2 = new Vector();
                for (int a = 1; a <= c; a++) {
                    v2.add(risults.getInt("ID"));
                    v2.add(risults.getString("Vehicle_Type"));
                    v2.add(risults.getString("Vehicle_No"));
                    v2.add(risults.getString("Model"));
                    v2.add(risults.getString("Type_of_Fuel"));
                    v2.add(risults.getInt("Sheats"));
                    v2.add(risults.getInt("Year"));
                }
                Df.addRow(v2);
            }
            conn1.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton refreshbtn;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}