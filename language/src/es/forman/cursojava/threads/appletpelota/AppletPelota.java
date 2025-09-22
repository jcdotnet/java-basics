//package es.forman.cursojava.threads.appletpelota;
//
//import java.applet.Applet;
//import java.awt.Graphics;
//
//public class AppletPelota extends Applet {
//    public static int LIMITE =300;
//	Pelota pelota;
//	Pelota pelota2;
//	Pelota pelota3;
//	Desplazador desplaza;
//	Desplazador desplaza2;
//	Desplazador desplaza3;
//    @Override
//	public void init() {
//		pelota= new Pelota();
//		pelota2= new Pelota();
//		pelota3= new Pelota();
//		desplaza = new Desplazador(pelota,this);
//		desplaza2 = new Desplazador(pelota2,this);
//		desplaza3 = new Desplazador(pelota3,this);
//		desplaza.start();
//		desplaza2.start();
//		desplaza3.start();
//		super.init();
//	}
//
//	@Override
//	public void paint(Graphics lienzo) {
//		// TODO Auto-generated method stub
//
//		int x=pelota.getCoordenadaX();
//		int y=pelota.getCoordenadaY();
//		int x2=pelota2.getCoordenadaX();
//		int y2=pelota2.getCoordenadaY();
//		int x3=pelota3.getCoordenadaX();
//		int y3=pelota3.getCoordenadaY();
//		//lienzo.drawOval(x,y,20,20);
//		lienzo.drawRect(0,0,300,300);
//		lienzo.fillOval(x,y,20,20);
//		lienzo.fillOval(x2,y2,20,20);
//		lienzo.fillOval(x3,y3,20,20);
//	 }
//
//
//}
