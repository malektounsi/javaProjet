/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.autoplus.frame;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;

/**
 *
 * @author malek
 */
public class LoginGUI extends javax.swing.JFrame {
    int xMouse;
    int yMouse;
    Connection con=null;
    ResultSet rs=null;
    PreparedStatement ps=null;
    /**
     * Creates new form LoginGUI
     */
    public LoginGUI() {
        initComponents();
        con=ConnexionBd.Connexion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        back = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        backk = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        txtlogin = new javax.swing.JTextField();
        resize = new javax.swing.JLabel();
        MouveJframe = new javax.swing.JLabel();
        Description = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        back1 = new javax.swing.JLabel();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/autoplus/images/boutton_large.png"))); // NOI18N

        jTextField6.setText("jTextField6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setText("login");
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 70, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/autoplus/images/boutton_large.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel3MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 320, 380, 40));

        backk.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        backk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backk.setText("password");
        getContentPane().add(backk, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 70, 40));

        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 20, 20));

        jPasswordField1.setBackground(new java.awt.Color(19, 116, 225));
        jPasswordField1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField1.setBorder(null);
        jPasswordField1.setCaretColor(new java.awt.Color(204, 204, 255));
        jPasswordField1.setSelectionColor(new java.awt.Color(255, 204, 255));
        jPasswordField1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPasswordField1MouseMoved(evt);
            }
        });
        jPasswordField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPasswordField1MouseExited(evt);
            }
        });
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 310, 30));

        txtlogin.setBackground(new java.awt.Color(19, 116, 225));
        txtlogin.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtlogin.setForeground(new java.awt.Color(255, 255, 255));
        txtlogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtlogin.setBorder(null);
        txtlogin.setCaretColor(new java.awt.Color(204, 204, 255));
        txtlogin.setOpaque(false);
        txtlogin.setSelectionColor(new java.awt.Color(255, 204, 255));
        txtlogin.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                txtloginMouseMoved(evt);
            }
        });
        txtlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtloginMouseExited(evt);
            }
        });
        txtlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtloginActionPerformed(evt);
            }
        });
        txtlogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtloginKeyPressed(evt);
            }
        });
        getContentPane().add(txtlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 310, 40));

        resize.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        resize.setForeground(new java.awt.Color(255, 255, 255));
        resize.setText("-");
        resize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resizeMouseClicked(evt);
            }
        });
        getContentPane().add(resize, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 30, 10));

        MouveJframe.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MouveJframeMouseDragged(evt);
            }
        });
        MouveJframe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MouveJframeMousePressed(evt);
            }
        });
        getContentPane().add(MouveJframe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 30));

        Description.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Description.setForeground(new java.awt.Color(0, 153, 51));
        Description.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Description, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 400, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/autoplus/images/loginp.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 450));

        jTextField3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setBorder(null);
        jTextField3.setCaretColor(new java.awt.Color(204, 204, 255));
        jTextField3.setOpaque(false);
        jTextField3.setSelectionColor(new java.awt.Color(204, 204, 255));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 310, 40));

        jTextField4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setBorder(null);
        jTextField4.setCaretColor(new java.awt.Color(204, 204, 255));
        jTextField4.setOpaque(false);
        jTextField4.setSelectionColor(new java.awt.Color(204, 204, 255));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 320, 40));

        jTextField5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setBorder(null);
        jTextField5.setCaretColor(new java.awt.Color(204, 204, 255));
        jTextField5.setOpaque(false);
        jTextField5.setSelectionColor(new java.awt.Color(204, 204, 255));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 310, 40));

        jTextField7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setBorder(null);
        jTextField7.setCaretColor(new java.awt.Color(204, 204, 255));
        jTextField7.setOpaque(false);
        jTextField7.setSelectionColor(new java.awt.Color(204, 204, 255));
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 310, 40));

        back1.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        back1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back1.setText("login");
        getContentPane().add(back1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 70, 40));

        setSize(new java.awt.Dimension(500, 452));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        ImageIcon img= new ImageIcon(getClass().getResource("boutton_hover.png"));
        jLabel3.setIcon(img);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
         ImageIcon img= new ImageIcon(getClass().getResource("boutton_large.png"));
        jLabel3.setIcon(img);
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
         ImageIcon img= new ImageIcon(getClass().getResource("boutton_pressed.png"));
        jLabel3.setIcon(img);
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseReleased
         ImageIcon img= new ImageIcon(getClass().getResource("boutton_hover.png"));
        jLabel3.setIcon(img);
    }//GEN-LAST:event_jLabel3MouseReleased

    private void txtloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtloginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtloginActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void txtloginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtloginKeyPressed
         ImageIcon img= new ImageIcon(getClass().getResource("backtxt.png"));
         back.setIcon(img);
    }//GEN-LAST:event_txtloginKeyPressed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
        
        ImageIcon img= new ImageIcon(getClass().getResource("backtxt.png"));
       backk.setIcon(img);
    }//GEN-LAST:event_jPasswordField1KeyPressed

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void resizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resizeMouseClicked
        this.setState(LoginGUI.ICONIFIED);
    }//GEN-LAST:event_resizeMouseClicked

    private void MouveJframeMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouveJframeMouseDragged
        int x= evt.getXOnScreen();
        int y= evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_MouveJframeMouseDragged

    private void MouveJframeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouveJframeMousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_MouveJframeMousePressed

    private void txtloginMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtloginMouseMoved
       Description.setText("Veuillez entrer votre login pour accéder à votre session");
    }//GEN-LAST:event_txtloginMouseMoved

    private void jPasswordField1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MouseMoved
        Description.setText("Veuillez entrer votre password pour accéder à votre session");
    }//GEN-LAST:event_jPasswordField1MouseMoved

    private void txtloginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtloginMouseExited
        Description.setText("");
    }//GEN-LAST:event_txtloginMouseExited

    private void jPasswordField1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MouseExited
        Description.setText("");
    }//GEN-LAST:event_jPasswordField1MouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        String requete= "select * from login_table where login=? and password=?";
        try{
            ps=con.prepareStatement(requete);
            ps.setString(1, txtlogin.getText());
            ps.setString(2, jPasswordField1.getText());
            rs=ps.executeQuery();
            if(rs.next()){
                System.out.println("correct login");
                dispose();
                new AcceulGui().setVisible(true);
            }
        }catch(Exception ex){
            System.out.println("EXception:"+ex);
           
        }
        Description.setForeground(Color.RED);
        Description.setText("Erreur");
         System.out.println("login failed");
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Description;
    private javax.swing.JLabel MouveJframe;
    private javax.swing.JLabel back;
    private javax.swing.JLabel back1;
    private javax.swing.JLabel backk;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel resize;
    private javax.swing.JTextField txtlogin;
    // End of variables declaration//GEN-END:variables
}
