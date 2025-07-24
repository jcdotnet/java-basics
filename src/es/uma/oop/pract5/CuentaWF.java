// Autor Jose Carlos Roman Rubio ITI Sistemas  
// ejercicio 2 de la Practica 5
 
import java.io.*;
import java.util.*;

class CuentaWF {
   String fichero;
   	
   	
   	CuentaWF(String cadena) {
   		this.fichero= cadena;
   	}
   	
   	
   	SortedMap cuenta() throws IOException {
   	   SortedMap tabla= new TreeMap();
   	   FileReader fr = new FileReader(fichero);
   	   BufferedReader buffer = new BufferedReader(fr);
   	   
   	   StringTokenizer cadena;
   	      	   
   	   String linea = buffer.readLine();
   	   while (linea!=null) {
   	   	   cadena= new StringTokenizer(linea," ;:,.");
   	   	   while (cadena.hasMoreTokens()) {
   	   	      String palabra= cadena.nextToken();
   	   	      Integer frec= (Integer) tabla.get(palabra);
   	   	      if (frec==null) 
   	   	      	 tabla.put(palabra,new Integer(1));
   	   	      else 
   	   	         tabla.put(palabra,new Integer(frec.intValue()+1));   	   	   
   	   	   }
   	   	   linea = buffer.readLine();
   	   	   	   	   	 
   	   }   	  
   	   buffer.close(); 
   	   return tabla;
   	}

}