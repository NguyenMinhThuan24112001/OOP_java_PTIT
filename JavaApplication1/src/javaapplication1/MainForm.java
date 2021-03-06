
package javaapplication1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Admin
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        setLocationRelativeTo(this);
        setLayout(null);
        bt1.setEnabled(false);
        bt2.setEnabled(false);
        bt3.setEnabled(true);
        mLamlai.setEnabled(false);
        mTinhtoan.setEnabled(false);
        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               txtn1.setText("");
               txtn2.setText("");
            }
        });
        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n1=Integer.parseInt(txtn1.getText());
                int n2=Integer.parseInt(txtn2.getText());
                lblnkq.setText("Tong "+(n1+n2));
            }
        });
        txtn1.getDocument().addDocumentListener(new DocumentListener(){
            @Override
            public void insertUpdate(DocumentEvent e) {
                check();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                check();

            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
         });
        txtn2.getDocument().addDocumentListener(new DocumentListener(){
            @Override
            public void insertUpdate(DocumentEvent e) {
                check();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                check();

            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
         });
       bt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               if(JOptionPane.showConfirmDialog(null,"Co thoat khong","Thoat", JOptionPane.YES_NO_OPTION)
                    ==JOptionPane.YES_OPTION){
                System.exit(0);
            }
            }
       });
    }
    public void check() { 
        String s1=txtn1.getText();
        String s2=txtn2.getText();
        if(s1.isEmpty() && s2.isEmpty())
            bt1.setEnabled(false);// n??t nh???p l???i m??? ??i
            mLamlai.setEnabled(false);
        if(!s1.isEmpty() || !s2.isEmpty())
            bt1.setEnabled(true);
            mLamlai.setEnabled(true);
        String reg ="\\d+";
        if(s1.matches(reg)&&s2.matches(reg)){
            bt2.setEnabled(true);
            mTinhtoan.setEnabled(true);
        }
        else{
            bt2.setEnabled(false);
            mTinhtoan.setEnabled(false);
        }
        //return super.checkImage(image, observer); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbln1 = new javax.swing.JLabel();
        lbln2 = new javax.swing.JLabel();
        txtn1 = new javax.swing.JTextField();
        txtn2 = new javax.swing.JTextField();
        lblnkq = new javax.swing.JLabel();
        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu1 = new javax.swing.JMenu();
        mLamlai = new javax.swing.JMenuItem();
        mTinhtoan = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        menu2 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("T??nh to??n");

        lbln1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbln1.setForeground(new java.awt.Color(51, 51, 51));
        lbln1.setText("Nhap vao so thu 1");

        lbln2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbln2.setForeground(new java.awt.Color(51, 51, 51));
        lbln2.setText("Nhap vao so thu 2");

        txtn1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtn1.setForeground(new java.awt.Color(255, 51, 51));
        txtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtn2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtn2.setForeground(new java.awt.Color(255, 51, 51));
        txtn2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblnkq.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblnkq.setForeground(new java.awt.Color(51, 51, 51));
        lblnkq.setText("K???t qu???");

        bt1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt1.setForeground(new java.awt.Color(51, 51, 51));
        bt1.setText("Nhap lai");

        bt2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt2.setForeground(new java.awt.Color(51, 51, 51));
        bt2.setText("Tinh toan");

        bt3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt3.setForeground(new java.awt.Color(51, 51, 51));
        bt3.setText("Dong");

        menu1.setText("Thuc Hien");

        mLamlai.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mLamlai.setText("Lam lai");
        mLamlai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mLamlaiActionPerformed(evt);
            }
        });
        menu1.add(mLamlai);

        mTinhtoan.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mTinhtoan.setText("Tinh Toan");
        mTinhtoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mTinhtoanActionPerformed(evt);
            }
        });
        menu1.add(mTinhtoan);
        menu1.add(jSeparator1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem3.setText("Thoat");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menu1.add(jMenuItem3);

        jMenuBar1.add(menu1);

        menu2.setText("Dat Mau");

        jMenu1.setText("Dat mau chu");

        jMenuItem4.setText("Mau do");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Mau xanh");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("Mau vang");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        menu2.add(jMenu1);

        jMenu2.setText("Dat mau nen");

        jMenuItem7.setText("Mau xanh nhat");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem8.setText("Mau Vang nhat");
        jMenu2.add(jMenuItem8);

        menu2.add(jMenu2);

        jMenuBar1.add(menu2);

        jMenu3.setText("Mo Form khac");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Mo Form 1");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbln1)
                            .addComponent(lbln2))
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtn2, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addComponent(txtn1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(lblnkq))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(bt1)
                        .addGap(98, 98, 98)
                        .addComponent(bt2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(bt3)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbln1)
                    .addComponent(txtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbln2)
                    .addComponent(txtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(lblnkq)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt1)
                    .addComponent(bt2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt3)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mLamlaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mLamlaiActionPerformed
                // TODO add your handling code here:
                  txtn1.setText("");
               txtn2.setText("");
    }//GEN-LAST:event_mLamlaiActionPerformed

    private void mTinhtoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mTinhtoanActionPerformed
        // TODO add your handling code here:
            int n1=Integer.parseInt(txtn1.getText());
            int n2=Integer.parseInt(txtn2.getText());
            lblnkq.setText("Tong  " + (n1+n2));
    }//GEN-LAST:event_mTinhtoanActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(null,"Co thoat khong","Thoat", JOptionPane.YES_NO_OPTION)
                    ==JOptionPane.YES_OPTION){
                System.exit(0);
            }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        lblnkq.setForeground(Color.red);
        lbln1.setForeground(Color.red);
        lbln2.setForeground(Color.red);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
         lblnkq.setForeground(Color.blue);
        lbln1.setForeground(Color.blue);
        lbln2.setForeground(Color.blue);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
         lblnkq.setForeground(Color.yellow);
        lbln1.setForeground(Color.yellow);
        lbln2.setForeground(Color.yellow);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        txtn1.setBackground(Color.pink);
         txtn2.setBackground(Color.pink);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        Main1 m = new Main1();
        //k??ch ho???t main 1 d??ng setvisible
        m.setVisible(true);
                
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lbln1;
    private javax.swing.JLabel lbln2;
    private javax.swing.JLabel lblnkq;
    private javax.swing.JMenuItem mLamlai;
    private javax.swing.JMenuItem mTinhtoan;
    private javax.swing.JMenu menu1;
    private javax.swing.JMenu menu2;
    private javax.swing.JTextField txtn1;
    private javax.swing.JTextField txtn2;
    // End of variables declaration//GEN-END:variables

//    private static class DoucumentListener implements DocumentListener {
//
//        public DoucumentListener() {
//        }
//    }
}
