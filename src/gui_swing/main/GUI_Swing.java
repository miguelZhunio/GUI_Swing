package gui_swing.main;

import gui_swing.componentes.Event_JEditorPane;
import gui_swing.componentes.Event_JTextComponent;
import gui_swing.componentes.JChoose;
import gui_swing.componentes.JPapup;
import gui_swing.componentes.JProgress;
import gui_swing.componentes.JTF_Ejemplo_IV;
import gui_swing.componentes.JtabbedPane;
import gui_swing.componentes.JtextArea;
import gui_swing.componentes.Ventana2;
import java.awt.Color;
import java.awt.Dimension;
import java.text.ParseException;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.SwingConstants;


public class GUI_Swing {
    private static Scanner in = new Scanner(System.in);
    private static String op;
    private static boolean error = false;
    
    public static void main(String[] args) throws ParseException {
        do {
            System.out.print("*********************** COMPONENTES SWING ***********************\n"
                    + "1. JTextComponent \n"
                    + "2. JEditorPane \n"
                    + "3. JTextField y JPasswordField \n"
                    + "4. JTextArea \n"
                    + "5. JPopupMenu \n"
                    + "6. JProgressBar \n"
                    + "7. JTabbedPane \n"
                    + "8. JFileChooser \n"
                    + "9. JLayoutPane \n"
                    + "10. Salir \n"
                    + "---> "
            );
            op = in.next();
            if (op.equalsIgnoreCase("10")) {System.exit(0);}
            error = op.matches("[1-9]{1}");
        } while (!error);
        
        switch(op) {
            case "1": // Miguel
                Event_JTextComponent jtextcomponent = new Event_JTextComponent();
                break;
            case "2": // Miguel
                Event_JEditorPane editorpane = new Event_JEditorPane();
                break;
            case "3": //Issac
                JTF_Ejemplo_IV ventana1 = new JTF_Ejemplo_IV();
                ventana1.setVisible(true);//Visible Ventana
                
                Ventana2 mostrar = new Ventana2();//2da ventana
                mostrar.setVisible(true);
                break;
            case "4": // Erick
                JtextArea area = new JtextArea();
                area.setVisible(true);
                break;
            case "5": // Erick
                JPapup papu = new JPapup(); 
                break;
            case "6": // Jose
                new JProgress().setVisible(true);
                break;
            case "7": // Jose
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
                    java.util.logging.Logger.getLogger(JtabbedPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    java.util.logging.Logger.getLogger(JtabbedPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    java.util.logging.Logger.getLogger(JtabbedPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                    java.util.logging.Logger.getLogger(JtabbedPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                //</editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        new JtabbedPane().setVisible(true);
                    }
                });
                break;
            case "8": // Sebastian
                JChoose choose = new JChoose();
                choose.setVisible(true);
                break;
            case "9": // Sebastian
                JFrame v = new JFrame("JLAyeredPane");
                JLayeredPane lay=new JLayeredPane();
                JLabel p1=new JLabel();
                p1.setOpaque(true);
                p1.setText("Buenos Dias ");
                p1.setBackground(Color.CYAN);
                p1.setBounds(0, 0, 145,250);
                
                JLabel p2=new JLabel();
                p2.setOpaque(true);
                p2.setBackground(Color.PINK);
                p2.setBounds(60, 60, 145,250);
                
                JLabel p3=new JLabel();
                p3.setOpaque(true);
                p3.setText("Gupo#2");
                p3.setHorizontalAlignment(SwingConstants.CENTER);
                p3.setBackground(Color.MAGENTA);
                p3.setBounds(150, 150, 145,250);
                
                lay.add(p1,Integer.valueOf(2));
                lay.add(p2,Integer.valueOf(0));
                lay.add(p3,Integer.valueOf(1));
                
                lay.setBounds(50, 50, 500, 500);

                v.add(lay);
		v.setDefaultCloseOperation(v.EXIT_ON_CLOSE);
                v.setSize(new Dimension(500, 450));
                v.setLocationRelativeTo(null);
                v.setLayout(null);
                v.setVisible(true);
                break;
                
        }
        
    }
    
}
