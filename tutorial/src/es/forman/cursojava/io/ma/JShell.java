package es.forman.cursojava.io.ma;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Minishell programada en Java. Permite navegar por la estructura de directorios
 * de un ordenador. <br>
 * Los comandos que admite son: cd y cat.
 * @author Miguel Angel Garcia
 *
 */
public class JShell {
	
	private BufferedReader reader;
	public final static String[] comandos = {"cd", "ls", "cat", "exit" };
	public final static int COMANDO_CD = 0;
	public final static int COMANDO_LS = 1;
	public final static int COMANDO_CAT = 2;
	public final static int COMANDO_EXIT = 3;
	
	private File directorioActual;
	private final File root;
	
	public JShell() {
		reader = new BufferedReader(new InputStreamReader(System.in));  // System.in es un InputStream
		File[] roots = File.listRoots();
		this.root = roots[0];		// Asumimos c:
		this.directorioActual = root;
	}
	
	/**
	 * Lee la siguiente l�nea de comandos.
	 * @return
	 */
	protected String leeLinea() {
		try {
			System.out.print(this.getPrompt());
			return this.reader.readLine();
		}
		catch (IOException e)  {
			return JShell.comandos[COMANDO_EXIT];
		}
	}
	
	private String getPrompt() {
		return this.directorioActual.getAbsolutePath()+">";
	}
	
	protected boolean chequeaLS(String[] comando)  {
		if (comando[0].equalsIgnoreCase(JShell.comandos[JShell.COMANDO_LS]))  {
			return true;
		}
		else return false;		
	}
	
	/** Lista el directorio actual */
	protected void ejecutaLS()  {
		Directorio dir = new Directorio();
		System.out.println("Directorio de: " + this.directorioActual);
		File[] ficheros = dir.getContenido(this.directorioActual);
		System.out.println((this.directorioActual.getParentFile()));
		if (ficheros == null)
			System.out.println("Directorio vac�o");
		else {
			for (File f:ficheros)
				System.out.println(f);
		}
	}

	protected void ejecutaComandoInvalido() {
		System.out.println("Comando inv�lido");
	}

	protected boolean chequeaCAT(String[] s) {
		if (s[0].equalsIgnoreCase(JShell.comandos[JShell.COMANDO_CAT]))  {
			return true;
		}
		else return false;
	}
	
	protected void ejecutaCAT(String nombreArchivo) {
		File fArchivo = new File(this.directorioActual, nombreArchivo);
		if (fArchivo == null)
			System.out.print(nombreArchivo + " no es un nombre de archivo v�lido");
		else if (fArchivo.isDirectory())
			System.out.print(nombreArchivo + " es un directorio");
		else {
			try {
				FicheroTexto f = new FicheroTexto();
				f.abre(fArchivo.getAbsolutePath());
				StringBuffer sb = new StringBuffer();
				while (f.siguienteLinea(sb))
					System.out.println(sb.toString());
			}
			catch (FileNotFoundException e) {
					System.out.println(nombreArchivo + " no es un nombre de archivo v�lido");
			} catch (IOException ioe)  {
				System.out.println("Excepci�n inesperada al mostrar " + nombreArchivo);
			}

		}
	}

	protected boolean chequeaEXIT(String[] s) {
		if (s[0].equalsIgnoreCase(this.comandos[JShell.COMANDO_EXIT])) 
			return true;
		else
			return false;
	}

	protected boolean chequeaCD(String[] s) {
		if (s[0].equalsIgnoreCase(this.comandos[JShell.COMANDO_CD])) 
			return true;
		else
			return false;
	}
	
	protected void ejecutaCD(String[] s) {
		// Comprueba que el argumento es un directorio v�lido o ".."
		String directorioDestino = s[1];
		if (directorioDestino.equals("..") && !this.directorioActual.equals(this.root))
			this.directorioActual = this.directorioActual.getParentFile();
		else  {
				File f = new File(this.directorioActual, s[1]);
				if (f != null && f.isDirectory())
					this.directorioActual = f;
				else System.out.println(s[1] +" no es un directorio");
		}
	}
	
	/**
	 * Procesa un comando del usuario y analiza si es v�lido.
	 * Si lo es, lo ejecuta.
	 * @return Un comando v�lido y sus par�metros, si lleva.
	 */
	public void procesaComando() {
		boolean comandoValido = false;
		while (!comandoValido)  {
			String[] s = this.leeLinea().split(" ");
			if (chequeaLS(s))
					ejecutaLS();
			else if (chequeaCD(s))
					ejecutaCD(s);
			else if (chequeaEXIT(s))
					return;
			else if (chequeaCAT(s))
					ejecutaCAT(s[1]);
			else
					ejecutaComandoInvalido();
			}
	}
		
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JShell shell = new JShell();
		shell.procesaComando();

	}

	public File getDirectorioActual() {
		return directorioActual;
	}

	public void setDirectorioActual(File directorioActual) {
		this.directorioActual = directorioActual;
	}

}
