/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryManagementPakage;

/**
 *
 * @author user
 */
public class MainUserInterface extends javax.swing.JFrame {

    /**
     * Creates new form MainUserInterface
     */
    public MainUserInterface() {
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
        jLabel2 = new javax.swing.JLabel();
        categoryBtn = new javax.swing.JButton();
        authorBtn = new javax.swing.JButton();
        PubBtn = new javax.swing.JButton();
        bookBtn = new javax.swing.JButton();
        memBtn = new javax.swing.JButton();
        issueBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        returnBtn1 = new javax.swing.JButton();
        teachRequest = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Edwardian Script ITC", 1, 24)); // NOI18N
        jLabel1.setText("Library");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Edwardian Script ITC", 1, 24)); // NOI18N
        jLabel2.setText("Management");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 181, -1));

        categoryBtn.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        categoryBtn.setText("Category");
        categoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryBtnActionPerformed(evt);
            }
        });
        getContentPane().add(categoryBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 106, 181, 37));

        authorBtn.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        authorBtn.setText("Author");
        authorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorBtnActionPerformed(evt);
            }
        });
        getContentPane().add(authorBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 181, 37));

        PubBtn.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        PubBtn.setText("Publisher");
        PubBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PubBtnActionPerformed(evt);
            }
        });
        getContentPane().add(PubBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 181, 37));

        bookBtn.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        bookBtn.setText("Book");
        bookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookBtnActionPerformed(evt);
            }
        });
        getContentPane().add(bookBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 181, 37));

        memBtn.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        memBtn.setText("Member");
        memBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memBtnActionPerformed(evt);
            }
        });
        getContentPane().add(memBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 181, 37));

        issueBtn.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        issueBtn.setText("Issue");
        issueBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueBtnActionPerformed(evt);
            }
        });
        getContentPane().add(issueBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 181, 37));

        logoutBtn.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        getContentPane().add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 181, 37));

        backbtn.setIcon(new javax.swing.ImageIcon("/home/rakibul/Documents/LibraryManagement/backIcon.png")); // NOI18N
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        getContentPane().add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 38, 31));

        returnBtn1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        returnBtn1.setText("Return");
        returnBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(returnBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 181, 37));

        teachRequest.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        teachRequest.setText("Teachers Request");
        teachRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teachRequestActionPerformed(evt);
            }
        });
        getContentPane().add(teachRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 181, 37));

        setSize(new java.awt.Dimension(550, 473));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        new OpenPage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backbtnActionPerformed

    private void categoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryBtnActionPerformed
        // TODO add your handling code here:
        new Category().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_categoryBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        new OpenPage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void bookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookBtnActionPerformed
        // TODO add your handling code here:
        new Book().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bookBtnActionPerformed

    private void authorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorBtnActionPerformed
        // TODO add your handling code here:
        new Author().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_authorBtnActionPerformed

    private void PubBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PubBtnActionPerformed
        // TODO add your handling code here:
        new Publisher().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_PubBtnActionPerformed

    private void memBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memBtnActionPerformed
        // TODO add your handling code here:
        new Member().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_memBtnActionPerformed

    private void issueBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueBtnActionPerformed
        // TODO add your handling code here:
        new IssueBook().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_issueBtnActionPerformed

    private void returnBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBtn1ActionPerformed
        // TODO add your handling code here:
        new ReturnBook().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_returnBtn1ActionPerformed

    private void teachRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teachRequestActionPerformed
        // TODO add your handling code here:
        new TeacherIssueBooks().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_teachRequestActionPerformed

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
            java.util.logging.Logger.getLogger(MainUserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUserInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PubBtn;
    private javax.swing.JButton authorBtn;
    private javax.swing.JButton backbtn;
    private javax.swing.JButton bookBtn;
    private javax.swing.JButton categoryBtn;
    private javax.swing.JButton issueBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton memBtn;
    private javax.swing.JButton returnBtn1;
    private javax.swing.JButton teachRequest;
    // End of variables declaration//GEN-END:variables
}
