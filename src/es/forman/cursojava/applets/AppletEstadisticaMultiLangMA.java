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
//
//import es.forman.cursojava.colecciones.Estadistica;
//
//public class AppletEstadisticaMultiLangMA extends Applet implements ActionListener {
//
//	private TextField tfNumero;
//	private TextArea taNumerosSeleccionados;
//	private TextField tfMedia, tfMediana;
//	private Button btnValida;
//	private Button btnCalcula;
//	private Button btnBorra;
//	private ArrayList<String> listaNumeros;
//	private Estadistica estadistica;
//	private HashMap<String, String> palabras;
//	private final String dirRecursosServidor = "/applets/config/";
//	private URL servidor;
//
//	private void setPalabrasPorDefecto() {
//		if (this.palabras == null)
//			this.palabras = new HashMap<String,String>();
//		this.palabras.put("saludo","C�lculo de estad�sticas");
//		this.palabras.put("introvalor","Introduzca un valor y pulse Valida");
//		this.palabras.put("valida","Valida");
//		this.palabras.put("calcula","Calcula");
//		this.palabras.put("borra","Borra");
//	}
//
//	private void cargaParametros(URL servidor)  {
//		if (servidor == null)  {
//			this.setPalabrasPorDefecto();
//			return;
//		}
//
//		try {
//			BufferedReader reader = new BufferedReader(new InputStreamReader(servidor.openStream()));
//			String sLinea;
//			String[] parametro;
//			this.palabras = new HashMap<String,String>();
//			while ((sLinea=reader.readLine())!=null) {
//				parametro = sLinea.split("=");
//				palabras.put(parametro[0], parametro[1]);
//			}
//		}
//		catch (IOException i)  {		// En caso de error en la carga, establece las que tiene por defecto.
//			this.setPalabrasPorDefecto();
//		}
//	}
//
//	public String getString(String clave) {
//		String valor;
//		if (this.palabras != null)  {
//			valor = this.palabras.get(clave);
//			if (valor != null)
//				return valor;
//		}
//		return clave;
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
//        		this.servidor = new URL("http", this.getCodeBase().getHost(), this.dirRecursosServidor+lenguaje+".txt");
//        	this.cargaParametros(this.servidor);
//        } catch (MalformedURLException e) {
//        		// No leemos del servidor
//		}
//
//		listaNumeros = new ArrayList<String>();
//		tfNumero = new TextField(this.getString("introvalor"));
//		this.add(tfNumero);
//		tfNumero.addActionListener(this);
//		taNumerosSeleccionados = new TextArea();
//		this.add(taNumerosSeleccionados);
//		btnValida = new Button(this.getString("valida"));
//		this.add(btnValida);
//		btnCalcula = new Button(this.getString("calcula"));
//		this.add(btnCalcula);
//		btnBorra = new Button(this.getString("borra"));
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
//		  lienzo.drawString(this.getString("saludo"),20,20);
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
