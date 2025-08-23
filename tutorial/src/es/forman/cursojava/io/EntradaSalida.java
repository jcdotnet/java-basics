package es.forman.cursojava.io;

import java.io.*;
import java.util.ArrayList;

import es.forman.cursojava.colecciones.Estadistica;

public class EntradaSalida {
     
   
	public String leeTeclado(String prompt) throws IOException {
     //envuelvo un printreader (system.in)
	 InputStreamReader isr=new InputStreamReader(System.in);
     // teclado es lento, uso buffer aficicencia
     BufferedReader dato= new BufferedReader(isr); 
     System.out.print(prompt+"> ");
     String linea=dato.readLine();     
     return linea;
	}
	
	public void mostrarArchivo(String nombre) throws IOException {
		FileInputStream f= new FileInputStream(nombre);
		/* en el path tambien podria escapar las barras \\
	    * podria haber usado FileReader y envolver directam
		* con BufferedReades */
		BufferedReader reader;   
	    reader= new BufferedReader(new InputStreamReader(f));
	    String linea= reader.readLine();
	       while (linea!=null) {
			   System.out.println(linea);
			   linea= reader.readLine();
		   }
	       reader.close();
	}

	
	public void copiarArchivo(String archivo1, String archivo2) throws IOException{
		FileReader f = new FileReader(archivo1);
		BufferedReader lee= new BufferedReader(f);
		FileWriter f2= new FileWriter("src/es/forman/cursojava/io/prueba2.txt");
	    BufferedWriter escribe= new BufferedWriter(f2);
	    String linea= lee.readLine();
	       while (linea!=null) {
			   System.out.println(linea);
			   escribe.write(linea);
			   escribe.newLine();
			   linea= lee.readLine();
		   }
	       lee.close();
	       escribe.close();
	}
	
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
	   
	   EntradaSalida es= new EntradaSalida();
	   /* leo contenido de un fichero...
	    *  y lo muestro por pantalla
	   */
	   es.mostrarArchivo("src/es/forman/cursojava/io/prueba.txt");
	   /* leo contendido de un fichero...
	   *   ... y lo copio a otro
	   */ 
       es.copiarArchivo("src/es/forman/cursojava/io/prueba.txt","src/es/forman/cursojava/io/prueba2.txt");
		
       /* leo contenido de un fichero de numeros
        * y calculo su media
        */
       ArrayList <Double> numeros= new ArrayList<Double> ();
       FileReader f3= new FileReader("src/es/forman/cursojava/io/numeros.txt");
       BufferedReader lee= new BufferedReader(f3);
       String numero= lee.readLine();
       while (numero!=null) {
    	  // numeros.add(new Double(numero)); // Double deprecated in Java 9
		   numeros.add(Double.valueOf(numero));
		   numero= lee.readLine();
       }
       Estadistica e = new Estadistica();
       System.out.println(e.getMedia(numeros));
       lee.close();
       
       /* simular un shell basico 
        *  que no hace nada, solo imprimir el comando
        */
       String comando= es.leeTeclado("Comando:");
       while (!(comando.equals(""))) {
    	   System.out.println(comando);
    	   comando= es.leeTeclado("Comando");
       }
	}
}
