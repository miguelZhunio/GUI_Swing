/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui_swing.componentes;

import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author IV
 */
public class JTF_Ejemplo_IV extends JFrame {//Isaac Villa

    private JPanel panel;
    private JLabel etiqueta;
    private JTextField cajaTexto;
    private JLabel saludo;
    private JButton boton1;
    private JPasswordField passwordField;
    private JLabel contraseña;
    private JTextField cajaTexto2;
    private JButton obtenerTexto;
    private JButton obtenerPassword;
    private JLabel mostrarcontra;

    public JTF_Ejemplo_IV() {
        setSize(500, 500);//Tamaño de la ventana
        setTitle("Ejemplo de JTextField");
        setLocationRelativeTo(null);//Centamos la pantalla
        //this.getContentPane().setBackground(Color.BLUE);//Color

        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);//Finalizando

    }

    private void iniciarComponentes() {
        colocarPaneles();
        colocarEtiquetas();
        colocarBotones();
        colocarCajasDeTexto();
        oyenteDeAccion();
        eventoOyenteDeRaton();

    }

    private void colocarPaneles() {
        panel = new JPanel();//Creamos un panel
        //panel.setBackground(Color.RED);//Color al panel
        panel.setLayout(null);//Desactivar el diseño
        this.getContentPane().add(panel);//Agreamos el panel a la ventana
    }

    private void colocarEtiquetas() {
        etiqueta = new JLabel();//Creamos una etiqueta
        etiqueta.setText("Ingrese su nombre: ");//Agregamos un texto
        etiqueta.setBounds(30, 10, 200, 30);//Damos el tamaño
        panel.add(etiqueta);//agregamos al panel
        
        saludo = new JLabel();
        saludo.setBounds(50, 300, 300, 40);
        saludo.setFont(new Font("arial", 1, 20));
        panel.add(saludo);
        
        contraseña = new JLabel();
        contraseña.setText("Ingrese su contraseña: ");
        contraseña.setBounds(30, 100, 400, 50);
        panel.add(contraseña);
        
        mostrarcontra = new JLabel();
        //mostrarcontra.setText(" ");
        mostrarcontra.setBounds(50, 350, 400, 50);
        panel.add(mostrarcontra);

    }

    private void colocarBotones() {
        boton1 = new JButton();//Creamos un boton
        boton1.setText("Obtener Nombre");//Establecer un texto al boton
        boton1.setBounds(150, 200, 150, 40);//Damos Tamaño
        boton1.setEnabled(true);//Establece el encendido del boton
        boton1.setMnemonic('a');//Establecemos alt + letra para funcionar
        //boton1.setBackground(Color.red);//Cambiar el color del boton
        panel.add(boton1);//Agregamos al panel
        //obtenerTexto = new JButton("Obtener Texto");
        //obtenerTexto.setBounds(50, 250, 150, 40);
        //panel.add(obtenerTexto);

        obtenerPassword = new JButton("Obtener Password");
        obtenerPassword.setBounds(150, 250, 150, 40);
        panel.add(obtenerPassword);
    }

    private void colocarCajasDeTexto() {//Caja de texto de una sola linea
        cajaTexto = new JTextField();//Creamos la caja de texto
        cajaTexto.setBounds(50, 50, 200, 20);//Establecemos tamaño ancho y largo
        //cajaTexto.setText("Escribir aqui...");

        System.out.println("Texto en la caja: " + cajaTexto.getText());
        panel.add(cajaTexto);

        cajaTexto2 = new JPasswordField();
        cajaTexto2.setBounds(50, 150, 200, 20);
        panel.add(cajaTexto2);

    }

    private void oyenteDeAccion() {
        //Los eventos es hacer que algo suceda, tomen accion.
        //Evento de ActionListener (Oyente de accion)//tipo Interface tiene 1 solo metodo que es el actionPerformed
        ActionListener oyenteDeAccion = new ActionListener() {
            @Override//Implementar todos los metodos abstractos actionPerfomeed
            public void actionPerformed(ActionEvent e) {
                saludo.setText("Hola " + cajaTexto.getText());
            }
        };
        boton1.addActionListener(oyenteDeAccion);
        
        ActionListener oyenteDeAccion2 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarcontra.setText("Contraseña: " + cajaTexto2.getText());
            }
        };
        obtenerPassword.addActionListener(oyenteDeAccion2);
    }

    private void eventoOyenteDeRaton() {

        //Agregando oyente de raton
        MouseListener oyenteDeRaton = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                //cajaTexto.("mouseClicked\n");
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
        boton1.addMouseListener(oyenteDeRaton);

    }

    private void campoContraseña() {
        passwordField = new JPasswordField(20);
        
        panel.add(passwordField);

    }

}//Main
