package es.uma.oop.pract5.Profe;

import java.io.*;
public class EjLineaF {
	static public void main(String [] args) {
		PrintWriter pw = new PrintWriter(System.out,true);
		
		// Primero con LineaF. Ejercicio 3
		LineaF lf = new LineaF("c:/datos/cursos/java/ejmNuevo/Linea/readme.txt");
		pw.println("CON LineaF");
		lf.salida(pw);
		
		// Y ahora con LineaFW. Ejercicio 4
		LineaFW lfw = new LineaFW("c:/datos/cursos/java/ejmNuevo/Linea/readme.txt",
							   "c:/datos/cursos/java/ejmNuevo/Linea/noClaves.txt");
		pw.println("\nCON LineaFW");
		lfw.salida(pw);
	}
}
		
