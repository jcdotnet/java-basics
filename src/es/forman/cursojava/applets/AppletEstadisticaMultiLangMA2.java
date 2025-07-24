//package es.forman.cursojava.applets;
//
//import java.applet.Applet;
//import java.awt.Button;
//import java.awt.Dimension;
//import java.awt.Graphics;
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
//import java.util.Properties;
//
//import es.forman.cursojava.colecciones.Estadistica;
//
//public class AppletEstadisticaMultiLangMA2 extends Applet implements ActionListener {
//
//	private TextField tfNumero;
//	private TextArea taNumerosSeleccionados;
//	private TextField tfMedia, tfMediana;
//	private Button btnValida;
//	private Button btnCalcula;
//	private Button btnBorra;
//	private ArrayList<String> listaNumeros;
//	private Estadistica estadistica;
//	private Properties palabras;
//	//private HashMap<String, String> palabras;
//	private final String dirRecursosServidor = "/applets/config/";
//	private URL servidor;
//
//	private Properties getPalabrasPorDefecto() {
//		Properties propsDefecto = new Properties();
//		propsDefecto.setProperty("saludo","C�lculo de estad�sticas");
//		propsDefecto.setProperty("introvalor","Introduzca un valor y pulse Valida");
//		propsDefecto.setProperty("valida","Valida");
//		propsDefecto.setProperty("calcula","Calcula");
//		propsDefecto.setProperty("borra","Borra");
//		return propsDefecto;
//	}
//
//	private void cargaParametros(URL servidor)  {
//		try {
//			this.palabras = new Properties(this.getPalabrasPorDefecto());
//			palabras.load(servidor.openStream());
//		}
//		catch (IOException i)  {		// En caso de error en la carga, se quedar� al menos con las que tiene por defecto
//		}
//	}
//
//	public void init() {
//        // Lee el par�metro de entrada "lang", si existe
//        String lenguaje = this.getParameter("lang");
//        if (lenguaje == null)
//        	lenguaje = "es";
//
//		//		 Calcula la URL actual; contempla el doble caso de AppletViewer o descargado de servidor Web.
//        try {
//        	if (!this.getCodeBase().getProtocol().equalsIgnoreCase("http"))
//        		this.servidor = new URL("http", "localhost", this.dirRecursosServidor+lenguaje+".txt");
//			else
//        		this.servidor = new URL("file", this.getCodeBase().getHost(), this.dirRecursosServidor+lenguaje+".txt");
//        	this.cargaParametros(this.servidor);
//        } catch (MalformedURLException e) {
//        		// No leemos del servidor
//		}
//
//		listaNumeros = new ArrayList<String>();
//		tfNumero = new TextField(this.palabras.getProperty("introvalor"));
//		this.add(tfNumero);
//		tfNumero.addActionListener(this);
//		taNumerosSeleccionados = new TextArea();
//		this.add(taNumerosSeleccionados);
//		btnValida = new Button(this.palabras.getProperty("valida"));
//		this.add(btnValida);
//		btnCalcula = new Button(this.palabras.getProperty("calcula"));
//		this.add(btnCalcula);
//		btnBorra = new Button(this.palabras.getProperty("borra"));
//		this.add(btnBorra);
//		// Registro mi applet como listener ("escuchador") de eventos para los botones
//		btnValida.addActionListener(this);
//		btnCalcula.addActionListener(this);
//		btnBorra.addActionListener(this);
//
//        tfMedia = new TextField(5);
//        tfMediana = new TextField(5);
//        this.add(tfMedia);
//        this.add(tfMediana);
//
//        this.estadistica = new Estadistica();
//
//
//	}
//
//	public void paint(Graphics lienzo) {
//		  lienzo.drawString(this.palabras.getProperty("saludo"),20,20);
//		  this.tfNumero.setLocation(20,40);
//		  this.btnValida.setLocation(this.tfNumero.getWidth()+20, 40);
//		  this.btnCalcula.setLocation((int)this.btnValida.getLocation().getX() + 50, 40);
//		  this.btnBorra.setLocation((int)this.btnCalcula.getLocation().getX() + 60, 40);
//		  this.taNumerosSeleccionados.setLocation(20, 40+this.tfNumero.getHeight()+10);
//		  this.tfMedia.setLocation(20, 250);
//		  this.tfMediana.setLocation(80, 250);
//	}
//
//	public void actionPerformed(ActionEvent evento) {
//		if (evento.getSource().equals(this.btnValida) ||
//				evento.getSource().equals(this.tfNumero))  {
//			this.listaNumeros.add(this.tfNumero.getText());
//			this.taNumerosSeleccionados.append("\n"+this.tfNumero.getText());
//		} else if (evento.getSource().equals(this.btnCalcula))  {
//			ArrayList<Double> lista = this.estadistica.getListaNumeros(this.listaNumeros.toArray(new String[0]));
//			this.tfMedia.setText(""+this.estadistica.getMedia(lista));
//			this.tfMediana.setText(""+this.estadistica.getMediana(lista));
//		} else if (evento.getSource().equals(this.btnBorra))  {
//			this.listaNumeros.clear();
//			this.taNumerosSeleccionados.setText("");
//		}
//		this.tfNumero.setText("");
//		this.repaint();
//	}
//}
