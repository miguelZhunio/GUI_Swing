/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package gui_swing.componentes;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
//nombre de la clase
public class JtextArea extends JFrame {
//creando
  private JTextArea editor;
  private JTextField status;
//se cerea un contructor
  public JtextArea() {
     //Tema y titulo de    
    setTitle("Columna y Fila en un TextArea");
    setSize(500,500);

     // Inicializamos el Layout
     // gestores de aspecto capaces de organizar, de manera automática, la posición y tamaño de los componentes
    setLayout(new BorderLayout());
    setDefaultCloseOperation(EXIT_ON_CLOSE);
   // inicializiando
    editor = new JTextArea();
    // Añadimos los campos al Layout
    add(editor, BorderLayout.CENTER);
//inicializamos 
    status = new JTextField();
    add(status, BorderLayout.SOUTH);
  }

  public static void main(String args[]) {
    JtextArea app = new JtextArea();
    app.setVisible(true); //lo hace visible a la ventana de jframe
  }	
}