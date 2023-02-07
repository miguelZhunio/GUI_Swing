package gui_swing.componentes;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.text.MaskFormatter;

public class Event_JTextComponent extends JFrame{
    
    public Event_JTextComponent() throws ParseException {
        String auxNombre = "Nombre:";
        String auxEdad = "Fecha:";
        String auxPassword = "Password:";
        String auxComment = "Comentario:";
        MaskFormatter mascara = new MaskFormatter("##--##--####");
        mascara.setPlaceholderCharacter('_');
        

        setLayout(null); //Layout absoluto
        
        JLabel titulo = new JLabel();
        JLabel Nombre = new JLabel();
        JLabel pass = new JLabel();
        JLabel fecha = new JLabel();
        JLabel comment = new JLabel();
        
        JEditorPane editorpane1 = new JEditorPane();
        JTextField field1 = new JTextField();
        JFormattedTextField formatted = new JFormattedTextField(mascara);
        JPasswordField password = new JPasswordField();
        JTextArea area = new JTextArea();
        JTextPane panel = new JTextPane();
        
                
                
        titulo.setFont(new Font("Serif", Font.PLAIN, 28));
        titulo.setBounds(175,25, 350, 50);
        titulo.setText("INGRESO DE DATOS");
        add(titulo);
        
        Nombre.setFont(new Font("Serif", Font.PLAIN, 20));
        Nombre.setBounds(50,100, 150, 30);
        Nombre.setText(auxNombre);
        add(Nombre);
        
        pass.setFont(new Font("Serif", Font.PLAIN, 20));
        pass.setBounds(50,155, 150, 30);
        pass.setText(auxPassword);
        add(pass);
        
        fecha.setFont(new Font("Serif", Font.PLAIN, 20));
        fecha.setBounds(50,210, 150, 50);
        fecha.setText(auxEdad);
        add(fecha);
        
        field1.setBounds(250, 100, 300, 30); 
        field1.setFont(new Font("Serif", Font.PLAIN, 20));
        add(field1);
        
        password.setBounds(250, 155, 300, 30);
        password.setFont(new Font("Serif", Font.PLAIN, 20));
        add(password);
        
        formatted.setBounds(250, 220, 300, 30); 
        formatted.setFont(new Font("Serif", Font.PLAIN, 20));
        add(formatted);
        
        comment.setBounds(50,315,150, 30);
        comment.setText(auxComment);
        comment.setFont(new Font("Serif", Font.PLAIN, 20));
        add(comment);
        
        area.setBounds(50, 350, 275, 275); 
        area.setFont(new Font("Serif", Font.PLAIN, 20));
        add(area);
        
        
        
        // Marcamos el editor para usar html
        panel.setContentType("text/html");
        panel.setBounds(375, 350, 275, 275);        
        JButton boton = new JButton("Search");
        boton.setBounds(75, 175, 125,50);
        panel.add(boton);
        add(panel);
        
        
        ActionListener escuchador = new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                String Fecha = formatted.getText();
                String nombre = field1.getText();
                String comentario = area.getText();
                String textHTML = "<center><h1>JEditorPane</h1></center> <br>"
                + "<p><b>Nombre: </b>" + nombre + "</p>"
                + "<p><b>Fecha: </b>" + Fecha + "</p>"
                + "<p><b>Comentario: </b>" + comentario + "</p>";
                panel.setText(textHTML);

            }
            
        };
        
        boton.addActionListener(escuchador);

        
        initPantalla();
    }

    private void initPantalla() {

        setLayout(null); //Layout absoluto
        setTitle("Libreria Swing"); //Título del JFrame
        setSize(700, 700); //Dimensiones del JFrame
        setResizable(false); //No redimensionable
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar proceso al cerrar ventana
        setVisible(true); //Mostrar JFrame
        
    }

}
