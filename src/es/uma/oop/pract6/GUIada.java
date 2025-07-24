
package es.uma.oop.pract6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// Implementa un adaptador anónimo

public class GUIada {
    public static void main(String [] args) {
        JFrame v = new JFrame("Ventana con balon");
        v.addWindowListener(
            new WindowAdapter () {
                   public void windowClosing(WindowEvent e) {
                        System.exit(0);
                   }
                }
            );
        v.getContentPane().add(new VentanaBalon());
        v.setSize(300,300);
        v.setVisible(true);
    }
}
