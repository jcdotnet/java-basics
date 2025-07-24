//package es.forman.cursojava.applets.pelota;
//
//import java.applet.Applet;
//import java.awt.Color;
//import java.awt.Graphics;
//
//public class JuegoPelota extends Applet {
//
//	private Graphics lienzo;
//	private Pelota pelota;
//	private Desplazador desplazador;
//	private Controlador controlador;
//
//	public void init() {
//		this.pelota = new Pelota();
//		this.controlador = new Controlador(this);
//		this.desplazador = new Desplazador(this.pelota, this);
//	}
//
//	public void start() {
//		this.desplazador.start();
//		this.controlador.start();
//	}
//
//	public void update(Graphics lienzo) {
//		this.pelota.setLienzo(lienzo);
//		this.pelota.erase();
//		this.pelota.draw();
//		System.out.println("Update");
//	}
//}
