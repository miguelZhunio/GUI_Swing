package gui_swing.componentes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class JPapup{
    String text1 =  "Primer Elemento" ;
    String text2 = "Segundo Elemento";
    String text3 = "Tercer Elemento";
        
    
    public JPapup() {
        
        // Instancia objetos 
        // 3 CheckboxMenuItem
        CheckboxMenuItem primerElementoMenu = new CheckboxMenuItem(text1);
        CheckboxMenuItem segundoElementoMenu = new CheckboxMenuItem(text2);
        CheckboxMenuItem tercerElementoMenu = new CheckboxMenuItem(text3);
        // Se instancia un objeto ItemListener y se registra sobre los
        // elementos de menu ya instanciadosControladorCheckBox
        primerElementoMenu.addItemListener( new ControladorCheckBox() );
         tercerElementoMenu.addItemListener( new ControladorCheckBox() );

        // Instancia un objeto Menu de tipo PopUp y le añade los objetos
        // CheckboxMenuItem
        PopupMenu miMenuPopup = new PopupMenu( "Menu Popup" );
        miMenuPopup.add( primerElementoMenu );
        miMenuPopup.add( segundoElementoMenu );
        miMenuPopup.add( tercerElementoMenu );    

        Frame miFrame = new Frame( "JPopupMenu en Java" );
        miFrame.addMouseListener( new ControladorRaton(miFrame,miMenuPopup) );
        miFrame.add( miMenuPopup );   
        miFrame.setSize( 250,100 );
        miFrame.setVisible(true);

        // Instancia y registra un receptor de eventos de ventana para
        // terminar el programa cuando se cierra el Frame
        miFrame.addWindowListener( new Conclusion() );
    }
    

// Clase para atrapar los eventos de pulsacion del raton y presentar
// en la pantalla el objeto menu Popup, en la posicion en que se
// encontraba el cursor
class ControladorRaton extends MouseAdapter{
    Frame aFrame;
    PopupMenu aMenuPopup;

    // Constructor parametrizado
    ControladorRaton( Frame frame,PopupMenu menuPopup ) {
        aFrame = frame;
        aMenuPopup = menuPopup;
        }

    public void mousePressed( MouseEvent evt ) {
        // Presenta el menu PopUp sobre el Frame que se especifique
        // y en las coordenadas determinadas por el click del raton,
        // cuidando de que las coordenadas no se encuentren situadas
        // sobre la barra de titulo, porque las coordenadas Y en 
        // esta zona son negativas
        if( evt.getY() > 50 ) 
            aMenuPopup.show( aFrame,evt.getX(),evt.getY() );
        }
    }

// Clase para instanciar un objeto receptor de eventos de los
// elementos del menu que sera registrado sobre estos elementos
class ControladorCheckBox implements ItemListener {
    public void itemStateChanged( ItemEvent evt ) {
        // Presenta en pantalla el elemento que ha generado el
        // evento
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(250,100);
        frame.setVisible(true);
        JLabel label = new JLabel(text1,SwingConstants.CENTER);
        label.setSize(250, 100);
        frame.add(label);
    }
}

class Conclusion extends WindowAdapter {
    public void windowClosing( WindowEvent evt ) {
        // termina el programa cuando se cierra la ventana
        System.exit( 0 ); 
        }
    }
}