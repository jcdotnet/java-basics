package es.uma.oop.pract5;

import java.io.*;

class Driver3 {
     public static void main(String [] args) {
     	LineaF lf;
     	try {
     	  lf= new LineaF("texto.txt");
     	  lf.volcarInfo("salida.txt");
        } catch (IOException e) {
        	System.out.println("Error E/S");
        	return;
        }
        PrintWriter pantalla= new PrintWriter(System.out, true);
        lf.volcarInfo(pantalla);   
    }
}