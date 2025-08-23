//package es.forman.cursojava.applets;
//
//import java.applet.Applet;
//import java.awt.Graphics;
//import java.awt.Image;
//import java.net.MalformedURLException;
//import java.net.URL;
//public class HolaMundo extends Applet{
//
//	@Override
//	public void paint(Graphics lienzo)  {
//		// TODO Auto-generated method stub
//		super.paint(lienzo);
//		lienzo.drawString("Hola Mundo", 10, 10);
//	    String valor= this.getParameter("autor");
//	    lienzo.drawString(valor, 100, 100);
//
//	    //a�adimos logo
//	    Image img;
//		try {
//			img = this.getImage(new URL("http://www.redia.com/img/java.gif"));
//			lienzo.drawImage(img,10,100,this);
//		} catch (MalformedURLException e) {
//			// TODO Auto-generated catch block
//			lienzo.drawString("URL incorrecta",10,100);
//		}
//
//
//	}
//
//
//}
