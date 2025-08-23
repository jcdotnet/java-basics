package es.uma.oop.pract1.punto;

public class Punto {
    protected double x,y;
 
    public Punto() {
	this(0,0);
    }
    public Punto(double vx, double vy) {
        x = vx;
        y = vy;
    }
    public void valorInicial(double vx, double vy) {
        x = vx;      // es igual que   this.x = vx
        y = vy;
    }
    public double distancia(Punto q) {
        double dx = x - q.x;
        double dy = y - q.y;
        return Math.sqrt(dx*dx+dy*dy);
    }
    public double distancia (double cx, double cy) {
        double dx = x - cx;
        double dy = y - cy;
        return Math.sqrt(dx*dx+dy*dy);
    }
    public void trasladar(double dx, double dy) {
        x =+ dx;
        y =+ dy;
    }
}


