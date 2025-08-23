package es.forman.cursojava.io.jshell;

import java.io.File;

public class Directorio {

	public void listarDirectorio(String directorio) {
	  File f= new File(directorio);	
	  if (f.exists()) {
		  String [] archivos=f.list();
		  for (int i=0; i<archivos.length;i++)
			  System.out.println(archivos[i]);
	  }
	}

	
	public void listarDetallado(String directorio) {
		File f= new File(directorio);	
		  if (f.exists()) {
			  File[] file =f.listFiles();
			  for (int i=0; i<file.length;i++) {
		        if (file[i].isFile()) 
		        	System.out.println(file[i].getName());
		        else if (file[i].isDirectory())
		        	System.out.println("+ "+file[i].getName());
			  }
		  }
	}
	
	
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Vamos a listar un directorio
        Directorio dir = new Directorio(); 
		dir.listarDetallado("c:");
	}

}
