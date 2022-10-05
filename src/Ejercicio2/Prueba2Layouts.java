/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import Ejercicio1.PracticaLayoutsEntregar;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author a21cristinaaf
 */
public class Prueba2Layouts extends JFrame implements ActionListener{
    
    JTextField cuadro1;
    JTextField cuadro2;
    JTextField cuadro3;
    JTextField cuadro4;
    
    
    public Prueba2Layouts(){
        cuadro1= new JTextField("hola", 10);
        cuadro2= new JTextField("Escribe el texto aquí: ", 10);
        cuadro3= new JTextField("Campo de texto no editable", 10);
        cuadro3.setEditable(false);
        cuadro4= new JPasswordField(8);
        
        this.setLayout(new FlowLayout());
        
        this.add(cuadro1);
        this.add(cuadro2);
        this.add(cuadro3);
        this.add(cuadro4);
    }
    
    public static void main(String[] args) {
        Prueba2Layouts prueba2= new Prueba2Layouts();

        prueba2.setSize(350, 150);
        prueba2.setTitle("Prueba de JTextField y JPasswordField");
        prueba2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        prueba2.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
