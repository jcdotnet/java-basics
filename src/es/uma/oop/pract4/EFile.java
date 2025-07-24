package es.uma.oop.pract4;

import java.io.*;
import java.util.*;

public class EFile  {
	public static void main(String args[])  {
		String camino=null;
		try  {
			camino=args[0];
		} catch (ArrayIndexOutOfBoundsException e)  {
			System.out.println("EFile camino");
			return; 
		}
		// Reconstrucción del mapa
		SortedMap m = new TreeMap();
		DataInputStream disF=null;
		try  {
			disF = new DataInputStream(
					new BufferedInputStream(
					 new FileInputStream(camino)));
			int l = disF.readInt(); // Número de elementos
			while (l>0)  {
				char c = disF.readChar();
				int i  = disF.readInt();
				m.put(new Character(c),new Integer(i));
				l--;
			}
			System.out.println(m); // Muestra el mapa
			disF.close();
		} catch (FileNotFoundException e)  {
			System.out.println("Fichero no encontrado ");
			return;
		} catch (IOException e)  {
			System.out.println("Problemas de e/s");
			return;
		}
	}
}