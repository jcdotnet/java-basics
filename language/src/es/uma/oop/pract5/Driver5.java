package es.uma.oop.pract5;

import java.util.*;
import java.io.*;
public class Driver5 {
	
	public static void main (String arg[]){
		Kwic w= new Kwic();
		w.creaNoClaves("noclaves.txt");
		w.creaEntradas("titulos.txt");
		PrintWriter pw=new PrintWriter(System.out,true); 
		 w.creaSalida(pw);
	}
}