/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author a21cristinaaf
 */
public class PracticaLayoutsEntregar extends JFrame implements ActionListener {

    /**
     * @param args the command line arguments
     */


    JButton boton1;
    JButton boton2;
    JButton boton3;
    JTextField cajaTexto;

    public PracticaLayoutsEntregar() {

        boton1 = new JButton("Hola");
        boton2 = new JButton("Ventana");
        boton3 = new JButton("Limpiar");
        cajaTexto = new JTextField(20);

        this.add(cajaTexto, BorderLayout.NORTH);

        JPanel panel = new JPanel();

        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);

        this.add(panel);

        boton1.addActionListener(this);
        boton2.addActionListener(this);
        boton3.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        cajaTexto.setText(e.getActionCommand());
        System.out.println("Este objeto es un botón");
        System.out.println("Mi botón " + e.paramString());
 
    }
    
        public static void main(String[] args) {
        PracticaLayoutsEntregar ventanaPrueba = new PracticaLayoutsEntregar();

        ventanaPrueba.setSize(350, 150);
        ventanaPrueba.setTitle("Formulario1");
        ventanaPrueba.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaPrueba.setVisible(true);
        
    }
}

