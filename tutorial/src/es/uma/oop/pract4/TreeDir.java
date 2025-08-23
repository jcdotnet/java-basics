package es.uma.oop.pract4;

import java.io.*;

public class TreeDir  {
	public static final int SANGRADO=5;
	public static void main(String [] args)  {
		String camino=null;
		try  {
			camino = args[0]; 
		} catch (ArrayIndexOutOfBoundsException e)  {
			camino = ".";
		}
		File fcamino = new File(camino);
		muestra(fcamino, 0);
	}
	public static void muestra(File f, int ind)  {
		if (!f.exists())
			return;
		
		for(int i=0;i<ind*SANGRADO;i++)
			System.out.print(" ");
		System.out.println(f.getName());
		
		if (f.isDirectory())  {
			File [] lf = f.listFiles();
			for (int i = 0;i<lf.length;i++)
				muestra(lf[i],ind+1);
		}	
	}				
}
		
