package es.forman.cursojava.io.ma;

import java.io.File;

public class Directorio {

	public String[] getListado(File f) {
		if (f.isDirectory())
			return f.list();
		else {
			String[] s = new String[1];
			s[0] = "Este archivo no es un directorio";
			return s;
		}
	}
	
	public File[] getContenido(File f) {
		if (f.isDirectory())
			return f.listFiles();
		else
			return null;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Directorio dir = new Directorio();
		File fdir = new File("c:\\temp\\brother");
		System.out.println("Directorio de: " + fdir.getAbsolutePath());
		String[] nombreFicheros = dir.getListado(fdir);
		for (String s:nombreFicheros)
			System.out.println(s);
		File[] ficheros = dir.getContenido(fdir);
		for (File f:ficheros)
			if (f.isFile())
				System.out.println(f.getName());
			else
				System.out.println("+"+f.getName());
	}

}
