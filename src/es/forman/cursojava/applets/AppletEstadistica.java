//package es.forman.cursojava.applets;
//
//// APPLETS DEPRECATED SINCE JAVA 9
//
//import java.applet.Applet;
//import java.awt.Button;
//import java.awt.Graphics;
//import java.awt.Label;
//import java.awt.TextArea;
//import java.awt.TextField;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.ArrayList;
//
//import es.forman.cursojava.colecciones.Estadistica;
//
//public class AppletEstadistica extends Applet implements ActionListener{
//
//
//  private Label label;
//  private TextField textNum, textMedia,textMediana;
//  private TextArea area;
//  private Button okBoton, submitBoton;
//  ArrayList <Double> lista;
//  Estadistica e;
//
//
//public void init() {
//	  super.init();
//	  lista= new ArrayList<Double> ();
//	  label= new Label("Introduzca numero");
//	  textNum= new TextField(5);
//	  okBoton= new Button("OK");
//	  area= new TextArea(10,10);
//	  submitBoton= new Button("Calcular");
//	  textMedia= new TextField(5);
//	  textMediana= new TextField(5);
//		this.add(label);
//		this.add(textNum);
//		textNum.addActionListener(this); // evento pulsar enter sobre caja de texto
//		this.add(okBoton);
//		okBoton.addActionListener(this); // evento pulsar boton
//		this.add(area);
//		this.add(submitBoton);
//		submitBoton.addActionListener(this); // evento pulsar boton
//		this.add(textMedia);
//		this.add(textMediana);
//}
//
//
//public void paint(Graphics lienzo) {
////	 boton1.setLocation(10,10); // posicion (dnd se dibujara)
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
