/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.autoplus.frame;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author malek
 */
public class ConnexionBd {
    String filename=null;
    public static String path;
    Connection con=null;
    public static Connection Connexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");// charger le driver ODBC
             // ********connection********** 
            Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost/auto_plus", "root", "");
            if(con!=null) 
                System.out.println("la connection à la base de données a été établie avec succés");
            else 
                System.out.println("Probléme de connection à la base de données");
            return con;  
        }catch(Exception ex){
            System.out.println("SqlEXception:"+ex);
           return null;        
        }
        
    }
    public void filen(){
        try{
        JFileChooser chooser=new JFileChooser();
        chooser.setDialogTitle("choisir une image png");
        chooser.setApproveButtonText("Ajouter une image");
        chooser.showOpenDialog(null);
        File f =chooser.getSelectedFile();
        filename=f.getAbsolutePath();
        this.path=(filename);
        }catch(Exception ex){
            System.out.println(ex);
            JOptionPane.showMessageDialog(null,"veuiller choisir une image");
        }
    }
    public String getpath(){
    return path;
    }
    
}
