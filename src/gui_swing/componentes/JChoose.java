/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_swing.componentes;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;



/**
 *
 * @author Usuario
 */
public class JChoose extends JFrame implements ActionListener{
    JButton b,b2,b3;
    JFileChooser fl;
    JPanel p;
    
    public JChoose(){
        
        this.setSize(400, 150);
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);
        Panel();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);  
       
    }
    private void Panel(){
       p=new JPanel();
//       this.getContentPane().add(p);
       this.add(p);
       bot();
       
       
    }
    private void bot(){
        b=new JButton("Seleccionar");
        b2=new JButton("Guardar");
        b3= new JButton("Salir");
        
        b.addActionListener(this);
        b.setVisible(true);
        
        b.setBorder(BorderFactory.createEtchedBorder());
        b2.setBorder(BorderFactory.createEmptyBorder());
        b3.setBorder(BorderFactory.createEmptyBorder());
        p.add(b);
        p.add(b2);
        
        b.addActionListener(this);
        b2.addActionListener(this);
       
        
               
             
       fl=new JFileChooser("C:\\Users\\Usuario\\OneDrive\\Escritorio");
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equalsIgnoreCase("Seleccionar")){
            if (e.getSource()==b){
                
           int op=fl.showOpenDialog(null);
           fl.setFileFilter(new FileTypeFilter(".txt","Text File"));
           if(op == JFileChooser.APPROVE_OPTION){
               System.out.println("la  opcion que selecciono" + fl.getSelectedFile().getAbsoluteFile());
               
           }else{
               System.out.println("Salio de la seleccion");
           }
        }else{
                if (e.getSource()==b2){
           int op2=fl.showSaveDialog(null);
           if(op2 == JFileChooser.APPROVE_OPTION){
               System.out.println("la  opcion que selecciono" + fl.getSelectedFile().getAbsolutePath());
           }else{
               System.out.println("Salio de la seleccion");
           }
            }
    }
    }else{
            
        }
            
    }

    private static class FileTypeFilter extends javax.swing.filechooser.FileFilter {

        public FileTypeFilter(String txt, String text_File) {
        }

        @Override
        public boolean accept(File f) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public String getDescription() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
  
    

