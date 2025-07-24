//package es.forman.cursojava.applets;
//
//import java.applet.Applet;
//import java.awt.Button;
//import java.awt.Graphics;
//import java.awt.Label;
//import java.awt.TextArea;
//import java.awt.TextField;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.ArrayList;
//import java.util.HashMap;
//
//import es.forman.cursojava.colecciones.Estadistica;
//
//public class AppletEstadisticaML extends Applet implements ActionListener{
//
//
//  private Label label;
//  private TextField textNum, textMedia,textMediana; //mejor tfXXX
//  private TextArea area;    // usar mejor taXXX
//  private Button okBoton, submitBoton;  // usar  bntXXX
//  private ArrayList <Double> lista;
//  private HashMap <String,String> archDupla;
//  private String lenguaje;
//  private Estadistica e;
//
//
//
//  private void setPalabrasPorDefecto() {
//		archDupla.put("label", "Introduzca n�mero y pulse OK");
//		archDupla.put("boton", "C�lcular estad�sticas");
//	}
//
//
//public void init() {
//	  super.init();
//	  this.lenguaje=getParameter("lang");
//	  archDupla= new HashMap<String,String>();
//
//	  StringBuffer sb= new StringBuffer("http://localhost/applets/recursos/");
//	  sb.append(this.lenguaje).append(".txt");
//	try {
//	    URL servidor;
//		if (this.lenguaje==null)
//			servidor = new URL("http://localhost/applets/recursos/es.txt");
//		else
//		    servidor = new URL(sb.toString());
//		InputStreamReader isr;
//		isr = new InputStreamReader(servidor.openStream());
//
//      BufferedReader reader =new BufferedReader(isr);
//      String linea =  reader.readLine();
//      while (linea!=null) {
//        String [] dupla = linea.split("=");
//        archDupla.put(dupla[0],dupla[1]);
//        linea=reader.readLine();
//      }
//	}
//	catch (MalformedURLException e) {
//		this.setPalabrasPorDefecto();
//	}catch (IOException e) {
//		this.setPalabrasPorDefecto();
//	}
//	  label= new Label(archDupla.get("label"));
//	  textNum= new TextField(5);
//	  okBoton= new Button("OK");
//	  area= new TextArea(10,10);
//	  submitBoton= new Button(archDupla.get("boton"));
//	  textMedia= new TextField(5);
//	  textMediana= new TextField(5);
//		this.add(label);
//		this.add(textNum);
//		this.add(okBoton);
//		this.add(area);
//		this.add(submitBoton);
//		this.add(textMedia);
//		this.add(textMediana);
//		okBoton.addActionListener(this);
//		submitBoton.addActionListener(this);
//		textNum.addActionListener(this);
//		lista= new ArrayList<Double> ();
//
//
//}
//
//
//public void paint(Graphics lienzo) {
//	//this.objeto.setLocation(100,100); // posicion (dnd se dibujara)
//	super.paint(lienzo);
//}
//
//public void actionPerformed(ActionEvent evento) {
//	if ((evento.getSource()==okBoton) || (evento.getSource()==textNum)) {
//		String num= textNum.getText();
//		if (num!=null)
//		   lista.add(Double.valueOf(num));
//		   area.append(num);
//		   area.append("\n");
//		   textNum.setText(" ");
//	}
//	else if (evento.getSource()==submitBoton) {
//		e= new Estadistica();
//		this.textMedia.setText(e.getMedia(lista)+" ");
//		this.textMediana.setText(e.getMediana(lista)+" ");
//
//	}
//
//	}
//}