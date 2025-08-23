package es.uma.oop.pract4;

import java.io.*;
import java.util.*;

public class DDFile  {
	public static void main(String args[])  {
		String camino=null;
		String salida=null;
		try  {
			camino=args[0];
			salida=args[1];
		} catch (ArrayIndexOutOfBoundsException e)  {
			System.out.println("DFile camino salida");
			return; 
		}
		SortedMap m = new TreeMap();
		FileInputStream fisF=null;
		DataOutputStream dosF=null;
		try  {
			// Lectura de los datos y creación del mapa
			fisF = new FileInputStream(camino);
			int r;
			r = fisF.read();
			while (r!=-1)  {
				if (Character.isLetter((char)r))  {
					Character cr = new Character((char)r);
					Integer freq = (Integer)m.get(cr);
					m.put(cr,freq==null?new Integer(1): new Integer(freq.intValue()+1));
				}
				r = fisF.read();
			}
			System.out.println(m);	// muestra la estructura	 		 
			fisF.close();
			
			// Guardar los datos;
			dosF = new DataOutputStream(
					new BufferedOutputStream(
					 new FileOutputStream(salida)));
			dosF.writeInt(m.size()); // Longitud
			Iterator it = m.entrySet().iterator();
			while (it.hasNext())  {
				Map.Entry e = (Map.Entry)it.next();
				dosF.writeChar(((Character)e.getKey()).charValue());
				dosF.writeInt(((Integer)e.getValue()).intValue());
			}
			dosF.close();
		} catch (FileNotFoundException e)  {
			System.out.println("Fichero no encontrado ");
			return;
		} catch (IOException e)  {
			System.out.println("Problemas de e/s");		
			return;
		}
	}
}
