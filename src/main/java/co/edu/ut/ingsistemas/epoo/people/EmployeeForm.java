/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ut.ingsistemas.epoo.people;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 * Representa un formulario de ejemplo.
 *
 * @author Diego Alejandro Guzmán Trujillo.
 */
public class EmployeeForm extends JFrame {

    /**
     * Punto de entrada de ejecución del programa.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Se crea el formulario como si fuera un objeto común.
        EmployeeForm ef = new EmployeeForm();
        // 2. Se configura el formulario llamando métodos de este.
        ef.setLayout(new GridLayout(3, 2));
        ef.add(new JLabel("ID"));
        ef.add(new JTextField());
        ef.add(new JLabel("Name"));
        ef.add(new JTextField());
        ef.add(new JButton("Add"));
        ef.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ef.setSize(480, 240);
        // 3. Se invoca este método para mostrar el formulario.
        ef.setVisible(true);
    }
}
