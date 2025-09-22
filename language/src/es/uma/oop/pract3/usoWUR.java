// Jose Carlos Roman Rubio
package es.uma.oop.pract3;

import java.util.*;
import java.io.*;

class usoWUR {
  
  public static void main(String args[]) {  
     System.out.print(" Introduce una frase -> ");
     try { 
       BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
       String frase = br.readLine();
     } catch (IOException e) {
     	System.out.println("Error de lectura");
     	return;
     }
     WUR w = new WUR("frase");
     SortedSet dup = w.duplicados();
     SortedSet noDup = w.noDuplicados();
     System.out.println("Palabras DUPLICADAS: "+dup);
     System.out.println("Palabras NO duplicadas: "+noDup);
  }        
}