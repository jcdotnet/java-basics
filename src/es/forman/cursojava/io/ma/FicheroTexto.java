package es.forman.cursojava.io.ma;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.zip.GZIPOutputStream;

public class FicheroTexto {
	
	private BufferedReader reader;
	private BufferedWriter writer;
	private PrintWriter pwriter;
	private GZIPOutputStream gzWriter;
	private boolean comprime;
	public final static int LECTURA = 0;
	public final static int ESCRITURA = 1;
	
	
	/**
	 * Devuelve un Reader al archivo que le pasamos.
	 * @param nombre
	 * @return
	 */
	public boolean abre(String nombre) {
		try {
			this.reader = new BufferedReader(new FileReader(nombre));
			return true;
		} catch (FileNotFoundException e) {
			return false;
		}
	}
	
	public boolean abre(String nombre, int operacion) {
		if (operacion == LECTURA)
			return (this.abre(nombre));
		try {
			if (!comprime)  {
				this.writer = new BufferedWriter(new FileWriter(nombre));
				this.pwriter = new PrintWriter(writer);
			}
			else {
				FileOutputStream stream = new FileOutputStream(nombre+".gzip");
				this.pwriter = new PrintWriter(
						new OutputStreamWriter(
								new GZIPOutputStream(stream)));
			}
			return true;
		} catch (FileNotFoundException e) {
			return false;
		} catch (IOException ie) {
			return false;
		}
		
	}
	
	public String leeLinea() throws IOException {
			return this.reader.readLine();
	}
	
	public void setCompresion(boolean comprime)  {
		this.comprime = comprime;
	}
	
	public void escribeLinea(StringBuffer sb) throws IOException {
		//this.writer.write(sb.toString()+"\n");	// M�todo 1
		this.pwriter.println(sb.toString());		// M�todo 2: empleando un 2� wrapper
	}
	
	public boolean cierra() {
		if (this.reader != null)
			try {
				reader.close();
				return true;
			}
			catch (IOException e) {
				return false;
			}	
		else if (this.writer != null)
			try {
				writer.close();
			}
		catch (IOException e) {
			return false;
		}
		return false;
	}
	
	public boolean siguienteLinea(StringBuffer sb) throws IOException {
		String linea = this.reader.readLine();
		sb.setLength(0);			// Limpia el StringBuffer por si acaso
		if (linea == null)
			return false;
		else {
			sb.append(linea);
			return true;
		}
	}
	
	public static void main (String[] args) throws IOException {
		FicheroTexto fichero = new FicheroTexto();
		fichero.abre ("c:\\temp\\HolaMundo.java");
		// M�todo 1
		String linea;
		while ((linea = fichero.leeLinea()) != null)
			System.out.println(linea);
		fichero.cierra();
		fichero.abre ("c:\\temp\\HolaMundo.java");
		// M�todo 2 m�s copia a otro fichero
		StringBuffer sbLinea = new StringBuffer();
		FicheroTexto ficheroCopia = new FicheroTexto();
		ficheroCopia.setCompresion(true);
		ficheroCopia.abre("c:\\temp\\HolaMundoCopia.java", FicheroTexto.ESCRITURA);
		while (fichero.siguienteLinea(sbLinea))  {
			System.out.println(sbLinea);
			ficheroCopia.escribeLinea(sbLinea);
		}
		ficheroCopia.cierra();
	}

}
