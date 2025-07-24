package es.forman.cursojava.applets;
//
//import java.applet.Applet;
//import java.awt.Graphics;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.MalformedURLException;
//import java.net.URL;
//
//public class LeeArchivoServer extends Applet{
//  private String linea;
//
//@Override
//public void paint(Graphics lienzo) {
//	// TODO Auto-generated method stub
//	super.init();
//	try {
//		URL servidor= new URL("http://localhost/applets/recursos/prueba.txt");
//	    // new URL("www.google.com"); solo puedo conectar a otro server en applet loca
//
//		InputStreamReader isr= new InputStreamReader(servidor.openStream());
//        BufferedReader reader =new BufferedReader(isr);
//        this.linea= reader.readLine();
//
//        int pos=0;
//        while (linea!=null) {
//        	pos+=10;
//        	lienzo.drawString(linea,10,pos);
//        	linea= reader.readLine();
//        }
//        reader.close();
//	} catch (MalformedURLException e) {
//		lienzo.drawString("URL mal formada",10,10);
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		lienzo.drawString("Error entrada/salida",10,10);
//	}
//	/*finally {
//		if (reader!=null)
//			reader.close();
//	}*/
//}
//
//
//
//
//
//}
