package es.forman.cursojava.applets.pelota;

//import java.applet.Applet;
//import java.awt.Color;
//import java.awt.Graphics;
//
//public class JuegoPelotaMultiple extends Applet {
//
//	private Graphics lienzo;
//	private Pelota[] pelota = { new Pelota(), new Pelota(), new Pelota(), new Pelota(), new Pelota(), new Pelota() };
//	private Desplazador[] desplazador;
//	private Controlador controlador;
//
//	public void init() {
//		this.controlador = new Controlador(this);
//		this.desplazador = new Desplazador[pelota.length];
//		for (int i=0; i< pelota.length; i++)
//			this.desplazador[i] = new Desplazador(this.pelota[i], this);
//	}
//
//	public void start() {
//		for (Desplazador desp: desplazador)
//			desp.start();
//		this.controlador.start();
//	}
//
//	public void update(Graphics lienzo) {
//		//Color bg = this.getBackground();
//		//lienzo.setColor(Color.ORANGE);
//		for (Pelota pelotaActual: this.pelota)  {
//			pelotaActual.setLienzo(lienzo);
//			pelotaActual.erase();
//			pelotaActual.draw();
//		}
//		System.out.println("Update");
//	}
//}
