package es.uma.oop.pract5;

import java.util.*;
import java.io.*;

public class SimD  {
	private int nveces;	
	private int [] jugadas;	
	public SimD(int veces)  {
		juega(veces);
	}	
    private void juega(int n)  {
    	Random r = new Random();
    	nveces = n;
    	jugadas = new int [6];
		for(int i=0;i<nveces;i++)  {
			jugadas[r.nextInt(6)]++; 
		}
	}	
	
	public void salida(String s)  {
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(s),true);
			salida(pw);
			pw.close();
		} catch (IOException e)  {
			System.out.println("Error de E/S");
		}
	} 
					
	public void salida(PrintWriter pw)  {
		pw.println("Jugadas: "+nveces);
		for(int i=0;i<6;i++)
			pw.println((i+1)+" -> "+jugadas[i]);
	}
}	
				 
		