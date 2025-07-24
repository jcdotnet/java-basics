//package es.forman.cursojava.applets;
//
//import java.applet.Applet;
//import java.awt.Graphics;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.HashMap;
//
//public class CommServidor extends Applet {
//
//	private String saludo;
//
//	public void init() {
//		BufferedReader reader=null;
//		try {
//			//URL servidor = new URL("http://localhost/applets/res/prueba.txt");
//			URL servidor = new URL("http://www.google.com");
//			reader = new BufferedReader(new InputStreamReader(servidor.openStream()));
//			this.saludo = reader.readLine();
//		}
//		catch (MalformedURLException m) {
//			m.printStackTrace(System.out);
//		}
//		catch (IOException i)  {
//			i.printStackTrace(System.out);
//		}
//		catch (Exception e) {
//			e.printStackTrace(System.out);
//		}
//		finally {
//			try {
//				if (reader!=null)
//					reader.close();
//			}
//			catch (IOException e) {
//
//			}
//		}
//	}
//
//	public void paint(Graphics lienzo)  {
//		lienzo.drawString("Servidor dice:"+this.saludo, 10, 10);
//	}
//}
