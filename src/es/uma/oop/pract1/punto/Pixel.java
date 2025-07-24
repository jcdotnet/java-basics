package es.uma.oop.pract1.punto;

public class Pixel extends Punto {
    byte color;

    public Pixel(double dx, double dy, byte c) {
        super(dx,dy);
        color = c;
    }
    public double distancia(double cx, double cy) {
        double dx = Math.abs(x - cx);
        double dy = Math.abs(y - cy);
        return dx+dy; // distancia Manhattan
    }
    public void trasladar(double dx, double dy) {
        super.trasladar(dx,dy);
        color = (byte)0;
    }
}


