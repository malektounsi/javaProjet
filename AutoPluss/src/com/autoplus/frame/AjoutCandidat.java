/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.autoplus.frame;

import java.awt.event.KeyEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import sun.swing.ImageIconUIResource;

/**
 *
 * @author malek
 */
public class AjoutCandidat extends javax.swing.JFrame {
    Connection con=null;
    ResultSet rs=null;
    PreparedStatement ps=null;
    public String sexe;
    public ImageIcon Format=null;
    int s=0;
    byte[] photo=null;
    /**
     * Creates new form AjoutCandidat
     */
    public AjoutCandidat() {
        initComponents();
        con=ConnexionBd.Connexion();
        Recuperer();
    }
    public void recept(){
        List_des_candidats ad= new List_des_candidats();
        String r=ad.re();
        if(r=="ah"){
            btnUpdate.setVisible(true);
            btnAdd.setVisible(false);
        }else{
            if(r=="a"){
                btnAdd.setVisible(true);
                btnUpdate.setVisible(false);
            }
        }
       
    }
    
    
    
    
    public void ClearData(){
        txtcin.setText("");
        txtnom.setText("");
        txtprenom.setText("");
        txtdateNais.setDate(null);
        txtage.setText("");
//        txtsexe.setText("");
        txtgsm.setText("");
        txtemail.setText("");
    }
       public void Recuperer(){
        List_des_candidats ls=new List_des_candidats();
        ls.Deplace();
        try{
           String rec =ls.getTableResult();
           String requet="select * from candidat_table where cin='"+rec+"'";
           ps=con.prepareStatement(requet);
           rs=ps.executeQuery();
           if(rs.next()){
               String t1=rs.getString("cin");
               txtcin.setText(t1);
               String t2=rs.getString("nomc");
               txtnom.setText(t2);
               String t3=rs.getString("prenomc");
               txtprenom.setText(t3);
               Date t4=rs.getDate("date_naissance");
               txtdateNais.setDate(t4);
               String t5=rs.getString("age");
               txtage.setText(t5);
               String t6=rs.getString("sexe");
               String vbn=t6;
               if(vbn.equals("Homme")){
                   jRadioButton1.setSelected(true);
                   sexe="Homme";
                }else
                   if(vbn.equals("femme")){
                       jRadioButton2.setSelected(true);
                       sexe="Femme";
                   }

//               txtsexe.setText(t6);
               String t7=rs.getString("gsm");
               txtgsm.setText(t7);
               String t8=rs.getString("email");
               txtemail.setText(t8);
               byte[]imagedata=rs.getBytes("image");
               Format = new ImageIcon(imagedata);
               image.setIcon(Format);
               
           }
        }catch(Exception ex){
            System.out.println(ex);
             
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        txtcin = new javax.swing.JTextField();
        txtnom = new javax.swing.JTextField();
        txtprenom = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        txtgsm = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        btnpath = new javax.swing.JButton();
        txtpath = new javax.swing.JTextField();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        image = new javax.swing.JLabel();
        txtdateNais = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("cin");

        jLabel2.setText("nom");

        jLabel3.setText("prenom");

        jLabel4.setText("date de naissance");

        jLabel5.setText("age");

        jLabel6.setText("sexe");

        jLabel7.setText("gsm");

        jLabel8.setText("E_mail");

        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        txtcin.setName("txtcin"); // NOI18N

        txtage.setEditable(false);
        txtage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtageMouseEntered(evt);
            }
        });

        txtgsm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtgsmKeyTyped(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Homme");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Femme");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        btnpath.setText("Images");
        btnpath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpathActionPerformed(evt);
            }
        });

        txtpath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpathActionPerformed(evt);
            }
        });

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/autoplus/images/img-landscape-photo-photography-picture-icon-12.png"))); // NOI18N
        jScrollPane1.setViewportView(image);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtdateNais.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtdateNais, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtprenom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                    .addComponent(txtnom, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtcin, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtage))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtgsm, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(txtemail))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtpath)
                        .addComponent(btnpath, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtcin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtprenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtdateNais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtgsm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnAdd)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtpath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnpath)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        Date actuelle= new Date();
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        String date=dateFormat.format(actuelle);
        String dc= date;
        try{
            String requete="insert into candidat_table (cin,nomc,prenomc,date_naissance,age,sexe,gsm,email,date_inscription,image) values(?,?,?,?,?,?,?,?,'"+dc+"',?)";
            ps= con.prepareStatement(requete);
            
           ps.setString(1,txtcin.getText());
           ps.setString(2, txtnom.getText());
            ps.setString(3, txtprenom.getText());
            ps.setString(4,((JTextField)txtdateNais.getDateEditor().getUiComponent()).getText());
            ps.setString(5, txtage.getText());
            ps.setString(6, sexe);
            ps.setString(7, txtgsm.getText());
            ps.setString(8, txtemail.getText());
            ps.setBytes(9,photo);
            ps.execute();
            JOptionPane.showMessageDialog(null, "saved");
        }catch(Exception e){
            System.out.println("--> SQLException:"+ e);
        }
        finally{
            try{
                ps.close();
                rs.close();
            }catch(Exception ex){
                
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String t1=txtcin.getText();
        String t2=txtnom.getText(); 
        String t3=txtprenom.getText();
//        String t4=txtdateNais.getText();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd",Locale.getDefault(Locale.Category.DISPLAY));
        String d=sdf.format(txtdateNais.getDate());
        String t5=txtage.getText();
        String t6=sexe;
        String t7=txtgsm.getText();
        String t8=txtemail.getText();
        String requete="update candidat_table set cin=?,nomc=?,prenomc=?,date_naissance=?,age=?,sexe=?,gsm=?,email=?,image=? where cin='"+t1+"' ";
        try{
            ps=con.prepareStatement(requete);
            ps.setString(1,txtcin.getText());
           ps.setString(2, txtnom.getText());
            ps.setString(3, txtprenom.getText());
            ps.setString(4,((JTextField)txtdateNais.getDateEditor().getUiComponent()).getText());
            ps.setString(5, txtage.getText());
            ps.setString(6, sexe);
            ps.setString(7, txtgsm.getText());
            ps.setString(8, txtemail.getText());
            ps.setBytes(9,photo);
            
            ps.execute();
            JOptionPane.showMessageDialog(null, "Modification avec succès");
        }catch(SQLException ex){
            System.out.println(ex);
        }
        
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       recept();
    }//GEN-LAST:event_formWindowOpened

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        sexe="Homme";
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        sexe="Femme";
    }//GEN-LAST:event_jRadioButton2ActionPerformed
    
     
    private void txtpathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpathActionPerformed

    private void btnpathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpathActionPerformed
      ConnexionBd v = new ConnexionBd();
        v.filen();
        String vpath=v.getpath();
        if(vpath==null){
            
        }else{
            image.setIcon(new ImageIcon(vpath));
            txtpath.setText(vpath);
        try{ 
          File image=new File(vpath);  
            FileInputStream fs =new FileInputStream(image);
            ByteArrayOutputStream bs = new ByteArrayOutputStream();
            byte [] b = new byte[1024];
            for(int re ;(re=fs.read(b))!=-1;){
            bs.write(b,0,re);
            }
            photo=bs.toByteArray();
        }catch(Exception e){
            e.printStackTrace();
        }
        }
    }
    public void imagess(){
        ConnexionBd v = new ConnexionBd();
        v.filen();
        String vpath=v.getpath();
        if(vpath==null){
            
        }else{
            image.setIcon(new ImageIcon(vpath));
            txtpath.setText(vpath);
        try{ 
          File image=new File(vpath);  
            FileInputStream fs =new FileInputStream(image);
            ByteArrayOutputStream bs = new ByteArrayOutputStream();
            byte [] b = new byte[1024];
            for(int re ;(re=fs.read(b))!=-1;){
            bs.write(b,0,re);
            }
            photo=bs.toByteArray();
        }catch(Exception e){
            e.printStackTrace();
        }
        }
    }//GEN-LAST:event_btnpathActionPerformed

    private void txtageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtageMouseEntered
        try{
        Date actuelle= new Date();
        DateFormat dateFormat=new SimpleDateFormat("yyyy");
        String date=dateFormat.format(actuelle);
        String dc= date;
                String t1=txtcin.getText();
        String t2=txtnom.getText(); 
        String t3=txtprenom.getText();
//        String t4=txtdateNais.getText();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy",Locale.getDefault(Locale.Category.DISPLAY));
        String d=sdf.format(txtdateNais.getDate());
        String t5=txtage.getText();
        String t6=sexe;
        String t7=txtgsm.getText();
        String t8=txtemail.getText();
        int d1=Integer.parseInt(dc);
        int d2=Integer.parseInt(d);
        int r=(d1-d2);
        String resultat=String.valueOf(r);
        txtage.setText(resultat);
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"tapez date de naissance");
        }
    }//GEN-LAST:event_txtageMouseEntered

    private void txtgsmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtgsmKeyTyped
        char t=evt.getKeyChar();
        if(!(Character.isDigit(t)||(t==KeyEvent.VK_BACK_SPACE)||(t==KeyEvent.VK_DELETE))){
           evt.consume();
        }
    }//GEN-LAST:event_txtgsmKeyTyped

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
            java.util.logging.Logger.getLogger(AjoutCandidat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjoutCandidat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjoutCandidat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjoutCandidat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjoutCandidat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnpath;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel image;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtcin;
    private com.toedter.calendar.JDateChooser txtdateNais;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtgsm;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txtpath;
    private javax.swing.JTextField txtprenom;
    // End of variables declaration//GEN-END:variables
}
