//package es.forman.cursojava.applets;
//
//
//import java.applet.Applet;
//import java.awt.Button;
//import java.awt.Graphics;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class Botones extends Applet implements ActionListener {
//
//	Button boton1, boton2,boton3;
//
//
//	@Override
//	public void init() {
//		super.init();
//		boton1= new Button("Boton 1");
//		// boton1.setLocation(10,10); // posicion (dnd se dibujara)
//		boton2= new Button("Boton 2");
//		boton3= new Button("Boton 3");
//		this.add(boton1);
//		this.add(boton2);
//		this.add(boton3);
//		boton1.addActionListener(this);
//		boton2.addActionListener(this);
//		boton3.addActionListener(this);
//	}
//
//	public void actionPerformed(ActionEvent event) {
//		if (event.getSource()==boton1)
//			System.out.println("Boton 1 pulsado");
//		   // this.boton1.setVisible(false); lo oculto
//		else if (event.getSource()==boton2)
//			System.out.println("Boton 2 pulsado");
//		if (event.getSource()==boton3)
//			System.out.println("Boton 3 pulsado");
//
//
//	}
//
//}
