package gui_swing.componentes;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

public class Event_JEditorPane extends JFrame {


    public Event_JEditorPane() {
        String label = "JEDITORPANE";
        URL imgMain = getClass().getResource("AWT-vs-SWING.png");
        URL imgHeader = getClass().getResource("imgheader.jpg");
        URL imgService = getClass().getResource("Componentes+AWT.png");
        
        JLabel etiqueta = new JLabel(label,SwingConstants.CENTER);
        etiqueta.setFont(new Font("Serif", Font.BOLD, 32));
        etiqueta.setBounds(0,10, 1000, 50);
        add(etiqueta);


        setLayout(null); //Layout absoluto

        JEditorPane editorpanePlano = new JEditorPane();
        JEditorPane editorpaneRtf = new JEditorPane();
        JEditorPane editorpaneHTML = new JEditorPane();
        
        editorpanePlano.setContentType("text/plain");
        editorpanePlano.setBounds(0, 60, 150, 800);
        String plano = "Este es un JEditorPane de texto plano";
        editorpanePlano.setFont(new Font("Serif", Font.BOLD, 18));
        add(editorpanePlano);

        // Marcamos el editor para usar html
        editorpaneHTML.setContentType("text/html");
        // editorpaneHTML.setBounds(150, 60, 700, 800);
        String textHTML = "<div style='background-image: rgb(250, 235, 215);background-size: contain; width: 100%; height: 120px;' >"
                + "<center><h1>Interfaces Graficas de usuario</h1><br><h2>En Java</h2><br>"
                + "</center>"
                + ""
                + "</div>"
                + "<div style='background-color: rgb(240, 255, 255); width: 100%; height: 200px;'>"
                + "<center><h2>AWT Y SWING</h2><br><i>Librerias para crear GUI</i> <br>"
                + "<img  src=" +imgMain +">"
                + "</center>"
                + "</div>"
                + "<div style='background-color: rgb(240, 248, 255); width: 100%; height: 200px;'>"
                + "<center><h2>Componentes y Contenedores</h2><br>"
                + "<img  src=" + imgService +">"
                + "</center>"
                + "</div>"
                + "<div style='background-color: rgb(0, 139, 139); width: 100%; height: 170px;'>"
                + "<center><h2>Contactos</h2><br>"
                + "<a href=\"google.com\">Contacto</a>"
                + "</center>"
                + "</div>";
        editorpaneHTML.setText(textHTML);
        editorpaneHTML.setEditable(false);
        JScrollPane js = new JScrollPane(editorpaneHTML);
        js.setBounds(150, 60, 700, 800);
        add(js);

        // Para el uso de archivos rtf
        editorpaneRtf.setContentType("text/rtf");
        editorpaneRtf.setBounds(850, 60, 150, 800);
        String rtf = "{\\rtf1" + 
                "{\\colortbl ;\\red255\\green0\\blue0;}" +
                "Esto" +
                " es documento \\b rtf \\b0  de \\i que quiere \\i0\\par " +
                "decir \\cf1 Rich Text Format \\cf0 \\par" + "}";
        editorpaneRtf.setText(rtf);
        add(editorpaneRtf);


        // FocusEvent
        FocusListener escuchador = new FocusListener() {
            
            @Override
            public void focusGained(FocusEvent e) {
                editorpaneRtf.setText(null);
            }
            
            @Override
            public void focusLost(FocusEvent e) {
                
                editorpaneRtf.setText(rtf);
                
                
            }
            
        };
        
        editorpaneRtf.addFocusListener(escuchador);
        
        KeyListener teclado = new KeyListener() {
            
            public void keyPressed​(KeyEvent e) { // Cuando presionanamos una tecla
                editorpaneHTML.setText(null);
            }
            
            public void keyReleased​(KeyEvent e) { // Cuando dejemos de presionar una tecla
                etiqueta.setText("Metodo keyReleased​ ejecutado");
                editorpaneHTML.setText(textHTML);   
            }
            
            public void keyTyped​(KeyEvent e) { // Cuando hallamos presionado puntos, comas, etc.
                etiqueta.setText("Metodo keyTyped​ ejecutado");
            }
            
        };
        
        editorpaneRtf.addKeyListener(teclado);
        
        MouseListener raton = new MouseListener() {
            
            @Override
            public void mouseClicked(MouseEvent e) {
                etiqueta.setText(label);
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {     
            }
            
        };
        
        etiqueta.addMouseListener(raton);
        MouseListener raton2 = new MouseListener() {
            
            @Override
            public void mouseClicked(MouseEvent e) {        
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                editorpanePlano.setBackground(Color.CYAN);
                editorpanePlano.setText(null);
                // editorpaneRtf.setBackground(Color.CYAN);
                
            }

            @Override
            public void mouseExited(MouseEvent e) { 
                editorpanePlano.setText(plano);
                // editorpaneRtf.setText(rtf);
                editorpanePlano.setBackground(Color.WHITE);
            }
            
        };
        editorpanePlano.addMouseListener(raton2);
        //editorpaneRtf.addMouseListener(raton2);


        MouseListener raton3 = new MouseListener() {
            
            @Override
            public void mouseClicked(MouseEvent e) {                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                editorpaneHTML.setText(null);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                editorpaneHTML.setText(textHTML);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {     
            }
            
        };
        
        editorpaneHTML.addMouseListener(raton3);
        
        //Configurar y mostrar JFrame
        initPantalla();
    }

    private void initPantalla() {

        setLayout(null); //Layout absoluto
        setTitle("Libreria Swing"); //Título del JFrame
        setSize(1000, 800); //Dimensiones del JFrame
        setResizable(false); //No redimensionable
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar proceso al cerrar ventana
        setVisible(true); //Mostrar JFrame
    }

}
