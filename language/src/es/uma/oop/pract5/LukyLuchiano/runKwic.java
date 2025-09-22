package es.uma.oop.pract5.LukyLuchiano;

import java.util.*;
public class runKwic {
	
	public static void main (String arg[]){
		Kwic w= new Kwic();
		w.creaNoClaves("noclaves.txt");
		w.creaEntradas("titulos.txt");
		w.creaSalida("salida.txt");
	}
}