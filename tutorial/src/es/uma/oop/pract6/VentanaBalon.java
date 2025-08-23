package es.uma.oop.pract6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VentanaBalon extends JPanel implements ActionListener {
    protected Balon balon;
    protected JButton creceB;
    protected JButton decreceB;
    public VentanaBalon() {
        creceB = new JButton("Crece");
        decreceB = new JButton("Decrece");
        balon = new Balon(20,150,150);
        setLayout(new FlowLayout());
        add(creceB);
        add(decreceB);
        creceB.addActionListener(this);
        decreceB.addActionListener(this);
   }
   public void paintComponent(Graphics g) {
        super.paintComponent(g);
        balon.display(g);
   }
   public void actionPerformed(ActionEvent e) {
        if (e.getSource() == creceB)
            balon.cambia(10);
        else
            balon.cambia(-10);
        repaint();
   }
}
