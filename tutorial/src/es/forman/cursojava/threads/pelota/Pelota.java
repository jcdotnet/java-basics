
//import java.applet.Applet;
//import java.awt.Color;
//import java.awt.Graphics;
//
//import es.forman.cursojava.applets.pelota.interfaces.Sprite;
//
//public class Pelota implements Sprite {
//
//	public int x=50, y=50;
//	public int xAnterior, yAnterior;
//	private Color color;
//	private Graphics lienzo;
//
//	public Pelota() {
//		this.color = Color.ORANGE;
//		igualaXY();
//	}
//
//	public void setLienzo(Graphics lienzo)  {
//		this.lienzo = lienzo;
//	}
//
//	private boolean puedePintar() {
//		return this.lienzo!=null;
//	}
//
//	public void draw ()  {
//		if (!puedePintar())
//			return;
//		this.lienzo.setColor(this.color);
//		//lienzo.setXORMode(this.color);
//		this.lienzo.fillOval(x, y, this.getAncho(), this.getAlto());
//		System.out.println("Draw pelota");
//	}
//
//	private void igualaXY() {
//		this.xAnterior = x;
//		this.yAnterior = y;
//	}
//
//	public void erase()  {
//		if (!puedePintar())
//			return;
//		this.lienzo.setColor(Color.WHITE);
//		//this.lienzo.setXORMode(this.color);
//		lienzo.fillOval(xAnterior, yAnterior,  this.getAncho(), this.getAlto());
//		this.igualaXY();
//		System.out.println("erase");
//	}
//
//	public int getX() {
//		return this.x;
//	}
//
//	public void setX(int i) {
//		this.x = i;
//	}
//
//	public void incX(int i) {
//		this.setX(this.x + i);
//	}
//
//	public int getY() {
//		return this.y;
//	}
//
//	public void setY(int j) {
//		this.y = j;
//	}
//
//	public void incY(int j) {
//		this.setY(this.y + j);
//	}
//
//	public int getAncho() {
//		return 10;
//	}
//
//	public int getAlto() {
//		// TODO Auto-generated method stub
//		return 10;
//	}
//}
