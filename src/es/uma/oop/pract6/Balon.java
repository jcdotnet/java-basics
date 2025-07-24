package es.uma.oop.pract6;

import java.awt.*;

public class Balon {
    protected int radio;
    protected int x,y;

    public Balon(int n, int vx, int vy) {
        radio = n;
        x = vx;
        y = vy;
    }

    public void cambia(int n) {
        radio += n;
    }

    public void display(Graphics g) {
        g.drawOval(x-radio,y-radio,radio*2,radio*2);
    }
}
