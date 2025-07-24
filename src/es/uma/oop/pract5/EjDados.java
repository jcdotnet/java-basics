package es.uma.oop.pract5;

import java.io.*;
public class EjDados  {
	static public void main(String [] args)  {
		SimD sd = new SimD(100);
		sd.salida("pruebas.txt");
		sd.salida(new PrintWriter(System.out,true));
	}
}