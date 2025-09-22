//package es.forman.cursojava.applets.pelota;
//
//import java.applet.Applet;
//import java.awt.Dimension;
//import java.awt.Graphics;
//
//import es.forman.cursojava.applets.pelota.interfaces.Sprite;
//
//public class Desplazador extends Thread {
//
//	private Sprite spriteAsociado;
//	private int incrementoX, incrementoY;
//	private Dimension dimension;
//
//	public Desplazador(Sprite s, Applet a)  {
//		this.dimension = a.getSize();
//		this.spriteAsociado = s;
//		this.spriteAsociado.setX((int)(Math.random()*(dimension.getWidth()-this.spriteAsociado.getAncho())+10));
//		this.spriteAsociado.setY((int)(Math.random()*(dimension.getHeight()-this.spriteAsociado.getAlto())+10));
//		this.incrementoX = (int)(Math.random()*3+2);
//		this.incrementoY = (int)(Math.random()*3+2);
//	}
//
//	@Override
//	public void run() {
//		//for (int i=0; i<20; i++) {
//		while (true)  {
//			this.chequeaRumbo();
//			this.spriteAsociado.incX(this.incrementoX);
//			this.spriteAsociado.incY(this.incrementoY);
//			try {
//				this.sleep(100);
//				System.out.println("X = "+this.spriteAsociado.getX() + "  Y = " + this.spriteAsociado.getY());
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//		}
//	}
//
//	private void chequeaRumbo()  {
//		if (this.spriteAsociado.getX() + this.spriteAsociado.getAncho() > this.dimension.getWidth())
//			this.incrementoX = -this.incrementoX;
//		if (this.spriteAsociado.getY() + this.spriteAsociado.getAlto() > this.dimension.getHeight())
//			this.incrementoY = -this.incrementoY;
//		if (this.spriteAsociado.getY() < 0)
//			this.incrementoY = -this.incrementoY;
//		if (this.spriteAsociado.getX() < 0)
//			this.incrementoX = -this.incrementoX;
//	}
//
//}
